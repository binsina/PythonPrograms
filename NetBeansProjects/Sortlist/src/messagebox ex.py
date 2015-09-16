import random		# handy random-number functions

def run():
	# pick a number in the range 1-100
	mynum = random.choice( range(10) ) + 1
	i=0
	guess = 0		# what user guessed
	lastdist = 0		# last distance to mynum
	#tries = 3			# number of tries so far
        print(mynum)
                
        print "I'm thinking of a number from 1 to 10."
	
	# main loop: repeat until user gets it right
	while guess != mynum:
        
		#tries = 3
		guess = input("Your guess? ")
	
		if (guess != mynum):
		
			# find how far off you are
			newdist = abs(guess - mynum)
	
			# print warmer/colder than last time
			if (lastdist == 0):
				print "Guess again..."
			elif (newdist > lastdist):
				print "You're getting colder."
			else:
				print "You're getting warmer."
			lastdist = newdist
			
		# end of the if statement
	# repeat until user gets it right
	
	print ("YOU WIN!!!")
        run()


if __name__ == '__main__':
	run()
	print
	raw_input("press Return>")
else:
	print "Module warmer imported."
	print "To run, type: warmer.run()"
	print "To reload after changes to the source, type: reload(warmer)"''