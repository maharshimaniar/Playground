#python
l=list(input())
for i in range(0,len(l)):
  if i%2!=0:
      l[i]=''
  else:
      continue
    
print(''.join(l))