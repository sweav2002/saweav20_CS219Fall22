import java.util.Random;

public class LogicalOperators {

    public static void main(String [] args){

        Random r = new Random();

        int coinflip = r.nextInt(2);

        if ( coinflip ==0 ){
            System.out.println("heads");
        }
        else {
            System.out.println("tails");
        }


        int die1 = r.nextInt(6) + 1;
        int die2 = r.nextInt(6) + 1;

        if (die1 == 1 && die2 == 1) {
            System.out.println("Snake eyes");
        }

        if (die1 ==1){
            if  (die2 == 1){
                System.out.println("Snake Eyes");
            }
        }

        if (die1 != 1 || die2 != 1){
            System.out.println("At least one die was not a one");
        }

        if (die1 != 1){
            System.out.println("Die1 was not one");
        }
        else if (die2 != 1) {
            System.out.println("Die2 was not a one");
        }

        if (die1 == 1 || die2 == 1){
            if (die1 != 1 || die2 != 1){
                System.out.println("Only one die rolled a one.");
            }
        }


        // check if dei1 is between and 5 inclusive
        if (2 <= die1 && die1 <= 5){
            System.out.println("Between 2 and 5 inclusive");
        }
    }

}
