package new_test;

public class norepeatingchar {

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
}