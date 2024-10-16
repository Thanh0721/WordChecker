import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");

        System.out.println(words);
        
        WordChecker x = new WordChecker(words);

        boolean result = x.isWordChain();
        System.out.println("Is word chain: " + result);


        ArrayList<String> createdList = x.createList("ban");
        System.out.println("Result of createList with 'ban': " + createdList);

        createdList = x.createList("an");
        System.out.println("Result of createList with 'an': " + createdList);

        createdList = x.createList("cat");
        System.out.println("Result of createList with 'cat': " + createdList);
    }
}
