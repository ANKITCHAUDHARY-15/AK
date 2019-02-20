#code
t=int(input())
while t>0:
    n=input()
    while(len(n)>1):
        s=sum(map(lambda x:x*x,list(map(int,n))))
        n=str(s)
    if n=='1':
        print(1)
    else:
        print(0)
    t-=1
