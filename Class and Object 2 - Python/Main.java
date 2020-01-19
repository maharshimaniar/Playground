#Type your code here...
class shape:
  def __init__(self):
    pass
  def square(self,side):
    self.side=side
    print("The side of square = {} ".format(side))
    print("Area of square = {} ".format(side*side))
    
  def rectangle(self,length,breadth):
    self.length=length
    self.breadth=breadth
    print("The length and breadth of rectangle = {} , {}".format(length,breadth))
    print("Area of rectangle = {}".format(length*breadth))
    
side=int(input())
length=int(input())
breadth=int(input())
s=shape()
s.square(side)
s.rectangle(length,breadth)

