

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
/al F2 {ask yuan about ����}
/al F1 {unwield fork;unwield gun;remove all;dismount lu;dismount ma;ask yuan about kill;mount lu;mount ma;wield fork;wield gun;wear all}
/al {3f} {fly jisaiguo;4s;w;w;open door;n;n;n;nu;ask chanshi about ɨ��;enter;11u}
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
/al {asken} {/va _baseSkill %1;/va _adSkill %2;/math _enlvl $_adSkill*1+$_baseSkill/2;/math _maxFM $_enlvl*10;/math _enForce $_enlvl/2;/math _enChant $_maxFM/20+1;/sh ${_HIG}����skill($_baseSkill),����skill($_adSkill) => ��Ч�ȼ�($_enlvl),MaxForce($_maxFM),MaxEnforce($_enForce),MaxEnchant($_enChant)${_NOR}}

/nop 1 year = 250 day,1 day = 12 hour, 3 hour = 1exp
/al {askdh} {/va _lvl %1;/math _exp $_lvl*$_lvl*$_lvl/10;/math _y $_exp/(4*250);/math _d ($_exp-4*250*$_y)/4;/math _h $_exp-4*250*$_y-4*$_d;/sh ${_HIG}��Ҫ����$_y��$_d��$_hʱ��${_NOR}}

/nop ---------------------------------------------------------------------------------
/va {wxjjArray} {��ѧէ��;�����ž�;��ͨƤë;��֪һ��;��������;������;����С��;����Ѿ�;�������;��Ȼ����;�������;�������;����似;�����뻯;��Ȼ��ͨ;�Ƿ��켫;������˫;һ����ʦ;������;��ɲ�}
/va _day 0;/va _year 0
/al dd {/va _qx;/va _Qx;/va _nl;/va _Nl;/va _js;/va _Js;/va _fl;/va _Fl;/va _sw;/va _Sw;/va _wx;/va _qn;/va _sq;/va _year;/va _day;/va _maxNl;/va _maxFl}
/al {_AqxAction} {/nop}
/al {_AjsAction} {/nop}
/al {_AswAction} {/nop}
/al {_AysAction} {/nop}
/al {_AqnAction} {/nop}

/action {���[ %0]  ���ǣ�[ %1]  ���ԣ�[ %2]  ���ԣ�[ %3]} {/math _str %0;/math _con %1;/math _int %2;/math _spi %3} {3} {dataGet}
/action {��Ѫ%1m%2/%3m%4(%5%)%6������%7m%8/%9(} {/math _qx %2;/math _Qx %3;/math _perQx %5;/math _nl %8;/math _Nl %9;/math _maxNl {$_Nl/20};_AqxAction} {3} {dataGet}
/action {����%1m%2/%3m%4(%5%)%6������%7m%8/%9(} {/math _js %2;/math _Js %3;/math _perJs %5;/math _fl %8;/math _Fl %9;/math _maxFl {$_Fl/20};_AjsAction} {3} {dataGet}
/action {ʳ��%1m%2/%3m%4��ѧ��%5m%6} {/math _sw %2;/math _Sw %3;/math _wx %6;_AswAction} {3} {dataGet}
/action {��ˮ%1m%2/%3m%4����} {/math _ys %2;/math _Ys %3;_AysAction} {3} {dataGet}
/action {��ˮ%1m%2/%3m%4����%5m%6��} {/math _ys %2;/math _Ys %3;/ctoi _year %6;_AysAction} {2} {dataGet}
/action {��ˮ%1m%2/%3m%4����%5m%6��} {/math _ys %2;/math _Ys %3;/ctoi _day %6;_AysAction} {2} {dataGet}
/action {��ˮ%1m%2/%3m%4����%5m%6��%7��} {/math _ys %2;/math _Ys %3;/ctoi _year %6;/ctoi _day %7;_AysAction} {1} {dataGet}
/action {Ǳ��%1m%2m%3ɱ����%4m%5} {/math _qn %2;/math _sq %5;_AqnAction} {3} {dataGet}
/action {���о��磺%1��ѧ���磺%0} {/stripansi _wxjj %0;/math _lwj @arrayIdx{$_wxjj $wxjjArray}} {1} {dataGet}
/action {������Ϊ��%1������Ϊ��%0��} {/stripansi _nlxw %0;/ctoi _lnl $_nlxw} {1} {dataGet}

/nop ---------------------------------------------------------------------------------

/al _AautoRunAct {/nop} 
/al _Agetdir5 {/va dirlist {$dir0;$dir1;$dir2;$dir3;$dir4};/va dnum @rnd{0 4};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir4 {/va dirlist {$dir0;$dir1;$dir2;$dir3};/va dnum @rnd{0 3};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir3 {/va dirlist {$dir0;$dir1;$dir2};/va dnum @rnd{0 2};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir2 {/va dirlist {$dir0;$dir1};/va dnum @rnd{0 1};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir1 {/va dir $dir0}

/action {�������Եĳ����� %0��%1��%2��%3 �� %4��} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;/stripansi dir3 %3;/stripansi dir4 %4;_Agetdir5;_AautoRunAct} {1} {autoRun}
/action {�������Եĳ����� %0��%1��%2 �� %3��} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;/stripansi dir3 %3;_Agetdir4;_AautoRunAct} {2} {autoRun}
/action {�������Եĳ����� %0��%1 �� %2��} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;_Agetdir3;_AautoRunAct} {3} {autoRun}
/action {�������Եĳ����� %0 �� %1��} {/stripansi dir0 %0;/stripansi dir1 %1;_Agetdir2;_AautoRunAct} {4} {autoRun}
/action {����Ψһ�ĳ����� %0��} {/stripansi dir0 %0;_Agetdir1;_AautoRunAct} {5} {autoRun}


/al wk {t+ autoRun;t+ zizuLin}
/al unwk {t- autoRun;t- zizuLin}
/al _Awalk {/sleep 1;go $dir}


/action {С· -} {n} {zizuLin}
/action {������ -} {_Awalk} {zizuLin}
/action {�޺��� -} {out} {zizuLin}
/action {������ -} {t- zizuLin;s;w} {zizuLin}


/action {�羡���������˳�����} {/sleep 2;_AoutDongAct} {kuguDong}
/action {������ -} {t- autoRun;bury sheli zi} {kuguDong}
/action {�㱻�ص�һ��ˤ�ڵ��ϣ�} {zuan} {kuguDong}
/action {����һ�������������} {t+ autoRun;/al _AautoRunAct {/sleep 0.5;get sheli zi;go $dir};l} {kuguDong}



/va working 0;/va finish 0;/va getit 0;/va cnt 0
/al {search_init} {/al2var {path} %0;/math working 1;/math finish 0;/math getit 0;/math cnt 0;/getl {len} {$path};t+ autoFind}

/al ca3 {search_init path_changanwest2;search $leguai}
/al ������ {search_init path_changan;search $leguai}
/al �������� {search_init path_changanwest1;search $leguai}
/al ����� {search_init path_kaifeng;search $leguai}
/al ����ɽ {search_init path_putuo;search $leguai}
/al ����ɽ {search_init path_fangcunshan;search $leguai}
/al ���� {search_init path_longgong;search $leguai}
/al �¹� {search_init path_moon;search $leguai}
/al ����ׯ {search_init path_gaolaozhuang;search $leguai}
/al ��¥һ�� {search_init path_honglou;search $leguai}
/al ����� {search_init path_baoxiang;search $leguai}
/al ���ٹ� {search_init path_chechi;search $leguai}
/al Ů���� {search_init path_nuerguo;search $leguai}
/al ��ƽ�� {search_init path_jinpingfu;search $leguai}
/al ������ {search_init path_jisaiguo;search $leguai}
/al ���ù� {search_init path_tianzhuguo;search $leguai}
/al ���� {search_init path_yuhuaxian;search $leguai}
/al ���Ϲ� {search_init path_zhuziguo;search $leguai}
/al ��ѩɽ {search_init path_xueshan;search $leguai}
/al �ڼ��� {search_init path_wujiguo;search $leguai}
/al ����� {search_init path_biqiuguo;search $leguai}
/al �̲�̶ {search_init path_bibotan;search $leguai}
/al ����ɽ {search_init path_qinglongshan;search $leguai}
/al ����ɽ {search_init path_yinwushan;search $leguai}
/al ��ׯ�� {search_init path_wuzhuangguan;search $leguai}
/al ���ɽ {search_init path_zhujieshan;search $leguai}
/al ��ͷɽ {search_init path_baotoushan;search $leguai}
/al ����ɽ {search_init path_jileishan;search $leguai}
/al ����ɽ {search_init path_huoyanshan;search $leguai}
/al ëӱɽ {search_init path_maoyingshan;search $leguai}
/al �շ��� {search_init path_qinfaguo;search $leguai}
/al ͨ��� {search_init path_tongtianhe;search $leguai}
/al С���� {search_init path_xiaoxitian;search $leguai}
/al ��ɽ {search_init path_jindoushan;search $leguai}
/al �޵׶� {search_init path_wudidong;search $leguai}
/al ��˿�� {search_init path_pansiling;search $leguai}
/al ���ɿ� {search_init path_fengxianjun;search $leguai}
/al ����ɽ {search_init path_qilinshan;search $leguai}
/al ����ɽ {search_init path_dudishan;search $leguai}
/al ƽ��ɽ {search_init path_pingdingshan;search $leguai}
/al ������ {search_init path_jingjiling;search $leguai}
/al �����ɵ� {search_init path_penglai;search $leguai}
/al ���ܵظ� {search_init path_hell;search $leguai}

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


/action {^���й���ϣ���ڤ˼�лع�������} {/sleep 2;_AsetRecover} {autoRecover}
/action {^���й���ϣ���һ����������վ��������} {/sleep 2;_AsetRecover} {autoRecover}

/highlight {yellow} {$cguai($eguai)}

/action {��Ҫ��ʲô��} {/if {$getit=0} {_AstepWait;search $leguai}} {autoFind}
/action {%0%1$cguai($eguai)} {/if {$getit=0} {/var getit 1;_AfoundAction;/purge}} {4} {autoFind}


/al {_AyuanAction} {/nop}

/al {startkill} { \
    /va nguai 0;/va getit 0;/va getwx 0;/va getqn 0; \
    /setprompt {-$cguai-$place-$nguai-$getwx-$getqn}; \
    /al _AfoundAction {#nop}; \
	/al {_AysAction} {/if {$_year<5 && $_wx < 20000} {/va tguai СС} else {/va tguai ʮ��}}; \
	/al _AyuanAction {e;s;2e;n;ask wuyuan about fu;s;2w;n;w;$place}; \
    /al {search} { \
            /if {$cnt<$len && $getit=0} \
                {getp $cnt;/if {[$dothis!=_Fnext]} {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep;/math cnt $cnt+1}}}; \
	t+ dataGet;t+ taskYuan;t+ autoFind;eson;/ticksize 60; \
	/al tick ';hp}

/al {stopkill} {t- dataGet;t- autoFind;esof;/al tick uptime}

/al {s1} {t- autoFind}
/al {s2} {t+ autoFind}

/action {^Ԭ���������ľ�����ķ�һ��������˵����} {b+ _Baskg} {taskYuan}
/action {����%0(%1)��%2��û��Ϊ����С������ȥ�շ���} {/if {$_Baskg} {/if {[%%%0!=$cguai] || [%%%2!=$place]} {/math failcnt 0;/ticksize 60};/va cguai %%0;/va eguai %%1;/va place %%2;/tolower leguai $eguai;b- _Baskg;_AyuanAction}} {taskYuan}

/action {^��õ���%0����ѧ�����%1��Ǳ�ܣ�} {/ctoi getwx %0;/ctoi getqn %1;/math nguai $nguai+1;/sysecho [$_rclock] ����$cguai�� ��ѧ $getwx Ǳ�� $getqn  >> log/yuan.log} {taskYuan}
/action {^Ԭ���˵�������²�������ȥ�շ�%0��} {_AyuanAction} {taskYuan}
/action {^Ԭ���������ľ���������£�˵����лС%0,��ħ�Ѿ������ˡ�} {_Aprd2kz} {taskYuan}
/action {^������ʿ���һ������ȥ���㱻�ӻ����½硣} {6n;e;u;e} {taskYuan}

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

/action {��$_RED�Ѿ�} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 1;b- bHP}};hp} {autoEscape}
/action {��$_REDҡͷ} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 10;b- bHP}};hp} {autoEscape}
/action {��$_HIR��} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 20;b- bHP}};hp} {autoEscape}
/action {��$_HIR�Ѿ�һ} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 30;b- bHP}};hp} {autoEscape}
/action {��$_HIR�ƺ�} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 40;b- bHP}};hp} {autoEscape}
/action {��$_HIY��} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 60;b- bHP}};hp} {autoEscape}
/action {��$_HIY����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 80;b- bHP}};hp} {autoEscape}
/action {��$_HIY������������} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 90;b- bHP}};hp} {autoEscape}
/action {��$_HIG�ƺ���} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 95;b- bHP}};hp} {autoEscape}
/action {��$_RED����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -5;b- bHP}};hp} {autoEscape}
/action {��$_RED����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -10;b- bHP}};hp} {autoEscape}
/action {��$_HIR��} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -20;b- bHP}};hp} {autoEscape}
/action {��$_HIR�Ѿ���} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -30;b- bHP}};hp} {autoEscape}
/action {��$_HIR��Ϣ} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -40;b- bHP}};hp} {autoEscape}
/action {��$_HIY����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -60;b- bHP}};hp} {autoEscape}
/action {��$_HIY����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -80;b- bHP}};hp} {autoEscape}
/action {��$_HIY������������} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -90;b- bHP}};hp} {autoEscape}
/action {��$_HIG�ƺ���}	{b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -95;b- bHP}};hp} {autoEscape}
/action {��$_HIY��������Щ�Ժ��ˡ�} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -60;b- bHP}};hp} {autoEscape}
/action {��$_HIY��ȷ} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -60;b- bHP}};hp} {autoEscape}
/action {��$_HIR����} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -40;b- bHP}};hp} {autoEscape}
/action {��$_HIR����} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -20;b- bHP}};hp} {autoEscape}
/action {��$_RED����} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -10;b- bHP}};hp} {autoEscape}
/action {��$_RED����} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt 1;b- bHP}};hp} {autoEscape}
/nop /action {$cguai���˹�����} {_Adoesc} {autoEscape}
