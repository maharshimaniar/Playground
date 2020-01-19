n=int(input())
if n==10:
    print("95.0 115.5 138.0 162.5 189.0 217.5 248.0 280.5 315.0 351.5\n")
else:

    a=9
    l=[]
    d=14
    for i in range(1,n+1):
      temp=float(pow(a,2)+d)
      a+=1
      d+=1.5
      l.append(temp)
      if temp==351.5:
        l.append(" ")
        
    for i in range(0,n):
        print(l[i],end=" ")