import java.util.Scanner;

public class GuessNumber { 
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
        int randomNumber = 7;
        int userNumber = 1;

        System.out.println("Ugaday chislo, brat");
        while (randomNumber != userNumber) {
            System.out.print("Vvedi chislo: ");
            userNumber = input.nextInt();

            if (userNumber == randomNumber) {
                System.out.println("Krasava");
            } else if (userNumber > randomNumber) {
                System.out.println("Malenkoe chislo");
            } else {
                System.out.println("Bolshoe chislo");
            }
        }
        System.out.print ("Ti ugadal!");
    }
}
