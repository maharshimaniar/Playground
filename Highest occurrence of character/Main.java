#Type your code here...
strl=list(input())
alphabet='abcdefghijklmnopqrstuvwxyz'
maxchar=''
maxcnt=0
for i in alphabet:
  cnt=strl.count(i)
  if cnt>maxcnt:
    maxchar=i
    maxcnt=cnt
print(maxchar,maxcnt)