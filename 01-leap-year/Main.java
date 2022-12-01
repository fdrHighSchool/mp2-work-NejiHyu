class Main {
  public static void main(String[] args) {
      //check if the year is a leap year.
    System.out.println(2022 %4);
    System.out.println(2023 %4);
    System.out.println(2024 %4);
    System.out.println(2025 %4);
  } // end of main method

  public static boolean isaLeapyear(int year) {
    if (year % 4 == 0) {
      return true;
    } // end of if statement
      if(year % 100 == 0){
        return false;
      } // end of if 2 statement
        if(year % 400 == 0){
        return true;
        } // end of if 3 statement
    else {
      return false;
    } // end of else statement
  } // end of isleapyear method
} // end of class method
