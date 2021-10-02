public class CircularLinkedListAllFunction {  
    //Represents the node of list.  
        public class Node{  
            int data;  
            Node next;  
            public Node(int data) {  
                this.data = data;  
            }  
        }  

        //Declaring head and tail pointer as null.  
        public Node head = null;  
        public Node tail = null;  

    //This function will add the new node at the end of the list.  
     public void add(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(head == null) {  
             //If list is empty, both head and tail would point to new node.  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;  
        }  
    }
        //This function will add the new node at the end of the list.  
        public void addAtStart(int data){  
            //Create new node  
            Node newNode = new Node(data);  
            //Checks if the list is empty.  
            if(head == null) {  
                 //If list is empty, both head and tail would point to new node.  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
                //Store data into temporary node  
                Node temp = head;  
                //New node will point to temp as next node  
                newNode.next = temp;  
                //New node will be the head node  
                head = newNode;  
                //Since, it is circular linked list tail will point to head.  
                tail.next = head;  
            }  
        }  
                public void addAtEnd(int data){  
            //Create new node  
            Node newNode = new Node(data);  
            //Checks if the list is empty.  
            if(head == null) {  
                 //If list is empty, both head and tail would point to new node.  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
                //tail will point to new node.  
                tail.next = newNode;  
                //New node will become new tail.  
                tail = newNode;  
                //Since, it is circular linked list tail will points to head.  
                tail.next = head;  
            }  
        }  


        public void addNodeAtCertainIndex(int val, int index){

            Node temp = head;
			int count = 0;
			while(temp!=null && ++count!=index){
			temp = temp.next;
			}
			Node node  = new Node(val);
			Node help=temp.next;
			temp.next=node;
			node.next=help;
        }


    //Deletes node from the beginning of the list  
        public void deleteStart() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether contain only one element  
            //If not, head will point to next element in the list and tail will point to new head.  
            if(head != tail ) {  
                head = head.next;  
                tail.next = head;  
            }  
            //If the list contains only one element  
            //then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  


         //Deletes node from end of the list  
        public void deleteEnd() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether contain only one element  
            if(head != tail ) {  
                Node current = head;  
                //Loop will iterate till the second last element as current.next is pointing to tail  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                //Second last element will be new tail  
                tail = current;  
                //Tail will point to head as it is a circular linked list  
                tail.next = head;  
            }  
            //If the list contains only one element  
            //Then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  

     public void deleteAtCertainData(int data){
           if(head == null) {  
            return;  
        } 

        else{
            if(head!=tail){
                Node current=head;
                 while(current.next != tail && current.next.data!=data) {  
                    current = current.next;  
                }  
                current.next=current.next.next;
            }
        }
     }

  public void deleteAtCertainIndex(int idx){
         if(head == null) {  
           return;
        } 
        else{
            int i=0;
            if(head!=tail){
                Node current=head;
                while(current.next!=tail && i>idx){
                    current=current.next;
                    i++;
                }
                  current.next=current.next.next;
            }
        }
  }

    public void search(int element){
         Node current = head;  
        int i = 1;  
        boolean flag = false;  

         if(head == null) {  
            System.out.println("List is empty");  
        }  


        do{  
                 //Compares element to be found with each node present in the list  
                if(current.data ==  element) {  
                    flag = true;  
                    break;  
                }  
                current = current.next;  
                i++;  
            }while(current != head);  
             if(flag)  
                 System.out.println("Element is present in the list at the position : " + i);  
            else  
                 System.out.println("Element is not present in the list");  
	}
            //Displays all the nodes in the list  
        public void display() {  
            Node current = head;  
            if(head == null) {  
                System.out.println("List is empty");  
            }  
            else {  

                 do{  
                    //Prints each node by incrementing pointer.  
                    System.out.print(" "+ current.data);  
                    current = current.next;  
                }while(current != head);  
                System.out.println();  
            }  
        }  


        public static void main(String[] args) {  
            CircularLinkedListAllFunction cl = new CircularLinkedListAllFunction();  


            cl.addAtStart(1);  
            cl.display();  

            cl.add(2);  
            cl.display();  

            cl.addAtEnd(3);  
            cl.display();  

            cl.addNodeAtCertainIndex(4,2);  
            cl.display(); 

            cl.deleteStart();
            cl.display(); 

            cl.deleteEnd();
            cl.display();

            cl.deleteAtCertainData(3);
            cl.display();

            cl.deleteAtCertainIndex(2);
            cl.display();

            cl.search(4);



        }  
}  
