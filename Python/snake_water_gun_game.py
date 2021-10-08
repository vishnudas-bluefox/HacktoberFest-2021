import random   #builtin module

lst=['s','w','g']
comp_score=0
user_score=0
chances=0

i=1
print("\n================================== SNAKE---WATER---GUN---GAME ==================================")

while(i<=5):

    comp=random.choice(lst)

    x=input("\n\nEnter S for Snake\nEnter W for Water\nEnter G for Gun\nEnter your choice: ") 
    inp=x.lower()
    chances+=1
    if((inp=='s')or(inp=='w')or(inp=='g')):
        print(f"You chooses: {x} and Computer chooses: {comp} ")

        if(comp==inp):
            print("GAME DRAW!")
            print(5-chances,"chances left")

        elif(comp!=inp):
            if((comp=='s' and inp=='w')or(comp=='w'and inp=='g')or(comp=='g'and inp=='s')):
                comp_score += 1
                print("\nCOMPUTER WIN!")
                print(5-chances,"chances left")

            elif((comp=='w' and inp=='s')or(comp=='g'and inp=='w')or(comp=='s'and inp=='g')):
                user_score += 1
                print("\nYOU WIN!")
                print(5-chances,"chances left")
    else:
        print("INVALID INPUT")
        exit()
    i+=1

print("\n\n================================== GAME OVER ==================================")
print("\n\nYour Points: %s\nComputer Points: %s"%(user_score,comp_score))


if(user_score > comp_score):
    print("\nWINNER: YOU ")
elif(user_score < comp_score):
    print("\nWINNER: COMPUTER ")
else:
    print("\nGAME DRAW!!")

