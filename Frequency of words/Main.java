#Type your code here...
l=input().split(' ')
templ=[]
for i in l:
  templ.append(i+' : '+str(l.count(i)))
l2=[]
for i in templ:
  if i not in l2:
    l2.append(i)
    print(i)