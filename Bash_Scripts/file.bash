#!/bin/bash

echo .txt:  $((echo $ls  ./ | grep *.txt))
echo .pdf: $((echo $ls ./ | grep *.pdf))
