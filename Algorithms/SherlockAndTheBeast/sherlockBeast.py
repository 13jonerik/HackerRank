cases = int(raw_input())
for x in range (0, cases):
    n = int(raw_input())
    calc = n
    if (calc < 2):
        print '-1'
    else:
        while(calc % 3 != 0 ): 
            calc -= 5 
        if(calc < 0): 
            print '-1' 
        else: 
            print calc * '5' + (n - calc) * '3' 
