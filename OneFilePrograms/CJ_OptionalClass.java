import java.util.Optional;

public class CJ_OptionalClass {
    public static void main(String[] args) {
        
        String[] words = new String[10];
        words[2] = "Hello";
        words[5] = null;
        Optional<String> checkNull5 = Optional.ofNullable(words[5]);    // ofNullable() method creates an Optional object that may or may not contain a non-null value
        Optional<String> checkNull2 = Optional.ofNullable(words[2]);

        if (checkNull5.isPresent()) {               // isPresent() method checks if the value is present or not
            String word = words[5].toLowerCase();
            System.out.print(words[5] + " is not null");
        } else {
            System.out.println("word[5] is null");
        }

        if (checkNull2.isPresent()) {
            String word = words[2].toLowerCase();
            System.out.println(word + " is not null");
        } else {
            System.out.println("word[2] is null");
        }

        Optional<String> empty = Optional.empty();  // empty() method creates an empty Optional object
        System.out.println(empty);

        Optional<String> value = Optional.of(words[2]);   // of() method creates an Optional object with a non-null value                                                                                                                                                                                                                                                                                   
        System.out.println(value);


    }

}