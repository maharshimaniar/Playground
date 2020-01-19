#Type your code here...
class MyCalculator:
  def __init__(self,n,p):
    self.n=n
    self.p=p
  def ans(self):
    return pow(n,p)
class Error(Exception):
  pass
class notzero(Error):
  pass
class notnegative(Error):
  pass
try:
  n=int(input())
  p=int(input())
  if n==0 and p==0:
    raise notzero
  elif n<0 or p<0:
    raise notnegative
  else:
    c=MyCalculator(n,p)
    print(c.ans())
    
except notzero:
  print("n and p should not be zero.")
except notnegative:
  print("n or p should not be negative.")