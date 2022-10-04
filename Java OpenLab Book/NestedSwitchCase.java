package smartgraduates;

public class NestedSwitchCase {

	public static void main(String[] args) {
		int month=2;
		int day=1;
		
		switch(month) {
		case 1:
		System.out.println("This is Jan");
		break;
		case 2:System.out.println("Thss is feb month");
			switch(day) {
			case 1:
				System.out.println(" Its Sunday");
				break;
			case 2:
				System.out.println("   Its Monday");
			}
		}

	}

}
