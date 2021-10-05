import mysql.connector
con=mysql.connector.connect(host='localhost',password='Sachin2002',user='root',database='mysql')
cur=con.cursor()
def input_record():
    while True:
        no=int(input("Book No  :"))
        nm=input("Enter Book name   :")
        p=int(input("Enter Price   :"))
        query= ''' INSERT INTO CompSci
                 VALUES({},"{}",{})'''.format(no,nm,p)
        cur.execute(query)
        con.commit()
        ch=input("You want to continue?(y/n)")
        if ch=="n":
              break
      
def update_price():
      no=int(input("BOOK NO  :"))
      p=int(input("Enter Price   :"))
      sql=""" UPDATE CompSci 
              SET Price={}
              WHERE bookno={}""".format(p,no)
      cur.execute(sql)
      con.commit()

def show_record():
      query="""SELECT *
               FROM CompSci"""
      cur.execute(query)
      data=cur.fetchall()
      for i in data:
            print(i)

def delete_record():
        no=int(input("BOOK NO  :"))
        query="""DELETE FROM CompSci
                 WHERE bookno={}""".format(no,)
        cur.execute(query)
        con.commit()
        
def menu():
      print("1. Input Records")
      print("2. Show Records")
      print("3. Update Records")
      print("4. Delete Records")
      print("5. Exit")
      ch=int(input("Enter Your Choice from 1 to 5   :"))
      if ch==1:
         input_record()
         return menu()
      if ch==2:
         show_record()
         return menu()
      if ch==3:
         update_price()
         return menu()
      if ch==4:
         delete_record()
         return menu()
      else:
         print("Thank You For Choosing our System.....")
menu()
