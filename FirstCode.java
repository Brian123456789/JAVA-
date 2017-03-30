
//Download JDK from http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
//open up a cmd window and type:
//C:\Users\brian\java programs>set path="C:\Program Files\Java\jdk1.8.0_121\bin"
//in cmd window type:javac when you see the list, javac compiler is working.
//in cmd window type: javac FirstCode.java
//then type in command window: java FirstCode
//Rule: when compiling, use file name, when running program use class name.
//the result should be: Hello


class FirstCode

//In Java everything must belong to a class. Start by making your program a class 
//by using the class keyword. 

	{
		public static void main (String a[ ])

//use static because it means the following pertains to a class. (String a[ ]) is added because java //will use an array to accomplish the work you are asking it to do in your program.
//Java runs on JVM, Java Virtual Machine. It will ask for a main method, which is main. Since our
//program returns no value, we add void to the line.

		{

			System.out.print ("Hello");

//System denotes an in-built method. This means it is part of java and we do not have to code a //special method. We just use the System keyword to access our methos and its objects.
//.out is an out object, and the print method belongs to this object.

		}
	}