
/al _AstopAction {/purge;/ignore 1;dazuo 0;mingsi 0}
/al _Aquit {/log log/pker.log;touxiang;quit;/40 {/sleep 0.5;touxiang;quit}}

/action {%0给你一%1${_RED}双${_NOR}${_HIB}色${_NOR}${_HIW}冰。} {drop redblueice} {autoQuit}
/action {^你觉得身上凉凉的，湿湿的，原来是冰块化了。} {/bell} {autoQuit}
/action {^你打了个寒颤。} {/bell} {autoQuit}
/action {^你嘴唇发青，脸色时红时青，身子微微发抖，好像冷得厉害。} {/bell} {autoQuit}
/action {^你“啊～～秋～～”一声打了个喷嚏，不由皱了皱眉。} {/bell;/sysecho [$_rclock] 有人正在探听$name的行踪。 >> log/quit.log} {autoQuit}
/action {^你急忙掐指算去，似乎%0正在探听你的行踪。} {/bell;/sysecho [$_rclock] %0正在探听$name的行踪。 >> log/quit.log} {autoQuit}
/action {是%0(%1)正在打听你的道行。} {/bell;/sysecho [$_rclock] %%0(%1)正在打听$name的道行。 >> log/quit.log} {autoQuit}
/action {${_HIR}如果你要和%0性命相搏，请你也对这个人下一次 kill 指令。} {l;_AstopAction;_Aquit} {autoQuit}
