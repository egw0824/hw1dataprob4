public class Main {
    // Method to check whether a character is a consonant
    public static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return (c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    // Recursive method to count and collect consonants
    public static int consonantCheck(String s, int index, int count, StringBuilder uniqueConsonants) {
        // Base Case: Stop when we reach the end of the string
        if (index >= s.length()) {
            // Print the final output in the required format
            System.out.println("Total consonants: " + count + " (" + uniqueConsonants + ")");
            return count;
        }

        char currentChar = s.charAt(index); // Get the current character

        // Check if it's a consonant
        if (isConsonant(currentChar)) {
            count++; 

            // Convert to lowercase for case-insensitive uniqueness check
            String lowerChar = Character.toString(Character.toLowerCase(currentChar));

            // Add to the unique consonant list only if not already present
            if (!uniqueConsonants.toString().toLowerCase().contains(lowerChar)) {
                uniqueConsonants.append(currentChar).append(",");
            }
        }

        // Recursive call to process the next character
        return consonantCheck(s, index + 1, count, uniqueConsonants);
    }

    // Main method
    public static void main(String[] args) {
        String test1 = "A58*u7(($1ee&";  
        String test2 = "CSC530DaTaStrc"; 

        consonantCheck(test1, 0, 0, new StringBuilder());
        consonantCheck(test2, 0, 0, new StringBuilder());
    }
}
