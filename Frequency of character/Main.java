#Type your code here..
string=input()
dict={}
for i in string:
  if i not in dict:
    dict.update({i:string.count(i)})
sorted(dict)
l=[]
for key, val in dict.items() :
  l.append(key+' '+str(val))
l.sort()
for i in l:
  print(i)