#Type your code here
strl=list(input())
substrl=list(input())
index=int(input())
ans=''
tempword=''
for i in range(0,len(substrl)):
  strl.insert(index+i,substrl[i])
for i in strl:
  if i!=' ':
    tempword+=i
  else:
    ans+=tempword+' '
    tempword=''
print(ans+tempword)