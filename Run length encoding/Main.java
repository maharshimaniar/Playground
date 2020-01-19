#Type your code here...
str1=input()
cnt=0
ans=''
for i in str1:
  if i not in ans:
    ans=ans+i+str(str1.count(i))
print(ans)