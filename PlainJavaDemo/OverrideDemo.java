/**
 * 编译错误，函数不能通过返回值区分
 */
class Super {
	public int f(){
		return 1;
	}
}

class SubClass extends Super {
	public float f(){
		return 2f;
	}
}

public class OverrideDemo {
	public static void main(String[] args){
		Super s = new SubClass();
		s.f();
	}
}