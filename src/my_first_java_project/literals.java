package my_first_java_project;

public class literals {
	public static void something(long l) {
		System.out.println(l+10);
	}
	public static void something(int l) {
		System.out.println(l-10);
	}
	public static void main(String args[]) {
		// . in the literal indicates double/float
		// long is followed by 'L' eg: 10L (10l is also legal)
		// anything in ' ' is char
		//int is just numbers
		//octal is starting with 0
		// hexadecimal is starting with 0x
		
		something (10L);    //prints 20
	}
}
