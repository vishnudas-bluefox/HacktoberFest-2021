import time
import random

board={                                                            #dict for board 
    1:' ', 2:' ', 3:' ',    
    4:' ', 5:' ', 6:' ',
    7:' ', 8:' ', 9:' '
}

def game():                                                       # main game loop
    global player
    global bot
    print("#######################################################")
    print("TIC TAC TOE")
    print("#######################################################")
    display(board)
    print("Positions are as follow:")
    print("1, 2, 3 ")
    print("4, 5, 6 ") 
    print("7, 8, 9 ")
    print("\n")
    
    
    try:                                                           
        player=input("What do you wanna play with? ( o / x ): ")
        player.lower()
    
    except ValueError:
        print("PLEASE ENTER A VALID OPTION !")
        time.sleep(2)
        player=input(("What do you wanna play with? ( o / x ): "))
        player.lower

    while True:
        if player != "o" and player!="x" and player!="O" and player!="X" :
            print("\n")
            print("PLEASE ENTER A VALID OPTION !")
            time.sleep(2)
            player=input(("What do you wanna play with? ( o / x ): "))
            player.lower
        else:
            break
    
    print("\n\nBOT GOES FIRST ")
    if player=='x':
        bot='o'
    else:
        bot='x'
    
    
        

def display(board):                                     #displays board
    print("\n")
    print(board[1]+' | '+board[2]+' | '+board[3])
    print("--+---+--")
    print(board[4]+' | '+board[5]+' | '+board[6])
    print("--+---+--")
    print(board[7]+' | '+board[8]+' | '+board[9])
    print("\n")

def spaceIsFree(position):                              #checks for free space
    if board[position] == ' ':
        return True
    else:
        return False




def draw_checker():                                   #checks for draw
    for i in board.keys():
        if board[i] == ' ':
         return False
    
    return True

def win_checker():                                                #checks for winner
    if (board[1] == board[2] and board[1] == board[3] and board[1] != ' '):
        return True
    elif (board[4] == board[5] and board[4] == board[6] and board[4] != ' '):
        return True
    elif (board[7] == board[8] and board[7] == board[9] and board[7] != ' '):
        return True
    elif (board[1] == board[4] and board[1] == board[7] and board[1] != ' '):
        return True
    elif (board[2] == board[5] and board[2] == board[8] and board[2] != ' '):
        return True
    elif (board[3] == board[6] and board[3] == board[9] and board[3] != ' '):
        return True
    elif (board[1] == board[5] and board[1] == board[9] and board[1] != ' '):
        return True
    elif (board[7] == board[5] and board[7] == board[3] and board[7] != ' '):
        return True
    else:
        return False


def insert(sign,position):              #insert user choice into playing board
        board[position]=sign
        time.sleep(1)
        print(display(board))
        if win_checker():
            print("%s wins!" %(sign))
            time.sleep(3)
            quit()

        elif draw_checker():
            print("Its a Draw")
            time.sleep(3)
            quit()
        

def player_move():                      #takes choice from user

    try:
        player_position=int(input("Enter the position where you wanna enter: "))
        if spaceIsFree(player_position):
            insert(player,player_position)
            
        elif not spaceIsFree:
            print("Postition already Taken!")
            player_move()
        else:
            print("Enter a valid position! ")
            time.sleep(1)
            player_move()

    except ValueError:
        print("Please only inter a valid position!")
        time.sleep(1)
        player_move()
    

    

def bot_move():                         #randomize choice from bot
    bot_position=random.randint(1,9)
    if spaceIsFree(bot_position):
        insert(bot,bot_position)

    else:
        bot_move()






    
game()           
while not win_checker():          #MAIN GAME LOOP
    bot_move()
    player_move()
    
    









