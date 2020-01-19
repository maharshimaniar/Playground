#python
str=input()
l1=[]
l2=[]
for i in range(0,len(str)):
  if str[i].isupper():
    l1.append(str[i])
  else:
    l2.append(str[i])
    
print(len(l2))
print(len(l1))