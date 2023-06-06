import java.util.HashMap;

class Translator {

    HashMap<Integer, String> numericAlpha = new HashMap<>();

    public Translator(String[] alphabetic, int[] numeric) {

        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }

    }

    public String translate(Integer number) {
        String result = numericAlpha.get(number);
        return result;
    }
}
