package q12;

public class Parent {
	

	    int field1 = 1;
	    final int field2 = 2;

	    Parent() {
	        field1 = 2; // OK
	        field2 = 3; // Compilation error
	    }

	}

