package new_test;
import java.util.Arrays;

public class hello {
   
    public static void main(String[] main){
      //  MyClass myclass = new MyClass();

   String fruits = "Orange,Apple,leachy,guave";
   String[] fruity = fruits.split(",");
   System.out.println(Arrays.toString(fruity));
      
    //   String splittedstring = fruits.toString().split(",");
  
    //  System.out.println(splittedstring);
    //  String fruit = fruitsdiff(fruits);
    //  System.out.println(fruit);
    //  String reversedString = reverseString("Shwetha"); 
    //     String reverseStringChar = reverseStringChar("Marathe");
    //     char result = myclass.nonrepeatingchar("programm");
    //     System.out.println(result);

        // System.out.println(reversedString);
        // System.out.println(reverseStringChar);
        // System.out.println("Hello World");
        // for (int i = 0;i<5;i++){
        //     System.out.println("Shwetha" + i);

        // }
    }
// Function to reverse a string
public static String reverseString(String str){
   StringBuilder reversed = new StringBuilder();
   for(int i= str.length()-1;i>=0;i--){ 
     reversed.append(str.charAt(i));
}
return reversed.toString();
}
// funstion to reverse a string without StringBuilder
public static String reverseStringChar(String str){

   char[] charArray = str.toCharArray();

   int start = 0;
   int end = charArray.length - 1;
   while (start<end){
      char temp = charArray[start];
      charArray[start] = charArray[end];
      charArray[end] = temp;
      
      start++;
      end--;
   }
   return new String(charArray);

   }

   public  char nonrepeatingchar(String str) {

    int[] charcount = new int[256];
        for(char c:str.toCharArray()){
            charcount[c]++;
        }
        for(char c:str.toCharArray()){
            if(charcount[c]==1){
                return c;
            }
        }
        return '\0';
    
    }
public static String fruitsdiff(String[] str){ 
    
   
    
    for (int i=0;i<str.length;i++){
        System.out.println("fruits:"+str[i]);

    }
    return str.toString();
    }
}
