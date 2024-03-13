package newtest2;
import java.util.Arrays;

public class Firstsmallestpositivenumber {

    public static void main(String[] args) {

        int[] test1 = { -1, 0, 1, 3 };
        System.out.println("missingposnumber: " + firstpositivenumber(test1));
    }

    public static int firstpositivenumber(int[] A) {

        Arrays.sort(A);

        int positivenumber = 1;
        for (int value : A) {

            if (value == positivenumber) {
                positivenumber++;
            }
        }
        return positivenumber;

    }

}