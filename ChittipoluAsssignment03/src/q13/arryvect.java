package q13;
import java.io.*;
import java.util.*;

public class arryvect {

		public static void main (String[] args)
		{
			// creating an ArrayList
			ArrayList<String> al = new ArrayList<String>();

			// adding object to arraylist
			al.add("hello");
			al.add("world");
			al.add("hi");
			al.add("how are you");

			// traversing elements using Iterator'
			System.out.println("ArrayList elements are:");
			Iterator it = al.iterator();
			while (it.hasNext())
				System.out.println(it.next());

			// creating Vector
			Vector<String> v = new Vector<String>();
			v.addElement("Practice");
			v.addElement("java");
			v.addElement("code");

			// traversing elements using Enumeration
			System.out.println("\nVector elements are:");
			Enumeration e = v.elements();
			while (e.hasMoreElements())
				System.out.println(e.nextElement());
		}
	}



