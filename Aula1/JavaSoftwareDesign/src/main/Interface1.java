package main;

public interface Interface1 {
	boolean INTERFACE_VAR = true;

	default void interfaceMethodOne() {
		System.out.println("Método um, da interface um");
	}

	void interfaceMethodTwo();
}
