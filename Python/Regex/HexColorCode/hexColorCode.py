import re
import sys

inp = ""
for line in sys.stdin:
    inp = inp + line
    
res = re.findall(r'#[a-fA-F0-9]*', inp)
for each in res:
    print each
