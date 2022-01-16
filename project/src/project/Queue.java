package project;
import java.util.LinkedList;
import java.util.*;
public class Queue {

	public static void main(String[] args)
	{
	Queue<String> queue = new LinkedList<>();
	queue.add("Kolkata");
	queue.add("Patna");
	queue.add("Delhi");
	queue.add("Gurgaon");
	queue.add("Noida");
	System.out.println( queue);
	        		System.out.println( queue.peek());
	        		queue.remove();
	        		System.out.println("After removing  " + queue);
	        		System.out.println("Size of Queue : " + queue.size());
	    	}
	}

