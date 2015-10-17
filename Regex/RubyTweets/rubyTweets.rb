# Enter your code here. Read input from STDIN. Print output to STDOUT
count = 0
STDIN.each do |line|
    count += 1 if line =~ /hackerrank/i
end
puts count
