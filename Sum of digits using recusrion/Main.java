def func(num):
  global sum
  if num==0:
    print(sum)
  else:
    temp=num%10
    sum+=temp
    num=int(num/10)
    func(num)
sum=0
n=int(input())
func(n) 
