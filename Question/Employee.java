public class Employee{
    public static void main(args Str[]){
     List<String> employees = Arrays.asList{"arun", "charu", "alex", "Arjun"}   ;

     Stream<String> st = List.Stream()
                        -> map()
                        -> filter(names) -> (name.startswith(a))
                        -> map(name.Uppercast())
                        -> Collect()

        List<String> outputList = st.stream()
                                .filter(S -> s.startsWith('a'))
                                .map(String::toUpperCase)
                                .collect(Collectors.toList());

        System.out.println()
    }

}

