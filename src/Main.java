import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul" };

        boolean play = true;
        String invalid = "Ongeldige invoer";
        Scanner scanner = new Scanner(System.in);

        Translator translator = new Translator(alphabetic, numeric);

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();
            if (Objects.equals(input, "x")) {
                play = false;
            } else if (Objects.equals(input, "v")) {
                System.out.println("Voer een cijfer in van 0 t/m 9");
                int inputNumber = scanner.nextInt();
                scanner.nextLine();
                if (inputNumber < 10) {
                    String result = translator.translate(inputNumber);
                    System.out.println("Vertaling: " + result);
                } else {
                    System.out.println(invalid +" voer een cijfer tussen 0 en 9 in");
                }
            } else {
                System.out.println("Ongeldige invoer, voer een 'x' of 'v' in");
            }
        }
    }
}


