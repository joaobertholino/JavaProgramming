package main;

public class ConcreteClass extends AbstractClass {
//	Properties
	public int password;

//	Constructors
	public ConcreteClass() {
		super();
	}

	public ConcreteClass(int password) {
		super(password);
	}

	//	Behaviors
	@Override
	public int getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String sayHi() {
		return "Hi";
	}

	@Override
	public void interfaceMethodTwo() {
		System.out.println("Método dois da interface um");
	}
}
