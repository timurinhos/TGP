package module4;


public class ForBreakExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i > 5) {
				System.out.println("\nВыходим из цикла");
				break;
			}
			System.out.print(i + " ");
		}
	}

}
