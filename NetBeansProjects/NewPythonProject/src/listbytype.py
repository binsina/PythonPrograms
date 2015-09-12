fName=str(raw_input("what is your firt name?"))
lName=str(raw_input("what is your last name?"))
age=int(raw_input("How do you do pay for transportation this year?"))
College=str(raw_input("What is the name of your college or school you attend ?"))
Graduation=input("How much do you pay for tution this year ?")
InsuranceNum=input("How much do you pay for insurance deductible per year ?")
GroupNumber=str(raw_input("what is the name of your insurance carrier"))


List =  [(fName,lName,age,College,Graduation,InsuranceNum,GroupNumber)]

Liststrings = list(map(lambda x:(x[0],x[1],x[3],x[6]),List))
print(" ")
print (Liststrings)

Listnumaddition = list(map(lambda x:(x[2]+x[4]+x[5]),List))
Listnumbers = list(map(lambda x:(x[2],x[4],x[5]),List))
print (Listnumbers)
print(" ")
print (fName,lName,"Your Total expensives this year is:",Listnumaddition)        
      


