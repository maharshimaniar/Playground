#python#python
type=input().lower()
tut=int(input())
bus=int(input())
hostel=int(input())
if type=='msds':
  total=tut+bus
elif type=='msh':
  total=tut+hostel
elif type=='mgsds':
  total=(1.5*tut)+bus
elif type=='mgsh':
  total=(1.5*tut)+hostel
print(total)