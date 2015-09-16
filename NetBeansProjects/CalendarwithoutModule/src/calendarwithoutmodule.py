# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "binsina"
__date__ = "$Sep 11, 2015 6:39:41 PM$"

def main():
	numberofDays = input("Input the number of days in the month (28-31): ")
	startingDay = input("Input the starting day (0=Sun, 1=Mon,2=Tue,3=Wed,4=Fri,5=Sat,6=Sun): ")
	for j in range(startingDay):
		print "  ", 
	i = 1
	while i <= numberofDays:
		if i < 10:
			print "", i,
		else:
			print i,
		if (i+startingDay) % 7 == 0:
			print " "
		i = i + 1

main()


