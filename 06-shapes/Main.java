class Main {
  public static void main(String[] args) {
    //square(4);
    //rectangle(2,3);
    righttriangle(6);
    
  }
    /*public static void square(int s){
      for(int row = 0; row < s; row++) {
        for (int col= 0; col < s; col++) {
          System.out.print("* ");
        } // end of col loop
          System.out.println();
      } // end of row loop
    } // end of the method

   /* public static void rectangle(int w, int l) {
      for(int row = 0; row < l; row++) {
        for (int col = 0; col < w; col++) {
          System.out.print("* ");
        }// end of col loop
        System.out.println();
      }// end of row loop
    }// end of rectangle*/

    public static void righttriangle(int n) {
      for(int row = 0; row < n; row++) {
        for (int col = 0; col <= row; col++) {
          System.out.print("* ");
        }// end of col loop
        System.out.println();
      }// end of row loop
    }// end of method

    public static void equilateraltriangle(int v) {
      for(int row = 0; row < n; row++) {
        
      }
    }
} // end of class




//for(int i = 0; i < 6; i++){
    //  System.out.println("* * * *");
    //}
