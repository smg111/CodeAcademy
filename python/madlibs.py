
#Mad Lib game.

STORY = "This morning %s woke up feeling %s. 'It is going to be a %s day!' Outside, a bunch of %ss were protesting to keep %s in stores. They began to %s to the rhythm of the %s, which made all the %ss very %s. Concerned, %s texted %s, who flew %s to %s and dropped %s in a puddle of frozen %s. %s woke up in the year %s, in a world where %ss ruled the world."

print "Starting Mad Libs..."
name = raw_input("Enter a name: ")
firstadj = raw_input("Enter an adjective: ")
secondadj = raw_input("Enter another adjective: ")
thirdadj = raw_input("Enter one last adjective: ")
verb = raw_input("Enter a verb: ")
firstnoun = raw_input("Enter a noun: ")
secondnoun = raw_input("Enter another noun: ")
animal = raw_input("Enter an animal: ")
food = raw_input("Enter a food: ")
fruit = raw_input("Enter a fruit: ")
superhero = raw_input("Enter a superhero: ")
country = raw_input("Enter a country: ")
dessert = raw_input("Enter a dessert: ")
year = raw_input("Enter a year: ")

print STORY % (name,firstadj,secondadj,animal,food,verb,firstnoun, fruit, thirdadj, name, superhero, name, country, name, dessert, name, year, secondnoun)






