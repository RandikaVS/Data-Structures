array = []

n = int(input("Enter number of elements : "))
print("Enter numbers")

for i in range(n):
    array.append(int(input()))
print(array)

def selectionSort(arr):
    n = len(arr)

    for a in range(n):
        min_idx = a
        for b in range(a+1,n):
            if arr[min_idx]>arr[b]:
                min_idx=b
        arr[a],arr[min_idx] = arr[min_idx],arr[a]

selectionSort(array)
print("Sorted array is : ")
print(array)
