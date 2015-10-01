import java.util.Scanner;
public class Lab04b {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		boolean loop = true;
		while(loop){
			int choice;
			System.out.println("Level > ");
			choice = s.nextInt();
			int i = 0;
			switch (choice){
			case 1: System.out.println("Physiological");
					loop = false;
					break;
			case 2: System.out.println("Safety\nPhysiological");
					loop = false;
					break;
			case 3: System.out.println("Love and Belonging\nSafety\nPhysiological");
					loop = false;
					break;
			case 4: System.out.println("Esteem\nLove and Belonging\nSafety\nPhysiological");
					loop = false;
					break;
			case 5: System.out.println("Self-Actualization\nEsteem\nLove and Belonging\nSafety\nPhysiological");
					loop = false;
					break;
			default: System.out.println("Not a valid choice, choose again.");
					s.next();
					break;
			}
			
	}
}
}
