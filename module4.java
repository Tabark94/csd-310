import java.util.Scanner;
    public class module4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean loop = true;
        while (loop){
            System.out.print("Enter your first string: ");
            String input1 = scanner.nextLine();
            System.out.println("First string entered: " + input1);
            System.out.print("Enter your Second string: ");
            String input2 = scanner.nextLine();
            System.out.println("Second string entered: " + input2);

            if (input1.contains(input2)) {
                System.out.println("The second string is a substring of the first string.");
            } else if (input2.contains(input1)) {
                System.out.println("The first string is a substring of the second string.");
            } else {
                System.out.println("Neither string is a substring of the other.");
            }
            System.out.println("Do you want to check again? (yes/no)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                loop = false;
            }
        }
        }
    }