import java.util.Scanner;
public class Lab04a {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String name;
		int utils=0;
		int buyutil = 0, eatutil = 0, dreamutil =0;
		System.out.println("Enter your name: ");
		name = s.nextLine();
		boolean loop = true;
		while(loop){
			int choice;
			System.out.println("Enter action of " + name + ":");
			Menu();
			choice = s.nextInt();
			switch (choice){
			case 1: System.out.println("How many people? :");
					int buycream = s.nextInt();
					System.out.println("this action caused " + Case1(buycream) + " utils of happiness.");
					buyutil = Case1(buycream);
					break;
			case 2: System.out.println("How many people? :");
					int eatcream = s.nextInt();
					System.out.println("this action caused " + Case2(eatcream) + " utils of happiness.");
					eatutil = Case2(eatcream);
					break;
			case 3: System.out.println("How many people? :");
					int dreamcream = s.nextInt();
					System.out.println("this action caused " + Case3(dreamcream) + " utils of happiness. That was a pretty dank dream though. I'm hungry now.");
					dreamutil = Case3(dreamcream);
					break;
			case 4: System.out.println("Oh gee you died. Well I guess its time to see if you get a present from Santa!");
					System.out.println(name + " caused " + Case4(buyutil, eatutil, dreamutil) + " utils of happiness.");
					int karma = Case4(buyutil, eatutil, dreamutil);
					System.out.println("This was a morally " + Life(karma) + " life.");
					loop = false;
					break;
			default: System.out.println("Not a valid choice, choose again.");
					s.next();
					break;
			}
			
		}
	}
	public static void Menu(){
		System.out.println("(1) - Buy people ice cream\n(2) - Steal ice cream from people\n(3) - Dream about people eating ice cream\n(4) - Die");
	}
	public static int Case1(int buycream){
		int utils = 0;
		utils = utils + buycream*3;
		return utils;	
	}
	public static int Case2(int eatcream){
		int utils = 0;
		utils = utils - eatcream*5;
		return utils;	
	}
	public static int Case3(int dreamcream){
		int utils = 0;
		utils = utils + dreamcream*0;
		return utils;	
	}
	public static int Case4(int buycream, int eatcream, int dreamcream){
		int karma = buycream + eatcream + dreamcream;
		return karma;	
	}
	public static String Life(int karma){
		if( karma > 0){
			return "good";
		}
		else if (karma < 0){
			return "bad";
		}
		else{
			return "neutral";
		}
	}
}
