fName=str(raw_input("what is your firt name?"))
lName=str(raw_input("what is your last name?"))
transCost=int(raw_input("How much did you do pay for transportation this year?"))
College=str(raw_input("What is the name of your college or school you attend ?"))
Graduation=input("How much do you pay for tution this year ?")
InsurancePay=input("How much do you pay for insurance deductible per year ?")
InsuranceName=str(raw_input("what is the name of your insurance carrier ?"))
#variables for user input

List =  [(fName,lName,transCost,College,Graduation,InsurancePay,InsuranceName)]
#User inputs are returned into a List/Aaray
Liststrings = list(map(lambda x:(x[0],x[1],x[3],x[6]),List))
print(" ")
print (Liststrings)
#using lambda and map tool you can separate the list by string
Listnumaddition = list(map(lambda x:(x[2]+x[4]+x[5]),List))
Listnumbers = list(map(lambda x:(x[2],x[4],x[5]),List))
#using lambda/map tool to separate the list by numbers/and add the integars
print (Listnumbers)
print(" ")
#used the %s to make the output little more cleaner       
print("%s %s Your Total expensives this Year were:$%s" %(fName,lName,Listnumaddition))    


