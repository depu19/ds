
package string.problems;

/**
 * Minimum number of characters to be replaced to make a given string Palindrome.
 */
public class MakeStringAPalindrome {

  public static void main(String[] args) {
    System.out.println(makeStringPalindrome("macdg"));
  }

  private static String makeStringPalindrome(String s){
    int length = s.length();
    int countOfLettersToBeChanged=0;
    for (int i=0;i<length/2;i++){
      if(s.charAt(i) !=  s.charAt(length-i-1)){
        countOfLettersToBeChanged++;
       if(s.charAt(i)  < s.charAt(length-i-1)){
         s=s.replace(s.charAt(length-i-1),s.charAt(i));
       }
       else {
         s=s.replace(s.charAt(i),s.charAt(length-i-1));
       }
      }

    }
    System.out.println("Count of letters to be changed is "+countOfLettersToBeChanged);
    return s;
  }

}