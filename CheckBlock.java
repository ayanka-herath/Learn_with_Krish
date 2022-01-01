class CheckBlock
{
	{
		System.out.println("Hello, I am coming from empty block");
	}
	
	{
		System.out.println("Hello, I am coming from empty block2");
	}
	
	static
	{
		System.out.println("Hello, I am coming from static block");
	}
	
	CheckBlock()
	{
		System.out.println("Hello, I am coming from constructor");
	}
	
	CheckBlock(int x)
	{
		System.out.println("Hello, I am coming from constructor");
	}
	
	public static void main(String[] args)
	{
		CheckBlock obj = new CheckBlock();
		CheckBlock(2);
	}
}