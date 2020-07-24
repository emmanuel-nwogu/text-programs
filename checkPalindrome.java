import java.util.Scanner;

public class checkPalindrome {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scan.nextLine();
        if (palCheck(text)) {
            System.out.println("Yes, " + text + " is a palindrome");
        } else {
            System.out.println("Nah, " + text + " is not a palindrome");
        }
        
        
    }
    
    public static String reverser(String sample) {
        String reversed = "";
        for (int i = sample.length() - 1; i >= 0; i--) {
            reversed += sample.charAt(i);
        }
        return reversed;
    }
    
    public static boolean palCheck(String text) {
        String reversed = reverser(text);
        return text.equals(reversed);
    }
}
