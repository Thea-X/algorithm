public class InitOrder {
	/**
	*	我不能理解为什么 Test 和 contructor两个字符串都没有打印出来
	*/

	{
		System.out.println("Test");
	}

	public InitOrder(){
		System.out.println("contructor!");
	}

	public static void main(String[] args){
		System.out.println("main");
	}
}