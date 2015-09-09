#!/usr/bin/env python

def checkFunny(line, rev, length):
    check = True
    for i in range(1, len(line)):
        if (abs(ord(line[i]) - ord(line[i - 1])) != abs(ord(rev[i]) - ord(rev[i - 1]))):
            check = False
    return check

num = input()
for i in range(num):
    line = raw_input()
    
    reverse = list(line[::-1])
    line = list(line)
    
    if checkFunny(line, reverse, num):
        print "Funny"
    else:
        print "Not Funny"

# vim: tabstop=8 expandtab shiftwidth=4 softtabstop=4
