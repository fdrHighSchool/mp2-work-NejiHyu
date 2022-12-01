class Main {
  public static void main(String[] args) {
   System.out.println()
  } // end statement for the main method.
  
  /*public static boolean divBy3 (int num) {
    if(num %3 == 0); {
          return true;
        } //end of if statement.
    else {
      return false;
    }
  } // end of divBy3 method  */

  public static boolean divBy3 (int num) {
    int sum = 0;
    while(sum != 0){
      int ones = num % 10;
      sum += ones;
      int newNum = num / 10;
      

      
      return sum % 3 == 0;
    }// end of while loop
    return sum % 3 == 0;
  }
  
}
