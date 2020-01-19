#Type your code here...
n=int(input())
l=[]
for i in range(0,n):
  temp=int(input())
  l.append(temp)
m=int(input())
n=int(input())
sum=0
try:
  for i in range(m,n):
    sum+=l[i]
  print("Sum of numbers in the given range =",sum)

except IndexError:
  print("list index out of range")