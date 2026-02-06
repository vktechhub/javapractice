import java.util.HashMap;

public class wordstest{
    public static void main(String[] args) {
        List<String> str1 = new ArrayList<>();
        str.add("test");
        str.add("vignesh");
        str.add("kanna");
        str.add("ram");
        str.add("hari");
        str.add("kumar");
// put in hashmap using streams - get length of each word
        HashMap< Char, String[]> output = new HashMap<>();

        // create a stream from the list and map each word to its starting character 
        Consumer x = str1.Stream()
                .map(word -> {
                    Char startingChar = word.charAt(0);
                    output.putIfAbsent(startingChar, new String[]{});
                    String[] existingWords = output.get(startingChar);
                    String[] newWords = Arrays.copyOf(existingWords, existingWords.length + 1);
                    newWords[newWords.length - 1] = word;
                    output.put(startingChar, newWords);
                    return null;
                });



// put in hashmap using streams - count of chars
        String str2 = "Vignesh Kanna Time TestVig";
        //char[] count = 


        char[] chararray = str2.toCharArray();
        HashMap< Char, count> output1 = new HashMap<>();

        Consumer x1 = chararray.Stream()
                .map(x -> { output1.add(x, getordefault(0,)) })




// split by word and show length
        String[] str3 = str2.split(" ");
        for (String strelement : str3 ){
            System.out.println("Word :- " + strelement.length());
        }








    }
}