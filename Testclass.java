import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Testclass{

    public static void main(String[] args){

        // String concatStr1 = "Test";
        // String concatStr2 = "Selenium ";


        // StringBuffer str = new StringBuffer();
        // String res = str.append(concatStr1).append(concatStr2).toString();
        // System.out.println(res);


        // String str = "mary";
        // String str1 = "army";

        // char[] char1 = str.toLowerCase().toCharArray();
        // char[] char2 = str1.toLowerCase().toCharArray();
        // Arrays.sort(char1);
        // System.err.println(char1);
        // Arrays.sort(char2);
        // System.out.println(char2);
        // if(Arrays.equals(char1,char2)){
        //     System.out.println("IS anagram");

        // }
        // else
        // System.out.println("Not anagram");

        // int result = str.length()-str.replaceAll("i","").length();
        // System.out.println(result);

        //Duplicate characters in a String
        String str = "swiss";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] arr = str.toCharArray();
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }

            //output
            for(Character key : map.keySet()){
                if(map.get(key)==1){ 
                System.out.println(key + map.get(key));
                }

            }
        }
    }
    //     Map<String,Integer> map = new HashMap <String,Integer>();
    //     Integer count = 1;
    //     String[] arr = str.split(" ");
    //     for(int i=0;i<arr.length;i++){
    //         if(!map.containsKey(arr[i])){
    //             map.put(arr[i],count);
    //         }
    //         else
    //         {
    //             map.put(arr[i],map.get(arr[i])+1);
    //         }

    //     }

    //     for(String x : map.keySet()){
    //         if (map.get(x)==1){
    //         System.out.println(x + map.get(x));
    //     }
    // }

    // }

// public boolean isNum(int num){
//  if(num <= 1)
//  {
//     return false;
//  }
//  if(int i = 2; i*i<=num;i++){
// if(num%i == 0){
//     return false;
// }



//  }
//  retutn true;

// }

}