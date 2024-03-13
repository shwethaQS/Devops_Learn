package new_test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Hashset {

    //Map - HashMap
    //Set - HashSet
    //Set -LinkedHashSet
    //Iterator itr = mySet.iterator();

    public static void main(String[] args){


        String str = "I am test test";

String[] arr = str.split("\\s");
Set<String> mySet = new LinkedHashSet<String>();
for(String s:arr){

    mySet.add(s);

}

Iterator itr = mySet.iterator(); 

while(itr.hasNext()){

    System.out.println(itr.next());
}


// int[] arr = {1,2,3,14,41,45,6,1};

// Set<Integer> hs = new HashSet<Integer>();
// for( int x: arr){
//     if(!hs.add(x)){
//         //hashset doesnt allow duplicates
//         System.out.println("duplicate:"+x);
//     }
// }
//time complexity = o(n) cause we are using one for loop

//Hashmap
// Map<Integer,Integer> map = new HashMap<Integer,Integer>();

// for(int x :arr){

//     if(!map.containsKey(x)){
//         map.put(x,1);
//     }
//     else 
//     {

//       map.put(x,map.get(x)+1));

//     }

// }

    }
    
}
