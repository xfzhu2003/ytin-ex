/*********************************************************************
 * Filename:      glist.cpp
 * Version:
 * 
 * Description:   common functions for single link table,ported from
 * glib,you can visit
 *   http://developer.gnome.org/doc/API/2.0/glib/glib-Singly-Linked
 *   -Lists.html
 * for detail function description
 * 
 * Author:        fog hua <fog@localhost.localdomain>
 * Created at:    Thu Apr 15 18:18:43 2004
 * Modified at:   Sun Apr 18 10:53:26 2004
 * Modified by:   fog hua <fog@localhost.localdomain>
 ********************************************************************/
#include <stdlib.h>
#include "glist.proto"

/* following functions for single-linked lists */

GSList* g_slist_alloc (void)
{
    GSList *list;
  
    list = (GSList *)malloc(sizeof(GSList));
  
    return list;
}

void g_slist_free (GSList *list)
{
    GSList *last;
  
    while (list)
    {
        last = list;
        list = list->next;
        free (last);
    }
}

GSList* g_slist_append (GSList   *list,
                        gpointer  data)
{
    GSList *new_list;
    GSList *last;

    new_list = g_slist_alloc ();
    new_list->data = data;
    new_list->next = NULL;
    
    if (list)
    {
        last = g_slist_last (list);
        /* g_assert (last != NULL); */
        last->next = new_list;

        return list;
    }
    else
        return new_list;
}

GSList* g_slist_prepend (GSList   *list,
                         gpointer  data)
{
    GSList *new_list;

    new_list = g_slist_alloc ();
    new_list->data = data;
    new_list->next = list;

    return new_list;
}

GSList* g_slist_insert (GSList   *list,
                gpointer  data,
                gint      position)
{
    GSList *prev_list;
    GSList *tmp_list;
    GSList *new_list;

    if (position < 0)
        return g_slist_append (list, data);
    else if (position == 0)
        return g_slist_prepend (list, data);

    new_list = g_slist_alloc ();
    new_list->data = data;

    if (!list)
        return new_list;

    prev_list = NULL;
    tmp_list = list;

    while ((position-- > 0) && tmp_list)
    {
        prev_list = tmp_list;
        tmp_list = tmp_list->next;
    }

    if (prev_list)
    {
        new_list->next = prev_list->next;
        prev_list->next = new_list;
    }
    else
    {
        new_list->next = list;
        list = new_list;
    }

    return list;
}

GSList* g_slist_insert_before (GSList  *slist,
                       GSList  *sibling,
                       gpointer data)
{
    if (!slist)
    {
        slist = g_slist_alloc ();
        slist->data = data;

        return slist;
    }
    else
    {
        GSList *node, *last = NULL;

        for (node = slist; node; last = node, node = last->next)
            if (node == sibling)
                break;
        if (!last)
        {
            node = g_slist_alloc ();
            node->data = data;
            node->next = slist;

            return node;
        }
        else
        {
            node = g_slist_alloc ();
            node->data = data;
            node->next = last->next;
            last->next = node;

            return slist;
        }
    }
}

GSList* g_slist_concat (GSList *list1, GSList *list2)
{
    if (list2)
    {
        if (list1)
            g_slist_last (list1)->next = list2;
        else
            list1 = list2;
    }

    return list1;
}

GSList* g_slist_remove (GSList        *list,
                gconstpointer  data)
{
    GSList *tmp, *prev = NULL;

    tmp = list;
    while (tmp)
    {
        if (tmp->data == data)
        {
            if (prev)
                prev->next = tmp->next;
            else
                list = tmp->next;

            g_slist_free (tmp);
            break;
        }
        prev = tmp;
        tmp = prev->next;
    }

    return list;
}

GSList* g_slist_remove_all (GSList        *list,
                    gconstpointer  data)
{
    GSList *tmp, *prev = NULL;

    tmp = list;
    while (tmp)
    {
        if (tmp->data == data)
        {
            GSList *next = tmp->next;

            if (prev)
                prev->next = next;
            else
                list = next;
	  
            g_slist_free (tmp);
            tmp = next;
        }
        else
        {
            prev = tmp;
            tmp = prev->next;
        }
    }

    return list;
}

static inline GSList* _g_slist_remove_link (GSList *list,
                      GSList *link)
{
    GSList *tmp;
    GSList *prev;

    prev = NULL;
    tmp = list;

    while (tmp)
    {
        if (tmp == link)
        {
            if (prev)
                prev->next = tmp->next;
            if (list == tmp)
                list = list->next;

            tmp->next = NULL;
            break;
        }

        prev = tmp;
        tmp = tmp->next;
    }

    return list;
}

GSList* g_slist_remove_link (GSList *list,
                     GSList *link)
{
    return _g_slist_remove_link (list, link);
}

GSList* g_slist_delete_link (GSList *list,
                     GSList *link)
{
    list = _g_slist_remove_link (list, link);
    g_slist_free (link);

    return list;
}

GSList* g_slist_copy (GSList *list)
{
    GSList *new_list = NULL;

    if (list)
    {
        GSList *last;

        new_list = g_slist_alloc ();
        new_list->data = list->data;
        last = new_list;
        list = list->next;
        while (list)
        {
            last->next = g_slist_alloc ();
            last = last->next;
            last->data = list->data;
            list = list->next;
        }
    }

    return new_list;
}

GSList* g_slist_reverse (GSList *list)
{
    GSList *prev = NULL;
  
    while (list)
    {
        GSList *next = list->next;

        list->next = prev;
      
        prev = list;
        list = next;
    }
  
    return prev;
}

GSList* g_slist_nth (GSList *list,
             guint   n)
{
    while (n-- > 0 && list)
        list = list->next;

    return list;
}

gpointer g_slist_nth_data (GSList   *list,
                  guint     n)
{
    while (n-- > 0 && list)
        list = list->next;

    return list ? list->data : NULL;
}

GSList* g_slist_find (GSList        *list,
              gconstpointer  data)
{
    while (list)
    {
        if (list->data == data)
            break;
        list = list->next;
    }

    return list;
}

GSList* g_slist_find_custom (GSList        *list,
                     gconstpointer  data,
                     GCompareFunc   func)
{

    while (list)
    {
        if (! func (list->data, data))
            return list;
        list = list->next;
    }

    return NULL;
}

gint g_slist_position (GSList *list,
                  GSList *link)
{
    gint i;

    i = 0;
    while (list)
    {
        if (list == link)
            return i;
        i++;
        list = list->next;
    }

    return -1;
}

gint g_slist_index (GSList        *list,
               gconstpointer  data)
{
    gint i;

    i = 0;
    while (list)
    {
        if (list->data == data)
            return i;
        i++;
        list = list->next;
    }

    return -1;
}

GSList* g_slist_last (GSList *list)
{
    if (list)
    {
        while (list->next)
            list = list->next;
    }

    return list;
}

guint g_slist_length (GSList *list)
{
    guint length;

    length = 0;
    while (list)
    {
        length++;
        list = list->next;
    }

    return length;
}

void g_slist_foreach (GSList   *list,
                 GFunc     func,
                 gpointer  user_data)
{
    while (list)
    {
        GSList *next = list->next;
        (*func) (list->data, user_data);
        list = next;
    }
}

GSList* g_slist_insert_sorted (GSList       *list,
                       gpointer      data,
                       GCompareFunc  func)
{
    GSList *tmp_list = list;
    GSList *prev_list = NULL;
    GSList *new_list;
    gint cmp;
 
    if (!list)
    {
        new_list = g_slist_alloc ();
        new_list->data = data;
        return new_list;
    }
 
    cmp = (*func) (data, tmp_list->data);
 
    while ((tmp_list->next) && (cmp > 0))
    {
        prev_list = tmp_list;
        tmp_list = tmp_list->next;
        cmp = (*func) (data, tmp_list->data);
    }

    new_list = g_slist_alloc ();
    new_list->data = data;

    if ((!tmp_list->next) && (cmp > 0))
    {
        tmp_list->next = new_list;
        return list;
    }
  
    if (prev_list)
    {
        prev_list->next = new_list;
        new_list->next = tmp_list;
        return list;
    }
    else
    {
        new_list->next = list;
        return new_list;
    }
}

static GSList * g_slist_sort_merge (GSList   *l1, 
                    GSList   *l2,
                    GFunc     compare_func,
                    gboolean  use_data,
                    gpointer  user_data)
{
    GSList list, *l;
    gint cmp;

    l=&list;

    while (l1 && l2)
    {
        if (use_data)
            cmp = ((GCompareDataFunc) compare_func) (l1->data, l2->data, user_data);
        else
            cmp = ((GCompareFunc) compare_func) (l1->data, l2->data);

        if (cmp <= 0)
        {
            l=l->next=l1;
            l1=l1->next;
        } 
        else 
        {
            l=l->next=l2;
            l2=l2->next;
        }
    }
    l->next= l1 ? l1 : l2;
  
    return list.next;
}

static GSList * g_slist_sort_real (GSList   *list,
                   GFunc     compare_func,
                   gboolean  use_data,
                   gpointer  user_data)
{
    GSList *l1, *l2;

    if (!list) 
        return NULL;
    if (!list->next) 
        return list;

    l1 = list; 
    l2 = list->next;

    while ((l2 = l2->next) != NULL)
    {
        if ((l2 = l2->next) == NULL) 
            break;
        l1=l1->next;
    }
    l2 = l1->next; 
    l1->next = NULL;

    return g_slist_sort_merge (g_slist_sort_real (list, compare_func, use_data, user_data),
                               g_slist_sort_real (l2, compare_func, use_data, user_data),
                               compare_func,
                               use_data,
                               user_data);
}

GSList* g_slist_sort (GSList       *list,
              GCompareFunc  compare_func)
{
    return g_slist_sort_real (list, (GFunc) compare_func, FALSE, NULL);
}

GSList* g_slist_sort_with_data (GSList           *list,
                        GCompareDataFunc  compare_func,
                        gpointer          user_data)
{
    return g_slist_sort_real (list, (GFunc) compare_func, TRUE, user_data);
}


/* following functions for double-linked lists */
GList*
g_list_alloc (void)
{
    GList *list;
  
    list = (GList *)malloc(sizeof(GList));
  
    return list;
}

void
g_list_free (GList *list)
{
    GList *last;
  
    while (list)
    {
        last = list;
        list = list->next;
        free (last);
    }
}

void
g_list_free_1 (GList *list)
{
    free (list);
}

GList*
g_list_append (GList	*list,
               gpointer	 data)
{
    GList *new_list;
    GList *last;
  
    new_list = g_list_alloc ();
    new_list->data = data;
  
    if (list)
    {
        last = g_list_last (list);
        last->next = new_list;
        new_list->prev = last;

        return list;
    }
    else
        return new_list;
}


GList*
g_list_prepend (GList	 *list,
                gpointer  data)
{
    GList *new_list;
  
    new_list = g_list_alloc ();
    new_list->data = data;
  
    if (list)
    {
        if (list->prev)
        {
            list->prev->next = new_list;
            new_list->prev = list->prev;
        }
        list->prev = new_list;
        new_list->next = list;
    }
  
    return new_list;
}

GList*
g_list_insert (GList	*list,
               gpointer	 data,
               gint	 position)
{
    GList *new_list;
    GList *tmp_list;
  
    if (position < 0)
        return g_list_append (list, data);
    else if (position == 0)
        return g_list_prepend (list, data);
  
    tmp_list = g_list_nth (list, position);
    if (!tmp_list)
        return g_list_append (list, data);
  
    new_list = g_list_alloc ();
    new_list->data = data;
  
    if (tmp_list->prev)
    {
        tmp_list->prev->next = new_list;
        new_list->prev = tmp_list->prev;
    }
    new_list->next = tmp_list;
    tmp_list->prev = new_list;
  
    if (tmp_list == list)
        return new_list;
    else
        return list;
}

GList*
g_list_insert_before (GList   *list,
                      GList   *sibling,
                      gpointer data)
{
    if (!list)
    {
        list = g_list_alloc ();
        list->data = data;

        return list;
    }
    else if (sibling)
    {
        GList *node;

        node = g_list_alloc ();
        node->data = data;
        if (sibling->prev)
        {
            node->prev = sibling->prev;
            node->prev->next = node;
            node->next = sibling;
            sibling->prev = node;
            return list;
        }
        else
        {
            node->next = sibling;
            sibling->prev = node;

            return node;
        }
    }
    else
    {
        GList *last;

        last = list;
        while (last->next)
            last = last->next;

        last->next = g_list_alloc ();
        last->next->data = data;
        last->next->prev = last;

        return list;
    }
}

GList*
g_list_remove (GList	     *list,
               gconstpointer  data)
{
    GList *tmp;
  
    tmp = list;
    while (tmp)
    {
        if (tmp->data != data)
            tmp = tmp->next;
        else
        {
            if (tmp->prev)
                tmp->prev->next = tmp->next;
            if (tmp->next)
                tmp->next->prev = tmp->prev;
	  
            if (list == tmp)
                list = list->next;
	  
            g_list_free_1 (tmp);
	  
            break;
        }
    }
    return list;
}

GList*
g_list_remove_all (GList	*list,
                   gconstpointer data)
{
    GList *tmp = list;

    while (tmp)
    {
        if (tmp->data != data)
            tmp = tmp->next;
        else
        {
            GList *next = tmp->next;

            if (tmp->prev)
                tmp->prev->next = next;
            else
                list = next;
            if (next)
                next->prev = tmp->prev;

            g_list_free_1 (tmp);
            tmp = next;
        }
    }
    return list;
}

static inline GList*
_g_list_remove_link (GList *list,
                     GList *link)
{
    if (link)
    {
        if (link->prev)
            link->prev->next = link->next;
        if (link->next)
            link->next->prev = link->prev;
      
        if (link == list)
            list = list->next;
      
        link->next = NULL;
        link->prev = NULL;
    }
  
    return list;
}

GList*
g_list_remove_link (GList *list,
                    GList *link)
{
    return _g_list_remove_link (list, link);
}

GList*
g_list_delete_link (GList *list,
                    GList *link)
{
    list = _g_list_remove_link (list, link);
    g_list_free_1 (link);

    return list;
}

GList*
g_list_nth (GList *list,
            guint  n)
{
    while ((n-- > 0) && list)
        list = list->next;
  
    return list;
}

GList*
g_list_nth_prev (GList *list,
                 guint  n)
{
    while ((n-- > 0) && list)
        list = list->prev;
  
    return list;
}

gpointer
g_list_nth_data (GList     *list,
                 guint      n)
{
    while ((n-- > 0) && list)
        list = list->next;
  
    return list ? list->data : NULL;
}

GList*
g_list_find (GList         *list,
             gconstpointer  data)
{
    while (list)
    {
        if (list->data == data)
            break;
        list = list->next;
    }
  
    return list;
}

gint
g_list_position (GList *list,
                 GList *link)
{
    gint i;

    i = 0;
    while (list)
    {
        if (list == link)
            return i;
        i++;
        list = list->next;
    }

    return -1;
}

gint
g_list_index (GList         *list,
              gconstpointer  data)
{
    gint i;

    i = 0;
    while (list)
    {
        if (list->data == data)
            return i;
        i++;
        list = list->next;
    }

    return -1;
}

GList*
g_list_last (GList *list)
{
    if (list)
    {
        while (list->next)
            list = list->next;
    }
  
    return list;
}

GList*
g_list_first (GList *list)
{
    if (list)
    {
        while (list->prev)
            list = list->prev;
    }
  
    return list;
}

guint
g_list_length (GList *list)
{
    guint length;
  
    length = 0;
    while (list)
    {
        length++;
        list = list->next;
    }
  
    return length;
}
