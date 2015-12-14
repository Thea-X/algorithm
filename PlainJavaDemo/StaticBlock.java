/**
*实现在main()方法执行前输出hello world
*/
public class StaticBlock {
	static {
		System.out.println("Hello World");
	}
	public static void main(String[] args){
		System.out.println("main function");
	}
}