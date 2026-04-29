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

    int n = 4;

    for(int row = 1; row<= n; row++){
        for(int col = 1; col <= row-1; col++){
            System.out.print("  ");
        }
        for(int col = 1; col <= 2*n-2*row+1; col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    


    }





}