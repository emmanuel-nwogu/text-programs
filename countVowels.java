import java.util.Scanner;

public class countVowels {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string for vowel counting:");
        String word = scan.nextLine();  
        System.out.println(Count(word));
    }
    
    public static int Count(String string) {
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        int vowelCount = 0;
        for (int i = 0; i < string.length(); i++) {
            for (char vowel : vowels) {
                if (vowel == string.charAt(i)) {              
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
    
}
