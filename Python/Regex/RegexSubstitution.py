import sys
import re

input = ""
for line in sys.stdin:
    input = input + line
    
input = re.sub(r'(?<= )&&(?= )','and', input)
print re.sub(r'(?<= )\|\|(?= )','or', input)
