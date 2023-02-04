'''
  
  Name: Dami Gesinde
  Date: July, 2022
  Purpose of Program: This program was made during the summer after my first computer science course. Not wanting to forget what I learned and hoping to expand on my knowledge, I decided to make a simple game.
  
'''


print('Today you will be rolling a die with a range of 1-12.\n\nType "Roll" (with a capital "R" to roll!')

def play():
  
  import random

  numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

  roll = input(" ")
  if roll == ("Roll"):
    print(" ")
    print(random.choice(numbers))
    print(" ")
    play()

  else: 
    print("\nYou must not have typed it in the right format :( Try again.\n\n\n")
    play()
    
play()