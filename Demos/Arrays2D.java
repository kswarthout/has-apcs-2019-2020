public class Arrays2D {
  
  /*
   * Loop through all of the elements of a 2D array
   */
  public static double getAverage(int[][] a){
      double total = 0;
      int value = 0;
      for (int row = 0; row < a.length; row++){
         for (int col = 0; col < a[0].length; col++){
            value = a[row][col];
            total = total + value;
         }
      }
      return total / (a.length * a[0].length);
  }
  
  /*
   * Use a nested for-each loop to loop through all elements in an array
   */
   public static double getAvg(int[][] a){
      double total = 0;
      for (int[] innerArray : a){
         for (int val : innerArray){
            total = total + val;
         }
      }
      return total / (a.length * a[0].length);
   }
   
   /*
    * Loop through part of a 2D array
    */ 
   public static int getTotalForRow(int row, int[][] a){
      int total = 0;
      for (int col = 0; col < a[0].length; col++){
         total = total + a[row][col];
      }
      return total;
   }
   
   public static void main(String[] args){
    
     // declare a 2D array
     int[][] ticketInfo;
     String[][] seatingChart;
    
     // the following will cause an error
     // be careful not to reference an uninitialized array
     //System.out.println(ticketInfo); 
    
     // this 2D array has been initialized to hold 6 total values
     ticketInfo = new int [2][3];
    
     // You can also initialize (set) the values for the array when you create it.
     String[][] seatingInfo = { {"Jamal", "Maria"}, {"Jake", "Suzy"}, {"Emma", "Luke"} };
    
     // sets the value for the 2nd row and 3rd column of the 2D array
     ticketInfo[1][2] = 5;
    
     // get a value from a 2D array
     int value = ticketInfo[1][0];
     String name = seatingInfo[0][1];
    
     // get the number of rows and columns
     int rows = ticketInfo.length; // returns the number of rows
     int cols = ticketInfo[0].length; // returns the number of columns 
     
  }
  
}