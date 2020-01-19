#Type your code here...
class salary:
  def __init__(self,salary,bonus):
    self.salary=salary
    self.bonus=bonus
  def get_total(self):
    return (12*self.salary)+self.bonus
sal=int(input())
bon=int(input())
s=salary(sal,bon)
print("Total:",s.get_total())