t=int(input())
while t>0:
    n=int(input())
    #l=list(map(int,input().split(" ")))
    l=input().split(" ")
    if n%2==0:
        print(0)
    else:
        x=int(l[0])
        for i in range(2,n,2):
            x=x^int(l[i])
        print(x)
    t-=1
