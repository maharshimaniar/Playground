#python
str=input()
l=list(str)
templ=[]
newl=[]
for i in l:
  if i.isnumeric():
    templ.append(int(i))
i=0
while i<len(templ):
  temptup=(templ[i],templ[i+1])
  newl.append(temptup)
  i+=2
newtup1=[]
newtup2=[]
for i in newl:
  newtup1.append(i[0])
  newtup2.append(i[1])
final=[]
final.append(tuple(newtup1))
final.append(tuple(newtup2))
print(final)