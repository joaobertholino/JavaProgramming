package samples.animals;

public class Whale extends Mammal implements Acquatic {
	@Override
	public String born() {
		return "Baleia nascendo";
	}

	@Override
	public String eat() {
		return "Baleia comendo";
	}

	@Override
	public String growls() {
		return "Baleia fazendo barulho";
	}

	@Override
	public String reproduces() {
		return "Baleia reproduzindo";
	}

	@Override
	public String die() {
		return "Baleia morrendo";
	}

	@Override
	public String swin() {
		return "Baleia nadando";
	}
}
