#Type your code here...
class person:
  def __init__(self,name):
    self.name=name
  def display(self):
    print("Name of Person = {}".format(name))
    
class staff(person):
  def __init__(self,name,idi):
    person.__init__(self,name)
    self.idi=idi
  def display(self):
    person.display(self)
    print("Staff Id is  = {}".format(idi))
    
class tempstaff(staff):
  def __init__(self,name,idi,hr,days,):
    staff.__init__(self,name,idi)
    self.hr=hr
    self.days=days
    self.sal=hr*days*150

  def display(self):
    staff.display(self)
    print("No. of Days = {}".format(days))
    print("No. of Hours Worked = {}".format(hr))
    print("Total Salary = {}".format(self.sal))
    
name=input()
idi=int(input())
days=int(input())
hr=int(input())
p=tempstaff(name,idi,hr,days)
p.display()