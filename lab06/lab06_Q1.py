A=[]
i=0

while(i<8):
    A.append(int(input("Enter number : ")))
    i+=1

print(A)

def selectionSort(A):
    length=len(A)

    for i in range(length-1):
        minIndex =i
        for j in range(i+1,length):
            if(A[j]<A[minIndex]):
                minIndex=j
            A[i],A[minIndex]=A[minIndex],A[i]
    return A

selectionSort(A)
print("After selection sort algorithm")
print(A)
