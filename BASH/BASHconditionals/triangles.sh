read a
read b
read c

if (($a == $b)); then
  if (($b == $c)); then
    echo EQUILATERAL
  else
    echo ISOCELES
  fi
elif (($a == $c)); then
  echo ISOCELES
else
  echo SCALENE
fi

