package newtest2;
public class nonrepeatingchar {

    public static void main (String[] args){

        String input = "zooz";

        System.out.println("firstnonrepeatingchar: "+ firstnonrepeatingchar(input));
    }

    public static char firstnonrepeatingchar(String str) {

        int[] ch = new int[256];

        for (char c : str.toCharArray()) {

            ch[c]++;
        }

        for (char c : str.toCharArray()) {

            if (ch[c] == 1) {

                return c;
            }
        }
        return '\0';
    }

}
