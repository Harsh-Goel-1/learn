package DSA;

import java.util.Stack;
public class stacks {

	public static void main(String[] args) {
		
		//data structure is a named location used to store and organize data
		//algorithm is collection of steps to solve a problem
		
		//stack is a LIFO data structure stands for last in first out
		//data stored like a stack of books
		//push() to add to the top
		//pop() to remove from the top
		
		Stack<String> stack= new Stack<String>();
		System.out.println(stack.empty());
		stack.push("Bike Trackzz");
		stack.push("Super Mario");
		stack.push("Minecraft");
		stack.push("Doom");
		stack.push("borderlands");
		stack.push("final fantasy VII");
		
		stack.pop();
		stack.add(1,"Virus");
		//stacks internally use array instead of linkedlist
		String i= stack.pop();
		System.out.println(stack.empty()+"\n"+i);
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println("\n"+stack.search("minecraft"));
		System.out.println(stack.search("Minecraft"));//from the top
		
		//this produes java.lang.OutOfMemoryError: Java heap space 
		/*
		 	for(int x=0;x<1000000000;x++) {
				stack.push("Skyrim");
			}
		*/
		
		//uses of stacks?
		//1. undo/redo features
		//2. backtracking algorithms(maze,directories)
		//3. calling function(call stack) -- don't sweat on this one pls
	}

}
