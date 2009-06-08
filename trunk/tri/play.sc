
/action {%0(%1)告诉你：%2} {/stripansi teller %0;/sysecho [$_rclock] $teller(%1)告诉你：%2 >> log/tell.log} {tLog}
/action {%0回答你：%1} {/stripansi teller %0;/sysecho [$_rclock] $teller回答你：%1 >> log/tell.log} {tLog}
/action {%0在你的耳边悄声说道：%2} {/stripansi teller %0;/sysecho [$_rclock] $teller在你的耳边悄声说道：%2 >> log/tell.log} {tLog}


/al ssx {get %0 thousand-cash from kuang;gutou sx %0 thousand-cash}
/al sqx {get %0 thousand-cash from kuang;gutou qx %0 thousand-cash}
/al ssd {get %0 thousand-cash from kuang;gutou sd %0 thousand-cash}
/al stc {get %0 thousand-cash from kuang;gutou tc %0 thousand-cash}

/al sg {w;d;e;n;n;w;s;withdraw 1000 gold;/sleep 2;convert 1000 gold to cash;put cash in kuang;/sleep 2;n;e;s;s;w;u;e}

/al _AdumpP {/sh ${_HIW}}
/al _Adump {/sh ${_HIW}}
/va typeArray {kp;sx;qx;sd;tc}
/va phaseCnt 50;/va repCnt 15;/va sxLine 6;/va sxGtine 9;
/va p_cnt 0;/va t_cnt 0;/va sx_ncnt 0;
/nop *_tcnt - total count
/nop *_pcnt - total count in one phase
/nop *_dcnt - repeat count between prev to current
/nop sx_ncnt - sx number after bigline

/al _Arecord1 {/sysecho ${tmp}:${${tmp}_pcnt}>>log/gt_phase.txt}
/al _Arecord1_end {/sysecho --${_rclock}-->>log/gt_phase.txt;/sysecho --${_rclock}-->>log/gt_sx_d.txt}
/al _Arecord2 {/if {[$type=sx]} {_Acal3;/if {$sx_dcnt>=$sxLine} {/if {$sx_dcnt>$sxGtine} {/math sx_ncnt 1};/sysecho b($sx_dcnt)>>log/gt_sx_d.txt} else {/if {$sx_ncnt>0} {/math sx_ncnt $sx_ncnt-1};/sysecho a($sx_dcnt)>>log/gt_sx_d.txt}}}

/al _Acal1 {/if {$p_cnt>=$phaseCnt} {/loop {0,4} {/geti tmp {%%0} $typeArray;_Arecord1;/math ${tmp}_pcnt 0};/math p_cnt 0;_Arecord1_end};/math ${type}_tcnt ${${type}_tcnt}+1;/math ${type}_pcnt ${${type}_pcnt}+1;/math t_cnt $t_cnt+1;/math p_cnt $p_cnt+1}

/al _Acal3 {/if {${${type}_dcnt}<${${type}Line}} {/math ${type}_ddcnt ${${type}_ddcnt}+1} else {/loop {0,$repCnt} {/va num %0;/if {${${type}_ddcnt}=$num} {/math ${type}_0${num} ${${type}_0${num}}+1}};/math ${type}_ddcnt 0}}

/al _Acal2 {/loop {0,$repCnt} {/va num %0;/if {${${type}_dcnt}=$num} {/math ${type}_${num} ${${type}_${num}}+1}};_Arecord2;/loop {0,4} {/geti tmp {%%0} $typeArray;/if {[$tmp!=$type]} {/math ${tmp}_dcnt ${${tmp}_dcnt}+1;/if {${${tmp}_dcnt}>${${tmp}_dmax}} {/math ${tmp}_dmax ${${tmp}_dcnt}}}};/math ${type}_dcnt 0}

/al _Adump1 {_AdumpP 盘数统计:总[$t_cnt] 空盘[$kp_pcnt/$kp_tcnt],散星[$sx_pcnt/$sx_tcnt],七星[$qx_pcnt/$qx_tcnt],双对[$sd_pcnt/$sd_tcnt],头彩[$tc_pcnt/$tc_tcnt]}
/al _Adump2 {_AdumpP 间隔统计:空盘[$kp_dcnt/$kp_dmax],散星[$sx_dcnt/$sx_dmax],七星[$qx_dcnt/$qx_dmax],双对[$sd_dcnt/$sd_dmax],头彩[$tc_dcnt/$tc_dmax]}
/al _Adump3 {_Adump 碎盘统计:散星[$sx_tcnt],0[$sx_0],1[$sx_1],2[$sx_2],3[$sx_3],4[$sx_4],5[$sx_5],6[$sx_6],7[$sx_7],8[$sx_8],9[$sx_9]}
/al _Adump4 {_Adump 双倍碎盘统计:散星 0[$sx_00],1[$sx_01],2[$sx_02],3[$sx_03],4[$sx_04],5[$sx_05],6[$sx_06],7[$sx_07],8[$sx_08],9[$sx_09]}
/al _Adump5 {_Adump sx_ncnt = $sx_ncnt}

/al don {t+ duQian; \
    /loop {0,$repCnt} {/va num %0;/va sx_$num 0;/va qx_$num 0;/va sd_$num 0;/va tc_$num 0;/va kp_$num 0;/va sx_0$num 0;/va qx_0$num 0;/va sd_0$num 0;/va tc_0$num 0;/va kp_0$num 0}; \
    /loop {0,4} {/geti tmp {%%0} $typeArray;/va ${tmp}_tcnt 0;/va ${tmp}_pcnt 0;/va ${tmp}_dcnt 0;/va ${tmp}_dmax 0;/va ${tmp}_ddcnt 0}; \
    /sysecho ==${_rclock}==>>log/gt_sx_d.txt; \
    /sysecho ==${_rclock}==>>log/gt_phase.txt; \
    /skiptosay}
/al dof {t- duQian;/unskiptosay}


/nop 8 10 12 16 32...
/al _Aduqian {/math sx_gt $sx_cnt//6;/if {$sx_gt<6} {/math dp $sx_gt+1;/if {$dp<4} {/math gcnt 8+($dp-1)*2} else {/$dp {/math gcnt $gcnt*2}};gutou sx $gcnt gold;/math gcnt 1}}
/nop 10 10 12 20 32... 
/al _Aduqian1 {/math sx_gt $sx_cnt//6;/if {$sx_gt<4} {/geti {gcnt} {$sx_gt} {$gcntArray}} else {/math dp $sx_gt+1;/$dp {/math gcnt $gcnt*2}};/if {$btm>0} {gutou sx $gcnt gold};/math gcnt 1}
/nop /va gcntArray {14;14;24;40;60;80}
/va gcntArray {40;40;60;100;180;260}
/al _Aduqian2 {/math sx_gt $sx_dcnt//6;/geti {gcnt} {$sx_gt} {$gcntArray};/if {$sx_ncnt=1} {gutou sx $gcnt gold};/math gcnt 1}
/al _Aduqian0 {'}

/action {^你赢了%0张一千两银票！} {put cash in kuang} {duQian}
/action {^你身上的钱不够押。} {_Adump 投资失败！破产了！！} {duQian}
/action {^庄东叫道：%0……%1！} {/va res %1;/if {[$res=散星]} {/va type sx};/if {[$res=七星]} {/va type qx};/if {[$res=头彩]} {/va type tc};/if {[$res=双对]} {/va type sd};/if {[$res=空盘]} {/va type kp};_Acal1;_Acal2} {duQian}
/action {^%0两黄金(Gold)} {/if {$chkgold} {b- chkgold;/stripansi gold_cn %0;/ctoi gold_en $gold_cn;_Aduqian0}} {duQian}
/action {^接着庄东麻利地顺手将玉骰从盘中收回：现在开盘押钱！} {_Adump1;_Adump2;_Adump3;_Adump4;_Adump5;b+ chkgold;i} {duQian}

/nop 15/36 - kp - 1,1 1,3 1,5 2,4 2,6 3,1 3,3 3,5 4,2 4,6 5,1 5,3 5,5 6,2 6,4
/nop 03/36 - sd - 2,2 4,4 6,6
/nop 06/36 - qx - 1,6 2,5 3,4 4,3 5,2 6,1
/nop 01/36 - tc - x,x
/nop 12/36 - sx - 1,2 1,4 2,1 2,3 3,2 3,6 4,1 4,5 5,4 5,6 6,3 6,5

/al wkon {/al _AqxAction {/if {$_Bchk} {/sh $_nl,$_Nl;/if {$_nl<$_Nl} {/math dzQx $_qx-20;dazuo $dzQx} else {work};/math cnt $cnt+1;/if {$cnt>300} {s;e;n;e;buy jiudai from er;fill jiudai;drink jiudai;drop jiudai;w;s;w;n;/math cnt 0}}};t+ dataGet;t+ kangDM;/gag 希望;/gag 壮汉;/gag 倾国倾城;/gag 赌神}
/al woof {/al _AqxAction {/nop};t- dataGet;t- kangDM}

/action {^旁边过来个工头笑眯眯地对你说} {er;ef;/sleep 2;b+ _Bchk;hp} {kangDM}
/action {^你行功完毕} {/sleep 2;er;ef;b+ _Bchk;hp} {kangDM}
