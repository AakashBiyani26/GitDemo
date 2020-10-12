
public class exceptiondemo {
	
	int b=7;
	int c=0;
	int k=b/c;
	
	public void getdata() {
		System.out.println(k);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if i am not sure whether particular lines of code will give error or not. if they throw an error i need to
		//catch them and throw a message without failing the code.if people suspect code might throw an error then
		//they try to catch an error.
		int b=7;
		int c=0;
		try
		{
			int k=b/c;
			System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println("i catched exception");
		}
		
		//automation perspective : lets say on a ecommerce website, a pop up comes up only during christmas (saying 
		//its a special day. but when christmas ends and pop up doesnot comes for normal automation code with catching 
		//exception the script will fail but if we write an exception saying it is not a special day the script will skip
		// and we will catch that exception as it is not a special day so that script will not fail. to skip that
		//failure write try catch exception.
		
		//one try can be followed by multiple catch blocks. catch should be an immediate block after try.
		
		
		
		
		
				

	}

}
