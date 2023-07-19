import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string =scanner.nextLine();
        int start=0,end=string.length()-1;
        System.out.println(isPalindrome(string,start,end));
    }
    public static int isPalindrome(String input,int start,int end)
    {
        if(start>=end)
        {
            return 1;
        }
        if(input.charAt(start)!=input.charAt(end))
        {
            return 0;
        }
        return isPalindrome(input,start+1,end-1);
    }
}
