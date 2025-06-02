package step 1; learn the basics.lec2 patterns;


public class numberTriangle{
    public static void nTriangle(int n) {
        // Write your code here
        int i,j;
        for(i=1;i<=n;i++){
          
            for(j=1;j<=i;j++){
                 System.out.print(j + " ");
            }
              System.out.println();
        }
    }
}