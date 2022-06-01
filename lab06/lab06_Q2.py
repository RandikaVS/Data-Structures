array = []

num = int(input("Enter number of elemets : "))

for i in range(0,num):
    array.append(int(input()))
print(array)

def partition(arr,low,high):
    i=(low-1)
    pivot=arr[high]

    for a in range(low,high):

        if arr[a]<=pivot:
            i=i+1
            arr[i],arr[a] = arr[a],arr[i]
    arr[i+1],arr[high] = arr[high],arr[i+1]
    return (i+1)

def quicksort(arr,low,high):

    if low<high:
        pi=partition(arr,low,high)

        quicksort(arr,low,pi-1)
        quicksort(arr,pi+1,high)


quicksort(array,0,num-1)
print(array)
