#printing pattern 1,4,13,40,121. . . .

#---Recursive function---
def recurivefun(n):
    if n==1 :
        return 1
    else :
        #recursive function
        return 3*recurivefun(n-1)+1
    


#---main---
n = int(input("Enter number : ")) #get user inputs
while n!=-1: #checking if input value is not equal to -1
    #if input is not equals to -1 pass it to the function
    recurivefun(n) 
    #printing the output
    print("Output:",recurivefun(n))
    #asking user to input another integer value
    n = int(input("Enter number  : "))
print("Output: Finished") #ending the loop


