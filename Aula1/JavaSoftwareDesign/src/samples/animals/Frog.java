package samples.animals;

public class Frog extends Amphbian {

	@Override
	public String swin() {
		return "Sapo nadando";
	}

	@Override
	public String born() {
		return "Sapo nascendo";
	}

	@Override
	public String eat() {
		return "Sapo comendo";
	}

	@Override
	public String growls() {
		return "Sapo fazendo barulho";
	}

	@Override
	public String reproduces() {
		return "Sapo reproduzindo";
	}

	@Override
	public String die() {
		return "Sapo morrendo";
	}

	@Override
	public String walk() {
		return "Sapo andando";
	}
}
