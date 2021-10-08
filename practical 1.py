#Develop the python programme to read a text file ‘ABC.TXT’ line by line and show the words separated by ‘#’
def create_file():
    f=open("ABC.txt","w")
    line=input("enter the line:")
    while len(line)>0:
        print(line,file=f)
        line=input("enter the line:")
    f.close()
def show_content():
    f=open("ABC.txt","r")
    a=f.readlines()
    for i in a:
        words=a.split()
        print(word,sep="#")
    f.close()
def main():
    create_file()
    show_content()
main()
