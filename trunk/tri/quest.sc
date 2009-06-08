
/al {askLan} {/2 ask lan about 募捐} 
/al {askXia} {/2 ask xiang gong about 武器}


class autoQuest { \
    tri {你连忙俯身一拜，小心翼翼地站起来。} {/sleep 2;sd;s} {autoQuest}; \
    tri {香兰对你说道：这位小兄弟，姑娘还盼着您的%0呢！} {/va _cName %0} {autoQuest}; \
    tri {相公对你说道：这位小兄弟，老夫还盼着您的开山斧呢！} {/va _cName %0} {autoQuest}; \
} {/nop}
