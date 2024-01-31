public class reversestring {

    public static void main(String[] args) {

       // String str = "nitin";

       String str = "we are learning java";
        // StringBuffer reverse = new StringBuffer(str); // Create StringBuffer once
        // String res = reverse.reverse().toString();
        // // for (int i = str.length() - 1; i >= 0; i--) {
        // // reverse.append(str.charAt(i)); // Append characters from the original
        // string
        // // }

        // // String rev = reverse.toString(); // Get the final reversed string
        // System.out.println(res);

        // String firstfour = str.substring(0,4);
        // String lastfour = str.substring(str.length()-4, str.length());

        // System.err.println(lastfour);
        StringBuffer rev = new StringBuffer(str);
        // palindrome

        String[] revd = str.split(" ");
        System.out.println("revd:" + revd);
        for(String s:revd){
            int j= s.length();
            while(j>0){ 
            
                char ch = s.charAt(j-1);

            }

        }
        // if (revd.equals(str)) {
        //     System.out.println("Is palindrome");
        // } else
        //     System.out.println("Nope");

        // String reve = ("");
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     reve = reve + str.charAt(i);
        // }
        // System.out.println("r:" + reve);
        // if (reve.equalsIgnoreCase(str)) {

        //     System.out.println("Is pali");
        // } else
        //     System.out.println("no pali");

        // String[] arr = str.split(" ");
        // String res = "";
        // for (int i = arr.length - 1; i >= 0; i--) {

        //     res = res + arr[i] + " ";

        // }
        // System.out.println("res:" + res);




      


    }
}
