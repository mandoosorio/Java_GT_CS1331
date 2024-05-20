public class Craps {
    
    private Die die1, die2;
    private int point;

    public Craps(){
        die1 = new Die();
        die2 = new Die();
    }

    private int toss(){
        int total = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1.getFaceValue() + ", Die Two: " + die2.getFaceValue());
        return total;
    }

    // make this public as it is the method that the client will need to access
    public void go(){
        point = toss();
        System.out.println("Point: " + point);
        if((point == 7) || (point == 11)){
            System.out.println("Winner!");
        }
        else if((point == 2) || (point == 3) || (point == 12)){
            System.out.println("You lose!");
        }
        else {
            System.out.println("Entering Stage 2");
            stage2();
        }
    }

    // set stage2 to private becasue we do not want a client class to directly access stage2 without going through the appropriate workflow/process
    private void stage2(){
        boolean endGame = false;

        while(!endGame){
            int total = toss();

            System.out.println("Total: " + total);
            if(total == point){
                System.out.println("Winner!");
                endGame = true;
            }
            else if(total == 7){
                System.out.println("You Lost!");
                endGame = true;
            }
        }
    }

    public static void main(String[] args){
        // Create instance of the game of craps
        Craps game = new Craps();

        // Start the game
        game.go();
    }
}