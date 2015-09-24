import java.util.Scanner;
public class Lab03b {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		int b = 0;
		
		boolean loop = true;
		while(loop){
			System.out.println("Enter number bottles of root beer on the wall (1 to 99) > ");
			
			if(s.hasNextInt()){
				b = s.nextInt();
				if(b > 0 || b < 100){
					for(int i = b; i > 0; i--){
						for(int j = 0; j < i; j++){
							System.out.print("R");
						}
						System.out.println("");
					}
					System.out.println("NO MORE BOTTLES OF ROOT BEER ON THE WALL");
					loop = false;
				}
				else{
					System.out.print("Num must be > 0 and < 100 !");
				}
			}
			else{
				System.out.print("Enter an integer!");
				s.next();
			}
		}
	}

}
