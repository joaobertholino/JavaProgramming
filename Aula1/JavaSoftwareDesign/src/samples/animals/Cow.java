package samples.animals;

public class Cow extends Mammal implements Terrestrial {

	@Override
	public String born() {
		return "Vaca nascendo";
	}

	@Override
	public String eat() {
		return "Vaca comendo";
	}

	@Override
	public String growls() {
		return "Vaca mugindo";
	}

	@Override
	public String reproduces() {
		return "Vaca reproduzindo";
	}

	@Override
	public String die() {
		return "Vaca morrendo";
	}

	@Override
	public String walk() {
		return "Vaca andando";
	}
}
