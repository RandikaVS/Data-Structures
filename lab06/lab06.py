nArray = []
n = int(input("Enter number of elements : "))

print("Enter numbers : ")

for i in range(0,n):
    num = int(input())
    nArray.append(num)
print(nArray)

def insertionSort(arr):
    for i in range(1,len(arr)):
        key = arr[i]
        j = i-1
        while j>=0 and key<arr[j]:
            arr[j+1]=arr[j]
            j=j-1
            arr[j+1]=key

insertionSort(nArray)

print("Sorted array is : ")
print(nArray)
for i in range(0,len(nArray)):
    print("%d"%nArray[i])
