import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        // Onderstaande code is uitgecommentarieerd. Haal de code uit de comment (delete /* en */) om aan de slag te gaan met de bonus
        // In de code staan op verschillende plekken comments tussen "/*...*/" als hint wat je moet doen


        HashSet<Integer> secretNumber = randomNumberGenerator();
        System.out.println(secretNumber);
        String stringNumber = setToStringConverter(secretNumber);
        feedback(stringNumber);

    }
    /*moet dit returntype "void" zijn of wat anders?*/
    /*Heeft deze methode nog parameter(s) nodig?*/
         /*

        Stappenplan:
        - Maak een nieuwe variabele van type Random. (Tip: Zoek op internet hoe je Random kunt gebruiken)
        - Maak een nieuwe variabele van type HashSet.
        - Schrijf een while-loop om 4 random nummers aan de hashset toe te voegen
        - return de hashset
         */
    public static HashSet<Integer> randomNumberGenerator(){
        Random rand = new Random();
        HashSet<Integer> hashSet = new HashSet<>();

        int i= 0;
        while (hashSet.size() < 4) {
            hashSet.add(rand.nextInt(10));
        }
        return hashSet;

    }


    /*moet dit returntype "void" zijn of wat anders?*/
    /*Heeft deze methode nog parameter(s) nodig?*/
    /*
        Vul hier de body van de methode in.

        Stappenplan:
        - Maak als eerst een String variabele met als waarde een lege String. (of gebruik een StringBuilder)
        - Schrijf vervolgens een for-loop om de items in de hashset een voor een aan de String variabele toe te voegen.
        - Return de (gevulde) String variabele
         */
    public static String setToStringConverter(HashSet<Integer> hashSet) {
        StringBuilder secretNumber = new StringBuilder();

        for (Integer stringNumber : hashSet) {
            secretNumber.append(stringNumber);
        }
        return secretNumber.toString();
    }



    public static void feedback(String stringNumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringNumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringNumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringNumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
