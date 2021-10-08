import java.util.*;
class Node
{
	int data;
	Node next;
}
class QueueLinked
{
	Node first;
	Node last;
	int size;
	public Node getNewNode(int val){
		Node a = new Node();
		a.data = val;
		a.next = null;
		return a;
	}
	public void insert(int val){
		if(last==null){
			first = last = getNewNode(val);
			size++;
			return;
		}
		size++;
		last.next = getNewNode(val);
		last = last.next;
	}
	public boolean isEmpty(){
		if(last==null){
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
		return first.data;
	}
	//for rear element of the queue
	public int getRear(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		return last.data;
	}
	//for removing the element from the queue
	public int remove(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		size--;
		int t = first.data;
		first = first.next;
		if(first==null){
			last = null;
		}
		return t;
	}
	public static void main(String[] args) 
	{
		QueueLinked queue = new QueueLinked();
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

	}
}
