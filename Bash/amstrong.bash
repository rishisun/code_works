#!/bin/bash
echo -n "Enter the Number"
read number
oldnumber=$number
p=${#number}
while test $number -ne 0
do
rem=$(($number%10))
power=$(($rem**$p))
sum=$(($sum+$power))
number=$(($number/10))
done
if test $oldnumber -eq $sum
then
echo the number is amstrong
else
echo the number is not amstrong
fi
