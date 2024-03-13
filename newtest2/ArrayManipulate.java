package newtest2;
public class ArrayManipulate {

    public static void main(String[] args) {

        String[] s1 = { "Sunday", "Monday", "Tuesday" };

        String[] s2 = new String[s1.length];

        for (int i = 0; i < s1.length; i++) {

            s2[i] = s1[i].substring(0, 3);
            System.out.println(s2[i]);
        }

        for(String x:s2){

            System.out.println(x);
        }

       

    }

}
