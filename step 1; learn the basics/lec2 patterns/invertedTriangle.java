package step 1; learn the basics.lec2 patterns;


public class invertedTriangle {
    public static void seeding(int n) {
        // Write your code here
        int i,j;
        for(i=1;i<=n;i++){
           
            for(j=0;j<n-i+1;j++){
                    System.out.print("* ");
            }
             System.out.println();
        }
    }
}
// inverted triangle in numbers 
public class printNumberTriangle {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}