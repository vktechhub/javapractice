    public class STR_FirstCharCapsInSentence {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String input = "hello wORLD, I am VIGNESHKANNA";
        System.out.println("Input : " + input);
        String output = capitalizeFirstCharacter(input);
        System.out.println("Output: " + output);
    }

    /**
     * @param str
     * @return
     */
    public static String capitalizeFirstCharacter(String str) {
        StringBuilder result = new StringBuilder();
        char[] stringInput = str.toCharArray();
        char prev_Char = stringInput[0];

        if ( stringInput[0] != ' ') { result = result.append(Character.toUpperCase(stringInput[0]));}

        for (int i = 1; i < stringInput.length; i++) {
            if (prev_Char == ' '){
                result = result.append(Character.toUpperCase(stringInput[i]));
            } else {
                result = result.append(Character.toLowerCase(stringInput[i]));
            }

            prev_Char = stringInput[i];
        }
        return result.toString();
    }
}
