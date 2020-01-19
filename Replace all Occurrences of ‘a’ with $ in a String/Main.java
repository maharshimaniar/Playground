#python
str=input().lower()
l=list(str)
for i in range(0,len(l)):
  if l[i]=='a':
    l[i]='$'
str=''.join(l)
print(str)