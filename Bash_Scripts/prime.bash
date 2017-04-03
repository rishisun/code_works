#!/bin/bash
flag=0
echo enter number
read g
for((j=2;j<=g;j++))
do
n=$j
for((i=2;i<n;i++))
do
if [ $(($n%$i)) -eq 0 ]
then
flag=1
break
fi
done
if [ $flag -eq 0 ]
then
echo $n
fi
flag=0
done

