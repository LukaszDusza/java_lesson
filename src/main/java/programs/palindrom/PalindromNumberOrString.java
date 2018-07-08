package programs.palindrom;

public class PalindromNumberOrString {

    public static void main(String[] args) {

        boolean b =  isPalindrome("kajak");
        System.out.println(b);

        boolean c =  isPalindrome(123321);
        System.out.println(c);
    }

    public static boolean isPalindrome(String inputStr) {
        StringBuffer reverseStr = new StringBuffer();
        for(int i = inputStr.length()-1; i >= 0; i--) {
            reverseStr.append(inputStr.charAt(i));
        }

        if(inputStr.equalsIgnoreCase(reverseStr.toString())) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(long inputNo) {
        long reverseNo = 0;
        long num = inputNo;

        while (num > 0) {
            long remainder = num % 10;
            reverseNo = reverseNo * 10 + remainder;
            num = num / 10;
        }
        if(inputNo == reverseNo) {
            return true;
        }
        return false;
    }
}
