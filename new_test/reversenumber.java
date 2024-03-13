package new_test;
public class reversenumber {
    

public static void main(String[] args) {

    reversenumber revclass = new reversenumber();
    int r =4;
   // System.out.println("factorial of r:"+revclass.findFactorial(r));

   for(int i=1;i<=5;i++){

    for (int j=1;j<=i;j++){
     System.out.print("*");
    }
    System.out.println();
   }

//reverse number 
    int num = 4563;

    int result = 0;

    while(num>0){

        result = result*10+num%10;
        num = num/10;

    }

 //   System.out.println("result:"+result);

//factorial of a number - 0,1,1,2,3,5,..

    int first = 1;
    int second = 1;
    int n =10;

    for(int i =0;i<=n;i++){
      //  System.out.println(first);

        int third = first+second;

        first = second;

        second = third;
        
    }

    //Factorial

    int p = 4;
    int fact = 1;
    for(int i=1;i<=p;i++){

        fact = fact*i;
    }
   // System.out.println("fact:"+fact);

    //recursion - function calling itself

    
    

    
}
public  int findFactorial(int r){

    if(r<1)
    {
        return 1;
    }
    else {
        return r*findFactorial(r-1);

    }
}

}
