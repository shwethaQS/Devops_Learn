package newtest2;
import java.util.Arrays;

public class smallestnumberpositive {

    public static void main(String[] args) {

        int[] test1 = { 1, 0, 2, 3, 5 };
        System.out.println("firstpos: " + firstpos(test1));

        System.out.println(reverserstring("tha"));
    }

    public static int firstpos(int[] A) {

        int smallestpositive = 1;
        Arrays.sort(A);
        for (int value : A) {

            if (value == smallestpositive) {
                smallestpositive++;
            }
        }

        return smallestpositive;

    }

    public static String reverserstring(String str) {

        

        
      //  String[] revd = str.split(" ");
        String rev = " ";
        for (int i = str.length() - 1; i >= 0; i--) {

            rev = str.charAt(i)+rev;

        }

        if (rev.equals(str)){
            System.out.println("pali");
        }

        return rev;
    }

    public static int reverserint(int num) {

        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;

            num = num / 10;
        }
        return rev;

    }

}
