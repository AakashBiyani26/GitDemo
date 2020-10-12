
public class childclass extends parentclass {
	
	public void engine ()
	{
		System.out.println("new engine");
		
	}
	
	public void colour ()
	{
		System.out.println(colour);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		childclass cd = new childclass();
		cd.colour();
		cd.brakes();
		

	}

}
