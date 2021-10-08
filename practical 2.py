def create_file():
    story='''                             The lion and the rabbit
Once there lived a ferocious lion in the jungle who mercilessly killed many animals to satisfy his hunger.
The animals of the forest were worried that soon there would be no animals left. They decided that each day they would offer one animal for the lion to kill.
When it was the turn for an old wise rabbit, he devised a clever plan. He took his own time to reach the lion, who was furious to have been kept waiting.
He told the lion that on his way another ferocious lion who claimed to be the king of the jungle had eaten up five other rabbits who were to be the lion’s dinner.
The lion was surprised that there could be another king and demanded to see this other lion.
The rabbit took him to a well and told him that the other lion lived inside. The lion looked into the well and saw his own reflection in the water and believed it
was the other lion. He jumped into the well to kill it, but only drowned in the water. The witty rabbit had saved all the animals of the jungle.

Moral of the story: It is important to focus on the solution rather than the problem. If you focus right, you can come up with a smart way to face the challenge.'''
    f=open('panchantra.txt','w')
    f.write(story)
    f.close()
def show_file():
    f=open("panchantra.txt","r")
    content=f.read()
    f.close()
    print(content)
word=input("enter the word to count:")
def count_word(word):
    f=open("panchantra.txt","r")
    content=f.read()
    f.close()
    cnt=content.count(word)
    print("count of words",word,"=",cnt)
def main():
    create_file()
    show_file()
    count_word(word)
main()
