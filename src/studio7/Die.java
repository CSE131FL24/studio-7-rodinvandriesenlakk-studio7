package studio7;

public class Die {
	private int sides;

	public Die(int n) {
		this.sides = n;
	}
	public int Roll() {
		return (int) (Math.random()*(this.sides) + 1);
	}

	public static void main(String[] args) {
		Die d1 = new Die(6);
		System.out.println(d1.Roll());
	}
}