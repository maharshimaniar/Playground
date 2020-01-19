l=[]
str=input().lower()
for i in str:
  l.append(i)
l.sort()
print("".join(l))