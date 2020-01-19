#python
x=float(input())
y=float(input())
ans=(y*12)-x
ans1=(y*12)-x
ans2=x-(y*12)
if ans>0:
  print("profit : Rs.",'%.2f' %ans1)
else:
  print("Loss : Rs.",'%.2f' %ans2)