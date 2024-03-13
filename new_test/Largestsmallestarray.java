package new_test;
import java.util.Arrays;

public class Largestsmallestarray {


    public static void main(String[] args){

        int[] arr = {1,2,3,4,6,7,8,9,10};

        int smallest = arr[0];
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                largest = arr[i];
            }
            else if(arr[i]<smallest){

                smallest = arr[i];
            }

        }
System.out.println("smallest:"+smallest);
System.out.println("largerst:"+largest);


int sum = 0;
int expsum =0;
for(int i=0;i<arr.length;i++){

    sum = sum+arr[i];
}

for(int i=1;i<=10;i++){
    expsum = expsum+i;
}
System.out.println(expsum-sum);

//Duplicates in array

int[] arr1 = {2,1,3,4,5,8,2,6,7};
 Arrays.sort(arr1);

for(int i=0;i<arr1.length-1;i++){

    if(arr1[i]==arr1[i+1]){
        System.out.println("Dup:"+arr[i]);
    }

    // for(int j=i+1;j<arr1.length;j++){

    //     if(arr1[i]==arr1[j]){
    //         System.out.println("Duplicate array char:"+arr1[i]);
    //     }
    // }
}


    }



    
}
