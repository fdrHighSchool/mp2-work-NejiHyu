class Main {
  
  public static void main(String[] args) {
    
    // comment out each method call to test
    
    int x1 = 0, y1 = 0, x2 = 3, y2 = 4, r = 2, h = 8, a = 4, b = 5, c = 6;
    
    System.out.println(euclideanDistance(x1, y1, x2, y2)); // returns 5.0
    euclideanDistance(0,0,3,4);
    
    System.out.println(taxicabDistance(x1, y1, x2, y2)); // returns 7
    taxicabDistance(0,0,3,4);
    
    System.out.println(circleArea(r)); // returns 12.55637...
    circleArea(2);
    
    System.out.println(surfaceAreaCylinder(r,h)); // come up with your own test case!
     surfaceAreaCylinder(2,8);
    
    System.out.println(heronsTriangle(a,b,c)); // come up with your own test case!
     heronsTriangle(4,5,6);
    
  } // end main method
  
  public static double euclideanDistance(int x1, int y1, int x2, int y2){
    double changeX = (int) Math.pow(x2 - x1,2);
    double changeY = (int) Math.pow(y2 - y1,2);
    return (int) Math.sqrt(changeX + changeY);   
  }
  
  
  public static int taxicabDistance(int x1, int y1, int x2, int y2) {
    double changeX = Math.abs(x1-x2);
    double changeY = Math.abs(y1-y2);
    return (int) (changeX + changeY);
  }
  
  
 public static double circleArea(double r) {
    return Math.PI* (Math.pow(r, 2));                            
 }
  
  
  public static double surfaceAreaCylinder(double r, double h) {
    return (2*Math.PI*Math.pow(r,2) + (2*Math.PI*r*h));
  }
  
  
  public static double heronsTriangle(int a, int b, int c) {
    double s = (a+b+c)/2.0;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return area;
  }
  
} // end class
