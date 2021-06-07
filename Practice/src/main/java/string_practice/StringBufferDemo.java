package string_practice;

public class StringBufferDemo {

	public static void main(String[] args) {
	/*	StringBuffer buff = new StringBuffer("Hello");
		System.out.println("Buffer: "+buff);
		System.out.println("Length: "+buff.length());
		System.out.println("Capacity: "+buff.capacity());
		/*The java. lang. StringBuffer. capacity() method returns the current capacity.
		 * The capacity is the amount of storage available for newly inserted characters, 
		 * beyond which an allocation will occur.
		
		buff = new StringBuffer("Java");
		System.out.println("Buffer: "+buff);
		System.out.println("Length: "+buff.length());
		System.out.println("Capacity: "+buff.capacity());
		*/
		
		 // StringBuffer length vs. capacity.
	      StringBuffer buffer = new StringBuffer("Hello");
	      System.out.println("buffer = " + buffer);
	      System.out.println("length = " + buffer.length());
	      System.out.println("capacity = " + buffer.capacity());

	      // appending and inserting into StringBuffer.
	      /*The insert() method of the Java StringBuffer class is used to insert
	       the given string at the specified index. 
	       *There are various overloaded insert(index, "text") methods available in StringBuffer class.*/
	      String s;
	      int a = 42;
	      buffer = new StringBuffer(40);
	      s = buffer.append("a = ").append(a).append("!").toString();
	      System.out.println(s);

	      buffer = new StringBuffer("I Java!");
	      buffer.insert(2, "like ");
	      System.out.println(buffer);
	      
	      buffer = new StringBuffer("I");
	      buffer = buffer.append(" love").append(" You");
	      System.out.println(buffer);
	}

}
