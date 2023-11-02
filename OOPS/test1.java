package OOPS;
import java.io.IOException;

//efficient approach to find 2nd largest element in an array
public class test1 {
    static int secondLargest(int []arr){
    int largest=0,res=-1;
    for (int i=0;i< arr.length;i++){
        if(arr[i]>arr[largest]){
            res=largest;
            largest=i;

        } else if (arr[i]!=arr[largest]) {
            if(res==-1||arr[i]>arr[res]){
                res=i;
            }
        }
        }return res;
    }


    public static void main(String[] args) throws IOException {
       int[]a={5,20,12,20,8};
        System.out.println(secondLargest(a));





    }
}
