#Type your code here...
class mobile:
  def __init__(self,name,brand,color,pixel):
    self.name=name
    self.brand=brand
    self.color=color
    self.pixel=pixel
  def print(self):
  	print('{} own {} {} color smartphone having {} MP camera'.format(name,brand,color,pixel))
  
name=input()
brand=input()
color=input()
pixel=input()
m=mobile(name,brand,color,pixel)
m.print()