#python
str=input()
l=[]
n=len(str)
for i in range(0,2):
  l.append(str[i])
for i in range(n-2,n):
  l.append(str[i])
print(''.join(l))