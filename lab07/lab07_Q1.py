lst = []
n =int(input("enter number of elements : "))
print("enter mumbers : ")
for i in range(0,n):
    ele = int(input())
    lst.append(ele)

print(lst)

#implement the bubblesort
def bubblesort(arr):
    n = len(arr)
    for i in range(1,n-1):
        for j in range(0,n-i-1):
            if arr[j]> arr[j+1]:
                arr[j],arr[j+1] = arr[j+1],arr[j]


#call to bubblesort
bubblesort(lst)
print("sort array is :")
print(lst)
        
