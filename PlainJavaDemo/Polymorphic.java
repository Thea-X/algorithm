public class Polymorphic {
	//构造方法可以调用普通方法
	public static void main(String[] args){
		Base b = new Derived();
		b.g();
		b.f();
	}
}

class Base {
	public Base(){
		g();
	}

	public void f() {
		System.out.println("Base f()");
	}

	public void g(){
		System.out.println("Base g()");
	}
}

class Derived extends Base {
	public void f(){
		System.out.println("Derived f()");
	}

	public void g(){
		System.out.println("Derived g()");
	}
}