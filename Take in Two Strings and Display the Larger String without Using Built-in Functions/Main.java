#python
cnt1=0
cnt2=0
str1=input()
str2=input()
l1=list(str1)
l2=list(str2)
for i in range(0,len(l1)):
  cnt1+=1
for i in range(0,len(l2)):
  cnt2+=1
if cnt1>cnt2:
  print(str1)
else:
  print(str2)