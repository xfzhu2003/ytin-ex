
/al {b+} {/math {%%1} {1}}
/al {b-} {/math {%%1} {0}}

/al {fr} {t- autologin;/toggle speedwalk 0;/ses %1 {discworld.imaginary.com 23}}

/al {xj} {t+ autoLogin;/ses %1 {mud.cww.com 6666};/var name %1;/var passwd %2}
/al {el} {t+ autoLogin;/ses %1 {202.102.14.189 6666};/var name %1;/var passwd %2}
/al {ell} {t+ autoLogin;/ses %1 {172.31.12.220 6666};/var name %1;/var passwd %2}
/al {ll} {xj liuding 62527009}
/al {lfog} {xj fog 62527009}
/al {lfmy} {xj fmy �����չ�}
/al {ffog} {el fog 62527009}
/al {lwaterrat} {xj waterrat �����չ�}
/al {lzhouzhou} {xj zhouzhou hatpig}
/al {lhxzxfsbh} {xj hxzxfsbh 8642135}
/al {lliuding} {xj liuding 62527009}
/al {ldragcat} {xj dragcat 62527009}
/al {llxw} {xj lxw 123456}
/al {lzji} {xj zji 56666989}
/al {lpfm} {xj pfm ��ʱ�չ�}

class autoLogin { \
    tri {BIG5} {gb} {autoLogin}; \
    tri {���Ƿ�����Сѧѧ���������С} {no} {autoLogin}; \
    tri {����Ӣ������} {$name;$passwd;/split -1;/tickon} {autoLogin} \
} {/nop}

class tLog { \
    tri {%0(%1)�����㣺%2} {/stripansi teller %0;/sysecho [$_rclock] $teller(%1)�����㣺%2 >> log/tell.log} {tLog}; \
    tri {%0�ش��㣺%1} {/stripansi teller %0;/sysecho [$_rclock] $teller�ش��㣺%1 >> log/tell.log} {tLog} \
} {/nop}


/nop ---------------------------------------------------------------------------------
/al F12 {w;fly tianzhu;8w;s;s;e;buy dan from langzhong;eat dan;w;fc;s;e}
/al F8 {touxiang;dazuo 0;mingsi 0;touxiang}
/al F9 {/purge;/ignore}
/al F7 {unset no_accept;eat yao}
/al F6 {remove dun;unwield bang;unwield gun;unwield zhua;wield blade;perform pozhan;unwield blade;wield zhua;wield bang;wield gun;wear all}
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

class daMI { \
    tri {����һ�ѽ�ħ����} {get bang} {daMI}; \
    tri {����һ��������¡�} {get tianyi} {daMI}; \
    tri {%0����һЩ��ҩ��} {get yao} {daMI}; \
    tri {%0����һЩ��Ԫ����} {get dan} {daMI} \
} {/nop}
    
/nop ---------------------------------------------------------------------------------
/va {wxjjArray} {��ѧէ��;�����ž�;��ͨƤë;��֪һ��;��������;������;����С��;����Ѿ�;�������;��Ȼ����;�������;�������;����似;�����뻯;��Ȼ��ͨ;�Ƿ��켫;������˫;һ����ʦ;������;��ɲ�}
/va _day 0;/va _year 0
/al dd {/va _qx;/va _Qx;/va _nl;/va _Nl;/va _js;/va _Js;/va _fl;/va _Fl;/va _sw;/va _Sw;/va _wx;/va _qn;/va _sq;/va _year;/va _day;/va _maxNl;/va _maxFl}
/al {_AqxAction} {/nop}
/al {_AjsAction} {/nop}
/al {_AswAction} {/nop}
/al {_AysAction} {/nop}
/al {_AqnAction} {/nop}

class dataGet { \
    tri {���[ %0]  ���ǣ�[ %1]  ���ԣ�[ %2]  ���ԣ�[ %3]} {/math _str %0;/math _con %1;/math _int %2;/math _spi %3} {dataGet} {3}; \
    tri {��Ѫ%1m%2/%3${_ESC}%4(%5%)%6������%7m%8/%9(} {/math _qx %2;/math _Qx %3;/math _perQx %5;/math _nl %8;/math _Nl %9;/math _maxNl {$_Nl/20};_AqxAction} {dataGet} {3}; \
    tri {����%1m%2/%3${_ESC}%4(%5%)%6������%7m%8/%9(} {/math _js %2;/math _Js %3;/math _perJs %5;/math _fl %8;/math _Fl %9;/math _maxFl {$_Fl/20};_AjsAction} {dataGet} {3}; \
    tri {ʳ��%1m%2/%3${_ESC}%4��ѧ��%5m%6} {/math _sw %2;/math _Sw %3;/math _wx %6;_AswAction} {dataGet} {3}; \
    tri {��ˮ%1m%2/%3${_ESC}%4����} {/math _ys %2;/math _Ys %3;_AysAction} {dataGet} {3}; \
    tri {��ˮ%1m%2/%3${_ESC}%4����%5m%6��} {/math _ys %2;/math _Ys %3;/ctoi _year %6;_AysAction} {dataGet} {2}; \
    tri {��ˮ%1m%2/%3${_ESC}%4����%5m%6��} {/math _ys %2;/math _Ys %3;/ctoi _day %6;_AysAction} {dataGet} {2}; \
    tri {��ˮ%1m%2/%3${_ESC}%4����%5m%6��%7��} {/math _ys %2;/math _Ys %3;/ctoi _year %6;/ctoi _day %7;_AysAction} {dataGet} {1}; \
    tri {Ǳ��%1m%2${_ESC}%3ɱ����%4m%5} {/math _qn %2;/math _sq %5;_AqnAction} {dataGet} {3}; \
    tri {���о��磺%1��ѧ���磺%0} {/stripansi _wxjj %0;/math _lwj @arrayIdx{$_wxjj $wxjjArray}} {dataGet} {1}; \
	tri {������Ϊ��%1������Ϊ��%0��} {/stripansi _nlxw %0;/ctoi _lnl $_nlxw} {dataGet} {1}; \
} {/nop}


/nop ---------------------------------------------------------------------------------

/al {al_bedroom1} {3d;e;11s;6w;3n;w;open door;u;bed}
/al {al_bedback1} {out;mount ma;d;open door;e;3s;6e;11n;w;3u}
/al {pon} {/toggle stripcolor 1;/ticksize 15;/al tick {/tickoff;w;d;w;s;w;u;u;u;l poem};t+ autoPoem}
/al {pof} {/toggle stripcolor 0;/ticksize 300;/al tick time;t- autoPoem}
/var _Vpoem poem
/var _Vpoemcnt 0
/al {_Apoemafter} {/tickon}
/al {_Apoemget} {/if {[%%0!=$_Vpoem]} {/var _Vpoem %%0;/sys echo %%0 > poem.q;/sys perl poem.pl;/tex poem.cmd} else {d;d;d;e;n;e;u;e};_Apoemafter}
/al {_Apoemact} {/var _Vpoemtmp %1;chomp _Vpoemtmp;_Apoemget $_Vpoemtmp}
/al {_Apoemtri} {b+ _Bpoem;hp}
/al {_Apoemchk} {/if {$_Bpoem} {/if {%%0<50} {/tickoff;/sleep 2;al_bedroom1;sleep} else {d;d;d;e;n;e;u;e};b- _Bpoem}}

class autoPoem { \
    tri {�販ʿ�����ǽ��д����%0} {_Apoemact $0} {autoPoem}; \
    tri {��ǰ��Ŀ��������%0} {_Apoemact $0} {autoPoem}; \
    tri {�販ʿ��ͷ��} {/math _Vpoemcnt $_Vpoemcnt+1;_Apoemtri} {autoPoem};\
    tri {�販ʿҡ��ҡͷ} {_Apoemtri} {autoPoem}; \
    tri {��ҡҡͷ˵�����Ҳ�֪��} {_Apoemtri} {autoPoem}; \
    tri {�����Ѿ��ش�����ʫ��} {_Apoemtri} {autoPoem}; \
    tri {����û���˲��жԴ���} {_Apoemtri} {autoPoem}; \
    tri {����  %0/  %1 (%2%) } {_Apoemchk $0} {autoPoem}; \
    tri {��һ������} {/sleep 2;/tickon;al_bedback1;l poem} {autoPoem}; \
    tri {������������} {u;5n;u;ask girl about back;/sleep 2;/tickon;al_bedback1;l poem} {autoPoem} \
} {/nop}

/nop ---------------------------------------------------------------------------------

/va {skillArray} {stick;parry;dodge;force}
/nop /va {skillArray} {force;dragonforce;spells;seashentong}

/al _Asubskill { \
    /gag {���%0�����ˣ�}; \
    /gag {�������������棬����������}; \
    /gag {�����ھ�����������������}; \
    /gag {���������˼���������ɫ�������ö��ˡ�}; \
    /gag {����һ�������˿����������������Ѷ��ˡ�}; \
    /gag {%0 (%1)%2- %3 %4/%5};/antisub {%0 ($_skill)%2- %3 %4/%5};/antisub {%0 ($_adskill)%2- %3 %4/%5}}
/al _Aunsubskill { \
    /ungag {���%0�����ˣ�}; \
    /ungag {�������������棬����������}; \
    /ungag {�����ھ�����������������}; \
    /ungag {���������˼���������ɫ�������ö��ˡ�}; \
    /ungag {����һ�������˿����������������Ѷ��ˡ�}; \
    /ungag {%0 (%1)%2- %3 %4/%5};/unantisub {%0 ($_skill)%2- %3 %4/%5};/unantisub {%0 ($_adskill)%2- %3 %4/%5}}

/al _Axuexi {learn $_skill from $_teacher}
/al {_AgetSkill}{/geti {_skill} {%%0} $skillArray}
/al {_Alevelchk} { \
        /if {$skillIdx<$arrayLen} \
		/if {$curLevel<$maxLevel} \
		    {/nop} \
		else { \
		    /math skillIdx $skillIdx+1;_AgetSkill $skillIdx} \
        else {/nop}

/nop    path moon-wuya-kz
/nop    /al _A2teacher {out;e;s;sd;ed;ed;nd;nd;ed;e;n;n}
/nop    /al _A2sleeprm {s;s;w;wu;su;su;wu;wu;nu;n;w;bed};
/nop    /al {_Akz2bed} {w;d;w;n;7w;nw;ne;nw;nw;nw;w;wu;su;su;wu;wu;nu;n;w;bed};
/nop    /al {_Abed2kz} {out;e;s;sd;ed;ed;nd;nd;ed;e;se;se;se;sw;se;7e;s;e;u;e};

/al {le1on} { \
    t+ autoLearn1; \
    /math maxLevel %0; \
    /va _teacher {long nu}; \
    /al _A2teacher {s;e}; \
    /al _A2sleeprm {w;n}; \
    /al {_Akz2bed} {s;w;15s;3e;dive;/sleep 5;e;e;ne;e;e;se;se;n}; \
    /al {_Abed2kz} {s;nw;nw;w;w;sw;w;w;u;3w;15n;e;n}; \
    /getl arrayLen $skillArray; \
    /va skillIdx 0; \
    _AgetSkill $skillIdx; \
    _Asubskill; \
    skills}
/al {le1of} {t- autoLearn1;_Aunsubskill}

class autoLearn1 { \
    tri {��һ��������ֻ���������档�ûһ���ˡ�} {/sleep 2;_A2teacher;_Axuexi} {autoLearn1}; \
    tri {%0�����д���һ����ڹ��ķ������ƺ���������} {_Axuexi} {autoLearn1}; \
    tri {������%0��ָ�����ƺ���Щ�ĵá�} {_Axuexi} {autoLearn1}; \
    tri {�����̫���ˣ����ʲôҲû��ѧ����} {/sleep 2;_A2sleeprm;skills;sleep} {autoLearn1}; \
    tri {���˯��һ��, �Ȼ��ɡ�} {_Abed2kz;/sleep 72;_Akz2bed;sleep} {autoLearn1}; \
    tri {������������ -} {u;5n;u;ask girl about back;/sleep 2;_A2teacher;_Axuexi} {autoLearn1}; \
    tri {%0 ($_skill)%2- %3 %4/%5} {/math curLevel %4;/math dotLevel %5;_Alevelchk} {autoLearn1} \
} {/nop}


/al {le2on} { \
    t+ autoLearn2;t+ dataGet;t+ autoQuit; \
    /math maxLevel %1; \
    /va preNl 0;/math dzQx %2; \
    /va _teacher {pusa}; \
    /al _A2teacher {n;nu}; \
    /al _A2dz {sd;s}; \
    /al _Axuexi {/20 {learn $_skill from $_teacher for 10;ef}}; \
    /getl arrayLen $skillArray; \
    /va skillIdx 0; \
    _AgetSkill $skillIdx; \
    _Asubskill; \
    /al _AqxAction {/if {$_Bchk} {/if {($preNl!=0)&&((($preNl<$_Nl)&&($_nl<$_Nl))||(($preNl>$_Nl)&&($_nl>$_Nl)))} {/math delt $_nl-$preNl;/if {$delt>20} {/mathdzQx $dzQx-20} else {/math dzQx $dzQx+20}};/math preNl $_nl;_A2teacher;_Axuexi;_A2dz;skills;dazuo $dzQx;b- _Bchk}}; \
    hp;skills}

/al {le2of} {t- autoLearn2;t- dataGet;t- autoQuit;/al _AqxAction {/nop};_Aunsubskill}

class autoLearn2 { \
    tri {���й���ϣ���һ����������վ��������} {/sleep 2;er;ef;b+ _Bchk;hp} {autoLearn2}; \
    tri {%0 ($_skill)%2- %3 %4/%5} {/math curLevel %4;/math dotLevel %5;_Alevelchk} {autoLearn2} \
} {/nop}


/al {duon} { \
    t+ autoLearn2;t+ dataGet;t+ autoQuit; \
    /math maxLevel %1; \
    /va preNl 0;/math dzQx %2; \
    /va _teacher {yushu}; \
    /al _A2teacher {/nop}; \
    /al _A2dz {/nop}; \
    /al _Axuexi {/20 {read wall;er;ef}}; \
    /getl arrayLen $skillArray; \
    /va skillIdx 0; \
    _AgetSkill $skillIdx; \
    _Asubskill; \
    /al _AqxAction {/if {$_Bchk} {/if {($preNl!=0)&&((($preNl<$_Nl)&&($_nl<$_Nl))||(($preNl>$_Nl)&&($_nl>$_Nl)))} {/math delt $_nl-$preNl;/if {$delt>20} {/mathdzQx $dzQx-20} else {/math dzQx $dzQx+20}};/math preNl $_nl;_A2teacher;_Axuexi;_A2dz;skills;dazuo $dzQx;b- _Bchk}}; \
    hp;skills}

/al {duof} {t- autoLearn2;t- dataGet;t- autoQuit;/al _AqxAction {/nop};_Aunsubskill}

class autoDu { \
    tri {�������ˣ��ֱ�����ʱ����ӡ�} {ran zhang ben} {autoDu}; \
    tri {���й���ϣ���һ����������վ��������} {/sleep 2;er;ef;b+ _Bchk;hp} {autoDu}; \
    tri {%0 ($_skill)%2- %3 %4/%5} {/math curLevel %4;/math dotLevel %5;_Alevelchk} {autoDu} \
} {/nop}

/al {_AgetAdskill}{/geti {_adskill} {%%0} $adSkillArray}
/al {_Aadlevelchk} { \
        /if {$skillIdx<$arrayLen} \
		/if {$curLevel<$maxLevel} \
		    {/nop} \
		else { \
		    /math skillIdx $skillIdx+1;_AgetSkill $skillIdx;_AgetAdskill $skillIdx;/if {[$_skill=stick]} {remove all;unwield sword;unwield whip;wield stick;wield gun;wear all} else {/if {[$_skill=sword]} {remove all;unwield stick;unwield gun;unwield whip;wield sword;wear all}}}  \
        else {/nop}
 
/al {lianon} { \
    t+ autoLian;t+ dataGet;t+ kuguDong;t+ autoQuit; \
    /al _AoutDongAct {dazuo 20}; \
    /math maxLevel %1; \
    /va preNl 0;/math dzQx %2; \
    /al _Alianxi {/20 {lian $_skill;er;ef}}; \
    /va {skillArray} {dodge;stick;parry}; \
    /va {adSkillArray} {moondance;kusang-bang;qianjun-bang}; \
    /getl arrayLen $skillArray; \
    /va skillIdx 0; \
    _AgetSkill $skillIdx; \
    _AgetAdskill $skillIdx; \
    /al _AqxAction {/if {$_Bchk} {/if {($preNl!=0)&&((($preNl<$_Nl)&&($_nl<$_Nl))||(($preNl>$_Nl)&&($_nl>$_Nl)))} {/math delt $_nl-$preNl;/if {$delt>20} {/math dzQx $dzQx-20} else {/math dzQx $dzQx+20}};/math preNl $_nl;_Alianxi;skills;dazuo $dzQx;b- _Bchk}}; \
    _Asubskill; \
    hp;skills;dazuo 20}

/al {lianof} {t- autoLian;t- dataGet;t- kuguDong;t- autoQuit;/al _AqxAction {/nop};_Aunsubskill}

class autoLian { \
    tri {���й���ϣ���һ����������վ��������} {/sleep 2;er;ef;b+ _Bchk;hp} {autoLian}; \
    tri {%0 ($_adskill)%2- %3 %4/%5} {/math curLevel %4;/math dotLevel %5;_Aadlevelchk} {autoLian} \
} {/nop}


/al {mson} {t+ dataGet;t+ autoMingsi;/va maxnl 2000;/va maxfl 2000; \
	    /al {_AjsAction} {/if {($_Fl=$maxfl)||($_Nl=$maxnl)} {dazuo 0;mingsi 0;/sleep 8;quit};/math tmpQx $_qx-10;/math tmpNl ($_Nl*2-$_nl+20)/20*20;/if {$tmpQx<$tmpNl} {/va tmpDz $tmpQx} else {/va tmpDz $tmpNl};/math tmpJs $_js-10;/math tmpFl ($_Fl*2-$_fl+20)/20*20;/if {$tmpJs<$tmpFl} {/va tmpMs $tmpJs} else {/va tmpMs $tmpFl};/if {$tmpDz>=20} {dazuo $tmpDz} else {/if {$tmpMs>=20} {mingsi $tmpMs} else {e;sleep}}};\
	    hp}


/al {msof} {t- dataGet;t- autoMingsi}

class autoMingsi { \
	tri {^���й���ϣ���һ����������վ��������} {/sleep 2;hp} {autoMingsi}; \
    tri {^���й���ϣ���ڤ˼�лع�������} {/sleep 2;hp} {autoMingsi}; \
    tri {^��һ��������ֻ���������档�ûһ���ˡ�} {/sleep 2;w;hp} {autoMingsi}; \
    tri {^���˯��һ��, �Ȼ��ɡ�} {/sleep 2;sleep} {autoMingsi}; \
    tri {^������������ -} {u;5n;u;ask girl about back;/sleep 2;w;hp} {autoMingsi}; \
} {/nop}

/al lwon { \
	t+ autoQuit; \
        t+ dataGet; \
        t+ autoLianwu; \
	/math dzQx %0;/va _skill dodge; \
        /al _Agoyunfang {s;sw;sw;se;se;e;bian long nu;w;s}; \
        /al _AgoDz {bian;n;nw;nw;ne;ne;n}; \
        /al _Alianxi {/20 {lianwu;er;ef}}; \
        /al _AjsAction {/if {$_Bchk} {/if {$_fl<400} {mingsi 250} else {/if {($preNl!=0)&&((($preNl<$_Nl)&&($_nl<$_Nl))||(($preNl>$_Nl)&&($_nl>$_Nl)))} {/math delt $_nl-$preNl;/if {$delt>20} {/math dzQx $dzQx-20} else {/math dzQx $dzQx+20}};/math preNl $_nl;_Agoyunfang;_Alianxi;_AgoDz;skills;dazuo $dzQx};b- _Bchk}};_Asubskill \
        }

/al lwof {t- autoLianwu;t- dataGet;t- autoQuit;/al _AjsAction {/nop};_Aunsubskill;dazuo 0}

class autoLianwu { \
    tri {���й���ϣ���һ����������վ��������} {/sleep 2;er;ef;b+ _Bchk;hp} {autoLianwu}; \
    tri {���й���ϣ���ڤ˼�лع�������} {/sleep 2;er;ef;b+ _Bchk;hp} {autoLianwu} \
} {/nop}


class autoDM { \
    tri {���й���ϣ���ڤ˼�лع�������} {/sleep 2;touxiang;er;ef;hp;dazuo 150} {autoDM}; \
    tri {���й���ϣ���һ����������վ��������} {/sleep 2;touxiang;er;ef;hp;mingsi 200} {autoDM} \
} {/nop}


/al dx1on {t+ autoSeaBt;eson;t+ autoRun;b- _Bft;b- _Bfound;look;_Atristep}
/al dx1of {t- autoSeaBt;t- autoRun}
/al _Atristep {look jiao}

class autoSeaBt { \
    tri {ͻȻһ����ӿ��������嵽��ç�����} {t- _Bft;t- _Bfound;_Atristep} {autoSeaBt}; \
    tri {�������Եĳ����� south �� northeast��} {s} {autoSeaBt}; \
    tri {%0��(Jiao)} {/if {$_Bft!=1} {kill jiao;b+ _Bfound;b+ _Bft}} {autoSeaBt}; \
    tri {%0��(Yuan)} {/if {$_Bft!=1} {kill yuan;b+ _Bfound;b+ _Bft}} {autoSeaBt}; \
    tri {һֻ��ģ�����ĺ��ԡ�} {kill jiao} {autoSeaBt}; \
    tri {%0�����ˡ�} {b- _Bft;b- _Bfound;_Atristep} {autoSeaBt}; \
    tri {%0�����ˡ�} {b- _Bft;b- _Bfound;_Atristep} {autoSeaBt}; \
    tri {��Ҫ��ʲô��} {/if {$_Bfound!=1} {/sleep 1;go $dir;_Atristep}} {autoSeaBt}; \
} {/nop}

/nop ---------------------------------------------------------------------------------

/al _AautoRunAct {/nop} 
/al _Agetdir5 {/va dirlist {$dir0;$dir1;$dir2;$dir3;$dir4};/va dnum @rnd{0 4};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir4 {/va dirlist {$dir0;$dir1;$dir2;$dir3};/va dnum @rnd{0 3};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir3 {/va dirlist {$dir0;$dir1;$dir2};/va dnum @rnd{0 2};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir2 {/va dirlist {$dir0;$dir1};/va dnum @rnd{0 1};/geti {dir} {$dnum} {$dirlist}}
/al _Agetdir1 {/va dir $dir0}

class autoRun { \
    tri {�������Եĳ����� %0��%1��%2��%3 �� %4��} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;/stripansi dir3 %3;/stripansi dir4 %4;_Agetdir5;_AautoRunAct} {autoRun} {1}; \
    tri {�������Եĳ����� %0��%1��%2 �� %3��} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;/stripansi dir3 %3;_Agetdir4;_AautoRunAct} {autoRun} {2}; \
    tri {�������Եĳ����� %0��%1 �� %2��} {/stripansi dir0 %0;/stripansi dir1 %1;/stripansi dir2 %2;_Agetdir3;_AautoRunAct} {autoRun} {3}; \
    tri {�������Եĳ����� %0 �� %1��} {/stripansi dir0 %0;/stripansi dir1 %1;_Agetdir2;_AautoRunAct} {autoRun} {4}; \
    tri {����Ψһ�ĳ����� %0��} {/stripansi dir0 %0;_Agetdir1;_AautoRunAct} {autoRun} {5} \
} {/nop}

/al wk {t+ autoRun;t+ zizuLin}
/al unwk {t- autoRun;t- zizuLin}
/al _Awalk {/sleep 1;go $dir}

class zizuLin { \
    tri {С· -} {n} {zizuLin}; \
    tri {������ -} {_Awalk} {zizuLin}; \
    tri {�޺��� -} {out} {zizuLin}; \
    tri {������ -} {t- zizuLin;s;w} \
} {/nop}


class kuguDong { \
    tri {�羡���������˳�����} {/sleep 2;_AoutDongAct} {kuguDong}; \
    tri {������ -} {t- autoRun;bury sheli zi} {kuguDong}; \
    tri {�㱻�ص�һ��ˤ�ڵ��ϣ�} {zuan} {kuguDong}; \
    tri {����һ�������������} {t+ autoRun;/al _AautoRunAct {/sleep 0.5;get sheli zi;go $dir};l} {kuguDong} \
} {/nop}

/nop ---------------------------------------------------------------------------------

/gag ��Ϭţ
/gag �������


/nop *******kz to sea and moon*******
/alias {m1} {w;d;w;15s;3e;dismount ma;mount lu;mount ma;3w;15n;e;u;e}
/alias {m2} {w;d;w;n;7w;nw;ne;nw;nw;nw;w;wu;su;su;wu;wu;/2 {get lian};nu;dismount ma;mount lu;mount ma;sd;ed;ed;nd;nd;ed;e;se;se;se;sw;se;7e;s;e;u;e}
/alias {m3} {w;d;w;15s;3e;dive;/sleep 4;e;e;ne;e;e;ne;mount ma;sw;w;w;sw;w;w;u;mount lu;mount ma;3w;15n;e;u;e}

/nop *******+ to xueshan******
/alias {cx} {7w;nw;ne;/3 nw;3n;answer 2;n;nw;3n;w;2s;w;6n;cx1}
/alias {cx1} {/2 cld;/2 clr;/2 cld;clr;cld;/3 w;/2 n}
/alias {cx2} {/2 s;/3 e;clu;cll;/2 clu;/2 cll;/2 clu}
/alias {xc} {cx2;5s;2e;s;2w;s;2e;se;s;3s;/3 se;sw;se;7e}
/alias {cld} {climb down}
/alias {clu} {climb up}
/alias {clr} {climb right}
/alias {cll} {climb left}



/alias {er} {exert recover}
/alias {ef} {exert refresh}
/alias {yuan} {unwield jian;unwield zhua;remove all;ask yuan about kill;wield zhua;wield jian;wear all}


/alias {ts} {/sh GO $place ==> $cguai}
/alias {kk} {follow $leguai;kill $leguai}
/highlight {yellow} {%0$cguai($eguai)}

/al _ApreStep {e;s}
/al _Await {/sleep 2}

/nop => help kill path begins from kz 1 floor

/al _AsetHelpKillPath { \
/al {path_changan} {w;n;s;w;e;s;w;u;u;u;d;d;d;e;e;w;s;w;e;e;w;s;e;se;s;enter;e;enter;u;u;u;u;u;u;6d;out;w;out;n;nw;ne;e;se;ne;e;e;w;w;se;enter;out;nw;sw;nw;n;w;n;n;s;s;w;enter;u;u;u;u;u;u;u;u;u;u;u;u;u;u;14d;out;e;e;ne;e;w;n;e;w;n;s;w;n;s;s;n;w;n;e;w;n;s;s;s;n;w;d;u;n;n;s;w;e;e;e;2w;s;w;n;s;s;d;u;n;w;n;s;s;s;e;w;n;n;w;n;s;w;e;s;e;w;se;e;w;w;w;2e;s;w;e;s;n;e;e;w;se;w;e;s;n;e;n;n;n;e;w}; \
/al {path_kaifeng} {_ApreStep;6e;e;e;e;e;e;e;s;n;e;se;e;e;w;w;s;eu;s;sw;e;e;nw;su;s;w;s;w;e;s;e;s;n;e;n;e;w;n;w;n;nd;n;wd;n;nw;se;e;e;w;w;nw;ne;e;w;n;e;e;n;n;s;s;w;w;n;e;w;n;n;e;e;w;w;nw;sw;s;w;w;n;s;s;n;e;e;s;s;w;e;s;w;e;n;n;n;n;ne;n;w;sw;nw;n;ne;e;se;e;e;e;se;se;ne;nw;nw;w;s;w;nu;n;n;w;e;e;w;s;s;sd}; \
/al {path_putuo} {_ApreStep;fly putuo;sd;sd;s;s;2n;nu;nu;open door;n;w;s;n;e;e;s;n;w;n;enter;out;w;nd;n;ne;sw;s;su;e;e;nd;n;nw;n;nw;nw;nw;ne;ne;ne;nw;nw;n;e;n;e;n;n;s;w}; \
/al {path_fangcunshan} {_ApreStep;13s;10w;nw;nu;n;w;w;w;e;e;s;n;e;climb pine;d;nu;nw;nw;su;s;n;wu;ed;nd;se;se;ne;e;w;ne;nu;nu;open door;n;w;e;e;e;w;n;s;w;n;w;e;ne;e;w;n;s;s;n;sw;nu;n;nw;ne;nw;ne;enter}; \
/al {path_gaolaozhuang} {_ApreStep;13s;w;w;w;w;w;w;w;s;n;w;s;n;n;s;w;w;n;s;s;s;s;e;w;sw;ne;n;n;n;e;e;e;e;n;e;w;w;e;n;e;w;w;e;n;w;open door;u;bed;out;d;e;e;w;n;climb wall;n;n;e;nu;sd;w;s;s;climb wall;s;s;s}; \
/al {path_changanwest} {_ApreStep;w;w;w;w;w;w;w;nw;w;w;sw;w;give dao 3 silver;nw;w;nu;n;s;sd;w;w;w;e;e;out;n;n}; \
/al {path_changanwest1} {_ApreStep;w;w;w;w;w;w;w;nw;w;w;sw;w;give dao 3 silver;nw;w;nu;n;s;sd;w;w;w;e;e;_Fnext}; \
/al {path_changanwest2} {out;n;n}; \
/al {path_moon} {_ApreStep;7w;nw;ne;nw;nw;nw;w;wu;su;su;wu;wu;nu;w;w;w;e;e;e;e;enter;out;w;n;n;s;w;e;e;w;s;climb tree;u;u;enter;n;n;e;w;w;u;bed;out;d;s;n;e;n;e;e;;w;n;nw;w;w;e;s;w;e;e;s;s;s}; \
/al {path_moon1} {_ApreStep;7w;nw;ne;nw;nw;nw;w;wu;su;su;wu;wu;nu;w;w;w;e;e;e;e;enter;out;w;n;n;s;w;e;e;w;s;climb tree;_Fnext}; \
/al {path_moon2} {climb tree;u;u;enter;n;n;e;w;w;u;bed;out;d;s;n;e;n;e;e;;w;n;nw;w;w;e;s;w;e;e;s;s;s}; \
/al {path_longgong} {_ApreStep;16s;3e;dive;_Fwait;e;e;ne;e;e;ne;ne;e;w;n;s;sw;sw;se;se;e;w;s;n;nw;nw;eastup;e;s;s;sw;ne;se;e;w;nw;n;n;n;n;nw;se;ne;e;w;sw;s;s;e;eu;eu;e;e;n;s;s;n;e;n;n;w;w;s;s;s;s;e;e;n;n;n;n;w;w;w;w;s;s;s;s;s;s;e;e;n;n;w;wd;wd;w}; \
/al {path_longgong1} {_ApreStep;16s;3e;dive;_Fwait;e;e;ne;e;e;ne;ne;e;w;n;s;sw;sw;se;se;e;w;s;n;l north;nw;nw;eastup;_Fnext}; \
/al {path_longgong2} {e;s;s;sw;ne;se;e;w;nw;n;n;n;n;nw;se;ne;e;w;sw;s;s;e;eu;eu;e;e;n;s;s;n;e;n;n;w;w;s;s;s;s;e;e;n;n;n;n;w;w;w;w;s;s;s;s;s;s;e;e;n;n;w;wd;wd;w}
/al {path_qinfa} {fly qinfa;n;n;n;n;w;w;w;w;s;s;w;w;w;w;s;s;w;w;w;w;w;e;e;n;s;w;w;e;e;e;s;n;n;s;e;e;w;n;e;w;n;e;n;s;e;s;s;s;w;w;e;e;e;w;s}; \
/al {path_honglou} {e;give er 3 silver;e;sleep;u;s;w;e;e;w;out;enter;n;w;e;n;e;w;n;e;w;w;e;enter;out;n;u;d;n;w;e;e;w;n;w;e;e;w;buy pillow from gudong;u;d;n;d;u;n;backyard}; \
/al {path_honglou1} {_ApreStep;13s;6w;3n;w;open door;up;bed;sleep;_Fnext}; \
/al {path_honglou2} {u;w;e;n;e;w;n;e;w;w;e;enter;out;n;u;d;n;w;e;e;w;n;w;e;e;w;u;d;n;d;u;n;backyard} \
}

/nop self kill path begins from li jing
/nop when you wx < 100w,you need change the qilin path,get rid of the cave path
/al _AsetKillPath { \
/al {path_changan} {fly changan;s;w;e;s;w;u;u;u;d;d;d;e;e;w;s;w;e;e;w;s;e;se;s;enter;e;enter;u;u;u;u;u;u;6d;out;w;out;n;nw;ne;e;se;ne;e;e;w;w;se;enter;out;nw;sw;nw;n;w;n;n;s;s;w;enter;u;u;u;u;u;u;u;u;u;u;u;u;u;u;14d;out;e;e;ne;e;w;n;e;w;n;s;w;n;s;s;n;w;n;e;w;n;s;s;s;n;w;d;u;n;n;s;w;e;e;e;2w;s;w;n;s;s;d;u;n;w;n;s;s;s;e;w;n;n;w;n;s;w;e;s;e;w;se;e;w;w;w;2e;s;w;e;s;n;e;e;w;se;w;e;s;n;e;n;n;n;e;w}; \
/al {path_kaifeng} {fly changan;6e;e;e;e;e;e;e;s;n;e;se;e;e;w;w;s;eu;s;sw;e;e;nw;su;s;w;s;w;e;s;e;s;n;e;n;e;w;n;w;n;nd;n;wd;n;nw;se;e;e;w;w;nw;ne;e;w;n;e;e;n;n;s;s;w;w;n;e;w;n;n;e;e;w;w;nw;sw;s;w;w;n;s;s;n;e;e;s;s;w;e;s;w;e;n;n;n;n;ne;n;w;sw;nw;n;ne;e;se;e;e;e;se;se;ne;nw;nw;w;s;w;nu;n;n;w;e;e;w;s;s;sd}; \
/al {path_putuo} {fly putuo;sd;sd;s;s;2n;nu;nu;open door;n;w;s;n;e;e;s;n;w;n;enter;out;w;nd;n;ne;sw;s;su;e;e;nd;n;nw;n;nw;nw;nw;ne;ne;ne;nw;nw;n;e;n;e;n;n;s;w}; \
/al {path_fangcunshan} {fly changan;13s;10w;nw;nu;n;w;w;w;e;e;s;n;e;climb pine;d;nu;nw;nw;su;s;n;wu;ed;nd;se;se;ne;e;w;ne;nu;nu;open door;n;w;e;e;e;w;n;s;w;n;w;e;ne;e;w;n;s;s;n;sw;nu;n;nw;ne;nw;ne;enter}; \
/al {path_gaolaozhuang} {fly changan;13s;w;w;w;w;w;w;w;s;n;w;s;n;n;s;w;w;n;s;s;s;s;e;w;sw;ne;n;n;n;e;e;e;e;n;e;w;w;e;n;e;w;w;e;n;w;open door;u;bed;out;d;e;e;w;n;climb wall;n;n;e;nu;e;w;sd;w;s;s;climb wall;s;s;s}; \
/al {path_changanwest1} {fly changan;w;w;w;w;w;w;w;nw;w;w;sw;w;give dao 3 silver;nw;w;nu;n;s;sd;w;w;w;e;su;nd;e;_Fnext}; \
/al {path_changanwest2} {out;n;n}; \
/al {path_moon} {fly changan;7w;nw;ne;nw;nw;nw;w;wu;su;su;wu;wu;nu;w;w;w;e;e;e;e;enter;out;w;n;n;s;w;e;e;w;s;climb tree;u;u;enter;n;n;e;w;w;u;bed;out;d;s;n;e;n;e;e;;w;n;nw;w;w;e;s;w;e;e;s;s;s}; \
/al {path_longgong} {fly changan;16s;3e;dive;_Fwait;e;e;ne;e;e;ne;ne;e;w;n;s;sw;sw;se;se;e;w;s;n;l north;nw;nw;eastup;e;s;s;sw;ne;se;e;w;nw;n;n;n;n;nw;se;ne;e;w;sw;s;s;e;eu;eu;e;e;n;s;s;n;e;n;n;w;w;s;s;s;s;e;e;n;n;n;n;w;w;w;w;s;s;s;s;s;s;e;e;n;n;w;wd;wd;w}; \
/al {path_honglou} {fly changan;s;e;give er 3 silver;e;sleep;l;u;s;w;e;e;w;out;enter;n;w;e;n;e;w;n;e;w;w;e;enter;out;n;u;d;n;w;e;e;w;n;w;e;e;w;buy pillow from gudong;u;d;n;d;u;n;backyard}; \
/al {path_baoxiang} {fly baoxiang;n;n;n;n;nw;fly baoxiang;n;n;n;n;s;s;e;w;s;e;w;s;e;w;s;su;w;e;e;w;su;w;e;e;w;su;w;e;e;w;su;w;e;e;w;su;w;e;e;w;su;w;e;e;w;su;nd;nd;nd;nd;nd;nd;nd;n;sw;n;s;w;w;s;n;w;nw;n;ne;nu;nw;ne;se;s;se;nw;n;nw;nw;ed;e;e;ne;ne;sw;sw;w;w;wu;sd;nw;nw;nw;sw;sw;ne;ne;se;se;nu;ne;e;e}; \
/al {path_chechi} {fly wuji;5e;sw;w;sw;nw;n;nw;w;w;s;s;s;e;w;n;e;w;n;w;w;n;w;w;n;n;n;n;e;e;e;e;s;s;s;s;w;w;n;n;w;e;e;n;w;w;e;n;w;e;e;w;s;s;s;s;s;w;e;e;w;s;w;w;s;s;n;w;e;n;e;w;n;w;w;e;s;s;s;e;e;e;nu;nu;nu;w;e;open door;e;w;n;n;nw;spell shugui;s;se;s;ne;e;e;w;w;sw;s;sd;sd;sd;e;e;e;n;n;n;n;n;n;w;w;w;su;eu;sw;su;se;e;e;e;nu;sd;w;w;se;nw;n;n;s;s;w;nw;nd;ne;wd;nd;w;w;w;s;s;s;e;n;n;w;e;s;w;e;e;e;e;n;n;w;e;s;w}; \
/al {path_nuerguo} {fly nuerguo;n;n;w;w;e;nu;n;w;e;e;w;n;s;s;sd;e;s;w;w;s;e;e;se;e;n;s;w;s;su;open door;enter;out;nd;w;wu;nd;nu;nu;ed;wu;nw;nw;fly wuji;5e;sw;w;sw;nw;n;nw;w;s;s;s;w;w;w;w;w;w;w;n;n;n;w;sw;sw;nw;w;s;w;sw;w;n;w;w;n;w;n;nw;w;w;sw;wu;sw;n;nw;nw;n;sw;w;sw;sd;wd;nw;w;s;s}; \
/al {path_jinpingfu} {fly qinglong;sw;se;sd;se;s;w;n;s;e;se;se;s;s;s;e;w;s;w;s;n;e;e;s;n;e;n;s;e;n;n;n;s;e;w;s;e;w;s;se;se;se;s;s;se;se;se;e;e;w;w;nw;nw;nw;n;eu;e;e;n;e;s;e;se;nw;w;w;w;w}; \
/al {path_jisaiguo} {fly jisaiguo;n;n;n;n;e;e;ne;e;eu;se;nw;wd;w;sw;w;w;w;s;n;w;s;n;nu;sd;w;s;n;w;w;w;w;nw;se;e;sw;s;n;ne;e;e;s;s;s;s;e;e;open door;n;n;w;e;e;w;n;w;e;e;w;nu;ask chanshi about ɨ��;enter;u;u;u;u;u;u;u;u;u;u;u;u;12d;knock door;_Fwait;out;sd;s;s;s;e;e;n;n;n;n}; \
/al {path_tianzhuguo} {fly tianzhu;e;e;e;e;e;e;e;e;w;w;w;w;w;w;w;w;s;w;e;e;w;s;e;w;s;w;e;s;w;w;e;e;s;e;w;s;w;e;s;w;e;s;s;n;e;n;s;e;s;n;e;se;s;s;s;s;n;n;n;n;ne;e;s;n;n;s;e;n;s;e;n;n;w;e;n;w;e;n;n;n;w;e;n;w;e;n;w;w;w;n;s;w;w;n;s;w;s;w;s;s;s;e;e;n;s;e;e;s;n;e;w;w;s;w;e;s;w;e;e;w;s;n;n;n;e;e;e;e;se;s;se;se;s;sw;sw;s;s;s;n;se;nw;nw;w;e;e;n;fly yinwu;se;3e;ne;6e;4n;3w;2n;3e;bian guo wang;3w;fly tianzhu;8w;4s;3e;3n;bian;e;e;w;w;n;n;w;n;w;e;e;e;e;w;s;w;s}; \
/al {path_yuhuaxian} {fly qinglong;sw;se;sd;se;s;se;se;s;s;s;s;e;e;e;se;se;se;s;s;se;se;se;e;e;e;nw;nw;nu;sd;se;ne;ne;ne;nu;sd;sw;sw;sw;se;e;e;se;ne;sw;nw;w;w;s;s;s;w;w;e;e;e;e;w;w;s;e;w;s;w;e;s;w;e;e;w;s;s;w;w;w;e;e;s;n;e;e;s;n;e;e;w;w;w;s;s;e;e;e;w;w;w;s;sw;ne;n;n;n}; \
/al {path_zhuziguo} {fly zhuzi;s;s;s;s;s;s;s;s;s;s;s;s;e;ne;w;w;w;ne;n;e;w;w;e;n;e;w;n;n;w;w;w;w;e;n;s;s;n;e;s;n;n;s;e;n;s;s;n;e;e;e;e;e;ne;sw;w;n;s;w;n;s;s;s;n;e;w;n;w;n;s;w;n;n;w;w;w;e;e;e;e;e;e;w;w;w;n;n;n;n;ne;n;nw;ne;sw;se;s;sw;w;w;nw;nw;se;se;e;e;s;s;s;s;s;s}; \
/al {path_xueshan} {fly changan;7w;nw;ne;nw;nw;nw;n;n;n;answer 2;n;nw;n;n;n;w;s;s;w;n;n;n;n;n;n;climb down;climb down;climb right;climb right;climb down;climb down;climb right;climb down;w;w;w;sd;sd;sd;nu;nu;nu;w;e;n;jump shi bi;w;n;n;e;e;s;s;w;n;n;n;jump shi bi;open door;e;w;w;n;s;look south;e;n;n;jump shi bi;e;w;w;w;n;e;s;w;w;n;s}; \
/al {path_wujiguo} {fly wuji;n;n;e;ne;s;s;n;e;w;w;w;s;s;e;s;n;e;s;n;e;e;e;ne;ne;sw;sw;sw;w;sw;ne;e;ne;eu;se;eu;su;nd;n;se;se;ed;e;w;wu;nw;nw;enter;n;w;e;e;n}; \
/al {path_biqiuguo} {fly xiaoxitian;nw;nw;n;w;sw;w;sw;se;s;sw;w;w;nw;nw;sw;w;wu;nw;nw;wd;nw;w;nw;w;w;w;nw;e;w;s;n;w;w;sw;nw;se;e;s;w;w;w;w;e;e;e;s;se;nw;sw;s;sw;ne;w;w;s;n;e;e;n;ne;n;n;ne;e;e;se;s;sw;e;w;se;w;e;se;s;sw;s;sw;s;e;sw;se;s;s;sw;e;w;w;w;se;e;e}; \
/al {path_bibotan} {fly jingjiling;e;nw;n;ne;sw;s;se;s;sw;su;wd;sd;se;ed;se;e;ne;ne;e;w;sw;sw;dive;n;n;nu;n;nu;w;e;e;w;n;n;n;nw;nw;ne;ne;se;se;sw;sw;jump}; \
/al {path_qinglongshan} {fly qinglong;jump;jump;u;sw;se;sd;se;s;n;nw;nu;nw;ne;nw;wu;wu;nw;nu;ne;ne;n;nw;se;e;ne;sw;e;w;se}; \
/al {path_yinwushan} {fly yinwu;sw;w;w;w;w;e;e;e;e;ne;ne;sw;nw;nw;nw;w;se;ne;se;se;se;se;sw;se;nw;ne;e;e;e;w;w;w;nw;nw;nw;nw;nw;nu;w;sw;sd;fly yinwu;nw;nw;nw;ne;e;se;sd;bian xxjing;dive;bian;w;bian xxxjing;w;bian;w;nw}; \
/al {path_wuzhuangguan} {fly wuzhuang;sd;s;se;sd;s;n;nu;nw;n;nu;nu;nu;n;nu;w;su;nd;n;n;w;e;n;n;e;w;n;e;e;s;w;e;s;s;e;w;s;s;su;nd;w;enter;w;n;eu;u;d;ed;s;w;out;w;n;n;n;n;n;e;n;open door;n;ne;open door;d;u;n;sw;n;n;ne;ne;nw;nw;sw;sw;se;se;n;ne;n;nw;sw;s;se}; \
/al {path_zhujieshan} {fly qinglong;sw;se;sd;se;s;se;se;s;s;s;e;w;s;w;s;n;e;e;s;n;e;n;s;e;n;n;n;s;e;w;s;e;w;s;se;se;se;s;s;se;se;se;e;e;e;nw;ne;ne;ne;nu;nw;ne;nu;nw;ne;ne;e;e;e;se;sw;sd;sw;nw;w;ne;e;ne;e;w;sw;w;nw;w;sw;w;nw;w;sw;ne;e;se;e;ne;e;se;sw}; \
/al {path_baotoushan} {fly qinglong;sw;se;sd;se;s;se;se;s;s;s;e;w;s;w;s;n;e;e;s;n;e;n;s;e;n;n;n;s;e;w;s;e;w;s;se;se;se;s;s;se;se;se;e;e;e;nw;nw;nu;nw;nw;nw;nu;nu;sd;sd;wu;wu;nw;bian diaozuan;se;ed;ed;nu;nu;bian}; \
/al {path_jileishan} {fly jisaiguo;n;n;n;n;e;e;ne;e;eu;se;e;se;e;se;ne;e;w;sw;nw;sw;su;sw;se;e;su;sw;se;sw;n;s;se;sw;se;nw;w;sw;ne}; \
/al {path_huoyanshan} {fly nuerguo;e;e;s;s;se;s;w;wu;nd;nu;nu;nw;nw;w;sw;nw;w;nw;nw;w;s;n;n;s;w;w;w;w;wu;ed;sw;sw;su;su;wu;sd;sd;se;sw;s;wu;su;wu;su;e;e}; \
/al {path_dudishan} {fly nuerguo;e;e;s;s;se;s;w;wu;nd;nu;nu;nw;nw;w;sw;nw;ne;wu;nw;eu;nw;nu;nw;ne;sw;se;sd;se;wd;se;ed;sw;w;nw;se;e;ne;wu;nw;eu;nw;nu;nw;ne;ne}; \
/al {path_maoyingshan} {fly tianzhu;7w;8s;e;e;e;se;s;s;s;s;sw;s;se;se;sw;su;nd;sw;sw;su;se;se;e;e;e;nd;ne;nw;nw;wd;nw;se;eu;se;se}; \
/al {path_qinfaguo} {fly yinwu;se;e;e;e;ne;e;e;e;e;e;e;n;n;n;n;w;w;w;n;n;e;n;s;e;e;e;s;n;n;s;w;w;w;w;w;n;s;w;s;e;w;s;w;n;s;s;n;w;n;s;w;w;e;e;e;e;e;e;s;s;w;w;e;e;e;w;s}; \
/al {path_tongtianhe} {fly wuji;e;e;e;e;e;sw;w;sw;nw;n;nw;w;s;s;s;w;w;w;w;w;w;n;n;n;w;sw;sw;nw;ne;out;nw;out;w;n;out;w;out;s;se;out;e;out;w;sw;w;s;s;n;n;n;n;n;s;w;s;w;n;w;s;s;s;n;n;n;n;n;s;nw;w;w;sw;ne;e;e;se}; \
/al {path_xiaoxitian} {fly xiaoxitian;s;e;n;s;s;n;e;w;w;sw;s;n;ne;n;nw;nw;n;w;sw;w;e;ne;e;s;e;ne;e;e;e;se;nw;w;w;w;sw;w}; \
/al {path_jindoushan} {fly wuji;5e;sw;w;sw;nw;n;nw;w;s;s;s;w;w;w;w;w;w;w;n;n;n;w;sw;sw;nw;w;s;w;sw;w;n;w;w;n;w;n;nw;w;w;sw;wu;sw;n;nw;nw;n;sw;ne;s;se;se;bian yao;nw;sw;bian me;s;sw;w;s;ne;ne;n;ne;nw;n;sw;w;sw;sd;wd;nw;w;s;s}; \
/al {path_wudidong} {fly yinwu;se;e;e;e;ne;e;e;e;e;e;e;n;n;n;n;e;e;e;s;n;n;s;e;s;n;n;s;e;n;s;s;s;n;n;e;ne;nu;ed;wu;sd;sw;w;s;s;push statue;sw;su;enter;su;su;wu;dive dong;n;w;e;e;w;n;w;e;e;w;n;e;w}; \
/al {path_pansiling} {fly xiaoxitian;nw;nw;n;w;sw;w;sw;se;s;sw;w;w;nw;nw;sw;w;wu;se;se;se;e;s;e;s;n;ne;sw;w;w;e;n;w;nw;nw;w;sw;se;e;sd;nu;w;nw;ne;w;nw;w;s;s;w;e;s;sw;ne;n;n;n;e;se;e;sw;sw;unset no_accept;ask furen about ��Ǯ;_Fwait;set no_accept;ne;ne;e;nw;nw;nw;wd;nw;se;eu;ne;ed;ed;down;down;down;up;up;up;wu;jump down;drop huang qian;e;nu;ne;nu;se;s;ne;e;enter;out;ne;e;se;s;w;w;nw}; \
/al {path_fengxianjun} {fly yinwu;sw;w;w;w;w;sw;sw;s;s;s;s;s;s;sw;ne;n;n;n;n;n;w;s;s;n;n;n;n;s;s;w;s;w;n;n;s;w;n;n;s;s;s;s;se;sw;nw;ne;n;n;w;n;s;s;w;s;n;n;n;s;w;n;s;s;w;e}; \
/al {path_qilinshan} {fly zhuzi;12s;6n;4e;ne;eu;eu;se;fly qilin;right;right;right;right;right;right;right;climb;right;right;right;right;right;climb;nw;wu;ne;e;nw;ne;sw;w;nw}; \
/al {path_pingdingshan} {fly wuji;e;e;e;e;e;ne;ne;ne;ne;eu;ne;ne;se;se;se;e;e;w;w;ne;sw;s;n;nw;nw;s;nw;s;se;sw;se;s;ed;ed;se;ne;ne;sw;sw;nw;wu;wu;sw;su;se;sw;sw;se;wu;sw;se;s;sw;e;w;sw;ne;ne;n;nw;ne;nd}; \
/al {path_jingjiling} {fly jingjiling;wu;sw;w;nw;wu;nw;wu;s;su;sw;e;e;sw;w}; \
/al {path_penglai} {fly penglai;nu;enter;n;n;n;n;nw;nw;nw;nw;nw;nw;nw;nw;n;n;ne;ne;ne;ne;ne;ne;ne;ne;ne;ne;ne;ne;ne;n;n;n;s;nw;nw;n;n;out;sd;su;out;jump down;s;s;s;s;e;s;s;s;s;e;s;s;s;s;e;s;s;s;s;e;s;s;s;s}; \
}

/va working 0;/va finish 0;/va getit 0;/va cnt 0;/va _Bbreak 0;
/al {search_init} {/al2var {path} %0;/math _Bbreak 0;/math working 1;/math finish 0;/math getit 0;/math cnt 0;/getl {len} {$path};t+ autoFind}

/al ca1 {search_init path_changan;search $leguai}
/al ca2 {search_init path_changanwest1;search $leguai}
/al ca3 {search_init path_changanwest2;search $leguai}
/al mo1 {search_init path_moon1;search $leguai}
/al mo2 {search_init path_moon2;search $leguai}
/al fcs {search_init path_fangcunshan;search $leguai}
/al glz {search_init path_gaolaozhuang;search $leguai}
/al kf {search_init path_kaifeng;search $leguai}
/al lg1 {search_init path_longgong1;search $leguai}
/al lg2 {search_init path_longgong2;search $leguai}
/al hl2 {search_init path_honglou2;search $leguai}

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

/delimiter {;}

/va {msgGo} {${_CYN}�ǣ�ǣ�ǣ��${_NOR}}
/al {_AtrigStep} {look $leguai}
/al {stepwait} {/sleep 0.5}
/al {getp}{/geti {dothis} {%%0} $path}
/al {search} { \
	/if {$cnt<$len && $getit=0 && $_Bbreak=0} \
		{getp $cnt;/if {[$dothis!=_Fnext]} {/if {[$dothis=_Fwait]} {/sleep 2;_AtrigStep} else {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep};/math cnt $cnt+1}} \
	else { \
		/if {$cnt=$len} {/sleep 2;_Abackhell;tell $newbie 9527 û���ҵ�$cguai��}}}

/al {_Abackstep} {/math cnt $cnt-1}
/al {_Abackgo} {_Abackstep;getp $cnt;/var2al {_Adothis} $dothis;_Adothis;_Abackhell}
/al {_Ascontinue} {t+ autoFind;_Aunwld;/if {$getit=0} {search $leguai}}
/al {_Akcontinue} {t+ autoFind;/if {$getit=0} {search $leguai}}
/al {_Abreak} {t- autoFind;_Abackstep}
/al {_AyuanAction} {/nop}
/al {_Afire} {/if {$_Bfiring} {touxiang;er;/sleep 0.2;cast inferno on $leguai}}
/al {_Abackhell} {cast townportal;/3 north;3e;3s;se;out}
/al {buyfu} {unset no_accept;buy jiudai from er;w;n;3w;n;give yuan jiudai}

/al {startwork} { \
	/va helper pfm;/va failcnt 0; \
	/al _Aprd2kz {e;2s;e;u;e}; \
	/al _Akz2prd {w;d;w;2n;w}; \
	/al {_AysAction} {/if {$_year<5 && $_wx < 20000} {/va tguai СС} else {/va tguai ʮ��}}; \
	/al _AyuanAction {tell $helper 9527 [$tguai]$cguai[$eguai]-[$leguai]��$place;_Aprd2kz}; \
	t+ dataGet;t+ taskYuan;t+ taskNewBie;/ticksize 60; \
	/al tick {_Akz2prd;ask yuan about kill};hp}

/al {starthelp} { \
	/va newbie fog;/al _ApreStep {w;n}; \
	/al _AfoundAction {b+ _Bfiring;t- autoFind;unwield gun;wield blade;kill $leguai;perform pozhan;cast inferno on $leguai;touxiang}; \
	/va getit 0;/va working 0;/va _Bctguai 0; \
	/al tick {/if {$_Bctguai} {_Abackhell} else {uptime}}; \
	/al {search} { \
	    /if {$cnt<$len && $getit=0 && $_Bbreak=0} \
                {getp $cnt;/if {[$dothis!=_Fnext]} {/if {[$dothis=_Fwait]} {/sleep 2;_AtrigStep} else {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep};/math cnt $cnt+1}} \
	    else { \
                /if {$cnt=$len} {/sleep 2;_Abackhell;tell $newbie 9527 û���ҵ�$cguai��}}}; \
	_AsetHelpKillPath;t+ dataGet;t+ taskHelper;t+ autoFind;t+ autoQuit;hp}


/al {stophelp} {t- taskHelper;t- autoFind;t- dataGet;t- autoQuit}

/al {startkill} { \
    /setprompt {-$cguai-$place-$nguai-$getwx-$getqn-$error}; \
    /al _AfoundAction {t- autoKp2;t+ autoKp3;bian;cha $leguai}; \
    /va nguai 0;/va getit 0;/va getwx 0;/va getqn 0; \
    /al ticksize 360;/al tick {w;askli}; \
    /al {search} { \
            /if {$cnt<$len && $getit=0 && $_Bbreak=0} \
                {getp $cnt;/if {[$dothis!=_Fnext]} {/if {[$dothis=_Fwait]} {/sleep 2;_AtrigStep} else {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep};/math cnt $cnt+1}} \
	    else { \
                /if {$cnt=$len} {/sleep 2;t- autoKp2;t+ autoKp4;/math error -1;_Aback2pl}}}; \
    _AsetKillPath;t+ dataGet;t- autoKp2;t- autoKp3;t- autoKp4;t+ autoKp1;t+ autoFind;t+ autoQuit;eson;/al _AoutDongAct {t+ autoKp1;askli};t+ kuguDong; \
    /al _Adoesc {t- autoKp3;t+ autoKp4;/tickof;/math error 3;_Aback2pl}; \
	score;hp \
}

/al {startkill2} { \
    jiali $_maxNl;enchant $_maxFl; \
    /setprompt {-$cguai-$place-$error}; \
    /al _AfoundAction {t- autoKp2;t+ autoKp3;follow $leguai;kill $leguai}; \
    /al _Aback2pl {touxiang;t- autoKp4;t+ autoRecover;fc;2f;/al _AafterRecover {/if {$error=3} {t- autoKp4;t+ autoKp2;s;$place} else {f2;t- autoKp4;t+ autoKp1}};_AsetRecover}; \
    /va getit 0; \
    /al ticksize 360;/al tick {w;askli}; \
    /al {search} { \
            /if {$cnt<$len && $getit=0 && $_Bbreak=0} \
                {getp $cnt;/if {[$dothis!=_Fnext]} {/if {[$dothis=_Fwait]} {/sleep 2;_AtrigStep} else {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep};/math cnt $cnt+1}} \
	    else { \
                /if {$cnt=$len} {/sleep 2;t- autoKp2;t+ autoKp4;/math error -1;_Aback2pl}}}; \
    _AsetKillPath;t+ dataGet;t- autoKp2;t- autoKp3;t- autoKp4;t+ autoKp1;t+ autoFind;t+ autoQuit;eson; \
    /al _Adoesc {t- autoKp3;t+ autoKp4;/math error 3;_Aback2pl};hp \
}

/al {stopkill} {t- dataGet;t- autoKp1;t- autoKp2;t- autoKp3;t- autoKp4;t- autoFind;t- autoQuit;esof;/al tick uptime}


class taskYuan { \
    tri {Ԭ���������ľ�����ķ�һ��������˵����} {b+ _Baskg} {taskYuan}; \
    tri {����%0(%1)��%2��û��Ϊ����С������ȥ�շ���} {/if {$_Baskg} {/if {[%%%0!=$cguai] || [%%%2!=$place]} {/math failcnt 0;/ticksize 60};/va cguai %%0;/va eguai %%1;/va place %%2;/tolower leguai $eguai;b- _Baskg;_AyuanAction}} {taskYuan} \
} {/nop}




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
/al _Atick1to2 {/al tick {_AdisableKill;t+ autoKp4;/va error 3;_Aback2pl};/ticksize 300}

/al _AafterRecover {/nop}
/al {_AsetRecover} {/al _AjsAction {/if {$chkHP} {/if {$_fl<$_Fl*2*8/10} {/3 touxiang;er;ef;mingsi 100} else {/if {$_nl<$_Nl*2*8/10} {/3 touxiang;er;ef;dazuo 100} else {/al _AjsAction {/nop};t- autoRecover;_AafterRecover}}};b- chkHP};b+ chkHP;hp}

class autoRecover { \
    tri {^���й���ϣ���ڤ˼�лع�������} {/sleep 2;_AsetRecover} {autoRecover}; \
    tri {^���й���ϣ���һ����������վ��������} {/sleep 2;_AsetRecover} {autoRecover} \
} {/nop}

/nop ask guai
class autoKp1 { \
    tri {^�����˵��������%0(%1)��%2Ϊ������������ȥ������} {/va cp 0;/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*ʨ} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*�} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/ifm {*��} {%%0} {/va cp 1};/if {$cp=1} {/va cguai %%0;/va eguai %%1;/va place %%2;/tolower leguai $eguai;/va error 0;/va pretime $_time;t- autoKp1;t+ autoKp2;jiali $_maxNl;enchant $_maxFl;_Atick1to2;$place}} {autoKp1} {3}; \
    tri {${_NOR}${_CYN}�˵�����Ϸ�������ȥ����%0��} {/va cguai %0;/va bAsk 0;/va bFind 1;fly kaifeng;find $leguai} {autoKp1}; \
    tri {^ǧ���۸����㣺��֣��Ҳ�������ˣ�����} {/if {$bFind=1} {/if {($error=-1)||($error=2)} {/math error -1;_AKpbackKz} else {/math pretime $_time-1200;/math error -1;_AKpbackKz};/va bFind 0}} {autoKp1}; \
    tri {^ǧ���۸����㣺%0($leguai)��%1��} {/if {$bFind=1} {/if {($error=-1)&&([%%0=$place])} {_AKpbackKz} else {/va cguai %%0;/va place %%1;t- autoKp1;t+ autoKp2;_Atick1to2;$place};/va bFind 0}} {autoKp1}; \
    tri {^����û������ˡ�} {/if {$bAsk} {/math error 1;/math pretime $_time;_AKpbackKz;/va bAsk 0}} {autoKp1}; \
    tri {^�������������һ����˵����λ����,��ħ�ѳ���,������ȥЪϢ��} {_AKpbackKz} {autoKp1} \
} {/nop}


/al {_AKp2continue} {t+ autoKp2;/if {$getit=0} {search $leguai}}
/al {_AKp2break} {t- autoKp2;_Abackstep}

/nop tri {^ֻ���������ƵĲ�ס���ˡ�}
/nop tri {^�������Ƶ����ԣ�����һ����·��}
/nop find guai
class autoKp2 { \
    tri {%0һ��ץס���㣡} {_Abackstep} {autoKp2}; \
    tri {����Ҫ�뿪����Ȼ����ʲô��������ǰһ�Σ����ɵ�ͣ��������} {_Abackstep} {autoKp2}; \
    tri {^��ǰ�������ֵ�ס�����ȥ·��} {_Abreak;kill li shi} {autoKp2}; \
    tri {^���Ŵ�ʹ����ҡ��ҡ�֡�} {_Abreak;kill da shi} {autoKp2}; \
    tri {^���ܹ�������ס�㣺����������Ժ���߸�ʲôѽ��} {_Abreak;kill bear} {autoKp2}; \
    tri {^����������˼䲢��Ϸˣ֮��������ɧ�����ɼ�����} {_Abreak;kill wu gang} {autoKp2}; \
    tri {^��������˵������ʦ���ޣ��ټ����ˣ���������ذɣ�} {_Abreak;t- autoKp2;t+ autoKp4;/math error 2;_Aback2pl} {autoKp2}; \
	tri {^��һ��������ֻ���������档�ûһ���ˡ�} {w;t- autoKp2;t+ autoKp1;/math error -1;_AsetTsize} {autoKp2}; \
    tri {^���������µ��������й�ͣ����������} {_Abreak;kill xiboer gu} {autoKp2}; \
    tri {^�Ų������µ��������й�ͣ����������} {_Abreak;kill guboer xi} {autoKp2}; \
    tri {^�첨��Ц�ȵ�����Ժ�ǽ��أ�����Īȥ�ĺã�} {_Abreak;kill tianboer xiao} {autoKp2}; \
    tri {^Ц������ȵ�����Ժ�ǽ��أ�����Īȥ�ĺã�} {_Abreak;kill xiaoboer tian} {autoKp2}; \
    tri {^�����ʹһͦ���иֲ棬��ס�����ȥ·��} {_Abreak;kill guard} {autoKp2}; \
    tri {^����ţ��һ����ֻ��ţ�ǵ�ס�㣺���ﵽ�Ķ�ȥ��} {_Abreak;s;sw;fly qinglong;sw;se;sd;se;s;w;n;s;e;se;se;s;s;s;s;e;s;buy hulu from dian zhu;buy hulu from dianzhu;n;e;n;fill hulu} {autoKp2}; \
	tri {^����������ס�㣺�������Ϸ����ң���ȥ��ʲô��} {_Abreak;kill shou xing} {autoKp2}; \
	tri {^����������ס�㣺�������Ϸ����ң���ȥ��ʲô��} {_Abreak;kill fu xing} {autoKp2}; \
	tri {^»��������ס�㣺�������Ϸ����ң���ȥ��ʲô��} {_Abreak;kill lu xing} {autoKp2}; \
	tri {^����������������������˸��������} {_Abreak;/sleep 5;/3 exert heal;_Akcontinue} {autoKp2}; \
	tri {^ɽ���������������������} {_Abreak;F6;_Akcontinue} {autoKp2}; \
	tri {^�㽫�ͺ�«�����ֺ����͡�} {/sleep 2;s;fly qinglong;nw;wu;wu;nw;nu;ne;ne;n;give niujing hulu;_Akcontinue} {autoKp2}; \
	tri {^��������û���ֺ������ˡ�} {t- autoKp2;t+ autoKp4;/math error 2;s;fly changan;d;drop hulu;u;_Aback2pl} {autoKp2}; \
    tri {^����ɮ˵��������Ժˡ���ӿͣ���ء���} {_Abreak;kill shousi seng} {autoKp2}; \
    tri {^�߹��ؽ��µ����ǲ������ȥ�ĵط���} {_Abreak;kill wu jiang} {autoKp2}; \
    tri {^������ʿ�ȵ������У�} {_Abreak;jiali 0;kill wei shi} {autoKp2}; \
	tri {^����չһ������������ǰ�棬��Ц����} {_Abreak;jiali 0;kill xia} {autoKp2}; \
	tri {^ɽ���������������������} {_Abreak;F6;_Akcontinue}; \
    tri {^���(donate)һ�����ӵ����������ӭ��裺��} {_Abackstep;donate 1 silver} {autoKp2}; \
    tri {������������} {_Akcontinue} {autoKp2}; \
    tri {^��ʹ���ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {%0��ʿ���ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {^������ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {^�����������ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {^�Ų��������ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {^�첨��Ц���ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {^Ц���������ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {^�����ʹ���ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {^����ɮ���ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {^�߹��ؽ����ˡ�} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {������ʿ���ˡ�} {touxiang;er;ef;jiali $_maxNl;enchant $_maxFl;_Akcontinue} {autoKp2}; \
	tri {����չ���ˡ�} {touxiang;er;ef;jiali $_maxNl;enchant $_maxFl;_Akcontinue} {autoKp2}; \
	tri {^ֻ��һ�����������ǻ���һ���׹�������ֱ���ȥ������} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
	tri {^ֻ��һ��������»�ǻ���һ���׹�������ֱ���ȥ������} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
	tri {^ֻ��һ�����������ǻ���һ���׹�������ֱ���ȥ������} {t+ autoRecover;t- autoKp2;/al _AafterRecover {t+ autoKp2;_Akcontinue};_AsetRecover} {autoKp2}; \
    tri {���ˡ���һ������ӻ��ص����������С�����} {break;er} {autoKp2}; \
    tri {ֻ�������˷������ǣ��ǡ�������������} {/sleep 0.2;break;er} {autoKp2}; \
    tri {�����˵ķ�϶�㹻һ�������ȥ�ˡ�} {ca3} {autoKp2}; \
    tri {�����Ѿ����ˣ���Ѿ��ˡ�} {ca3} {autoKp2} \
} {/nop}


/nop kill guai
class autoKp3 { \
    tri {^˳��������㣺$cguai���书�Ѵ�%0�ľ��硣} {/stripansi gwxjj %0;/math glwj @arrayIdx{$gwxjj $wxjjArray};/math glwj $glwj-2} {autoKp3}; \
	tri {^˳��������㣺$cguai��������Ϊ����%0��%1m�Ļ��} {/stripansi gnlxw %0;/ctoi glnl $gnlxw;/math glnl $glnl-10;/if {(($_lwj>=18)||(($_lwj<18)&&($_lwj>=$glwj)))&&(($glnl)&&($_lnl>$glnl))} {follow $leguai;kill $leguai} else {t- autoKp3;t+ autoKp2;/var getit 0;_Akcontinue}} {autoKp3}; \
    tri {^$cguai��Ц������ƾ����㱾�£�Ҳ�����Ҷ���} {touxiang;/4 exert heal;er;kill $leguai} {autoKp3}; \
    tri {^$cguai����Ҳ���㳢�����޵����師��������} {touxiang;/4 exert heal;er;kill $leguai} {autoKp3}; \
    tri {^���޵����師һ���ǳɣ��㱻���˸����ֲ�����������Ϊ���£�} {touxiang;/8 exert heal;er;kill $leguai} {autoKp3}; \
	tri {${_NOR}${_HIW}��ٲ���������$cguai�ĳ��Ǹ߸߾���} {touxiang} {autoKp3}; \
    tri {^ֻ������ž����һ���������е�%0�Ѿ���Ϊ���أ�} {remove dun;wield bang;wield gun;wear dun} {autoKp3}; \
	tri {^������һ����ʯͷ�죬$cguai��ɽ����б����������} {sd;kill $leguai} {autoKp3}; \
    tri {( ����һ��������û����ɣ�����ʩ���ڹ���)} {/sleep 1;er} {autoKp3}; \
    tri {${_HIR}��ɫ������%0׷ȥ��} {_Adoesc} {autoKp3}; \
	tri {^������������������֪��������} {ef;ef;/sleep 2;_Adoesc} {autoKp3}; \
    tri {^$cguai��%0�뿪��} {kill $leguai} {autoKp3}; \
    tri {^$cguai�ƿ�һ��Ұ�ݣ����������˽�ȥ��} {enter;kill $leguai} {autoKp3}; \
    tri {^$cguai��%0��Ķ����ˡ�} {kill $leguai} {autoKp3}; \
    tri {^$cguaiһ��������Ķ��֣�ֻ�þ͵�һ�������ԭ�Σ����˼���ת������ʵʵ���߿��ˡ�} {/nop} {autoKp3}; \
    tri {^$cguai�ۼ����Σ�ֻ�û��ɹ����̸�����������С�} {/nop} {autoKp3}; \
    tri {^����һ�ӣ�$cguai���ɴ��⣬ѱ�����߿��ˡ�} {/nop} {autoKp3}; \
    tri {^$cguai�޿��κΣ�����һ����⣬ֱ������ȥ�ˣ�����} {/nop} {autoKp3}; \
    tri {^$cguai�ҽ�һ�������ˡ�} {/nop} {autoKp3}; \
    tri {^��õ���%0����ѧ�����%1��Ǳ�ܣ�} {/math nguai $nguai+1;/ctoi getwx %0;/ctoi getqn %1;t- autoKp3;t+ autoKp4;/math error 0;_Aback2pl} {autoKp3}; \
} {/nop}

/nop heal
class autoKp4 { \
    tri {^��Χû��һƬ�ƣ�û�취���Ƽ���} {/nop} {autoKp4}; \
    tri {^��ת�����ܣ�ȴ��%0һ��������ס��} {/sleep 2;_Adoesc} {autoKp4}; \
    tri {^��������һ�ɺڷ磬������Ҳ���źڷ�ɢȥ������} {/tickof;/3 north;3e;3s;se;out} {autoKp4}; \
    tri {^��Ȼһ��������ס���㡣} {er;ef;open guancai;t- autoKp4;t+ autoRecover;2f;/al _AafterRecover {/if {$error=3} {t- autoKp4;t+ autoKp2;_Atick1to2;touxiang;open door;n;close door;w;$place} else {touxiang;open door;n;close door;w;_AKpbackKz;t- autoKp4;t+ autoKp1}};_AsetRecover} {autoKp4} \
} {/nop}


/al {path_dx1} {{fly xiaoxitian;nw;nw;n;w;sw;w;sw;se;s;sw;w;w;nw;nw;sw;w;wu;nw;nw;ne;ed;ed};down;down;down;down;down;down}
/al {ddx1} { \
    enchant 50;/va cguai ˮ�ξ�;/va eguai {Shuizhi jing};/va leguai {shuizhi jing}; \
    /al tick {lianof;/unac {*�й�*};dazuo 0;/sleep 4;w;ddx1};/tickof; \
    /al _AfoundAction {follow $leguai;kill $leguai;cast juanbi on $leguai}; \
    /al {search} { \
            /if {$cnt<$len && $getit=0 && $_Bbreak=0} \
                {getp $cnt;/if {[$dothis!=_Fnext]} {/if {[$dothis=_Fwait]} {/sleep 2;_AtrigStep} else {/var2al {_Adothis} $dothis;_Adothis;_AtrigStep};/math cnt $cnt+1}} \
            else { \
                /if {$cnt=$len} {/sleep 2;2f;/unac {*�й�*};/tickon;/ticksize 450;lianon 110 120}}}; \
    search_init path_dx1;search $leguai; \
    t+ autoDx1;t+ dataGet;/va getit 0;t+ autoFind;eson;hp \
}

/al ddx1of {t- autoDx1}

class autoDx1 { \
    tri {ˮ�ξ��ٲ�����������ĳ��Ǹ߸߾���} {/sleep 0.5;cast juanbi on $leguai} {autoDx1}; \
    tri {( ����һ��������û����ɣ����������ġ�)} {/sleep 0.5;cast juanbi on $leguai} {autoDx1}; \
    tri {�����ڲ�����ħ����} {/sleep 0.5;cast juanbi on $leguai} {autoDx1}; \
    tri {ˮ�ξ�����һ�����ȣ����ڵ���һ��Ҳ�����ˡ�} {b- isf;kill $leguai} {autoDx1}; \
    tri {ˮ�ξ����ˡ�} {t+ autoRecover;t- autoDx1;/al _AafterRecover {t+ autoDx1;/math getit 0;_Akcontinue};_AsetRecover} {autoDx1} \
} {/nop}


/al {path_dx2} {fly xiaoxitian;s;{sw;s};{n;ne;e;e};{w;n};{s;s}}
/al {_Asteptri} {fight xiao tong}
/al {ddx2} { \
    enchant 50;/va ldguai {xiao tong}; \
    /va ycnt 1;/va cnt 0; \
    /al tick {w;ddx2};/tickof; \
    /al _AfoundAction {/nop}; \
    /al {_Astep} { \
            /if {$cnt<$len} \
                {/va ycnt 1;getp $cnt;/if {[$dothis=_Fwait]} {/sleep 2} else {/var2al {_Adothis} $dothis;_Adothis;_Asteptri};/math cnt $cnt+1} \
            else {/sleep 2;_Axx2jsc}}; \
    /al {_Anextpl} { \
	    /if {$cnt<$len} \
		{/va ycnt 1;/math fcnt $cnt;/loop {0,$fcnt} {getp %0;/var2al {_Adothis} $dothis;_Adothis};_Asteptri} \
	    else {/sleep 2;/va cnt 0;f2;/al tick {w;ddx2};/tickon;/ticksize 450}}; \
    search_init path_dx2; \
    t+ autoDx2;t+ dataGet;eson;hp;_Astep \
}

/nop tri {������Сͯ��������������} {_Adxkill} {autoDx2}; \

/al ddx2of {t- autoDx2;/al {_AafterRecover} {/nop}}
/al _Axx2jsc {s;w;w;n;w;w;n;ne;w;w;n;2f;t- autoDx2;t+ autoRecover;/al _AafterRecover {t+ autoDx2;_Anextpl};_AsetRecover}
/al _Adxkill {b+ isf;kill $ldguai $ycnt;;cast juanbi on $ldguai $ycnt}

class autoDx2 { \
    tri {%0��˵�������ж�Ϊʤ���ⲻ������̫����} {/math ycnt $ycnt+1;_Adxkill} {autoDx2}; \
    tri {Сͯ˵������Ȼ����ͽ̣�����ֻ�÷��㡣} {_Adxkill} {autoDx2}; \
    tri {���빥��˭��}  {_Astep} {autoDx2}; \
    tri {����û������ˡ�} {_Astep} {autoDx2}; \
    tri {�����%0�ȵ�����С���˵������ղ������������һ��} {/va dguai %0} {autoDx2}; \
    tri {$dguai�ٲ�����������ĳ��Ǹ߸߾���} {/if {$isf} {/sleep 0.5;cast juanbi on $ldguai $ycnt}} {autoDx2}; \
    tri {( ����һ��������û����ɣ����������ġ�)} {/if {$isf} {/sleep 0.5;cast juanbi on $ldguai $ycnt}} {autoDx2}; \
    tri {�����ڲ�����ħ����} {/if {$isf} {/sleep 0.5;cast juanbi on $ldguai $ycnt}} {autoDx2}; \
    tri {$dguai����һ�����ȣ����ڵ���һ��Ҳ�����ˡ�} {b- isf;kill $ldguai $ycnt} {autoDx2}; \
    tri {$dguai���ˡ�} {b- isf;_Axx2jsc} {autoDx2} {3}; \
    tri {%0�����ˡ�} {/math ycnt $ycnt-1;/if {$ycnt<0} {/math ycnt 0}} {autoDx2}; \
} {/nop}


class taskNewBie { \
    tri {����û������ˡ�} {_Aprd2kz} {taskNewBie}; \
    tri {%0(%1)�����㣺9527 û���ҵ�%2��} {/if {[%%2=$cguai]} {/math failcnt $failcnt+1;/math tmptick 60+$failcnt*10;/ticksize $tmptick}} {taskNewBie}; \
    tri {Ԭ���˵�������²�������ȥ�շ�%0��} {_AyuanAction} {taskNewBie}; \
    tri {Ԭ���������ľ���������£�˵����лС%0,��ħ�Ѿ������ˡ�} {_Aprd2kz} {taskNewBie} \
} {/nop}


/al _Awld {wield gun;/sleep 1;jiali $_maxNl;enchant $_maxFl}
/al _Aunwld {unwield gun;jiali 0}
/al _A2lusheng {fly changan;6s;3w}
/al _Atickidle {/ticksize 300;/al tick uptime}
/al _Aticklusheng {/ticksize 15;/al tick {kill lu sheng}}

class taskHelper { \
    tri {Ԭ�سϸ���һ�����������顽��} {set no_accept;tear book;s;3e;s;e} {taskHelper}; \
    tri {���%0�����ѳ�һֻ������} {_Aunwld} {taskHelper}; \
    tri {%0(%6)�����㣺9527 [%1]%2[%3]-[%4]��%5} {/if {$working=0} {/va newbie %%6;/va tguai %%1;/va cguai %%2;/va eguai %%3;/va leguai %%4;/va place %%5;/ticksize 300;/al tick _Abackhell;$place}} {taskHelper} {3}; \
    tri {��ǰ�������ֵ�ס�����ȥ·��} {_Abreak;_Awld;kill li shi} {taskHelper}; \
    tri {���ܹ�������ס�㣺����������Ժ���߸�ʲôѽ��} {_Abreak;_Awld;kill bear} {taskHelper}; \
    tri {����������˼䲢��Ϸˣ֮��������ɧ�����ɼ�����} {_Abreak;_Awld;kill wu gang} {taskHelper}; \
    tri {��������˵������ʦ���ޣ��ټ����ˣ���������ذɣ�} {_Abreak;_Abackhell;tell $newbie 9527 û���ҵ�$cguai��} {taskHelper}; \
    tri {���(donate)һ�����ӵ����������ӭ��裺��} {_Abackstep;donate 1 silver} {taskHelper}; \
    tri {���˯��һ��, �Ȼ��ɡ�} {_Abreak;/sleep 2;_Ascontinue} {taskHelper}; \
    tri {��������һ�꣬��ʼ˯����} {_Abreak} {taskHelper}; \
    tri {��һ��������ֻ���������档�ûһ���ˡ�} {w;w;_A2lusheng;_Awld;kill lu sheng;_Aticklusheng} {taskHelper}; \
    tri {¬�����ˡ�} {get zhen from corpse;_Aunwld;fly changan;s;e;_Atickidle;/math working 0} {taskHelper}; \
    tri {������������} {_Ascontinue} {taskHelper}; \
    tri {%0��ʿ���ˡ�} {_Ascontinue} {taskHelper}; \
    tri {���ﲻ׼�����ġ�} {_Abackgo} {taskHelper}; \
    tri {����ֱҡͷ�����ϲ�����ӣ������������䰡��} {_Awld;kill $leguai} {taskHelper}; \
    tri {������ˡ�} {_Ascontinue} {taskHelper}; \
    tri {���ˡ���һ������ӻ��ص����������С�����} {jiali 70;break;er} {taskHelper}; \
    tri {ֻ�������˷������ǣ��ǡ�������������} {/sleep 0.2;break;er} {taskHelper}; \
    tri {�����˵ķ�϶�㹻һ�������ȥ�ˡ�} {ca3} {taskHelper}; \
    tri {�����Ѿ����ˣ���Ѿ��ˡ�} {ca3} {taskHelper}; \
    tri {����Ҫ�뿪����Ȼ����ʲô��������ǰһ�Σ����ɵ�ͣ��������} {_Abackstep} {taskHelper}; \
    tri {${_HIB}��˫��һ�꣬��ʱȼ��һ����ɫ�Ļ��棬����׹�Ʈ����$cguai��} {_Afire} {taskHelper}; \
    tri {( ����һ��������û����ɣ����������ġ�)} {_Afire} {taskHelper}; \
    tri {�����ڲ�����ħ����} {_Afire} {taskHelper}; \
    tri {��κ��󲻴��顣} {_Afire} {taskHelper}; \
    tri {$cguai�ҽ�һ�������ˡ�} {b- _Bfiring;/sleep 8;/math finish 1;_Abackhell} {taskHelper}; \
    tri {$cguai��%0��Ķ����ˡ�} {b- _Bfiring;t+ autoFind;/sleep 8;_Abackhell} {taskHelper}; \
    tri {$cguai��%0�뿪��} {b- _Bfiring;t+ autoFind;/sleep 8;_Abackhell} {taskHelper}; \
    tri {��Ķ�����û����ɣ������ƶ���} {/if {$_Bctguai} {/sleep 1;go $dgguai}} {taskHelper}; \
    tri {��Ȼһ��������ס���㡣} {open guancai;w;8n;e;/al tick uptime;/math working 0} {taskHelper} \
} {/nop}


class autoFind { \
    tri {��Ҫ��ʲô��} {/if {$getit=0} {/sleep 0.5;search $leguai}} {autoFind}; \
    tri {%0%1$cguai($eguai)} {/if {$getit=0} {/var getit 1;b- _Bctguai;_AfoundAction;/purge}} {autoFind} {4} \
} {/nop}



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

class autoEscape { \
    tri {��$_RED�Ѿ�} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 1;b- bHP}};hp} {autoEscape}; \
    tri {��$_REDҡͷ} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 10;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIR��} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 20;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIR�Ѿ�һ} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 30;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIR�ƺ�} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 40;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIY��} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 60;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIY����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 80;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIY������������} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 90;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIG�ƺ���} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt 95;b- bHP}};hp} {autoEscape}; \
    tri {��$_RED����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -5;b- bHP}};hp} {autoEscape}; \
    tri {��$_RED����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -10;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIR��} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -20;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIR�Ѿ���} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -30;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIR��Ϣ} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -40;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIY����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -60;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIY����} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -80;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIY������������} {b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -90;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIG�ƺ���}	{b+ bHP;/al _AjsAction {/if {$bHP} {Hurt -95;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIY��������Щ�Ժ��ˡ�} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -60;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIY��ȷ} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -60;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIR����} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -40;b- bHP}};hp} {autoEscape}; \
    tri {��$_HIR����} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -20;b- bHP}};hp} {autoEscape}; \
    tri {��$_RED����} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt -10;b- bHP}};hp} {autoEscape}; \
    tri {��$_RED����} {b+ bHP;/al _AjsAction {/if {$bHP} {eHurt 1;b- bHP}};hp} {autoEscape}; \
    tri {$cguai���˹�����} {_Adoesc} \
} {/nop}

/al _AstopAction {/purge;/ignore 1;dazuo 0;mingsi 0}
/al _Aquit {/log log/pker.log;touxiang;quit;/40 {/sleep 0.5;touxiang;quit}}

class autoQuit { \
	tri {%0����һ%1${_RED}˫${_NOR}${_HIB}ɫ${_NOR}${_HIW}����} {drop redblueice} {autoQuit}; \
	tri {^��������������ģ�ʪʪ�ģ�ԭ���Ǳ��黯�ˡ�} {/bell} {autoQuit}; \
	tri {^����˸�������} {/bell} {autoQuit}; \
	tri {^���촽���࣬��ɫʱ��ʱ�࣬����΢΢�������������������} {/bell} {autoQuit}; \
    tri {^�㡰�����������һ�����˸����磬����������ü��} {/bell;/sysecho [$_rclock] ��������̽��$name�����١� >> log/quit.log} {autoQuit}; \
    tri {^�㼱æ��ָ��ȥ���ƺ�%0����̽��������١�} {/bell;/sysecho [$_rclock] %0����̽��$name�����١� >> log/quit.log} {autoQuit}; \
    tri {��%0(%1)���ڴ�����ĵ��С�} {/bell;/sysecho [$_rclock] %%0(%1)���ڴ���$name�ĵ��С� >> log/quit.log} {autoQuit}; \
    tri {${_HIR}�����Ҫ��%0�����ಫ������Ҳ���������һ�� kill ָ�} {l;_AstopAction;_Aquit} {autoQuit}; \
} {/nop}


/nop ==================================================================
/nop use dummy session to auto login
/nop ==================================================================
/nop /var _ses undefined
/nop /var _ticksize 30
/nop /al iam {/se ox #connected_to_ox... 0;/ox /al {quit} {/tickoff};/ox /tickon;/ox /ticksize $_ticksize;/ox /al tick00 %0;/ox /act {^#TICK!!!} {/ses $_ses};/ox /act {#SESSION %0 IS NOT DEFINED} {tick00;/sleep 0.5;/$_ses};/ox /ses $_ses}
/nop /al iamel {/var _ses %1;iam {el %%1;/var val_autologin 1}}
