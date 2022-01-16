package project;

import java.util.Iterator;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> l=new LinkedList<>();
l.add("hello every one");
l.add("ravi");
l.add("raju");


Iterator<String> ll=l.iterator();
while(ll.hasNext()) {
	System.out.println(ll.next());
}
	}

}
}
