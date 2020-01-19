#Type your code here...
class person:
  pass
class passport(person):
  def __init__(self,name,address,passport_number):
    person.name=name
    person.address=address
    self.passport_number=passport_number
name=input()
address=input()
passport_number=input()
p=passport(name,address,passport_number)
print("Name :",p.name)
print("Address :",p.address)
print("Passport Number :",p.passport_number)