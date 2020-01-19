#python
str=input()
char=0
num=0
for i in str:
  if i.isnumeric():
    num+=1
  else:
    char+=1
    
print(num)
print(char+3)
    