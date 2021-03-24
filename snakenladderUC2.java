import java.util.Random;

public class snakenladderUC2 {

	public static void main(String args[]) {
		//Initializing the position variable
		int position = 0;
		//Using storer array to prin it later
		String[] storer={"One" ,"Two", "Three" ,"Four","Five","Six"};
        	Random dice = new Random();
		//Generating a random value to match the dice
		int roll = dice.nextInt(6);
		//printing the respective dice value
        	System.out.println(storer[roll]);



	}

}

