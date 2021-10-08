import pickle
 
#file_name to be used wherever required
file_name = 'data.dat'
 
#function to create and initialise the binary file
 
 
def  create_blank_file( ):
   f = open(file_name, 'wb')
   f.close()
 
# function to  input the values from user and return the record
def  input_rec( ):
   rec={}
   rec['rollno'] = input('Enter Roll No')
   rec['name'] = input('Enter name')
   rec['marks'] = int(input('Enter marks'))
   return rec
 
# function to  add record into file input the values from user and return the record
def  add_record( ):
   lst=[]
   #Load all records into list
   f = open(file_name,'rb')
   while True:
     try:
       lst.append(pickle.load(f))
     except:
       break
  
   f.close()
 
   #Add new record into list
   rec=input_rec()
   lst.append(rec)
 
   #Save all records to file
   fout = open(file_name,'wb')
   for rec in lst:
       pickle.dump(rec,fout)
 
   fout.close()
 
 
# function to show the values to display
def  show_rec(rec):
   output='{0},{1},{2}'.format(rec['rollno'], rec['name'], rec['marks'])
   print(output)
 
#function to show the All records of binary file
 
def  show_all( ):
   fin = open(file_name , 'rb')
   while True:
     try:
       rec=pickle.load(fin)
       show_rec(rec)
     except:
       break
   fin.close( )
 
# function to input rollno , marks and update the marks
 
def update_marks( ):
   f = open(file_name, 'rb')
   rno = input('Enter Rollno')
   l = []      #List of records to hold data in memory
   found=False
   while True:
     try:
       rec=pickle.load(f)
       if rec['rollno'] == rno:
           found=True
           print('The old record:')
           show_rec(rec)
           m = int(input('Enter new marks'))
           rec['marks'] = m   #update record in memory
          
       l.append(rec)  # Add all records in list including updated
     except:
       break
   f.close()  #Close for reading
 
   if found:    #if record updated
       fout = open(file_name,'wb')
       for rec in l:
               pickle.dump(rec,fout)  # Store the record
 
       fout.close( )
 
def menu():
 print('1. Create File for data store')
 print('2. Add Record')
 print('3. Show Records')
 print('4. Update Marks')
 print('5. Exit')
 ch = input('Enter your response:')
 if ch in '12345':
   return int(ch)
 else:
   return 0
 
def main( ):
 functions=[create_blank_file,add_record,show_all,update_marks]
 exit_option = 5
 while(True):
   ch=menu()
   if ch == exit_option:
     break
   if ch > 0 and ch < 6:
     func = functions[ch-1]
     func( )
 
 

