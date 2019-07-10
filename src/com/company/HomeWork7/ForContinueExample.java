package module4;

public class ForContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i > 5) {
				System.out.print("\n" + i + " больше 5");
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
