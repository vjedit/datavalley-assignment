public class ReplaceCharacterAtIndex {
    public static String replaceCharAtIndex(String str, int index, char newChar) {
        if (index < 0 || index >= str.length()) {
            System.out.println("Invalid index!");
            return str;
        }
        
        char[] charArray = str.toCharArray();
        charArray[index] = newChar;
        
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        String originalString = "Hello World";
        int index = 6; // Index to replace
        char newChar = 'v'; // New character
        
        System.out.println("Original String: " + originalString);
        String modifiedString = replaceCharAtIndex(originalString, index, newChar);
        System.out.println("Modified String: " + modifiedString);
    }
}
