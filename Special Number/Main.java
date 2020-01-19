lower = int(input())
upper = int(input())
add  = 0
prod = 0
for i in range(lower,upper,1):
  unit = i%10
  ten = int(i/10)
  add = unit + ten
  prod = unit*ten
  if prod+add == i:
    print(i,end="\n")