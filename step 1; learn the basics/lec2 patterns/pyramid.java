package step 1; learn the basics.lec2 patterns;


public class pyramid {
    public static void nStarTriangle(int n) {
        // Write your code here
        int i,j;
        for(i=0;i<n;i++){
          
            //space
            for (j=0;j<n-i-1 ; j++ ){
                System.out.print(" ");
            }
                 //star
                 for (j=0;j<2*i+1;j++){
                      System.out.print("*");
                      }
                      //space
                      for(j=0;j<n-i-1 ; j++ ){
                         System.out.print(" ");  
                        }
                          System.out.println();

            
        }
    }
}
//inverted pyramid
public class invertedTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
        int i,j;
        for(i=0; i<n;i++){
            for( j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=0; j<2*n- (2*i+1) ; j++){
                System.out.print("*");
            }
            for( j=0; j<i; j++){
                System.out.print(" ");
            }
                System.out.println();
            

        }
    }
}