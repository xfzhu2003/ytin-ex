/nop ����ļ���Ҫ /read ansi.sc
/act {��$_RED����} {Hurt -5} {1}
/act {��$_RED�Ѿ�} {Hurt 1} {1}
/act {��$_RED����} {Hurt -10} {1}
/act {��$_REDҡͷ} {Hurt 10} {1}
/act {��$_HIR��} {Hurt -20} {1}
/act {��$_HIR��} {Hurt 20} {1}
/act {��$_HIR�Ѿ���} {Hurt -30} {1}
/act {��$_HIR�Ѿ�һ} {Hurt 30} {1}
/act {��$_HIR��Ϣ} {Hurt -40} {1}

/act {��$_HIR����} {Hurt 0} {1};/nop 40-60 shen
/act {��$_HIR����} {Hurt 0} {1};/nop 20-40 shen
/act {��$_RED����} {Hurt 0} {1};/nop 10-20 shen
/act {��$_RED����} {Hurt 0} {1};/nop 0-10 shen

/act {��$_HIR�ƺ�} {Hurt 40} {1}
/act {��$_HIY����}{Hurt -60} {1}
/act {��$_HIY��} {Hurt 60} {1}
/act {��$_HIY����}{Hurt -80} {1}
/act {��$_HIY����}{Hurt 80} {1}
/act {��$_HIY������������}{Hurt -90} {1}
/act {��$_HIY������������}{Hurt 90} {1}
/act {��$_HIG�ƺ���}{Hurt -95} {1}
/act {��$_HIG�ƺ���}{Hurt 95} {1}

/act {$_RED���˹��أ��Ѿ���} {eHurt0 -1} {3}
/act {$_RED���˹��أ��Ѿ���} {eHurt0 -5} {3}
/act {$_RED�Ѿ�} {eHurt0 1} {3}
/act {$_RED����} {eHurt0 -10} {3}
/act {$_REDҡͷ} {eHurt0 10} {3}
/act {$_HIR��} {eHurt0 -20} {3}
/act {$_HIR��������} {eHurt0 20} {3}
/act {$_HIR�Ѿ���} {eHurt0 -30} {3}
/act {$_HIR�Ѿ�һ} {eHurt0 30} {3}

/act {$_HIR����} {eHurt0 -40} {3};/nop 40-60 shen
/act {$_HIR����} {eHurt0 -20} {3};/nop 20-40 shen
/act {$_RED����} {eHurt0 -10} {3};/nop 10-20 shen
/act {$_RED����} {eHurt0 1} {3};/nop 0-10 shen

/act {$_HIR��Ϣ} {eHurt0 -40} {3}
/act {$_HIR�ƺ�} {eHurt0 40} {3}
/act {$_HIY����}{eHurt0 -60} {3}
/act {$_HIY��} {eHurt0 60} {3}
/act {$_HIY����}{eHurt0 -80} {3}
/act {$_HIY����}{eHurt0 80} {3}
/act {$_HIY������������}{eHurt0 -90} {3}
/act {$_HIY������������}{eHurt0 90} {3}
/act {$_HIG�ƺ���}{eHurt0 -95} {3}
/act {$_HIG�ƺ���}{eHurt0 95} {3}

/act {$frd$_RED���˹��أ��Ѿ���} {fHurt0 -1} {2}
/act {$frd$_RED���˹��أ��Ѿ���} {fHurt0 -5} {2}
/act {$frd$_RED�Ѿ�} {fHurt0 1} {2}
/act {$frd$_RED����} {fHurt0 -10} {2}
/act {$frd$_REDҡͷ} {fHurt0 10} {2}
/act {$frd$_HIR��} {fHurt0 -20} {2}
/act {$frd$_HIR��������} {fHurt0 20} {2}
/act {$frd$_HIR�Ѿ���} {fHurt0 -30} {2}
/act {$frd$_HIR�Ѿ�һ} {fHurt0 30} {2}

/act {$frd$_HIR����} {fHurt0 -40} {2};/nop 40-60 shen
/act {$frd$_HIR����} {fHurt0 -20} {2};/nop 20-40 shen
/act {$frd$_RED����} {fHurt0 -10} {2};/nop 10-20 shen
/act {$frd$_RED����} {fHurt0 1} {2};/nop 0-10 shen

/act {$frd$_HIR��Ϣ} {fHurt0 -40} {2}
/act {$frd$_HIR�ƺ�} {fHurt0 40} {2}
/act {$frd$_HIY����}{fHurt0 -60} {2}
/act {$frd$_HIY��} {fHurt0 60} {2}
/act {$frd$_HIY����}{fHurt0 -80} {2}
/act {$frd$_HIY����}{fHurt0 80} {2}
/act {$frd$_HIY������������}{fHurt0 -90} {2}
/act {$frd$_HIY������������}{fHurt0 90} {2}
/act {$frd$_HIG�ƺ���}{fHurt0 -95} {2}
/act {$frd$_HIG�ƺ���}{fHurt0 95} {2}

/al Hurt {/var Hurt %0;/if {($Hurt<1 && $Hurt>-40) || ($Hurt>0 && $Hurt<40)}{/if {$yaren=0}{/pauseoff;/purge;quit;/if {$guest=0}{/ox quit;/sys echo $_clock $name Hurt$Hurt >> log/quit.log}}};/if {$Hurt<-39 && $Hurt>-90}{ht2nd};/if {$Hurt>39 && $Hurt<60}{esc2nd};/if {$Hurt>59 && $Hurt<80}{esc3rd}}
/al esc2nd /nop
/al ht2nd /nop
/al ht15 /nop
/al esc3rd /nop

/al eHurt /nop
/al fHurt /nop
/al eHurt0 {/if {$rescue=3 && ((%%0<1 && %%0>40) || (%%0>0 && %%0<11))}{Rescue};eHurt %0}
/al fHurt0 {/if {%%0<0}{/math fHurt0 0-%%0} else {/math fHurt0 %%0};/if {$fHurt0=90}{showg (fHurt0=90-100)};/if {$fHurt0=80}{showg (fHurt0=80-90)};/if {$fHurt0=60}{showg (fHurt0=60-80)};/if {$fHurt0=40}{showg (fHurt0=40-60)};/if {$fHurt0=30}{showg (fHurt0=30-40)};/if {$fHurt0=20}{showg (fHurt0=20-30)};/if {$fHurt0=10}{showg (fHurt0=10-20)};/if {$fHurt0=5}{showg (fHurt0=5-10)};/if {%%0=1}{showg (fHurt0=0-10)};/if {%%0=-1}{showg (fHurt0=0-5)};/if {$rescue=3 && ((%%0<1 && %%0>40) || (%%0>0 && %%0<11))}{Rescue};fHurt %0}
/var rescue 0
/act {����һ��} {/if {$rescue=1} {Rescue2;/var rescue 0};/if {$rescue=2}{Rescue2};/if {$rescue=3}{Rescue} } {6}
/act {$frd����һ��} {svFrd};/al svFrd /nop
/al res1 {/alias Rescue2 %0;/var rescue 1;/nop action on faint only--once}
/al res2 {/alias Rescue2 %0;/var rescue 2;/nop action on faint only--always}
/al res3 {/alias Rescue %0;/var rescue 3;/nop action on both deep-red and faint}
