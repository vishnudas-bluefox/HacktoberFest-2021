class Stack{
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    
    boolean isEmpty(){
        return (top<0);
    }
    Stack(){
        top =-1;
    }
    
    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println(x+" pushed into stack");
            return true;
        }
    }
    
    void print(){
        for(int i = top;i>-1;i--){
            System.out.print(" "+a[i]);
            
        }
    }
}
class Main{

public static void main(String args[]){
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    System.out.println("Elements of stack is: ");
    s.print();
}
}

