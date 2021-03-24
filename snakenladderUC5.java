import java.util.Random;

public class snakenladderUC5 {

	public static void main(String args[]) {

		int position = 0;
		//storing the words in an array to print them later
		String[] storer={"One" ,"Two", "Three" ,"Four","Five","Six"};
        	Random dice = new Random();
		//Using while to repeat until the player wins the game or reaches 100
		while( position < 100 ) {
			//checking if the position is negative if negative return to 0
            		if (position < 0){
                		position = 0;
            			System.out.println(position);
            		}
			//Using random to generate the dice values and option values
			int displayer = dice.nextInt(6);
        		System.out.println(storer[displayer]);


			int ladder_or_snake = dice.nextInt(3);
			int roll = dice.nextInt(6);
			//Using switch to do respective actions 0 for no play, 1 for ladder and 2 for snake
            		switch (ladder_or_snake) {
                		case 0:
                    			System.out.println("No play");
                    			System.out.println(position);
                    		break;
                		case 1:
				//checking if the present roll will give exact 100 or les if not break and do again until perfect 100 is reached
					if (( position + roll) <= 100 ){
                    				System.out.println("Ladder");
                    				position += roll;
                        			System.out.println(position);
                       				break;
					}
					else
						break;
                		case 2:
                    			System.out.println("Snake");
                    			position = position - roll;
                    			System.out.println(position);
                    		break;

                		default :
                    		break;


			}
		}


	}

}
