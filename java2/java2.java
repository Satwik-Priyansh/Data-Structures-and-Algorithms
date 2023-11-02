package java2;
public class java2 {
    public static void main(String[] args) {
        //pattern programs
       /*&for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               System.out.print("*");
           }
           System.out.println("");
       }*/
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4||i==0||i==4) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println("");
        }*/
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println("");
        }*/
        /*for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }*/
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j<=4-i){
                    System.out.print(" ");
                }else
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
