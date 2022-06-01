a=3
a
type(a)

b="Sahan"
b
type(b)

a=b=c=1
a
b
c

a,b,c=1,2,"Sahan"
a
b
c

a="S"
b="a"
c=a+b
c

c=2+1j
c
type(c)

d=[1,2,54]
d
type(d)

5/2
5//2

2*4

2**4

x,y,z=1,2,"Sahan"
print(x,y,z, sep='/')
print(x,y,z, end='.')

print(''''hello
world
123
sahan''')

x=int(input("Enter number : "))
print(x)

a=str(input("Enter charactor : "))
print(ord(a))

b=int(input("Enter ASCII : "))
print(chr(b))

c=str(input("Enter equarion : "))
print(eval(c))

x="Hello"
print(len(x))

a="Hello"
b="World"
print(a+b)

c="Hello"*5
print(c)


s="Python"
print(s[0])
print(s[1])
print(s[-1])
print(s[-2])

x="abcdefghij"

print(x[2:5])
print(x[ :5])
print(x[2: ])
print(x[-2: ])
print(x[:])
print(x[1:7:2])
print(x[ : :-1])

range(10)
print(list(range(10)))

print(list(range(2,10)))
print(list(range(2,10,2)))
print(list(range(9,2,-1)))

a=20

if(a==10):
    print("a equals to 10")
    print("a is an integer")

elif(a<50):
    print("a is lower than 50")
    
    if(a==20):
        print("a is 20")

else:
    print("a is not equal to 10")


a=int(input("Enter number : "))
b=int(input("Enter number : "))

if(a<b):
    print(b," is larger")
elif(a>b):
    print(a," is larger")
else:
    print("numbers are equal")

a=int(input("Enter number 1 : "))
b=int(input("Enter number 2 : "))
c=int(input("Enter number 3 : "))

if(a<b and a<c):
    print(a," is minimum number")

elif(b<a and b<c):
    print(b," is minimum number")
else:
    print(c," is minimum number")

for i in range(5):
    print("Hello")

for i in [0,1,2,3,4]:
    print("Hello")
    
total=0
for i in range(1,6):
    total+=i
print(total)

for i in range(7):
    for j in range(1,i+2):
        print(j,end="")
    print(i)

i=0
while(i<10):
    print(i)
    i+=1

for i in range(10):
    if(i%2==1):
        continue
    print(i)
print("Done)
