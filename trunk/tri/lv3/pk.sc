
/al _AstopAction {/purge;/ignore 1;dazuo 0;mingsi 0}
/al _Aquit {/log log/pker.log;touxiang;quit;/40 {/sleep 0.5;touxiang;quit}}

/action {%0����һ%1${_RED}˫${_NOR}${_HIB}ɫ${_NOR}${_HIW}����} {drop redblueice} {autoQuit}
/action {^��������������ģ�ʪʪ�ģ�ԭ���Ǳ��黯�ˡ�} {/bell} {autoQuit}
/action {^����˸�������} {/bell} {autoQuit}
/action {^���촽���࣬��ɫʱ��ʱ�࣬����΢΢�������������������} {/bell} {autoQuit}
/action {^�㡰�����������һ�����˸����磬����������ü��} {/bell;/sysecho [$_rclock] ��������̽��$name�����١� >> log/quit.log} {autoQuit}
/action {^�㼱æ��ָ��ȥ���ƺ�%0����̽��������١�} {/bell;/sysecho [$_rclock] %0����̽��$name�����١� >> log/quit.log} {autoQuit}
/action {��%0(%1)���ڴ�����ĵ��С�} {/bell;/sysecho [$_rclock] %%0(%1)���ڴ���$name�ĵ��С� >> log/quit.log} {autoQuit}
/action {${_HIR}�����Ҫ��%0�����ಫ������Ҳ���������һ�� kill ָ�} {l;_AstopAction;_Aquit} {autoQuit}
