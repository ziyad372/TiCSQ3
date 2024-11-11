package Final_assignment;

public class P3 {
    public static boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }

        if(s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1, s.length()-1));
        }

        return false;
    }
    public static void main(String[] args) {

        String phrase = "A man, a plan, a canal, Panama!";
        System.out.println("Phrase: "+phrase);
        phrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (isPalindrome(phrase)){
            System.out.println("The phrase is Palindrome");
        }
        else{
            System.out.println("The phrase is not Palindrome");
        }
    }
}
