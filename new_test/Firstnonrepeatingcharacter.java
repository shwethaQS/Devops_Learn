package new_test;
public class Firstnonrepeatingcharacter{

public  static void main(String[] args){

 String input = "programming";
 System.out.println("Firstnonrepeatingcharacter: "+ nonrepeatingcharacter(input));

}

public static char nonrepeatingcharacter(String str){
   

    int[] ch = new int[256];

    for(char c : str.toCharArray()){

        ch[c]++;
    }

for(char c : str.toCharArray()){

    if(ch[c]==1){
        return c;
    }
}
return '\0';

}
}