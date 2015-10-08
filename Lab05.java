import java.util.Scanner;
import java.util.Random;
public class Lab05 {
	public static void main(String[] args){
		
		int iter = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("welcome to the DiceRoll program. Enter the number of times you wish to roll 2 dice.");
		iter = s.nextInt();
		DiceRoll(iter, 6);
		s.close();
	}
	public static void DiceRoll(int iter, int digit){
		Random d = new Random(iter);
		double two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0,ten=0,eleven=0,twelve=0;
			for (int i = 0; i<iter; i++){
				int die1 = d.nextInt(digit)+1;
				int die2 = d.nextInt(digit)+1;
				int sum = die1 + die2;
				if(sum==2){
		    		two++;
		    	}
		    	else if(sum==3){
		    		three++;
		    	}
		    	else if(sum==4){
		    		four++;
		    	}
		    	else if(sum==5){
		    		five++;
		    	}
		    	else if(sum==6){
		    		six++;
		    	}
		    	else if(sum==7){
		    		seven++;
		    	}
		    	else if(sum==8){
		    		eight++;
		    	}
		    	else if(sum==9){
		    		nine++;
		    	}
		    	else if(sum==10){
		    		ten++;
		    	}
		    	else if(sum==11){
		    		eleven++;
		    	}
		    	else{
		    		twelve++;
		    	}
			}
			System.out.print("The probability of getting a sum of \n2:" + two/iter + "\n3:" + three/iter + "\n4:" + four/iter + "\n5:" + five/iter + "\n6:" + six/iter + "\n7:" + seven/iter + "\n8:" + eight/iter + "\n9:" + nine/iter + "\n10:" + ten/iter + "\n11:" + eleven/iter + "\n12:" + twelve/iter);
		}
	}

