import java.util.Random;

public class snakenladderUC7 {

    public static void main(String[] args) {
        //Declaring and initializing first player' stuff
        int player_one_position =0;
        int player_one_dice_counter = 0;
        //Declaring and initializing second player' stuff
        int player_two_position =0;
        int player_two_dice_counter = 0;

        String[] storer={"One" ,"Two", "Three" ,"Four","Five","Six"};
        Random dice = new Random();
        //Using while to loop Until winner is found
        while( player_one_position < 100 && player_two_position < 100 /*Win condition is if the player reaches 100 */ ) {
            //Checking if player 1's is negative if zero reset it to 0
            if (player_one_position < 0){
                player_one_position = 0;

            }
            //Checking if player 2's is negative if zero reset it to 0
            if (player_two_position < 0){
                player_two_position = 0;
            }
            //rolling dice for player one and two

            int player_one_roll = dice.nextInt(6);
            int player_two_roll = dice.nextInt(6);

            //Using random to generate play options for both players
            int ladder_or_snake_player_one = dice.nextInt(3);
            int ladder_or_snake_player_two = dice.nextInt(3);
            //Using switch to move player accordingly
            switch (ladder_or_snake_player_one) {
                //No play case
                case 0:
                    System.out.println("Player One : No play");
                    System.out.println("Player 1's current position:"+player_one_position);
                    player_one_dice_counter += 1;
                    break;

                case 1:
                    //Ladder Case
                    System.out.println("Player One : Ladder");
                    //Checking the condition for perfect 100 score
                    if ((player_one_position + player_one_roll ) <= 10 ){

                        player_one_dice_counter += 1;
                        player_one_position += player_one_roll;
                        System.out.println("Player 1's :"+player_one_position);
                        break;
                    }
                    else{
                        break;
                    }
                case 2:
                    //Snake case
                    System.out.println("PlayerOne : Snake");
                    player_one_dice_counter += 1;
                    player_one_position = player_one_position - player_one_roll;
                    System.out.println("Player 1's :" +player_one_position);
                    break;

                default :
                    break;
        
        
            }


            switch (ladder_or_snake_player_one) {
                //No play case
                case 0:
                    System.out.println("Player One : No play");
                    System.out.println("Player 1's current position:"+player_one_position);
                    player_one_dice_counter += 1;                
                    break;
        
                case 1:
                    //Ladder Case
                    System.out.println("Player Two : Ladder");
                    //Checking the condition for perfect 100 score
                    if ((player_two_position + player_two_roll ) <= 100 ){
                        
                        player_two_dice_counter += 1;
                        player_two_position += player_two_roll;
                        System.out.println("Player 1's current position:"+player_two_position);
                        break;
                    }
                    
                    else{        
                        break;
                    }    
                case 2:
                    //Snake case
                    System.out.println("Player Two : Snake");
                    player_two_dice_counter += 1;
                    player_two_position = player_two_position - player_two_roll;
                    System.out.println("Player 2's current position :"+player_two_position);
                    break;

                default :
                    break;
        
        
            }
    

    

    }
    //Checking who won or if it is a Tie
    if (player_one_position > player_two_position){
    System.out.println("Player 1 Won " );
    }
    if (player_one_position == player_two_position ){
    System.out.println("It is draw");
    }
    else{
        System.out.println("Player 2 Won");
    }    
    System.out.println("player_one_dice_counter");
    System.out.println("player_two_dice_counter");
}


}
