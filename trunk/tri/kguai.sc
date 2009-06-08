

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
/al F4 {tie $leguai}
/al F3 {follow $leguai;kill $leguai}
/al F2 {ask yuan about 赏银}
/al F1 {unwield fork;unwield gun;remove all;dismount lu;dismount ma;ask yuan about kill;mount lu;mount ma;wield fork;wield gun;wear all}
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

/highlight {yellow} {$cguai($eguai)}

/action {你要看什么？} {/if {$getit=0} {_AstepWait;search $leguai}} {autoFind}
/action {%0%1$cguai($eguai)} {/if {$getit=0} {/var getit 1;_AfoundAction;/purge}} {4} {autoFind}


/al {_AyuanAction} {/nop}

/al {startkill} { \
    /va nguai 0;/va getit 0;/va getwx 0;/va getqn 0; \
    /setprompt {-$cguai-$place-$nguai-$getwx-$getqn}; \
    /al _AfoundAction {#nop}; \
	/al {_AysAction} {/if {$_year<5 && $_wx < 20000} {/va tguai 小小} else {/va tguai 十年}}; \
	/al _AyuanAction {e;s;2e;n;ask wuyuan about fu;s;2w;n;w;$place}; \
    /al {search} { \
            /if {$cnt<$len && $getit=0} \
                {getp $cnt;/if {[$dothis!=_Fnext]} {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep;/math cnt $cnt+1}}}; \
	t+ dataGet;t+ taskYuan;t+ autoFind;eson;/ticksize 60; \
	/al tick ';hp}

/al {stopkill} {t- dataGet;t- autoFind;esof;/al tick uptime}

/al {s1} {t- autoFind}
/al {s2} {t+ autoFind}

/action {^袁天罡将手中桃木剑向四方一划，对你说道：} {b+ _Baskg} {taskYuan}
/action {近有%0(%1)在%2出没，为害不小，请速去收服！} {/if {$_Baskg} {/if {[%%%0!=$cguai] || [%%%2!=$place]} {/math failcnt 0;/ticksize 60};/va cguai %%0;/va eguai %%1;/va place %%2;/tolower leguai $eguai;b- _Baskg;_AyuanAction}} {taskYuan}

/action {^你得到了%0点武学经验和%1点潜能！} {/ctoi getwx %0;/ctoi getqn %1;/math nguai $nguai+1;/sysecho [$_rclock] 消灭$cguai得 武学 $getwx 潜能 $getqn  >> log/yuan.log} {taskYuan}
/action {^袁天罡说道：在下不是请您去收服%0吗？} {_AyuanAction} {taskYuan}
/action {^袁天罡将手中桃木剑缓缓放下，说：多谢小%0,妖魔已经除尽了。} {_Aprd2kz} {taskYuan}
/action {^护宫卫士大喝一声：下去！你被扔回了下界。} {6n;e;u;e} {taskYuan}

/al _Awld {wield gun;/sleep 1;jiali $_maxNl;enchant $_maxFl}
/al _Aunwld {unwield gun;jiali 0}
/al _A2lusheng {fly changan;6s;3w}
/al _Atickidle {/ticksize 300;/al tick uptime}
/al _Aticklusheng {/ticksize 15;/al tick {kill lu sheng}}

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
