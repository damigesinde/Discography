'''

  Dami: Dami Gesinde
  Date: July, 2022
  The Purpose of Program: Rock Paper Scissors, along with Dice Rolling Simulator, was made during the summer after my first computer science course. Not wanting to forget what I learned and hoping to expand on my knowledge, I decided to make a simple game.
  
'''

def game():

  import random
  choices = ["Rock", "Paper", "Scissors"]

  print("Hello! Welcome to my RPS game.")
  print(" ")
  print("Today we will be playing some Rock Paper Scissors against a bot! (the bot being me).")
  print(" ")
  print("You will be player One! And I will be player Two!")
  print(" ")
  print("*Just a note: Throughout this program you will only need to answer with the words 'Rock',  'Paper' or 'Scissors'. With the first letter being a capital letter and no spaces!*")
  print(" ")

  def play():

    
    print("'Rock', 'Paper', or 'Scissors'?")
    panswer1 = input("Choice: ")
    print(" ")

    if panswer1 in choices:
  
      if panswer1 == ("Rock"):
        banswer1 = random.choice(choices)
        print("Your choice was " + panswer1 + ", and My choice was " + banswer1 + ".")

        if panswer1 == ("Rock") and banswer1 == ("Rock"):
          print("We tied!")
          print(" ")
          play()

        elif panswer1 == ("Rock") and banswer1 == ("Paper"):
          print("I won!")  
          print(" ")
          play()

        elif panswer1 == ("Rock") and banswer1 == ("Scissors"):
          print("You won. :(")
          print(" ")
          play()
      
        elif panswer1 == ("Paper") and banswer1 == ("Rock"):
          print("You won. :(")
          print(" ")
          play()

        elif panswer1 == ("Paper") and banswer1 == ("Paper"):
          print("We tied!") 
          print(" ")
          play()

        elif panswer1 == ("Paper") and banswer1 == ("Scissors"):
          print("I won!") 
          print(" ")
          play()
          

        elif panswer1 == ("Scissors") and banswer1 == ("Rock"):
          print("I won!")
          print(" ")
          play()
          

        elif panswer1 == ("Scissors") and banswer1 == ("Paper"):
          print("You won. :(")
          print(" ")
          play()

        elif panswer1 == ("Scissors") and banswer1 == ("Scissors"):
          print("We tied!")
          print(" ")
          play()

        else:
          print("So sorry something must have went wrong :(. Try again!")
          print(" ")
          game()
        
      else: 
        banswer1 = random.choice(choices)
        print("Your choice was " + panswer1 + ", and My choice was " + banswer1 + "!")
        if panswer1 == ("Rock") and banswer1 == ("Rock"):
          print("We tied!")
          print(" ")
          play()

        elif panswer1 == ("Rock") and banswer1 == ("Paper"):
          print("I won!")  
          print(" ")
          play()
          

        elif panswer1 == ("Rock") and banswer1 == ("Scissors"):
          print("You won. :(")
          print(" ")
          play()
      
        elif panswer1 == ("Paper") and banswer1 == ("Rock"):
          print("You won. :(")
          print(" ")
          play()

        elif panswer1 == ("Paper") and banswer1 == ("Paper"):
          print("We tied!") 
          print(" ")
          play()

        elif panswer1 == ("Paper") and banswer1 == ("Scissors"):
          print("I won!") 
          print(" ")
          play()
          

        elif panswer1 == ("Scissors") and banswer1 == ("Rock"):
          print("I won!")
          print(" ")
          play()
          

        elif panswer1 == ("Scissors") and banswer1 == ("Paper"):
          print("You won. :(")
          print(" ")
          play()

        elif panswer1 == ("Scissors") and banswer1 == ("Scissors"):
          print("We tied!")
          print(" ")
          play()

        else:
          print("So sorry something must have went wrong :(. Try again!")
          print(" ")
          game()
    
    else:
      print(" ")
      print("You must have not used the correct format! Try Again.")
      print(" ")
      print(" ")
      game()
      
  play()
  
game()