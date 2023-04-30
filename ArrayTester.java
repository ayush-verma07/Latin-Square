public class ArrayTester {
  
  public static int[] getColumn(int[][] arr2D, int c) 
  {
     int[] x = new int[arr2D.length];public class ArrayTester {
    
    
    /**
     * Returns an array containing the elements of column c of arr2D in the same order as
     * theyD appear in arr2D
     * @param arr2D valid 2D array with at least 1 row.
     * @param c is a valid column index in arr2D
     * @return arr2D is unchanged
     */
    public static int[] getColumn(int[][] arr2D, int c)
    {
        int a = 0;
        
        while(a < arr2D.length) {
           x[a] = arr2D[a][c];
           a++;
        }
        
        return x;
  }
   
   /**
     * Returns true if and only if every value in arr1 appears in arr2
     * Precondition: arr1 and arr2 have the same length
     * @param arr1 valid array with at least 1 index
     * @param arr2 valid array with at least 1 index
     * @return arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2)
    {
              boolean y = false;
        for(int i = 0; i < arr1.length; i++) {
           for(int j = 0; j < arr2.length; j++) {
              if(arr1[i] == arr2[j]) {
                 y = true;
                 break;
              }
           }
           if(!y) {return false;}
        }
        return true;
    }
       /**
     * Returns true if arr contains any duplicate values; false otherwise
     * @param arr valid arr with at least 1 index
     * @return arr is unchanged.
     */
    public static boolean containsDuplicates(int[] arr)
    {  
       for(int i = 0; i < arr.length - 1; i++) {
           for(int j = i + 1; j < arr.length; j++) {
              if(arr[i] == arr[j]) {return true;}
           }
        }
        return false;
    }
           }
    
    /**
     * Returns true if  square is a Latin square as described, false otherwise
     * @param square has an equal number of rows and columns.
     *               has at least 1 row.
     *@return square remains unchanged
     */
    
    public static boolean isLatin(int[][] square) {
       if(containsDuplicates(square[0])) {return false;}
        
        boolean b;
           for(int i = 0; i < square.length; i++) {
              b = hasAllValues(square[0], square[i]);
              if(!b) {return false;}
           }
        
        boolean x;
        for(int a = 0; a < square.length; a++) {
           int[] col = getColumn(square, a);
           x = hasAllValues(square[0], col);
           if(!x) {return false;}
           
        }
        
        return true;
    }
       
}
