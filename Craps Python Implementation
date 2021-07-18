
import random
 
CHOICES = ['big', 'small']
INIT_MONEY = 1000
 
 
def bet(int_money):
    """ to play each game """
    str_choice = get_str_choice()
    int_bet_money = get_int_bet_money(int_money)
         # return the number of points of three dice
    list_roll_point = roll_dice()
    str_roll_result = get_str_roll_result(list_roll_point)
 
    if str_choice == str_roll_result:
        print("The points are {}, You Win!".format(list_roll_point))
        int_money += int_bet_money
        print("You gained ${}, you have ${} now.\n".format(int_bet_money, int_money))
    else:
        print("The points are {}, You Lose!".format(list_roll_point))
        int_money -= int_bet_money
        print("You lost ${}, you have ${} now.\n".format(int_bet_money, int_money))
 
    return int_money
 
 
def get_str_choice():
         """Get player selection """
    while True:
        str_choice = input("Big or Small: ").lower()
        if str_choice not in CHOICES:
            print("Invalid Choice")
        else:
            return str_choice
 
 
def get_int_bet_money(int_money):
         """Get player bet """
    while True:
        try:
            int_bet_money = int(input("How much you wanna bet? "))
        except ValueError:
                         Print("sorry, can only be an integer")
            continue
 
        if int_bet_money == 0:
                         Print("No money, don't play!")
        elif int_bet_money > int_money:
            print("No more money!")
        else:
            return int_bet_money
 
 
def roll_dice():
         """Throw the dice and return the dice """
    print("<<<<< ROLL THE DICE! >>>>>")
    list_roll_point = []
    for dice in range(3):
        list_roll_point.append(random.randint(1, 6))
    return list_roll_point
 
 
def get_str_roll_result(list_roll_point):
         """Get the dice result, big or small """
    if 11 <= sum(list_roll_point) <= 18:
        return CHOICES[0]
    else:
        return CHOICES[1]
 
 
def main():
         """ controls the game to start, end, continue """
    print("\n\n" + "<" * 30 + " GAME STARTS! " + ">" * 30)
    print("You have ${} now.\n".format(INIT_MONEY))
    int_money = bet(INIT_MONEY)
 
    while int_money > 0:
        int_money = bet(int_money)
    else:
        print("GAME OVER!")
        if input("press r to restart game:\n") == 'r':
            main()
 
 
main()
