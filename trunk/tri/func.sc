/nop ***********************************************************************
/nop since we do not have local variables for function, I suggest variables
/nop that means to be local to be ended with _
/nop ***********************************************************************
/func strstr {/strstr {%%1} {%%2};/res $_}
/func strlen {/strlen {%%1};/res $_}
/func substr {/math v2_ %2;/math v3_ %3;/substr {%%1} $v2_ $v3_;/res $_}
/func ord {/ord _ {%%0};/res $_}
/func isdigit {/if {@ord{%%%0}>=@ord{0} && @ord{%%%0}<=@ord{9}}{/res 1} else {/res 0}}
/func fopen {/fopen {%%1} {%%2};/res $_}
/func fgets {/fgets {%%1} {2048} {%%2};/res $_}
/al chomp {/var t_ {$%%1};/math l_ @strlen{$t_}-1;/if {$l_>=0}{/var v_ @ord{@substr{$t_ $l_ 1}};/if {$v_=13 || $v_=10}{/var %%%1 @substr{$t_ 0 $l_}}} }
/func getl {/getl {_} {%%0};/res $_}
/func {rnd} {/math _temp ($_random//(%2-%1+1))+%1;/result ($_temp);/unvar _temp}
/func {arrayIdx} {/va _idxval %1;/va _array %2;/getl _arlen $_array;/math _arlen $_arlen-1;/loop {0,$_arlen} {/geti _tmpval %0 $_array;/if {[$_idxval=$_tmpval]} {/va _temp %%0}};/result ($_temp);/unvar _idxval;/unvar _array;/unvar _arlen;/unvar _tmpval;/unvar _temp}
