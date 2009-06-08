#/usr/bin/perl;
$poem="poem.300";
$question="poem.q";
$cmdfile="poem.cmd";
$errfile="poem.err";
$line="";
$temp="";
$l=0;
$l0=0;
$i=0;
$j=0;
$match=1;
$n=0;

$cmdline=0;
$option=0; #default option=0, answer short one only

if($#ARGV<0) {
#	print "Syntax: perl poem.pl Question\n";
#	exit(1);
#       perl does not take chinese cmdline arguments yet? here is the alternative
    #print "argv < 0 \n";
    if(!open(INPUT, "<$question")){
	print "please either put question into $question\n".
	    "or use syntax: perl poem.pl Question\n";
	exit(1);
    }
    while(<INPUT>) {chomp;$lineq=$_}
    #print "lineq = $lineq\n";
    close INPUT;
}
else {
    $cmdline=1;
    $lineq = $ARGV[0];
    $option = $ARGV[1] if($#ARGV>0);
}
$l0=length($lineq);
#print "$l0 \n";
if(!open(INPUT, "<$poem")) {
    print "cannot open $poem to read!\n";
    exit(2);
}
if(!open(OUTPUT, ">$cmdfile") && $cmdline){
    print "cannot open $cmdfile to write!\n";
    close(INPUT);
    exit(2);
}
#print OUTPUT "/nop\n";
while(<INPUT>){
    chomp;
    $line=$_;
    $l1=length($line);
#    print "option = $option,len = $l1;line = $line \n";
    if($option==0 && length($line)*2>3*$l0) {@lines = split(/  /, $line, 2);}
    else {$#lines=0; $lines[0]=$line;}
#    print "lines = $lines,len = $#lines\n";
    for($n=0; $n<=$#lines; $n++){
	$temp=$lines[$n];
#	print "temp = $temp \n";
	$l2=length($lines[$n]);
#	print "len2 = $l2,l0 = $l0 \n";
	if(length($lines[$n])>=$l0-1){
	    for($i=0, $match=1; $match && $i<$l0/2; $i++){
		for($j=0, $match=0; !$match && $j<($l=length($temp)/2); $j++){
#					print substr($temp, 2*$j, 2);
#					print " ?= ";
#					print substr($lineq, 2*$i, 2);
#					print "\n";
		    if(substr($temp, 2*$j, 2) eq substr($lineq, 2*$i, 2)){
#						print "yes!\n";
			$match=1; #oh, no! what is the break statement in Perl?!
		    }
		    else {$match=0;}
		}
		if($match){
		    $temp = sprintf("%s%s", substr($temp, 0, 2*$j-2), substr($temp, 2*$j));
#					print "temp = $temp\n\n";
		}
	    }
#	    print "match = $match,cmdline = $cmdline \n";
	    if($match) {
		close INPUT;
		if(1 || $cmdline){
#		    print "output = $lines[$n]\n";
		    print OUTPUT "answer $lines[$n]\n";
		    close(OUTPUT);
		}
		else {
		    print "$lines[$n]\n";
		}
		exit(0);
	    }
	}
    }
}
close INPUT;
if(1 || $cmdline){
    print OUTPUT "dunno\n";
    close(OUTPUT);
}
else {print "Cannot find match!\n";}
if(!open(OUTPUT, ">>$errfile")){
    print "cannot open $errfile to write!\n";
    exit(4);
}
#seek(OUTPUT, 2, 0);
print OUTPUT $lineq."\n";
close(OUTPUT);
exit(5);
