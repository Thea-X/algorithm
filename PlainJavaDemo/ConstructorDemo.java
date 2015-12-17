class Base{
	private String name;
	public Base(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}

class Child extends Base{
	String address;

	public Child(String address,String name){
		super(name);
		this.address = address;

	}
}

public class ConstructorDemo {
	public static void main(String[] args){
		Base base = new Base("nnn");
		System.out.println(base.getName());
	}
}