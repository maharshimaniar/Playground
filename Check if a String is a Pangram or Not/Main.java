#python
alphabet='abcdefghijklmnopqrstuvwxyz'
str=input()
for i in alphabet:
  if i in str:
    flag=0
    continue
  else:
    print("not pangram")
    flag=1
    break
if flag==0:
  print("pangram")