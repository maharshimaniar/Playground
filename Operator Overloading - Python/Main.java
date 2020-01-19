class grid:
  def __init__(self,n1,n2):
    self.n1=n1
    self.n2=n2
  def add(o1,o2):
    print("{},{}".format(o1.n1+o2.n1,o1.n2+o2.n2))
n1=int(input())
n2=int(input())
n3=int(input())
n4=int(input())
o1=grid(n1,n2)
o2=grid(n3,n4)
o1.add(o2)
