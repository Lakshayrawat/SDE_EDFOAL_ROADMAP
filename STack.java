package Stack__queues;

public class STack {
	int stack[] = new int[5];
	int top =0;
	
	//To add element in the stack
	public void push(int data) {
		
		stack[top]=data;
		top++;
		
	}

	//To print the stack
	public void show() {
		for(int n: stack) {
			System.out.println(n);
		} 
	}
	
	//To delete the element from the stack
	public int pop() {
		int data;
		top--;
		data= stack[top];
		stack[top]=0;
		
		return data;
	}
	
	//To check top element of the stack
	public int peek() {
		int data;
		data= stack[top-1];
		return data;
	}
	
	//It will give size of the stack
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
}
