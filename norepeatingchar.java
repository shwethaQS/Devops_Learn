
public class MyClass1 {

public  char nonrepeatingchar(String str) {

int[] charcount = new int[];
    for(char c:str.toCharArray()){
        charcount[c]++;
    }
    for(char c:str.toCharArray()){
        if(charcount[c]==1){
            retun c;
        }

    }
    return '\0';

}
}