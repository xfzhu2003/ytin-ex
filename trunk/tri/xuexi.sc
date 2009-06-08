
/nop /va {skillArray} {parry;stick;dodge;tonsillit;sword;unarmed;dodge}
/va {skillArray} {dodge;force;dragonforce;fork;fengbo-cha;parry}
/va {adSkillArray} {dragonstep;dragonfight;fengbo-cha}

/nop xuexi
/al _Asubskill { \
	/gag {你按著}; \
	/gag {${_HIY}你的%0进步了！}; \
    /gag {你现在气力充沛，不需吸气。}; \
    /gag {你现在精神饱满，不需吸气。}; \
    /gag {你深深吸了几口气，脸色看起来好多了。}; \
    /gag {你略一凝神，吸了口气，精神看起来清醒多了。}; \
    /gag {%0 (%1)%2- %3 %4/%5};/antisub {%0 ($_skill)%2- %3 %4/%5};/antisub {%0 ($_adskill)%2- %3 %4/%5}}

/al _Aunsubskill { \
	/ungag {你按著}; \
	/ungag {${_HIY}你的%0进步了！}; \
    /ungag {你现在气力充沛，不需吸气。}; \
    /ungag {你现在精神饱满，不需吸气。}; \
    /ungag {你深深吸了几口气，脸色看起来好多了。}; \
    /ungag {你略一凝神，吸了口气，精神看起来清醒多了。}; \
    /ungag {%0 (%1)%2- %3 %4/%5};/unantisub {%0 ($_skill)%2- %3 %4/%5};/unantisub {%0 ($_adskill)%2- %3 %4/%5}}

/al _Axuexi {learn $_skill from $_teacher}
/al {_AgetSkill} {/geti {_skill} {%%0} $skillArray}
/al {_Alevelchk} { \
        /if {$skillIdx<$arrayLen} { \
			/if {$curLevel>=$maxLevel} \
				{/math skillIdx $skillIdx+1;_AgetSkill $skillIdx;dazuo $dzQx} \
			else \
				{/if {$dotLevel>$maxdot} {/ifaexist {_A${_skill}Up} {_A${_skill}Up} else {dazuo $dzQx}} \
				else {dazuo $dzQx}} \
			} \
		}


/al {le2on} { \
    t+ autoLearn2;t+ dataGet;t+ autoQuit; \
    /math maxLevel %1; \
    /va preNl 0;/math dzQx %2; \
    /va _teacher {wuya}; \
    /al _A2teacher {se}; \
    /al _A2dz {answer 1;nw}; \
    /al _Axuexi {/10 {learn $_skill from $_teacher for 10;ef}}; \
    /getl arrayLen $skillArray; \
    /va skillIdx 0; \
    _AgetSkill $skillIdx; \
    _Asubskill; \
    /al _AqxAction {/if {$_Bchk} {/if {($preNl!=0)&&((($preNl<$_Nl)&&($_nl<$_Nl))||(($preNl>$_Nl)&&($_nl>$_Nl)))} {/math delt $_nl-$preNl;/if {$delt>20} {/math dzQx $dzQx-20} else {/math dzQx $dzQx+20}};/math preNl $_nl;_A2teacher;_Axuexi;_A2dz;b+ _Bchkskill;skills;b- _Bchk}}; \
    hp;b+ _Bchkskill;skills;}

/al {le2of} {dazuo 0;t- autoLearn2;t- dataGet;t- autoQuit;/al _AqxAction {/nop};_Aunsubskill}
/action {^你行功完毕，吸一口气，缓缓站了起来。} {/sleep 2;er;ef;b+ _Bchk;hp} {autoLearn2}
/action {%0 ($_skill)%2- %3 %4/%5} {/if {$_Bchkskill} {/math curLevel %4;/math dotLevel %5;/math maxdot {($curLevel+1)*($curLevel+1)};_Alevelchk;b- _Bchkskill}} {autoLearn2}

/al _AstickUp
/al _AtonsillitUp {t- autoLearn2;t+ skillUp;7s;3e;3s;se;out;open guancai;fly sky;open door;/sleep 2;20n;/ticksize 10;/al tick {kill dadi;exert sheqi dadi}}
/al _AtonsillitOk {t- skillUp;t+ autoLearn2;/ticksize 300;/al tick {uptime};/sleep 10;s;cast miwu;/3 north;7n;dazuo 20}
/al _AstickUp {t- autoLearn2;t+ skillUp;7s;3e;3s;se;out;open guancai;fly xiaoxitian;/sleep 2;nw;nw;n;w;sw;w;sw;se;s;sw;w;w;nw;nw;sw;w;wu;nw;nw;/5 se;e;enter danlu;enable stick none;unwield blade;wield bang;jiali 0;kill dao shi}
/al _AstickOk {enable stick qianjun-bang;t- skillUp;t+ autoLearn2;/ticksize 300;/al tick {uptime};s;cast miwu;/3 north;7n;dazuo 20}
/al _AparryUp {t- autoLearn2;t+ skillUp;7s;3e;3s;se;out;open guancai;fly xiaoxitian;/sleep 2;nw;nw;n;w;sw;w;sw;se;s;sw;w;w;nw;nw;sw;w;wu;nw;nw;/5 se;e;enter danlu;enable parry none;unwield blade;wield bang;jiali 0;kill dao shi}
/al _AparryOk {enable parry qianjun-bang;t- skillUp;t+ autoLearn2;/ticksize 300;/al tick {uptime};s;cast miwu;/3 north;7n;dazuo 20}
/al _AdodgeUp {t- autoLearn2;t+ skillUp;7s;3e;3s;se;out;open guancai;fly xiaoxitian;/sleep 2;nw;nw;n;w;sw;w;sw;se;s;sw;w;w;nw;nw;sw;w;wu;nw;nw;/5 se;e;enter danlu;enable dodge none;unwield blade;wield bang;jiali 0;kill dao shi}
/al _AdodgeOk {enable dodge moondance;t- skillUp;t+ autoLearn2;/ticksize 300;/al tick {uptime};s;cast miwu;/3 north;7n;dazuo 20}
/action {^你的「%0」进步了！} {_A${_skill}Ok} {skillUp}

/nop lianxi

/al {_AgetAdskill} {/geti {_adskill} {%%0} $adSkillArray}
/al {_Aadlevelchk} { \
		/if {($skillIdx<$arrayLen)&&($curLevel>=$maxLevel)} \
			{/math skillIdx $skillIdx+1;_AgetSkill $skillIdx;_AgetAdskill $skillIdx;/if {[$_skill=stick]} {remove all;unwield sword;unwield whip;wield stick;wield gun;wear all} else {/if {[$_skill=sword]} {remove all;unwield stick;unwield gun;unwield whip;wield sword;wear all} else {/if {[$_skill=fork} {remove all;unwield stick;unwield gun;unwield whip;unwield sword;wield fork;wear all}}}}}

/al {lianon} { \
    t+ autoLian;t+ dataGet;t+ kuguDong;t+ autoQuit; \
    /al _AoutDongAct {dazuo 20}; \
    /math maxLevel %1; \
    /va preNl 0;/math dzQx %2; \
    /al _Alianxi {/6 {lian $_skill;er;ef}}; \
    /getl arrayLen $skillArray; \
    /va skillIdx 0; \
    _AgetSkill $skillIdx; \
    _AgetAdskill $skillIdx; \
    /al _AqxAction {/if {$_Bchk} {/if {($preNl!=0)&&((($preNl<$_Nl)&&($_nl<$_Nl))||(($preNl>$_Nl)&&($_nl>$_Nl)))} {/math delt $_nl-$preNl;/if {$delt>20} {/math dzQx $dzQx-20} else {/math dzQx $dzQx+20}};/math preNl $_nl;_Alianxi;skills;dazuo $dzQx;b- _Bchk}}; \
    _Asubskill; \
    hp;skills;dazuo 20}

/al {lianof} {dazuo 0;t- autoLian;t- dataGet;t- kuguDong;t- autoQuit;/al _AqxAction {/nop};_Aunsubskill}

/action {^你行功完毕，吸一口气，缓缓站了起来。} {/sleep 2;er;ef;b+ _Bchk;hp} {autoLian}
/action {%0 ($_adskill)%2- %3 %4/%5} {/math curLevel %4;/math dotLevel %5;_Aadlevelchk} {autoLian}


/nop    path moon-wuya-kz
/nop /al _A2teacher {out;e;s;sd;ed;ed;nd;nd;ed;e;n;n}
/nop /al _A2sleeprm {s;s;w;wu;su;su;wu;wu;nu;n;w;bed}
/nop /al {_Akz2bed} {w;d;w;n;7w;nw;ne;nw;nw;nw;w;wu;su;su;wu;wu;nu;n;w;bed}
/nop /al {_Abed2kz} {out;e;s;sd;ed;ed;nd;nd;ed;e;se;se;se;sw;se;7e;s;e;u;e}

/nop /al _kzA2teacher {w;n;7w;nw;ne;nw;nw;nw;n;n}
/nop /al _A2teacher {out;d;e;3s;6e;13n;/sleep 2;7w;nw;ne;nw;nw;nw;n;n}
/nop /al _A2sleeprm {s;s;se;se;se;sw;se;7e;/sleep 2;13s;6w;3n;w;up;bed}
/nop /al {_Akz2bed} {w;12s;6w;3n;w;up;bed}
/nop /al {_Abed2kz} {out;d;e;3s;6e;12n;e}

/nop    path sea-longnu-kz
/nop    /al _A2teacher {s;e}
/nop    /al _A2sleeprm {w;n}
/nop    /al {_Akz2bed} {s;w;15s;3e;dive;/sleep 5;e;e;ne;e;e;se;se;n}
/nop    /al {_Abed2kz} {s;nw;nw;w;w;sw;w;w;u;3w;15n;e;n}

/nop    path sea-longnu-kz
/al _A2teacher {w;sw}
/al _A2sleeprm {ne;e}
/al {_Akz2bed} {s;w;15s;3e;dive;/sleep 5;e;e;ne;e;e;eu;e;n;n;ne;e}
/al {_Abed2kz} {w;sw;s;s;w;wd;w;w;sw;w;w;u;3w;15n;e;n}

/al {le1on} { \
    t+ autoLearn1; \
    /math maxLevel %0; \
    /va _teacher {bian}; \
    /getl arrayLen $skillArray; \
    /va skillIdx 0; \
    _AgetSkill $skillIdx; \
    _Asubskill; \
    _kzA2teacher;learn $_skill from $_teacher}
/al {le1of} {t- autoLearn1;_Aunsubskill}

/action {你一觉醒来，只觉精力充沛。该活动一下了。} {/sleep 2;_A2teacher;_Axuexi} {autoLearn1}
/action {%0和你切磋了一会儿%1，你似乎有所领悟。} {_Axuexi} {autoLearn1}
/action {你听了%0的指导，似乎有些心得。} {_Axuexi} {autoLearn1}
/action {你今天太累了，结果什么也没有学到。} {/sleep 2;_A2sleeprm;skills;sleep} {autoLearn1}
/action {你刚睡过一觉, 先活动活动吧。} {/sleep 2;_Abed2kz;/sleep 72;_Akz2bed;sleep} {autoLearn1}
/action {荡悠悠三更梦 -} {u;5n;u;ask girl about back;/sleep 2;_A2teacher;_Axuexi} {autoLearn1}
/action {%0 ($_skill)%2- %3 %4/%5} {/math curLevel %4;/math dotLevel %5;/math maxdot {($curLevel+1)*($curLevel+1)};_Alevelchk} {autoLearn1}


/action {慢慢地你终于又有了知觉} {s;3w;7s;jump bridge;north;north;north;e;n;bai yin;s;w;n;n;ask wang about leave;hp;true} {panShi}
