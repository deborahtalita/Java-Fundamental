package example;

import java.util.*;

interface Stack<T>{
	void push(T o);
	T pop();
}

public class ArrayListStack<T> implements Stack<T> {
	private ArrayList<T> stack = new ArrayList<T>();
	
	public void push (T o) {
		stack.add(o);
	}
	
	public T pop() {
		T top = null;
		if(stack.isEmpty()) {
			//System.out.println("List is empty! Nothing to remove.");
			throw new IllegalStateException();
		}
		 else {
			 top = stack.remove(stack.size() - 1);
			 return top;
		 }
		
	}
	
	public static void main(String[] args) {
		ArrayListStack<Integer> stk = new ArrayListStack<Integer>();
		stk.push(5);
		stk.push(7);
		stk.push(11);
		System.out.println(stk.pop());
	}

}
