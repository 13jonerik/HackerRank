sum=0
read n
for ((i = 0; i < $n; i++ ))
do
    read num
    sum=$(($sum + $num))
done
printf "%.3f" $(echo "scale=10; $sum/$n" | bc -l)
