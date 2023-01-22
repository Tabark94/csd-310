import java.util.Random;
import java.util.Scanner;


public class Assignment3 {

    public static void main(String[] args) {
    
        System.out.println("\nWelcome To The Challenge \n\nTry to beat the computer");
        Random random = new Random();
        Scanner input = new Scanner(System.in);
    while (true){
        int computer = random.nextInt(3)+1;
        System.out.print("Make your Choice between 1(Rock), 2(Paper), 3(Scissor), Select 4 to quit: ");
        int user = input.nextInt();
        if (user == 4) break;

    
        String computerselection = "";
        if (computer == 1) {
            computerselection = "Rock";
        } else if (computer == 2) {
            computerselection = "Paper";
        } else {
            computerselection = "Scissors";
        }


        String playerselection = "";
        if (user == 1) {
            playerselection = "Rock";
        } else if (user == 2) {
            playerselection = "Paper";
        } else {
            playerselection = "Scissors";
        }

        System.out.println("User has selected: " + playerselection);
        System.out.println("Computer has selected: " + computerselection);

        if (computer == user) {
            System.out.println("Its a tie");
        } else if (computer == 1 && user == 2){
            System.out.println(" You Win ");
        } else if (computer == 2 && user == 3){
            System.out.println(" You Win ");
        } else {
            System.out.println(" You Lose ");
        }
        
    }
    input.close();
    }
}