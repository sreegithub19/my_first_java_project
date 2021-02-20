package my_first_java_project;

public class default_values {
//	for global variables, they are initialized 
//	by default (depending on the data type of the global variable)
//	eg: 0,false, null( null is for reference type variable(eg:string))
	// for commenting a group of individual lines, press 'command' + '/'
	static int count;
	
	public static void main(String[] args) {
		//no default initialization for local variables
		int i; 
		//System.out.println(i);   //(shows error for static int also)
		System.out.println(count);  //shows 0
		
		
		//3rd type of comments( javadoc comments) for official documentation as comments in the code
		// /**
		// *
		// *
		// */
		
		
		//if(0)   -> this is wrong in java, 
		//it should be strictly boolean parameter 
		//( though c++ allows this)
		
	}
}
