"""

  Name: Dami Gesinde
  Date: June, 2022
  Purpose of Program: Persona was a project made for my final for my first class in computer science. Computer Science Principles was a semester class that taught me basic Python and a base understanding of coding. Principles gave me a passion for programming and inspired me to learn Python in my free time, because of the extra learning I was able to make this project with concepts that are not-so-basic python skills.
  
"""

import simplejson
import os

accountlist = []
accountpage = open("account.txt", "wt")

def app():

  print("Hello, welcome to Persona! Today you will be rating someone's personality!")
  print("Create a profile for the person you would like to rate by filling out the information.")

  name = input("Name: ")
  age = input("Age: ")
  print("Ex. Middleschool, Microsoft, Stay at Home Dad.")
  occupation = input("Occupation: ")
  print("Write in MM/DD/YYYY format. Ex. 01/03/2001.")
  birthday = input("Birthday: ")
  print("Ex. She/Her, It.")
  pronouns = input("Pronouns: ")

  rar = True
  while rar == True:
    accountlist.append(name)
    accountlist.append(age)     
    accountlist.append(occupation)
    accountlist.append(birthday)    
    accountlist.append(pronouns)

    print(accountlist)
    print(" ")
    
    def verify1():
      
      print('Options are "Yes" or "No".')
      verify = input("Is that the account information you would like to have? ")
      print(" ")
    
      if (verify == "Yes"):
        rar = False

        def rating():
          
          global rar
          
          print(" ")
          print("Time to rate them. Here you will get to determine your perception of others. Just answer a few questions.")
          print("Make sure to answer with a number from 0-5!")
          print(" ")
          
          empathy = float(input("How would you rate their empathy? "))
          impression = float(input("How would you rate their first impression on you? "))
          altruism = float(input("How woud you rate their altruism? "))
          responsiblity = float(input("How would you rate their responsibility? "))
          dilligence = float(input("How would you rate their dilligence? "))
          resiliance = float(input("How would you rate their resiliance? "))
          passion = float(input("How would you rate their passion? "))
          patience = float(input("How would you rate their patience? "))
          print(" ")
 
          rating = empathy + impression + altruism + responsiblity + dilligence + resiliance + passion + patience
          rating = rating / 8.0

          if (rating >= 0.0) and (rating <= 5.0):
            print("Your overall rating is: ")
            print(rating)
            print(" ")

            def verifytoo():
              global rar
              print('Options are "Yes" or "No".')
              verify2 = input("Is that the rating you would like to have? ")
              print(" ")
              
              if verify2 == ("Yes"):
                rar = False
                accountlist.append("Rating: " + str(rating))
                print(accountlist)
                print("Your done!")
                print(" ")
                simplejson.dump(accountlist, accountpage)
                accountpage.write("\n")
                accountpage.close()
                accountlist.clear()
                ClearConsole()
                app()

              elif verify2 == ("No"):
                print(" ")
                print("Try Again!")
                print(" ")
                accountlist.clear()
                app()

              else:
                print('Invalid Input. Options are "Yes" or "No". Try Again.')
                print(" ")
                verifytoo()
                
            verifytoo()
            
          else: 
            print("One of your inputed numbers was not in the range of 0-5. Try again.")
            print(" ")
            accountlist.clear()
            app()

        rating()
        
      elif verify == ("No"):
        rar = True
        accountlist.clear()
        print("Try Again!")
        print(" ")   
        app()
        
      else:
        print(" ")
        print('Invalid Input. Options are "Yes" or "No". Try Again.')
        rar = True
        print(" ")
        verify1()
        
    verify1()

def ClearConsole():
	os.system('cls' if os.name=='nt' else 'clear')

app()