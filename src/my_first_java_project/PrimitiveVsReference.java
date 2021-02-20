package my_first_java_project;

public class PrimitiveVsReference {
	public static void increment(int someInt) {someInt++;}
	public static void increment(int[] someArray) {someArray[0]++;}
	public static void main(String[] args) {
		int primitive = 10;
		//pass by value  (primitive types)
		increment(primitive);
		System.out.println(primitive);
		System.out.println(primitive);
		System.out.println("____________________");
		
		//pass by reference (reference types)
		//References have a typical 
		//size of 4 bytes on 32-bit platforms and 
		//on 64-bits platforms
		int[] ref = new int[25]; //new operator should be used for passing by reference
		ref[0] = 10;
		increment(ref);
		System.out.println(ref[0]);
	}
}
