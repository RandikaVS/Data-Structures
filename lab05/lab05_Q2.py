A=[]
i=0
while(i<8):
    A.append(int(input("Enter number : ")))
    i+=1

print(A)

def bubbleSort(A):
    for i in range(0,len(A)-1):
        for j in range(len(A)-1):
            if(A[j]>A[j+1]):
                key=A[j]
                A[j]=A[j+1]
                A[j+1]=key
    return A

bubbleSort(A)
print("Sorted array using Bubble Sort algorithm")
print(A)
