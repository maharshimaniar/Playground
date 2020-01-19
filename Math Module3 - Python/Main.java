#Type your code here...
n=int(input())
fac=1
for i in range(1,n+1):
  fac*=i
p=int(input())
q=int(input())
temp=int(p/q)
ans=p-(temp*q)
print(fac)
print(ans)