package java2;
public class java5 {
    static void minmax(int a[]){
         int n=a.length;
         int min=a[0],max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("min= "+min+" "+"max= "+max);
    }
    public static void main(String[] args) {
      int[]arr={3, 2, 1, 56, 10000, 167};
      minmax(arr);
        System.out.println();
    }
}
