#Type your code here...
alphabet='abcdefghijklmnopqrstuvwxyz'
str=input().lower()
not_str=[]
for i in alphabet:
  if i not in str and i not in not_str:
    not_str.append(i)
print(','.join(not_str)+',')