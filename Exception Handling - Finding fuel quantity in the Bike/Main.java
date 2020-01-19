#Type your code here...
try:
  n=input()
  if n.lower()=='null':
    n=None
  if n==None:
    raise NameError()
  else:
    print("Petrol Quantity =  "+n)
except NameError:
  print("There is no fuel in the Bike")