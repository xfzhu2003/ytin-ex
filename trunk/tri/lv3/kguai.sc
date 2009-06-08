

/al _Awieldb {remove all;wield blade;wear all}
/al _Awield {remove all;unwield blade;wield zhua;wield bang;wield gun;wear all}
/al _Aunwield {unwield zhua;unwield bang;unwield gun;unwield blade}
/nop ---------------------------------------------------------------------------------
/al F12 {w;fly tianzhu;8w;s;s;e;buy dan from langzhong;eat dan;w;fc;s;e}
/al F8 {touxiang;dazuo 0;mingsi 0;touxiang}
/al F9 {/purge;/ignore}
/al F7 {unset no_accept;eat yao}
/al F6 {remove dun;unwield bang;unwield gun;wield zhua;wield blade;perform pozhan;wear all}
/nop /al F6 {remove dun;unwield bang;unwield gun;unwield zhua;wield blade;perform pozhan;unwield blade;wield zhua;wield bang;wield gun;wear all}
/al F5 {enable stick qianjun-bang;perform pili;enable stick kusang-bang}
/al F4 {w;askli}
/al F3 3f
/al F2 {touxiang;/3 eh;er;kill $leguai}
/al F1 {touxiang;cast townportal}
/al {3f} {fly jisaiguo;4s;w;w;open door;n;n;n;nu;ask chanshi about 扫塔;enter;11u}
/al {f3} {12d;knock door;/sleep 2;out;sd;2s;open door;s;fly changan;s;e}
/al {askli} {fly sky;4e;5n;w;w;s;s;e;e;n;u;remove all;unwield bang;unwield gun;unwield zhua;/va bAsk 1;ask li about kill;wield zhua;wield bang;wield gun;wear all}
/al {dx1} {fly xiaoxitian;nw;nw;n;w;sw;w;sw;se;s;sw;w;w;nw;nw;sw;w;wu;nw;nw;ne;ed;ed;d}
/al {wdd} {fly yinwu;se;e;e;e;ne;e;e;e;e;e;e;n;n;n;n;e;e;e;s;n;n;s;e;s;n;n;s;e;n;s;s;s;n;n;e;ne;nu;ed;wu;sd;sw;w;s;s;push statue;sw;su;enter;su;su;wu;dive dong;n;w}
/al {jgb} {n;n;w;e;n;e;s;w;s}
/al {gc} {get gold from corpse;get silver from corpse}
/al {er} {exert recover}
/al {ef} {exert refresh}
/al {eh} {exert heal}
/al {fc} {fly changan}
/al {fk} {fly kaifeng}
/al {ch} {cast huanying}
/al {pf} {perform chaofeng}
/al {cj} {cast juanbi}
/al {ca} {cast invocation}
/al {ct} {touxiang;cast townportal;/3 north;3e;3s;se;out}
/al {pans} {bai cao;e;n;wu;u;ask daxian about leave;true;d;ed;s;w}
/al {askqn} {/va _lvl1 %1;/va _lvl2 %2;/va _wuxin %3;/math nd1 ($_lvl1)*($_lvl1+1)*(2*$_lvl1+1)/6;/math nd2 ($_lvl2)*($_lvl2+1)*(2*$_lvl2+1)/6;/math _needQn ($nd2-$nd1)/($_wuxin/2);/sh ${_HIG}skill from $_lvl1 to $_lvl2 need qn $_needQn${_NOR}}
/al {askwx} {/va _lvl %1;/math _needWx ($_lvl*$_lvl*$_lvl)/10;/sh ${_HIG}skill to $_lvl need wx $_needWx${_NOR}}
/al {exp} {hp;/sleep 1;/math _exp ($_wx+$_year*1000+$_day*4)/2;/math _leftexp (50000-$_exp)*2;/sh $_exp - ($_leftexp)}
/al {asken} {/va _baseSkill %1;/va _adSkill %2;/math _enlvl $_adSkill*1+$_baseSkill/2;/math _maxFM $_enlvl*10;/math _enForce $_enlvl/2;/math _enChant $_maxFM/20+1;/sh ${_HIG}基本skill($_baseSkill),特殊skill($_adSkill) => 有效等级($_enlvl),MaxForce($_maxFM),MaxEnforce($_enForce),MaxEnchant($_enChant)${_NOR}}

/nop 1 year = 250 day,1 day = 12 hour, 3 hour = 1exp
/al {askdh} {/va _lvl %1;/math _exp $_lvl*$_lvl*$_lvl/10;/math _y $_exp/(4*250);/math _d ($_exp-4*250*$_y)/4;/math _h $_exp-4*250*$_y-4*$_d;/sh ${_HIG}需要道行$_y年$_d天$_h时辰${_NOR}}

/nop ---------------------------------------------------------------------------------
/va {wxjjArray} {初学乍练;初窥门径;粗通皮毛;略知一二;半生不熟;马马虎虎;已有小成;渐入佳境;驾轻就熟;了然于胸;出类拔萃;心领神会;神乎其技;出神入化;豁然贯通;登峰造极;举世无双;一代宗师;震古铄今;深不可测}
/va _day 0;/va _year 0
/al dd {/va _qx;/va _Qx;/va _nl;/va _Nl;/va _js;/va _Js;/va _fl;/va _Fl;/va _sw;/va _Sw;/va _wx;/va _qn;/va _sq;/va _year;/va _day;/va _maxNl;/va _maxFl}
/al {_AqxAction} {/nop}
/al {_AjsAction} {/nop}
/al {_AswAction} {/nop}
/al {_AysAction} {/nop}
/al {_AqnAction} {/nop}

/action {体格：[ %0]  根骨：[ %1]  悟性：[ %2]  灵性：[ %3]} {/math _str %0;/math _con %1;/math _int %2;/math _spi %3} {3} {dataGet}
/action {气血%1m%2/%3m%4(%5%)%6内力：%7m%8/%9(} {/math _qx %2;/math _Qx %3;/math _perQx %5;/math _nl %8;/math _Nl %9;/math _maxNl {$_Nl/20};_AqxAction} {3} {dataGet}
/action {精神%1m%2/%3m%4(%5%)%6法力：%7m%8/%9(} {/math _js %2;/math _Js %3;/math _perJs %5;/math _fl %8;/math _Fl %9;/math _maxFl {$_Fl/20};_AjsAction} {3} {dataGet}
/action {食物%1m%2/%3m%4武学：%5m%6} {/math _sw %2;/math _Sw %3;/math _wx %6;_AswAction} {3} {dataGet}
/action {饮水%1m%2/%3m%4道行} {/math _ys %2;/math _Ys %3;_AysAction} {3} {dataGet}
/action {饮水%1m%2/%3m%4道行%5m%6年} {/math _ys %2;/math _Ys %3;/ctoi _year %6;_AysAction} {2} {dataGet}
/action {饮水%1m%2/%3m%4道行%5m%6天} {/math _ys %2;/math _Ys %3;/ctoi _day %6;_AysAction} {2} {dataGet}
/action {饮水%1m%2/%3m%4道行%5m%6年%7天} {/math _ys %2;/math _Ys %3;/ctoi _year %6;/ctoi _day %7;_AysAction} {1} {dataGet}
/action {潜能%1m%2m%3杀气：%4m%5} {/math _qn %2;/math _sq %5;_AqnAction} {3} {dataGet}
/action {道行境界：%1武学境界：%0} {/stripansi _wxjj %0;/math _lwj @arrayIdx{$_wxjj $wxjjArray}} {1} {dataGet}
/action {法力修为：%1内力修为：%0年} {/stripansi _nlxw %0;/ctoi _lnl $_nlxw} {1} {dataGet}

/nop ---------------------------------------------------------------------------------

/al _AautoRunAct {/nop} 
/al _Agetdir5 {/va dirlist {$dir0;$dir1;$dir2;$dir3;$dir4};/va dnum @rnd{0 4};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir4 {/va dirlist {$dir0;$dir1;$dir2;$dir3};/va dnum @rnd{0 3};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir3 {/va dirlist {$dir0;$dir1;$dir2};/va dnum @rnd{0 2};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir2 {/va dirlist {$dir0;$dir1};/va dnum @rnd{0 1};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir1 {/va dir $dir0}

/action {这里明显的出口是 %0、%1、%2、%3 和 %4。} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;/stripansi dir3 %3;/stripansi dir4 %4;_Agetdir5;_AautoRunAct} {1} {autoRun}
/action {这里明显的出口是 %0、%1、%2 和 %3。} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;/stripansi dir3 %3;_Agetdir4;_AautoRunAct} {2} {autoRun}
/action {这里明显的出口是 %0、%1 和 %2。} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;_Agetdir3;_AautoRunAct} {3} {autoRun}
/action {这里明显的出口是 %0 和 %1。} {/stripansi dir0 %0;/stripansi dir1 %1;_Agetdir2;_AautoRunAct} {4} {autoRun}
/action {这里唯一的出口是 %0。} {/stripansi dir0 %0;_Agetdir1;_AautoRunAct} {5} {autoRun}


/al wk {t+ autoRun;t+ zizuLin}
/al unwk {t- autoRun;t- zizuLin}
/al _Awalk {/sleep 1;go $dir}


/action {小路 -} {n} {zizuLin}
/action {紫竹林 -} {_Awalk} {zizuLin}
/action {罗汉塔 -} {out} {zizuLin}
/action {池塘边 -} {t- zizuLin;s;w} {zizuLin}


/action {风尽处，你走了出来。} {/sleep 2;_AoutDongAct} {kuguDong}
/action {舍利塔 -} {t- autoRun;bury sheli zi} {kuguDong}
/action {你被嘭地一声摔在地上！} {zuan} {kuguDong}
/action {你大叫一声，从天而降！} {t+ autoRun;/al _AautoRunAct {/sleep 0.5;get sheli zi;go $dir};l} {kuguDong}



/va working 0;/va finish 0;/va getit 0;/va cnt 0
/al {search_init} {/al2var {path} %0;/math working 1;/math finish 0;/math getit 0;/math cnt 0;/getl {len} {$path};t+ autoFind}

/al ca3 {search_init path_changanwest2;search $leguai}
/al 长安城 {search_init path_changan;search $leguai}
/al 长安城西 {search_init path_changanwest1;search $leguai}
/al 开封城 {search_init path_kaifeng;search $leguai}
/al 普陀山 {search_init path_putuo;search $leguai}
/al 方寸山 {search_init path_fangcunshan;search $leguai}
/al 龙宫 {search_init path_longgong;search $leguai}
/al 月宫 {search_init path_moon;search $leguai}
/al 高老庄 {search_init path_gaolaozhuang;search $leguai}
/al 红楼一梦 {search_init path_honglou;search $leguai}
/al 宝象国 {search_init path_baoxiang;search $leguai}
/al 车迟国 {search_init path_chechi;search $leguai}
/al 女儿国 {search_init path_nuerguo;search $leguai}
/al 金平府 {search_init path_jinpingfu;search $leguai}
/al 祭赛国 {search_init path_jisaiguo;search $leguai}
/al 天竺国 {search_init path_tianzhuguo;search $leguai}
/al 玉华县 {search_init path_yuhuaxian;search $leguai}
/al 朱紫国 {search_init path_zhuziguo;search $leguai}
/al 大雪山 {search_init path_xueshan;search $leguai}
/al 乌鸡国 {search_init path_wujiguo;search $leguai}
/al 比丘国 {search_init path_biqiuguo;search $leguai}
/al 碧波潭 {search_init path_bibotan;search $leguai}
/al 青龙山 {search_init path_qinglongshan;search $leguai}
/al 隐雾山 {search_init path_yinwushan;search $leguai}
/al 五庄观 {search_init path_wuzhuangguan;search $leguai}
/al 竹节山 {search_init path_zhujieshan;search $leguai}
/al 豹头山 {search_init path_baotoushan;search $leguai}
/al 积雷山 {search_init path_jileishan;search $leguai}
/al 火焰山 {search_init path_huoyanshan;search $leguai}
/al 毛颖山 {search_init path_maoyingshan;search $leguai}
/al 钦法国 {search_init path_qinfaguo;search $leguai}
/al 通天河 {search_init path_tongtianhe;search $leguai}
/al 小西天 {search_init path_xiaoxitian;search $leguai}
/al 金兜山 {search_init path_jindoushan;search $leguai}
/al 无底洞 {search_init path_wudidong;search $leguai}
/al 盘丝岭 {search_init path_pansiling;search $leguai}
/al 凤仙郡 {search_init path_fengxianjun;search $leguai}
/al 麒麟山 {search_init path_qilinshan;search $leguai}
/al 毒敌山 {search_init path_dudishan;search $leguai}
/al 平顶山 {search_init path_pingdingshan;search $leguai}
/al 荆棘岭 {search_init path_jingjiling;search $leguai}
/al 蓬莱仙岛 {search_init path_penglai;search $leguai}
/al 阴曹地府 {search_init path_hell;search $leguai}

/delimiter {;}

/al {_AtrigStep} {look $leguai}
/al {_AstepWait} {/sleep 0.5}
/al {getp}{/geti {dothis} {%%0} $path}

/al {_Abackstep} {/math cnt $cnt-1}
/al {_Abackgo} {_Abackstep;getp $cnt;/var2al {_Adothis} $dothis;_Adothis;_Abackhell}
/al {_Ascontinue} {t+ autoFind;_Aunwld;/if {$getit=0} {search $leguai}}
/al {_Akcontinue} {t+ autoFind;/if {$getit=0} {search $leguai}}
/al {_Abreak} {t- autoFind;_Abackstep}
/al {_AyuanAction} {/nop}
/al {_Afire} {/if {$_Bfiring} {touxiang;er;/sleep 0.2;cast inferno on $leguai}}
/al {_Abackhell} {t- autoFind;cast townportal;/3 north;3e;3s;se;out}
/al {buyfu} {unset no_accept;buy jiudai from er;w;n;3w;n;give yuan jiudai}

/al {stophelp} {t- taskHelper;t- autoFind;t- dataGet;t- autoQuit}

/al {startkill} { \
    /setprompt {-$cguai-$place-$nguai-$getwx-$getqn-$error}; \
    /al _AfoundAction {t- autoKp2;t+ autoKp3;_Awield;bian;cha $leguai}; \
    /va nguai 0;/va getit 0;/va getwx 0;/va getqn 0; \
    /al ticksize 360;/al tick {w;askli}; \
    /al {search} { \
            /if {$cnt<$len && $getit=0} \
                {getp $cnt;/if {[$dothis!=_Fnext]} {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep;/math cnt $cnt+1}} \
	    else { \
                /if {$cnt=$len} {/sleep 2;t- autoKp2;t+ autoKp4;/math error -1;_Aback2pl}}}; \
    t+ dataGet;t- autoKp2;t- autoKp3;t- autoKp4;t+ autoKp1;t+ autoFind;eson;/al _AoutDongAct {t+ autoKp1;askli};t+ kuguDong; \
    /al _Adoesc {t- autoKp3;t+ autoKp4;/tickof;/math error 3;_Aback2pl}; \
	score;hp \
}

/al {stopkill} {t- dataGet;t- autoKp1;t- autoKp2;t- autoKp3;t- autoKp4;t- autoFind;t- autoQuit;esof;/al tick uptime}


/nop error == 0, 	kill guai success,back to kz and wait an other task
/nop error == 3, 	found guai,but has not kill it,need kill again
/nop error == 2, 	not found the guai,need ask li jing and find again
/nop error == 1,	ask li jing fail,need ask again
/nop error == -1,	not found the guai,but not find again,task fail,wait the next one

/va error 0

/al {2f} {fly sky;4e;10n;4w;open door;s;close door}
/al {f2} {touxiang;open door;n;close door;w;fly changan;s;e}
/al _Aback2pl {touxiang;cast townportal}
/al _AsetTsize {/if {$error<0} {/math tickval 1800+$pretime-$_time;/if {$tickval<=10} {/math tickval 10};/al tick {/math vv $_time-$pretime;/if {$vv>1805} {w;askli;/al tick {w;askli}} else {/sh $vv;uptime}};/ticksize 60} else {/math tickval 365+$pretime-$_time;/if {$tickval<=10} {/math tickval 10};/ticksize $tickval;/al tick {w;askli}};/tickon}
/al _AKpbackKz {fly changan;s;e;_AsetTsize}

/al _AdisableKill {t- autoKp1;t- autoKp2;t- autoKp3;t- autoKp4}
/nop tick switch from idle to kill,we should kill the guai in 5 mins
/al _Atick1to2 {/al tick {_AdisableKill;t+ autoKp4;/va error 3;_Aback2pl};/ticksize 300;/tickon}

/al _AafterRecover {/nop}
/al {_AsetRecover} {/al _AjsAction {/if {$chkHP} {/if {$_fl<$_Fl*2*8/10} {/3 touxiang;er;ef;mingsi 100} else {/if {$_nl<$_Nl*2*8/10} {/3 touxiang;er;ef;dazuo 100} else {/al _AjsAction {/nop};t- autoRecover;_AafterRecover}}};b- chkHP};b+ chkHP;hp}


/action {^你行功完毕，从冥思中回过神来。} {/sleep 2;_AsetRecover} {autoRecover}
/action {^你行功完毕，吸一口气，缓缓站了起来。} {/sleep 2;_AsetRecover} {autoRecover}


/nop ask guai

/action {^李靖对你说道：近有%0(%1)在%2为非作歹，请速去降服！} {/va cp 0;/ifm {*怪} {%%0} {/va cp 1};/ifm {*精} {%%0} {/va cp 1};/ifm {*虎} {%%0} {/va cp 1};/ifm {*狮} {%%0} {/va cp 1};/ifm {*豹} {%%0} {/va cp 1};/ifm {*熊} {%%0} {/va cp 1};/ifm {*豺} {%%0} {/va cp 1};/ifm {*罴} {%%0} {/va cp 1};/ifm {*狈} {%%0} {/va cp 1};/ifm {*狼} {%%0} {/va cp 1};/if {$cp=1} {/va cguai %%0;/va eguai %%1;/va place %%2;/tolower leguai $eguai;/va error 0;/va pretime $_time;t- autoKp1;t+ autoKp2;jiali $_maxNl;enchant $_maxFl;_Atick1to2;$place}} {3} {autoKp1}
/action {${_NOR}${_CYN}李靖说道：老夫不是派你去降服%0吗？} {/if {[$leguai!=0]} {/va cguai %0;/va bAsk 0;/va bFind 1;fly kaifeng;find $leguai}} {autoKp1}
/action {^千里眼告诉你：奇怪，找不到这个人．．．} {/if {$bFind=1} {/if {($error=-1)||($error=2)} {/math error -1;_AKpbackKz} else {/math pretime $_time-1200;/math error -1;_AKpbackKz};/va bFind 0}} {autoKp1}
/action {^千里眼告诉你：%0($leguai)在%1。} {/if {$bFind=1} {/if {($error=-1)&&([%%0=$place])} {_AKpbackKz} else {/va cguai %%0;/va place %%1;t- autoKp1;t+ autoKp2;_Atick1to2;$place};/va bFind 0}} {autoKp1}
/action {^这里没有这个人。} {/if {$bAsk} {/math error 1;/math pretime $_time;_AKpbackKz;/va bAsk 0}} {autoKp1}
/action {^李靖对手中照妖镜一看，说：这位姑娘,妖魔已除尽,不妨先去歇息。} {_AKpbackKz} {autoKp1}


/al {_AKp2continue} {t+ autoKp2;/if {$getit=0} {search $leguai}}
/al {_AKp2break} {t- autoKp2;_Abackstep}
/al {_Arecover_ct} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover}
/nop {^只见荆棘被推的不住后退。}
/nop {^荆棘被推到两旁，闪出一条道路。}

/nop find guai
/action {%0一把抓住了你！} {_Abackstep} {autoKp2}
/action {你正要离开，忽然看见什么东西在眼前一晃，不由得停了下来。} {_Abackstep} {autoKp2}
/action {^宫前护卫伸手挡住了你的去路。} {_Abreak;kill li shi} {autoKp2}
/action {^阁门大使向你摇了摇手。} {_Abreak;kill da shi} {autoKp2}
/action {^黑熊怪伸手拦住你：你往本门书院里走干什么呀？} {_Abreak;kill bear} {autoKp2}
/action {^吴刚拦道：此间并非戏耍之处，请勿骚扰我仙家清修} {_Abreak;kill wu gang} {autoKp2}
/action {^云阳真人说道：祖师清修，少见外人，您还是请回吧！} {_Abreak;t- autoKp2;t+ autoKp4;/math error 2;_Aback2pl} {autoKp2}
/action {^你一觉醒来，只觉精力充沛。该活动一下了。} {w;t- autoKp2;t+ autoKp1;/math error -1;_AsetTsize} {autoKp2}
/action {^西波儿古嚷道：宫中有贵客，闲人免进！} {_Abreak;kill xiboer gu} {autoKp2}
/action {^古波儿西嚷道：宫中有贵客，闲人免进！} {_Abreak;kill guboer xi} {autoKp2}
/action {^天波儿笑喝道：后院是禁地，还是莫去的好！} {_Abreak;kill tianboer xiao} {autoKp2}
/action {^笑波儿天喝道：后院是禁地，还是莫去的好！} {_Abreak;kill xiaoboer tian} {autoKp2}
/action {^赤身鬼使一挺手中钢叉，挡住了你的去路。} {_Abreak;kill guard} {autoKp2}
/action {^守门牛精一晃两只大牛角抵住你：想溜到哪儿去？} {_Abreak;s;sw;fly qinglong;sw;se;sd;se;s;w;n;s;e;se;se;s;s;s;s;e;s;buy hulu from dian zhu;buy hulu from dianzhu;n;e;n;fill hulu} {autoKp2}
/action {^寿星伸手拦住你：里面是老夫卧室，你去干什么？} {_Abreak;kill shou xing} {autoKp2}
/action {^福星伸手拦住你：里面是老夫卧室，你去干什么？} {_Abreak;kill fu xing} {autoKp2}
/action {^禄星伸手拦住你：里面是老夫卧室，你去干什么？} {_Abreak;kill lu xing} {autoKp2}
/action {^你从悬崖上跳了下来，跌了个大跟斗。} {_Abreak;/sleep 5;/3 exert heal;_Akcontinue} {autoKp2}
/action {^你从悬崖上跳了下来，轻轻巧巧地落在地上，毫发未损。} {_Abreak;/sleep 5;_Akcontinue} {autoKp2}
/action {^你将油葫芦灌满酥合香油。} {/sleep 2;s;fly qinglong;nw;wu;wu;nw;nu;ne;ne;n;give niujing hulu;_Akcontinue} {autoKp2}
/action {^罐子里已没有酥合香油了。} {t- autoKp2;t+ autoKp4;/math error 2;s;fly changan;d;drop hulu;u;_Aback2pl} {autoKp2}
/action {^守寺僧说道：“寺院恕不接客，请回。”} {_Abreak;kill shousi seng} {autoKp2}
/action {^边关守将嚷到：那不是你该去的地方！} {_Abreak;kill wu jiang} {autoKp2}
/action {^护宫卫士喝道：禁行！} {_Abreak;/ticksize 300;jiali 0;kill wei shi} {autoKp2}
/action {^夏鹏展一个箭步闪到你前面，狞笑道：} {_Abreak;jiali 0;kill xia} {autoKp2}
/action {^山妖呲牙咧嘴地死活不让你过！} {_Abreak;/sleep 2;F6;/sleep 2;_Akcontinue} {autoKp2}
/action {^请捐(donate)一两银子到雕玉箱里。欢迎多捐：）} {_Abackstep;donate 1 silver} {autoKp2}
/action {荡悠悠三更梦} {_Akcontinue} {autoKp2}
/action {^大使死了。} {_Arecover_ct} {autoKp2}
/action {%0力士死了。} {_Arecover_ct} {autoKp2}
/action {^吴刚死了。} {_Arecover_ct} {autoKp2}
/action {^西波儿古死了。} {_Arecover_ct} {autoKp2}
/action {^古波儿西死了。} {_Arecover_ct} {autoKp2}
/action {^天波儿笑死了。} {_Arecover_ct} {autoKp2}
/action {^笑波儿天死了。} {_Arecover_ct} {autoKp2}
/action {^赤身鬼使死了。} {_Arecover_ct} {autoKp2}
/action {^守寺僧死了。} {_Arecover_ct} {autoKp2}
/action {^边关守将死了。} {_Arecover_ct} {autoKp2}
/action {^只听一声鹤鸣，寿星化作一道白光向天上直冲而去。。。} {_Arecover_ct} {autoKp2}
/action {^只听一声鹤鸣，禄星化作一道白光向天上直冲而去。。。} {_Arecover_ct} {autoKp2}
/action {^只听一声鹤鸣，福星化作一道白光向天上直冲而去。。。} {_Arecover_ct} {autoKp2}
/action {护宫卫士死了。} {touxiang;er;ef;jiali $_maxNl;enchant $_maxFl;_Akcontinue} {autoKp2}
/action {夏鹏展死了。} {touxiang;er;ef;jiali $_maxNl;enchant $_maxFl;_Akcontinue} {autoKp2}
/action {「咚」的一声，你从机关掉到了铁笼中………} {break;er} {autoKp2}
/action {只听铁栏杆发出“咔，咔”的响声………} {/sleep 0.2;break;er} {autoKp2}
/action {铁栏杆的缝隙足够一个人钻出去了。} {ca3} {autoKp2}
/action {铁笼已经打开了，别费劲了。} {ca3} {autoKp2}
/action {%0精拉拉扯扯揪住你不放。} {/va cjing %0;_Abreak;_Aunwield;kill yao jing} {autoKp2}
/action {%0精脚下一个不稳，跌在地上一动也不动了。} {touxiang;_Awieldb;_Akcontinue} {autoKp2}


/nop kill guai

/action {^顺风耳告诉你：$cguai的武功已达%0的境界。} {/stripansi gwxjj %0;/math glwj @arrayIdx{$gwxjj $wxjjArray};/math glwj $glwj-2} {autoKp3}
/action {^顺风耳告诉你：$cguai的内力修为已有%0年%1m的火候。} {/stripansi gnlxw %0;/ctoi glnl $gnlxw;/math glnl $glnl-10;/if {(($_lwj>=18)||(($_lwj<18)&&($_lwj>=$glwj)))&&(($glnl)&&($_lnl>$glnl))} {follow $leguai;kill $leguai} else {t- autoKp3;t+ autoKp2;/var getit 0;_Akcontinue}} {autoKp3}
/action {^$cguai狂笑道：就凭你这点本事，也来跟我斗？} {touxiang;/4 exert heal;er;kill $leguai} {autoKp3}
/action {^$cguai道：也叫你尝尝这无敌三板斧的厉害！} {touxiang;/4 exert heal;er;kill $leguai} {autoKp3}
/action {^这无敌三板斧一气呵成，你被攻了个措手不及，伤势甚为可怕！} {touxiang;/8 exert heal;er;kill $leguai} {autoKp3}
/action {${_NOR}${_HIW}你促不击防，被$cguai的长鼻高高卷起} {touxiang} {autoKp3}
/action {^只听见「啪」地一声，你手中的%0已经断为两截！} {remove dun;wield bang;wield gun;wear dun} {autoKp3}
/action {^哗啦啦一阵碎石头响，$cguai从山壁上斜滑了下来！} {sd;kill $leguai} {autoKp3}
/action {( 你上一个动作还没有完成，不能施用内功。)} {/sleep 1;er} {autoKp3}
/action {${_HIR}黑色柳丁向%0追去。} {_Adoesc} {autoKp3}
/action {^慢慢地你终于又有了知觉．．．} {ef;ef;/sleep 2;_Adoesc} {autoKp3}
/action {^$cguai往%0离开。} {kill $leguai} {autoKp3}
/action {^$cguai推开一堆野草，往地下钻了进去。} {enter;kill $leguai} {autoKp3}
/action {^$cguai往%0落荒而逃了。} {kill $leguai} {autoKp3}
/action {^$cguai一看不是你的对手，只得就地一滚，变回原形，打了几个转，老老实实地走开了。} {/nop} {autoKp3}
/action {^$cguai眼见无奈，只好化成股青烟附到了你的手中。} {/nop} {autoKp3}
/action {^你手一挥，$cguai如蒙大赦，驯服地走开了。} {/nop} {autoKp3}
/action {^$cguai无可奈何，化做一道青光，直冲云霄去了．．．} {/nop} {autoKp3}
/action {^$cguai惨叫一声，死了。} {/nop} {autoKp3}
/action {^你得到了%0点武学经验和%1点潜能！} {/va leguai 0;/math nguai $nguai+1;/ctoi getwx %0;/ctoi getqn %1;t- autoKp3;t+ autoKp4;/math error 0;_Aback2pl} {autoKp3}

/nop heal

/action {^周围没有一片云，没办法腾云驾雾。} {/nop} {autoKp4}
/action {^你转身想跑，却被%0一个箭步拦住。} {/sleep 2;_Adoesc} {autoKp4}
/action {^你口中喷出一股黑风，整个人也随着黑风散去。。。} {/tickof;/3 north;3e;3s;se;out} {autoKp4}
/action {^你现在不能移动！} {/purge;/sleep 4;/tickof;/3 north;3e;3s;se;out} {autoKp4}
/action {^忽然一股青气笼住了你。} {er;ef;open guancai;t- autoKp4;t+ autoRecover;2f;/al _AafterRecover {/if {$error=3} {t- autoKp4;t+ autoKp2;_Atick1to2;touxiang;open door;n;close door;w;_Awield;$place} else {touxiang;open door;n;close door;w;_AKpbackKz;t- autoKp4;t+ autoKp1}};_AsetRecover} {autoKp4}


/highlight {yellow} {%0$cguai($eguai)}

/action {你要看什么？} {/if {$getit=0} {_AstepWait;search $leguai}} {autoFind}
/action {%0%1$cguai($eguai)} {/if {$getit=0} {/var getit 1;b- _Bctguai;_AfoundAction;/purge}} {4} {autoFind}


/al {_AyuanAction} {/nop}

/al {startwork} { \
	/va helper liuding;/va failcnt 0; \
	/al _Aprd2kz {e;2s;e;u;e}; \
	/al _Akz2prd {w;d;w;2n;w}; \
	/al {_AysAction} {/if {$_year<5 && $_wx < 20000} {/va tguai 小小} else {/va tguai 十年}}; \
	/al _AyuanAction {tell $helper 9527 [$tguai]$cguai[$eguai]-[$leguai]在$place;_Aprd2kz}; \
	t+ dataGet;t+ taskYuan;t+ taskNewBie;/ticksize 60; \
	/al tick {_Akz2prd;ask yuan about kill};hp}

/al {starthelp} { \
	/al _AfoundAction {b+ _Bfiring;t- autoFind;kill $leguai;F6;cast inferno on $leguai;touxiang}; \
	/va getit 0;/va working 0;/va _Bctguai 0; \
	/al tick {/if {$_Bctguai} {_Abackhell} else {uptime}}; \
	/al {search} { \
	    /if {$cnt<$len && $getit=0} \
                {getp $cnt;/if {[$dothis!=_Fnext]} {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep;/math cnt $cnt+1}} \
	    else { \
                /if {$cnt=$len} {/sleep 2;_Abackhell;/if {$finish=0} {tell $newbie 9527 没有找到$cguai！}}}}; \
	    t+ dataGet;t+ taskHelper;t+ autoQuit;hp}

/al {stophelp} {t- taskHelper;t- autoFind;t- dataGet;t- autoQuit}

/al {s1} {t- autoFind}
/al {s2} {t+ autoFind}

/action {^袁天罡将手中桃木剑向四方一划，对你说道：} {b+ _Baskg} {taskYuan}
/action {近有%0(%1)在%2出没，为害不小，请速去收服！} {/if {$_Baskg} {/if {[%%%0!=$cguai] || [%%%2!=$place]} {/math failcnt 0;/ticksize 60};/va cguai %%0;/va eguai %%1;/va place %%2;/tolower leguai $eguai;b- _Baskg;_AyuanAction}} {taskYuan}

/nop newbie ask yuan
/action {^这里没有这个人。} {_Aprd2kz} {taskNewBie}
/action {%0(%1)告诉你：9527 没有找到%2！} {/if {[%%2=$cguai]} {/math failcnt $failcnt+1;/math tmptick 60+$failcnt*10;/ticksize $tmptick}} {taskNewBie}
/action {^你得到了%0点武学经验和%1点潜能！} {/ctoi g_wx %0;/ctoi g_qn %1;/sysecho [$_rclock] 消灭$cguai得 武学 $g_wx 潜能 $g_qn  >> log/yuan.log} {taskNewBie}
/action {^袁天罡说道：在下不是请您去收服%0吗？} {_AyuanAction} {taskNewBie}
/action {^袁天罡将手中桃木剑缓缓放下，说：多谢小%0,妖魔已经除尽了。} {_Aprd2kz} {taskNewBie}
/action {^护宫卫士大喝一声：下去！你被扔回了下界。} {6n;e;u;e} {taskNewBie}

/al _Awld {wield gun;/sleep 1;jiali $_maxNl;enchant $_maxFl}
/al _Aunwld {unwield gun;jiali 0}
/al _A2lusheng {fly changan;6s;3w}
/al _Atickidle {/ticksize 300;/al tick uptime}
/al _Aticklusheng {/ticksize 15;/al tick {kill lu sheng}}

/nop helper kill guai
/action {袁守诚给你一本〖无字天书〗。} {set no_accept;tear book;s;3e;s;e} {taskHelper}
/action {你从%0身上搜出一只黄粱枕。} {_Aunwld} {taskHelper}
/action {%0(%6)告诉你：9527 [%1]%2[%3]-[%4]在%5} {/if {$working=0} {/va newbie %%6;/va tguai %%1;/va cguai %%2;/va eguai %%3;/va leguai %%4;/va place %%5;/ticksize 300;/al tick _Abackhell;w;t+ autoFind;$place}} {3} {taskHelper}
/action {宫前护卫伸手挡住了你的去路。} {_Abreak;_Awld;kill li shi} {taskHelper}
/action {黑熊怪伸手拦住你：你往本门书院里走干什么呀？} {_Abreak;_Awld;kill bear} {taskHelper}
/action {吴刚拦道：此间并非戏耍之处，请勿骚扰我仙家清修} {_Abreak;_Awld;kill wu gang} {taskHelper}
/action {云阳真人说道：祖师清修，少见外人，您还是请回吧！} {_Abreak;_Awld;kill master} {taskHelper}
/action {请捐(donate)一两银子到雕玉箱里。欢迎多捐：）} {_Abackstep;donate 1 silver} {taskHelper}
/action {你刚睡过一觉, 先活动活动吧。} {_Abreak;/sleep 2;_Ascontinue} {taskHelper}
/action {你往被中一钻，开始睡觉。} {_Abreak} {taskHelper}
/action {你一觉醒来，只觉精力充沛。该活动一下了。} {w;w;_A2lusheng;_Awld;kill lu sheng;_Aticklusheng} {taskHelper}
/action {卢生死了。} {get zhen from corpse;_Aunwld;fly changan;s;e;_Atickidle;/math working 0} {taskHelper}
/action {荡悠悠三更梦} {_Ascontinue} {taskHelper}
/action {%0力士死了。} {_Ascontinue} {taskHelper}
/action {云阳真人死了。} {_Ascontinue} {taskHelper}
/action {这里不准念咒文。} {_Abackgo} {taskHelper}
/action {对你直摇头：这大喜的日子，你念哪门子咒啊！} {_Awld;kill $leguai} {taskHelper}
/action {吴刚死了。} {_Ascontinue} {taskHelper}
/action {「咚」的一声，你从机关掉到了铁笼中………} {jiali 70;break;er} {taskHelper}
/action {只听铁栏杆发出“咔，咔”的响声………} {/sleep 0.2;break;er} {taskHelper}
/action {铁栏杆的缝隙足够一个人钻出去了。} {ca3} {taskHelper}
/action {铁笼已经打开了，别费劲了。} {ca3} {taskHelper}
/action {你正要离开，忽然看见什么东西在眼前一晃，不由得停了下来。} {_Abackstep} {taskHelper}
/action {${_HIB}你双掌一搓，登时燃起一团蓝色的火焰，点点磷光飘向了$cguai！} {_Afire} {taskHelper}
/action {( 你上一个动作还没有完成，不能念咒文。)} {_Afire} {taskHelper}
/action {你现在不能用魔法！} {_Afire} {taskHelper}
/action {这次好象不大灵。} {_Afire} {taskHelper}
/action {$cguai惨叫一声，死了。} {b- _Bfiring;/sleep 8;/math finish 1;/if {[$place=红楼一梦]} {/va getit 0;_Ascontinue} else {_Abackhell}} {taskHelper}
/action {$cguai往%0落荒而逃了。} {b- _Bfiring;t+ autoFind;/sleep 8;_Abackhell} {taskHelper}
/action {$cguai往%0离开。} {b- _Bfiring;t+ autoFind;/sleep 8;_Abackhell} {taskHelper}
/action {你的动作还没有完成，不能移动。} {/sleep 2;_Abackhell} {taskHelper}
/action {忽然一股青气笼住了你。} {open guancai;w;8n;e;/al tick uptime;/math working 0} {taskHelper}


/nop ------------------------------------------------------------------
/nop fight trigger settings
/nop ------------------------------------------------------------------

/alias eson {t+ dataGet;t+ autoEscape;/alias _Adoesc {t+ autoRun;look};/al _AautoRunAct {go $dir;t- autoRun}}
/alias esof {t- dataGet;/al _AqxAction {/nop};t- autoEscape;/al _AautoRunAct {/nop}}

/nop Hurt <value> 
/nop - value = 0,player will die
/nop - value > 0,just reduce qixue
/nop - value < 0,reduce max qixue and qixue

/al Hurt {/var Hurt %0;/if {($Hurt<1 && $Hurt>-20) || ($Hurt>0 && $Hurt<1)} {/pause off;/purge;quit;/sysecho [$_rclock] $name Hurt=$Hurt >> log/quit.log};/if {$Hurt<-19 && $Hurt>-100} {esc1nd};/if {$Hurt>1&& $Hurt<80} {esc2nd};/if {$Hurt>79 && $Hurt<100} {esc3nd}}
/al eHurt {/var eHurt %0;/if {($eHurt<0)&&($_perQx>70)&&($_perJs>70)} {/math num 11+$eHurt/10;touxiang;/$num eat hunyuan dan;/$num exert heal;er;ef;kill $leguai} else {touxiang;_Adoesc}}
/al esc3nd {/nop}
/al esc2nd {/if {($_nl>$_Nl/3)&&($_perQx>70)&&($_perJs>70)} {er} else {touxiang;_Adoesc}}
/al esc1nd {/if {($_nl>$_Nl/3)&&($_perQx>70)&&($_perJs>70)} {/math num 11+$Hurt/10;touxiang;/$num exert heal;er;ef;kill $leguai} else {touxiang;_Adoesc}}

/action {你$_RED已经} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 1;b- bHP}};hp} {autoEscape}
/action {你$_RED摇头} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 10;b- bHP}};hp} {autoEscape}
/action {你$_HIR看} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 20;b- bHP}};hp} {autoEscape}
/action {你$_HIR已经一} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 30;b- bHP}};hp} {autoEscape}
/action {你$_HIR似乎} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 40;b- bHP}};hp} {autoEscape}
/action {你$_HIY气} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 60;b- bHP}};hp} {autoEscape}
/action {你$_HIY动作} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 80;b- bHP}};hp} {autoEscape}
/action {你$_HIY看起来可能有} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 90;b- bHP}};hp} {autoEscape}
/action {你$_HIG似乎有} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 95;b- bHP}};hp} {autoEscape}
/action {你$_RED受伤} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -5;b- bHP}};hp} {autoEscape}
/action {你$_RED伤重} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -10;b- bHP}};hp} {autoEscape}
/action {你$_HIR受} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -20;b- bHP}};hp} {autoEscape}
/action {你$_HIR已经伤} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -30;b- bHP}};hp} {autoEscape}
/action {你$_HIR气息} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -40;b- bHP}};hp} {autoEscape}
/action {你$_HIY受伤} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -60;b- bHP}};hp} {autoEscape}
/action {你$_HIY受了} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -80;b- bHP}};hp} {autoEscape}
/action {你$_HIY看起来可能受} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -90;b- bHP}};hp} {autoEscape}
/action {你$_HIG似乎受}	{b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -95;b- bHP}};hp} {autoEscape}
/action {你$_HIY看起来有些迷糊了。} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -60;b- bHP}};hp} {autoEscape}
/action {你$_HIY的确} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -60;b- bHP}};hp} {autoEscape}
/action {你$_HIR两眼} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -40;b- bHP}};hp} {autoEscape}
/action {你$_HIR迷迷} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -20;b- bHP}};hp} {autoEscape}
/action {你$_RED神智} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -10;b- bHP}};hp} {autoEscape}
/action {你$_RED心智} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt 1;b- bHP}};hp} {autoEscape}
/nop /action {$cguai走了过来。} {_Adoesc} {autoEscape}
