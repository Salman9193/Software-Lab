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
		System.out.println(Runtime.getRuntime().freeMemory());
		int d[]={2,4,6,8};
		int e[]={3,5,7,8};
		System.out.println(Runtime.getRuntime().freeMemory());
		System.gc();
		
		System.out.println(Runtime.getRuntime().freeMemory());
		assignment t = new assignment();
		System.out.println(Runtime.getRuntime().freeMemory());
System.gc();
		
		System.out.println(Runtime.getRuntime().freeMemory());
	}
}
