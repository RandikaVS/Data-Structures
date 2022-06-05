A=[]
i=0
a=0
while(i<5):
    x=int(input("Enter number wihtin 10-20 : "))
    if(x<10 or x>20):
        print("Number is not in range (10-20)")
        continue
    else:
        i+=1
        A.append(x)


def inserSort(A):
    for j in range(1,len(A)):
        key=A[j]
        i=j-1
        while(i>=0 and A[i]>key):
            A[i+1]=A[i]
            i-=1
            a+=1
        A[i+1]=key
        
print(A)
inserSort(A)
print(a,"After inserSort algorithm")
print(A)



