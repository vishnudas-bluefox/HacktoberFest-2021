from gtts import gTTS  
from playsound import playsound
from tkinter import *
import os
window=Tk()
window.geometry("600x400")
window.configure(bg='darkgrey')
window.title("python text to speech system")

Font_tuple1 = ("Comic Sans MS", 20, "bold")
Font_tuple2 = ("Comic Sans MS", 15, "bold")
Label(window, text = "TEXT-TO-SPEECH SYSTEM", font = Font_tuple1, bg='black',fg='white').pack()
Label(text ="Designed by @maan", font = Font_tuple2 , bg ='black' , fg='white', width = '20').pack(side = 'bottom')

Msg = StringVar()
Label(window,text ="ENTER TEXT :", font = Font_tuple2, bg='darkgrey',fg='black').place(x=20,y=70)

entry_field = Entry(window, textvariable = Msg ,font=Font_tuple2, width='45')
entry_field.place(x=20,y=120)

def Text_to_audio():
    Message = entry_field.get()
    speech = gTTS(text = Message)
    speech.save('random.mp3')
    playsound('random.mp3')
    os.remove('random.mp3')

def Exit():
    window.destroy()

def Reset():
    Msg.set("")

Button(window, text = "PLAY TEXT", font = Font_tuple2 , command = Text_to_audio ,width = '10',bg='darkgrey').place(x=60,y=240)

Button(window, font = Font_tuple2,text = 'RESET TEXT', width = '11' , command = Reset, bg='darkgrey').place(x=250 , y = 240)

Button(window, font = Font_tuple2,text = 'EXIT', width = '5' , command = Exit, bg = 'OrangeRed1').place(x=470 , y = 240)

window.mainloop()