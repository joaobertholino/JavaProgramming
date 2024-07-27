package auxiliary;

import main.*;

public class AuxiliaryTester {
	public static void main(String[] args) {
		ConcreteClassOne ccOne = new ConcreteClassOne();
		System.out.println(ccOne.getPasswordClassOne());

		ConcreteClassTwo ccTwo = new ConcreteClassTwo();
		System.out.println(ccTwo.getPasswordClassOne());

		System.out.println();

		AbstractClass acOne = new ConcreteClass();
		System.out.println(acOne.password);
		System.out.println(acOne.getPassword());
		System.out.println(acOne.sayHi());
		System.out.println(acOne.INTERFACE_VAR);

		ConcreteClass ccThree = new ConcreteClass();
		System.out.println(ccThree.password);
		System.out.println(ccThree.getPassword());
		System.out.println(ccThree.sayHi() + "\n");
		System.out.println(ccThree.INTERFACE_VAR);

		AuxiliaryClass aux = new AuxiliaryClass();
		System.out.println(aux.INTERFACE_VAR);
		aux.interfaceMethodOne();
		aux.interfaceMethodTwo();

		System.out.println();

		System.out.println(Tools.printOptional());
		Tools.optional = 'D';
		System.out.println(Tools.printOptional());

		System.out.println(Tools.display("Um texto qualquer"));
		System.out.println(Tools.display("Um texto qualquer", 5.876));
	}
}
