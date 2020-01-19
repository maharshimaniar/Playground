#Type your code here...
vowel=['a','e','i','o','u']
l=list(input().lower())
for i in vowel:
  if i in l:
    flag=0
  else:
    flag=1
    break
if flag==1:
  print("Not Accepted")
else:
  print("Accepted")