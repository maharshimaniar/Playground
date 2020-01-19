a=3
b=8
l=[3,8]
n=int(input())
for i in range(2,n):
    temp=a+b+i
    a=b
    b=temp
    l.append(temp)
for i in range(0,n):
  print(l[i],end=" ")