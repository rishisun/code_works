#!/usr/bin/env bash
echo -n -e "\nEnter the Number: \n"
read number
oldnumber=${number}
p=${#number}
while test ${number} -ne 0
do
rem=$(($number%10))
power=$(($rem**$p))
sum=$(($sum+$power))
number=$(($number/10))
done
if test $oldnumber -eq $sum
then
echo ${oldnumber} is an AMSTRONG NUMBER.
else
echo ${oldnumber} is not an AMSTRONG NUMBER.
fi
