import java.util.Scanner;
import java.util.Arrays;

public class Battleship{
    public static void main(String[] args){
        int playerTurn = 1;

        char[][] player1BoardCOVERED = new char[5][5];
        char[][] player2BoardCOVERED = new char[5][5];

        char[][] player1Board = new char[5][5];
        char[][] player2Board = new char[5][5];

        int player1Lives = 5;
        int player2Lives = 5;

        for(int i = 0; i < player1BoardCOVERED.length; i++){
            for(int v = 0; v < 5; v++){
                player1BoardCOVERED[i][v] = '-';
            }
        }
        for(int i = 0; i < player2BoardCOVERED.length; i++){
            for(int v = 0; v < 5; v++){
                player2BoardCOVERED[i][v] = '-';
            }
        }

        //System.out.print(Arrays.deepToString(player1Board));

        System.out.println("Welcome to Battleship!");
        System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");

        player1Board = setupPlayer();
        printBattleShip(player1Board);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'y' for next player's turn: ");
        String ready = input.next().toLowerCase();

        if(ready.equals(new String("y"))){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
            player2Board = setupPlayer();
            printBattleShip(player2Board);
            while(player1Lives > 0 && player2Lives > 0){
                boolean validInput = false;
                int row;
                int col;
                do{
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Player " + playerTurn + ", enter hit row/column: ");
                    row = input2.nextInt();
                    col = input2.nextInt();
                    if(playerTurn == 1){
                        if(row > 4 || col > 4 || player2Board[row][col] == 'X' || player2Board[row][col] == 'O'){
                            System.out.println("Invalid coordinates. Choose different coordinates.");
                        } else {
                            validInput = true;
                        }
                    }
                    if(playerTurn == 2){
                        if(row > 4 || col > 4 || player1Board[row][col] == 'X' || player1Board[row][col] == 'O'){
                            System.out.println("Invalid coordinates. Choose different coordinates.");
                        } else {
                            validInput = true;
                        }
                    }
                }
                while(!validInput);



                char chosenSpace;
                if(playerTurn == 1){
                    chosenSpace = player2Board[row][col];
                    if(printResult(playerTurn, chosenSpace)){
                        player2Board[row][col] = 'X';
                        player2BoardCOVERED[row][col] = 'X';
                        player2Lives--;
                        printBattleShip(player2BoardCOVERED);
                    } else {
                        player2Board[row][col] = 'O';
                        player2BoardCOVERED[row][col] = 'O';
                        printBattleShip(player2BoardCOVERED);
                    }
                    
                }
                if(playerTurn == 2){
                    chosenSpace = player1Board[row][col];
                    if(printResult(playerTurn, chosenSpace)){
                        player1Board[row][col] = 'X';
                        player1BoardCOVERED[row][col] = 'X';
                        player1Lives--;
                        printBattleShip(player1BoardCOVERED);
                    } else {
                        player1Board[row][col] = 'O';
                        player1BoardCOVERED[row][col] = 'O';
                        printBattleShip(player1BoardCOVERED);
                    }
                }
                if(playerTurn == 1){
                    playerTurn = 2;
                } else {
                    playerTurn = 1;
                }
            }

            if(player1Lives > 0){
                System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
            }
            if(player2Lives > 0){
                System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
            }
            System.out.println("Final Boards");
            printBattleShip(player1Board);
            System.out.println("");
            printBattleShip(player2Board);
        } else {
            System.out.println("Exiting...");
        }
    }

    public static char[][] setupPlayer(){
        char[][] userSelection = new char[5][5];
        for(int i = 0; i < userSelection.length; i++){
            for(int v = 0; v < 5; v++){
                userSelection[i][v] = '-';
            }
        }

        for(int i = 0; i < 5; i++){
            boolean validInput = false;
            int rowSelection;
            int columnSelection;
            do{
                Scanner input = new Scanner(System.in);
                System.out.print("Enter ship " + (i + 1) + " location: ");
                rowSelection = input.nextInt();
                columnSelection = input.nextInt();

                if(rowSelection > 4 || columnSelection > 4 || userSelection[rowSelection][columnSelection] == '@'){
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                } else {
                    validInput = true;
                }
            } while(!validInput);

            userSelection[rowSelection][columnSelection] = '@';
        }

        return userSelection;
    }

    private static boolean printResult(int player, char chosenSpace){
        if(chosenSpace == '@'){
            System.out.println("PLAYER " + player + " HIT PLAYER #'s SHIP!");
            System.out.println("");
            return true;
        } else {
            System.out.println("PLAYER " + player + " MISSED");
            System.out.println("");
            return false;
        }
    }

    // Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}