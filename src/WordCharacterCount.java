import java.util.*;

public class WordCharacterCount {


    public static void main(String[] args) {

        String data = "If the middle item is greater than the item, " +
                "then the probe position is again calculated in the sub-array " +
                "to the right of the middle item. Otherwise, the item is" +
                " searched in the subarray to the left of the middle item." +
                " This process continues on the sub-array as well until the size" +
                " of subarray reduces to zero.";

        char[] charactersArray = data.toCharArray();

        String[] stringArray = data.split(" ");


        ArrayList<Character> characterList = new ArrayList<>();


        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

        for (Character character : charactersArray) {
            characterList.add(character);
        }

        TreeMap<String, Integer> orderedWords = new TreeMap<>();
        TreeMap<Character, Integer> orderedCharacters = new TreeMap<>();

        for (String word : stringList) {
            orderedWords.put(word, Collections.frequency(stringList, word));
        }

        for (Map.Entry singleEntry : orderedWords.entrySet()) {
            System.out.println(singleEntry.getKey() + " : " + singleEntry.getValue());
        }

        for (Character alphabet : characterList) {
            orderedCharacters.put(alphabet, Collections.frequency(characterList, alphabet));
        }

        for (Map.Entry singleEntry : orderedCharacters.entrySet()) {
            System.out.println(singleEntry.getKey() + " : " + singleEntry.getValue());
        }

    }
}


