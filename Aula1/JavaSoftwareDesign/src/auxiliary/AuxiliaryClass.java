package auxiliary;

import main.Interface1;
import main.Interface2;

public class AuxiliaryClass implements Interface1, Interface2 {
	@Override
	public void interfaceMethodTwo() {
		System.out.println("Método dois da interface um");
	}
}
