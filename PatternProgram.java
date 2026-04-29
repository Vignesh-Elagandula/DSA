public class PatternProgram {
    public static void main(String[] args){
       
    //    int n = 5;

    //    for(int row = 1; row <= n; row++){
    //      for(int col = 1; col<= n-row+1; col++){
    //         System.out.print("* ");
    //      }
    //      System.out.println("");
    //    }



    // //pyramid...
    //  int n = 5;

    //  for(int row = 1; row <=n; row++){
    //     // print for space
    //     for(int col = 1; col<=n-row; col++){
    //         System.out.print("  ");
    //     }
    //      // print for stars
    //     for(int col = 1; col <= 2*row-1; col++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //  }

    //inverted pyramid....

    // int n = 4;

    // for(int row = 1; row<= n; row++){
    //     for(int col = 1; col <= row-1; col++){
    //         System.out.print("  ");
    //     }
    //     for(int col = 1; col <= 2*n-2*row+1; col++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    
    // pyramid holograph question
           int n = 5;
         
           for(int row=1; row<= n; row++){
            // part 1 print spaces 
            for(int col = 1; col<= n-row; col++){
                System.out.print("  ");
            }
            // part 2 for spaces and stars
            if (row == 1 || row == n) {
                for(int col = 1; col <= 2*row-1; col++){
                    System.out.print("* ");
                }
            }
            else{
                // print star first
                System.out.print("* ");;
             // print spaces
                for(int col = 1; col<= 2*row-3; col++){
                    System.out.print("  ");
                }
              // print stars
              System.out.print("* ");

               
            }
            System.out.println();
           }
 












    }





}