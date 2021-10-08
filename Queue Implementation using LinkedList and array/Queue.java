import java.util.*;
class Queue
{
	int MAX = 5;
	int front = 0;
	int rear = -1;
	int size = 0;
	int[] a = new int[MAX];
	//check queue is full or not
	public boolean isFull(){
		if(size==MAX){
			return true;
		}
		return false;
	}
	public void insert(int val){
		if(isFull()){
			System.out.println("Queue is full remove some element");
			return;
		}
		rear = (rear+1)%MAX;
		size++;
		a[rear] = val;
	}
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;
	}
	//for size of queue
	public int getSize(){
		return size;
	}
	//for front of the queue
	public int getFront(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		return a[front];
	}
	//for rear element of the queue
	public int getRear(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		return a[rear];
	}
	//for removing the element from the queue
	public int remove(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		front = front % MAX;
		size--;
		return a[front++];
	}
	public static void main(String[] args) 
	{
		Queue queue = new Queue();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		System.out.println("Size of queue:"+queue.getSize());
		System.out.println("Front of queue:"+queue.getFront());
		System.out.println("Rear of queue:"+queue.getRear());
		//removing the element
		System.out.println("Removed Element: "+queue.remove());
		System.out.println("Size of queue:"+queue.getSize());
		System.out.println("Front of queue:"+queue.getFront());
		System.out.println("Rear of queue:"+queue.getRear());
		queue.insert(6);
		System.out.println("Size of queue:"+queue.getSize());
		System.out.println("Front of queue:"+queue.getFront());
		System.out.println("Rear of queue:"+queue.getRear());
	}
}
