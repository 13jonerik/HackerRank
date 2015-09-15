#!/usr/bin/env python

inputString = raw_input() 
score1 = 0 
score2 = 0 
n = len(inputString) 
for i in xrange(n):
    if inputString[i] in ['A', 'E', 'I', 'O', 'U']:
        score1 += (n-i)
    else:
        score2 += (n-i)
if score1 > score2: 
    print "Kevin" + ' ' + str(score1) 
elif score2 > score1: 
    print "Stuart" +' ' + str(score2) 
else: print "Draw"





# vim: tabstop=8 expandtab shiftwidth=4 softtabstop=4
