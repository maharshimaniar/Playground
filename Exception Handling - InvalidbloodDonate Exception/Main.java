#Type your code here...
class Error(Exception):
  pass
class InvalidbloodDonate(Error):
  pass

try:
  age=int(input())
  weight=int(input())
  if age<18 or weight<55:
    raise InvalidbloodDonate
  else:
    print("Can donate blood")
except InvalidbloodDonate:
  print("Not eligible to donate blood")
  