

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


/action {^���й���ϣ���ڤ˼�лع�������} {/sleep 2;_AsetRecover} {autoRecover}
/action {^���й���ϣ���һ����������վ��������} {/sleep 2;_AsetRecover} {autoRecover}


/nop ask guai

/action {^�����˵��������%0(%1)��%2Ϊ������������ȥ������} {/va cp 0;/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*ʨ} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*�} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/if {$cp=1} {/va cguai %%0;/va eguai %%1;/va place %%2;/tolower leguai $eguai;/va error 0;/va pretime $_time;t- autoKp1;t+ autoKp2;jiali $_maxNl;enchant $_maxFl;_Atick1to2;$place}} {3} {autoKp1}
/action {${_NOR}${_CYN}�˵�����Ϸ�������ȥ����%0��} {/if {[$leguai!=0]} {/va cguai %0;/va bAsk 0;/va bFind 1;fly kaifeng;find $leguai}} {autoKp1}
/action {^ǧ���۸����㣺��֣��Ҳ�������ˣ�����} {/if {$bFind=1} {/if {($error=-1)||($error=2)} {/math error -1;_AKpbackKz} else {/math pretime $_time-1200;/math error -1;_AKpbackKz};/va bFind 0}} {autoKp1}
/action {^ǧ���۸����㣺%0($leguai)��%1��} {/if {$bFind=1} {/if {($error=-1)&&([%%0=$place])} {_AKpbackKz} else {/va cguai %%0;/va place %%1;t- autoKp1;t+ autoKp2;_Atick1to2;$place};/va bFind 0}} {autoKp1}
/action {^����û������ˡ�} {/if {$bAsk} {/math error 1;/math pretime $_time;_AKpbackKz;/va bAsk 0}} {autoKp1}
/action {^�������������һ����˵����λ����,��ħ�ѳ���,������ȥЪϢ��} {_AKpbackKz} {autoKp1}


/al {_AKp2continue} {t+ autoKp2;/if {$getit=0} {search $leguai}}
/al {_AKp2break} {t- autoKp2;_Abackstep}
/al {_Arecover_ct} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover}
/nop {^ֻ���������ƵĲ�ס���ˡ�}
/nop {^�������Ƶ����ԣ�����һ����·��}

/nop find guai
/action {%0һ��ץס���㣡} {_Abackstep} {autoKp2}
/action {����Ҫ�뿪����Ȼ����ʲô��������ǰһ�Σ����ɵ�ͣ��������} {_Abackstep} {autoKp2}
/action {^��ǰ�������ֵ�ס�����ȥ·��} {_Abreak;kill li shi} {autoKp2}
/action {^���Ŵ�ʹ����ҡ��ҡ�֡�} {_Abreak;kill da shi} {autoKp2}
/action {^���ܹ�������ס�㣺����������Ժ���߸�ʲôѽ��} {_Abreak;kill bear} {autoKp2}
/action {^����������˼䲢��Ϸˣ֮��������ɧ�����ɼ�����} {_Abreak;kill wu gang} {autoKp2}
/action {^��������˵������ʦ���ޣ��ټ����ˣ���������ذɣ�} {_Abreak;t- autoKp2;t+ autoKp4;/math error 2;_Aback2pl} {autoKp2}
/action {^��һ��������ֻ���������档�ûһ���ˡ�} {w;t- autoKp2;t+ autoKp1;/math error -1;_AsetTsize} {autoKp2}
/action {^���������µ��������й�ͣ����������} {_Abreak;kill xiboer gu} {autoKp2}
/action {^�Ų������µ��������й�ͣ����������} {_Abreak;kill guboer xi} {autoKp2}
/action {^�첨��Ц�ȵ�����Ժ�ǽ��أ�����Īȥ�ĺã�} {_Abreak;kill tianboer xiao} {autoKp2}
/action {^Ц������ȵ�����Ժ�ǽ��أ�����Īȥ�ĺã�} {_Abreak;kill xiaoboer tian} {autoKp2}
/action {^�����ʹһͦ���иֲ棬��ס�����ȥ·��} {_Abreak;kill guard} {autoKp2}
/action {^����ţ��һ����ֻ��ţ�ǵ�ס�㣺���ﵽ�Ķ�ȥ��} {_Abreak;s;sw;fly qinglong;sw;se;sd;se;s;w;n;s;e;se;se;s;s;s;s;e;s;buy hulu from dian zhu;buy hulu from dianzhu;n;e;n;fill hulu} {autoKp2}
/action {^����������ס�㣺�������Ϸ����ң���ȥ��ʲô��} {_Abreak;kill shou xing} {autoKp2}
/action {^����������ס�㣺�������Ϸ����ң���ȥ��ʲô��} {_Abreak;kill fu xing} {autoKp2}
/action {^»��������ס�㣺�������Ϸ����ң���ȥ��ʲô��} {_Abreak;kill lu xing} {autoKp2}
/action {^����������������������˸��������} {_Abreak;/sleep 5;/3 exert heal;_Akcontinue} {autoKp2}
/action {^��������������������������ɵ����ڵ��ϣ�����δ��} {_Abreak;/sleep 5;_Akcontinue} {autoKp2}
/action {^�㽫�ͺ�«�����ֺ����͡�} {/sleep 2;s;fly qinglong;nw;wu;wu;nw;nu;ne;ne;n;give niujing hulu;_Akcontinue} {autoKp2}
/action {^��������û���ֺ������ˡ�} {t- autoKp2;t+ autoKp4;/math error 2;s;fly changan;d;drop hulu;u;_Aback2pl} {autoKp2}
/action {^����ɮ˵��������Ժˡ���ӿͣ���ء���} {_Abreak;kill shousi seng} {autoKp2}
/action {^�߹��ؽ��µ����ǲ������ȥ�ĵط���} {_Abreak;kill wu jiang} {autoKp2}
/action {^������ʿ�ȵ������У�} {_Abreak;/ticksize 300;jiali 0;kill wei shi} {autoKp2}
/action {^����չһ������������ǰ�棬��Ц����} {_Abreak;jiali 0;kill xia} {autoKp2}
/action {^ɽ���������������������} {_Abreak;/sleep 2;F6;/sleep 2;_Akcontinue} {autoKp2}
/action {^���(donate)һ�����ӵ����������ӭ��裺��} {_Abackstep;donate 1 silver} {autoKp2}
/action {������������} {_Akcontinue} {autoKp2}
/action {^��ʹ���ˡ�} {_Arecover_ct} {autoKp2}
/action {%0��ʿ���ˡ�} {_Arecover_ct} {autoKp2}
/action {^������ˡ�} {_Arecover_ct} {autoKp2}
/action {^�����������ˡ�} {_Arecover_ct} {autoKp2}
/action {^�Ų��������ˡ�} {_Arecover_ct} {autoKp2}
/action {^�첨��Ц���ˡ�} {_Arecover_ct} {autoKp2}
/action {^Ц���������ˡ�} {_Arecover_ct} {autoKp2}
/action {^�����ʹ���ˡ�} {_Arecover_ct} {autoKp2}
/action {^����ɮ���ˡ�} {_Arecover_ct} {autoKp2}
/action {^�߹��ؽ����ˡ�} {_Arecover_ct} {autoKp2}
/action {^ֻ��һ�����������ǻ���һ���׹�������ֱ���ȥ������} {_Arecover_ct} {autoKp2}
/action {^ֻ��һ��������»�ǻ���һ���׹�������ֱ���ȥ������} {_Arecover_ct} {autoKp2}
/action {^ֻ��һ�����������ǻ���һ���׹�������ֱ���ȥ������} {_Arecover_ct} {autoKp2}
/action {������ʿ���ˡ�} {touxiang;er;ef;jiali $_maxNl;enchant $_maxFl;_Akcontinue} {autoKp2}
/action {����չ���ˡ�} {touxiang;er;ef;jiali $_maxNl;enchant $_maxFl;_Akcontinue} {autoKp2}
/action {���ˡ���һ������ӻ��ص����������С�����} {break;er} {autoKp2}
/action {ֻ�������˷������ǣ��ǡ�������������} {/sleep 0.2;break;er} {autoKp2}
/action {�����˵ķ�϶�㹻һ�������ȥ�ˡ�} {ca3} {autoKp2}
/action {�����Ѿ����ˣ���Ѿ��ˡ�} {ca3} {autoKp2}
/action {%0������������ס�㲻�š�} {/va cjing %0;_Abreak;_Aunwield;kill yao jing} {autoKp2}
/action {%0������һ�����ȣ����ڵ���һ��Ҳ�����ˡ�} {touxiang;_Awieldb;_Akcontinue} {autoKp2}


/nop kill guai

/action {^˳��������㣺$cguai���书�Ѵ�%0�ľ��硣} {/stripansi gwxjj %0;/math glwj @arrayIdx{$gwxjj $wxjjArray};/math glwj $glwj-2} {autoKp3}
/action {^˳��������㣺$cguai��������Ϊ����%0��%1m�Ļ��} {/stripansi gnlxw %0;/ctoi glnl $gnlxw;/math glnl $glnl-10;/if {(($_lwj>=18)||(($_lwj<18)&&($_lwj>=$glwj)))&&(($glnl)&&($_lnl>$glnl))} {follow $leguai;kill $leguai} else {t- autoKp3;t+ autoKp2;/var getit 0;_Akcontinue}} {autoKp3}
/action {^$cguai��Ц������ƾ����㱾�£�Ҳ�����Ҷ���} {touxiang;/4 exert heal;er;kill $leguai} {autoKp3}
/action {^$cguai����Ҳ���㳢�����޵����師��������} {touxiang;/4 exert heal;er;kill $leguai} {autoKp3}
/action {^���޵����師һ���ǳɣ��㱻���˸����ֲ�����������Ϊ���£�} {touxiang;/8 exert heal;er;kill $leguai} {autoKp3}
/action {${_NOR}${_HIW}��ٲ���������$cguai�ĳ��Ǹ߸߾���} {touxiang} {autoKp3}
/action {^ֻ������ž����һ���������е�%0�Ѿ���Ϊ���أ�} {remove dun;wield bang;wield gun;wear dun} {autoKp3}
/action {^������һ����ʯͷ�죬$cguai��ɽ����б����������} {sd;kill $leguai} {autoKp3}
/action {( ����һ��������û����ɣ�����ʩ���ڹ���)} {/sleep 1;er} {autoKp3}
/action {${_HIR}��ɫ������%0׷ȥ��} {_Adoesc} {autoKp3}
/action {^������������������֪��������} {ef;ef;/sleep 2;_Adoesc} {autoKp3}
/action {^$cguai��%0�뿪��} {kill $leguai} {autoKp3}
/action {^$cguai�ƿ�һ��Ұ�ݣ����������˽�ȥ��} {enter;kill $leguai} {autoKp3}
/action {^$cguai��%0��Ķ����ˡ�} {kill $leguai} {autoKp3}
/action {^$cguaiһ��������Ķ��֣�ֻ�þ͵�һ�������ԭ�Σ����˼���ת������ʵʵ���߿��ˡ�} {/nop} {autoKp3}
/action {^$cguai�ۼ����Σ�ֻ�û��ɹ����̸�����������С�} {/nop} {autoKp3}
/action {^����һ�ӣ�$cguai���ɴ��⣬ѱ�����߿��ˡ�} {/nop} {autoKp3}
/action {^$cguai�޿��κΣ�����һ����⣬ֱ������ȥ�ˣ�����} {/nop} {autoKp3}
/action {^$cguai�ҽ�һ�������ˡ�} {/nop} {autoKp3}
/action {^��õ���%0����ѧ�����%1��Ǳ�ܣ�} {/va leguai 0;/math nguai $nguai+1;/ctoi getwx %0;/ctoi getqn %1;t- autoKp3;t+ autoKp4;/math error 0;_Aback2pl} {autoKp3}

/nop heal

/action {^��Χû��һƬ�ƣ�û�취���Ƽ���} {/nop} {autoKp4}
/action {^��ת�����ܣ�ȴ��%0һ��������ס��} {/sleep 2;_Adoesc} {autoKp4}
/action {^��������һ�ɺڷ磬������Ҳ���źڷ�ɢȥ������} {/tickof;/3 north;3e;3s;se;out} {autoKp4}
/action {^�����ڲ����ƶ���} {/purge;/sleep 4;/tickof;/3 north;3e;3s;se;out} {autoKp4}
/action {^��Ȼһ��������ס���㡣} {er;ef;open guancai;t- autoKp4;t+ autoRecover;2f;/al _AafterRecover {/if {$error=3} {t- autoKp4;t+ autoKp2;_Atick1to2;touxiang;open door;n;close door;w;_Awield;$place} else {touxiang;open door;n;close door;w;_AKpbackKz;t- autoKp4;t+ autoKp1}};_AsetRecover} {autoKp4}


/highlight {yellow} {%0$cguai($eguai)}

/action {��Ҫ��ʲô��} {/if {$getit=0} {_AstepWait;search $leguai}} {autoFind}
/action {%0%1$cguai($eguai)} {/if {$getit=0} {/var getit 1;b- _Bctguai;_AfoundAction;/purge}} {4} {autoFind}


/al {_AyuanAction} {/nop}

/al {startwork} { \
	/va helper liuding;/va failcnt 0; \
	/al _Aprd2kz {e;2s;e;u;e}; \
	/al _Akz2prd {w;d;w;2n;w}; \
	/al {_AysAction} {/if {$_year<5 && $_wx < 20000} {/va tguai СС} else {/va tguai ʮ��}}; \
	/al _AyuanAction {tell $helper 9527 [$tguai]$cguai[$eguai]-[$leguai]��$place;_Aprd2kz}; \
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
                /if {$cnt=$len} {/sleep 2;_Abackhell;/if {$finish=0} {tell $newbie 9527 û���ҵ�$cguai��}}}}; \
	    t+ dataGet;t+ taskHelper;t+ autoQuit;hp}

/al {stophelp} {t- taskHelper;t- autoFind;t- dataGet;t- autoQuit}

/al {s1} {t- autoFind}
/al {s2} {t+ autoFind}

/action {^Ԭ���������ľ�����ķ�һ��������˵����} {b+ _Baskg} {taskYuan}
/action {����%0(%1)��%2��û��Ϊ����С������ȥ�շ���} {/if {$_Baskg} {/if {[%%%0!=$cguai] || [%%%2!=$place]} {/math failcnt 0;/ticksize 60};/va cguai %%0;/va eguai %%1;/va place %%2;/tolower leguai $eguai;b- _Baskg;_AyuanAction}} {taskYuan}

/nop newbie ask yuan
/action {^����û������ˡ�} {_Aprd2kz} {taskNewBie}
/action {%0(%1)�����㣺9527 û���ҵ�%2��} {/if {[%%2=$cguai]} {/math failcnt $failcnt+1;/math tmptick 60+$failcnt*10;/ticksize $tmptick}} {taskNewBie}
/action {^��õ���%0����ѧ�����%1��Ǳ�ܣ�} {/ctoi g_wx %0;/ctoi g_qn %1;/sysecho [$_rclock] ����$cguai�� ��ѧ $g_wx Ǳ�� $g_qn  >> log/yuan.log} {taskNewBie}
/action {^Ԭ���˵�������²�������ȥ�շ�%0��} {_AyuanAction} {taskNewBie}
/action {^Ԭ���������ľ���������£�˵����лС%0,��ħ�Ѿ������ˡ�} {_Aprd2kz} {taskNewBie}
/action {^������ʿ���һ������ȥ���㱻�ӻ����½硣} {6n;e;u;e} {taskNewBie}

/al _Awld {wield gun;/sleep 1;jiali $_maxNl;enchant $_maxFl}
/al _Aunwld {unwield gun;jiali 0}
/al _A2lusheng {fly changan;6s;3w}
/al _Atickidle {/ticksize 300;/al tick uptime}
/al _Aticklusheng {/ticksize 15;/al tick {kill lu sheng}}

/nop helper kill guai
/action {Ԭ�سϸ���һ�����������顽��} {set no_accept;tear book;s;3e;s;e} {taskHelper}
/action {���%0�����ѳ�һֻ������} {_Aunwld} {taskHelper}
/action {%0(%6)�����㣺9527 [%1]%2[%3]-[%4]��%5} {/if {$working=0} {/va newbie %%6;/va tguai %%1;/va cguai %%2;/va eguai %%3;/va leguai %%4;/va place %%5;/ticksize 300;/al tick _Abackhell;w;t+ autoFind;$place}} {3} {taskHelper}
/action {��ǰ�������ֵ�ס�����ȥ·��} {_Abreak;_Awld;kill li shi} {taskHelper}
/action {���ܹ�������ס�㣺����������Ժ���߸�ʲôѽ��} {_Abreak;_Awld;kill bear} {taskHelper}
/action {����������˼䲢��Ϸˣ֮��������ɧ�����ɼ�����} {_Abreak;_Awld;kill wu gang} {taskHelper}
/action {��������˵������ʦ���ޣ��ټ����ˣ���������ذɣ�} {_Abreak;_Awld;kill master} {taskHelper}
/action {���(donate)һ�����ӵ����������ӭ��裺��} {_Abackstep;donate 1 silver} {taskHelper}
/action {���˯��һ��, �Ȼ��ɡ�} {_Abreak;/sleep 2;_Ascontinue} {taskHelper}
/action {��������һ�꣬��ʼ˯����} {_Abreak} {taskHelper}
/action {��һ��������ֻ���������档�ûһ���ˡ�} {w;w;_A2lusheng;_Awld;kill lu sheng;_Aticklusheng} {taskHelper}
/action {¬�����ˡ�} {get zhen from corpse;_Aunwld;fly changan;s;e;_Atickidle;/math working 0} {taskHelper}
/action {������������} {_Ascontinue} {taskHelper}
/action {%0��ʿ���ˡ�} {_Ascontinue} {taskHelper}
/action {�����������ˡ�} {_Ascontinue} {taskHelper}
/action {���ﲻ׼�����ġ�} {_Abackgo} {taskHelper}
/action {����ֱҡͷ�����ϲ�����ӣ������������䰡��} {_Awld;kill $leguai} {taskHelper}
/action {������ˡ�} {_Ascontinue} {taskHelper}
/action {���ˡ���һ������ӻ��ص����������С�����} {jiali 70;break;er} {taskHelper}
/action {ֻ�������˷������ǣ��ǡ�������������} {/sleep 0.2;break;er} {taskHelper}
/action {�����˵ķ�϶�㹻һ�������ȥ�ˡ�} {ca3} {taskHelper}
/action {�����Ѿ����ˣ���Ѿ��ˡ�} {ca3} {taskHelper}
/action {����Ҫ�뿪����Ȼ����ʲô��������ǰһ�Σ����ɵ�ͣ��������} {_Abackstep} {taskHelper}
/action {${_HIB}��˫��һ�꣬��ʱȼ��һ����ɫ�Ļ��棬����׹�Ʈ����$cguai��} {_Afire} {taskHelper}
/action {( ����һ��������û����ɣ����������ġ�)} {_Afire} {taskHelper}
/action {�����ڲ�����ħ����} {_Afire} {taskHelper}
/action {��κ��󲻴��顣} {_Afire} {taskHelper}
/action {$cguai�ҽ�һ�������ˡ�} {b- _Bfiring;/sleep 8;/math finish 1;/if {[$place=��¥һ��]} {/va getit 0;_Ascontinue} else {_Abackhell}} {taskHelper}
/action {$cguai��%0��Ķ����ˡ�} {b- _Bfiring;t+ autoFind;/sleep 8;_Abackhell} {taskHelper}
/action {$cguai��%0�뿪��} {b- _Bfiring;t+ autoFind;/sleep 8;_Abackhell} {taskHelper}
/action {��Ķ�����û����ɣ������ƶ���} {/sleep 2;_Abackhell} {taskHelper}
/action {��Ȼһ��������ס���㡣} {open guancai;w;8n;e;/al tick uptime;/math working 0} {taskHelper}


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
