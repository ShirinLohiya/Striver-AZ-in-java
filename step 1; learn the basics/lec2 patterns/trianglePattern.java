package step 1; learn the basics.lec2 patterns;


public class trianglePattern {
    public static void nForest(int n) {
        // Write your code here
        int i, j;
        //row and break line

        for(i=1;i<=n;i++){
     
            //based on i print j times
            for(j=1;j<=i;j++){
               System.out.print("* ");
                
            }
        
               System.out.println();
        }
    }
}