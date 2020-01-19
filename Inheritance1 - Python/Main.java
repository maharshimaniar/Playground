#Type your code here...
class calc:
  def __init__(self,n1,n2):
    self.n1=n1
    self.n2=n2
  def add(self):
    print("Addition : {}".format(n1+n2))
  def sub(self):
    print("Subtraction : {}".format(n1-n2))
    
class adv_calc(calc):
  def __init__(self,n1,n2):
    super().__init__(n1,n2)
    self.n1=n1
    self.n2=n2
  def mul(self):
    print("Multiplication : {}".format(n1*n2))
  def div(self):
    print("Floor Division : {}".format(n1//n2))
    
n1=int(input())
n2=int(input())
c=adv_calc(n1,n2)
c.add()
c.sub()
c.mul()
c.div()