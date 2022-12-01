public class Main {
  public static void main(String[] args) {
   string lettergrade;
  }
  public static String letterGrade(int grade) {
    if (grade <= 100 && grade >= 95) {
      System.out.println("A++");
    } // end of if statement.
    if (grade == 95) {
      System.out.println("A+");
    } // end of if statement.
    else if (grade <= 94 && grade >= 90) {
      System.out.println("A");
    } // end of else if statement.
    else if (grade < 90 && grade >= 85) {
      System.out.println("A-");
    } // end of else if 2 statement.
    else if (grade == 85) {
      System.out.println("B+"); 
    } // end of else if 4 statement.
    else if (grade < 84 && grade >= 80) {
      System.out.println("B"); 
    } // end of else if 3 statement.
    else if (grade < 80 && grade >= 75) {
      System.out.println("B-"); 
    } // end of else if 5 statement.
    else if (grade == 75) {
      System.out.println("C+"); 
    } // end of else if 6 statement.
    else if (grade < 74 && grade >= 70) {
      System.out.println("C"); 
    } // end of else if 7 statement.
    else if (grade < 70 && grade >= 65) {
      System.out.println("C-"); 
    } // end of else if 8 statement.
    else if (grade == 65) {
      System.out.println("D+"); 
    } // end of else if 9 statement.
    else if (grade < 64 && grade >= 60) {
      System.out.println("D"); 
    } // end of else if 10 statement.
    else if (grade < 60 && grade >= 55) {
      System.out.println("D-"); 
    } // end of else if 11 statement.
    else if (grade < 55) {
      System.out.println("F"); 
    } // end of else if 11 statement.
      return lettergrade;
  } 
} // end of class method.
