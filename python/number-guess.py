# Guess a number.. you win if the number guessed is greater than the sum of the two rolls of a pair of 7-sided dice. 

from random import randint
from time import sleep

def get_user_guess():
  user_guess = int(raw_input("Please guess now: "))
  return user_guess
def roll_dice(number_of_sides):
  first_roll = randint(1,number_of_sides)
  second_roll= randint(1,number_of_sides)
  max_val = number_of_sides*2
  print "The maximum possible value is " + str(max_val)
  sleep(1)
  user_guess = get_user_guess()
  if user_guess > max_val:
    print "Guess is larger than the max value."
    return 
  else: 
    print "Rolling..."
    sleep(2)
    print "First roll: "+ str(first_roll)
    sleep(1)
    print "Second roll: "+ str(second_roll)
    sleep(1)
    total_roll = first_roll + second_roll
    print str(total_roll)
    print "Result..."
    sleep(1)
    if user_guess > total_roll:
      print "You won!"
      return
    else:
      print "Sorry, you lost!"
      return
    
roll_dice(7)
