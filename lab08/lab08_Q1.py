array = []

n = int(input("Enter number of elements of array : "))
print("Enter numbers : ")

for i in range(0,n):
    array.append(int(input()))
print(array)

def binarySearchTree(arr,min,max,key):
    if(max<min):
        return false
    else:
        mid = ((max+min)//2)
        if arr[mid]>key:
            binarySearchTree(arr,min,mid-1,key)
        elif arr[mid]<key:
            return binarySearchTree(arr,mid+1,max,key)
        else:
            return mid

p = int(input("Enter number you want to search : "))
answer = binarySearchTree(array,0,len(array)-1,p)
print("KEy found at the index : ",answer)
    
