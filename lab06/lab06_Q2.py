A=[]
x=0
while(x<10):
    i=int(input("Enter number : "))
    A.append(i)
    x+=1

print(A)

def partition(A,low,high):
    i=(low-1)
    pivot=A[high]

    for j in range(low,high):
        if(A[j]<=pivot):
            i+=1
            A[i],A[j]=A[j],A[i]
    A[i+1],A[high]=A[high],A[i+1]
    return (i+1)

def quickSort(A,low,high):
    if(low<high):
        q=partition(A,low,high)
        quickSort(A,low,q-1)
        quickSort(A,q+1,high)

quickSort(A,0,len(A)-1)
print("After Partition algorithm")
print(A)
