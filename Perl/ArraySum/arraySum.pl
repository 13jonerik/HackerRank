#!/usr/bin/perl

$n = <STDIN>;
chomp $n;
$arr_temp = <STDIN>;
@arr = split / /,$arr_temp;
chomp @arr;
$len = scalar @arr;
$sum = @_;
for (my $i = 0; $i < $len; $i++) {
    $sum += @arr[$i];
    #$sum += $arr;
}
print $sum;
