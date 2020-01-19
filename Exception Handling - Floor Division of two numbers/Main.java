#Type your code here...
m=int(input())
n=int(input())
try:
  if n==0:
    raise ZeroDivisionError
  else:
    print("{} // {}  =  {}".format(m,n,m//n))
    
except ZeroDivisionError:
  print("You cannot divide a number by zero")