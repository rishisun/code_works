#!/bin/bash
a=1
b=1
echo enter the number of digits
read n
echo -n "$a","$b",
for ((i=0;i<$n-2;i++))
do
c=$((a+b))
a=$b
b=$c
echo -n "$c",
done
echo
echo these are the numbers "$c"
