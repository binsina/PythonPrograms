#to separate the input by type, int, str
#the problem with this is that the user has to input quotoation marks 
#around the string type- it defeats the purpose of being input-smart

myList=input("Please enter your list separted by a comma:")
myIntList = [x for x in myList if isinstance(x, int)]

myStrList = [x for x in myList if isinstance(x, str)]

print (myIntList, myStrList)

