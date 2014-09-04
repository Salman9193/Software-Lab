package softwarelab;

public class assignment {

	int multiply(int a,int b)
	{
		if(a==1)
		{
			return b;
		}
		else if(b==1)
		{
			return a;
		}
		else
		{
			return a*b;
		}
		
	}
	int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		assignment a = new assignment();
		//System.out.println(a.add(3, 7));
		//System.out.println(a.multiply(1, 1));
	}
}
