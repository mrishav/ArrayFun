package ArrayFun;
// 
// Class Description: Modify and test different Array features with Rectangle Objects and Integers
import java.util.Random;
import java.lang.Exception;

public class ArrayFun {
  
  public static void main (String[] args) {
    
    
    RectangleFun();
    IntegerFun();
  }
  
  // Integer Array
  public static void IntegerFun () {
    // Make Int List
    int[] intList = new int[10];
    Random r = new Random();
    
    // Assign random number to each value from 0-8 index
    for (int i = 0; i < 8; i++) {
      intList[i] = r.nextInt(26) - 10;
      System.out.print(intList[i] + " ");
    }
    
    System.out.println();
    
    int sum = 0;
    int lowestValue = Integer.MAX_VALUE;
    int lowestIndex=-1;
    // Loop through in order to get the sum and lowest value
    for (int i : intList) {
      sum += i;
    }
    
    for(int i=0;i<intList.length;i++){
    	if(intList[i]<lowestValue){
    		lowestValue=intList[i];
    				lowestIndex=i;
    	}
    }
    // Print information
    System.out.println("The sum is " + sum);
    System.out.println("The lowest index is " + lowestIndex);
    
  }
  
  // Rectangle Array 
  public static void RectangleFun () {
    // Create Rectangle Array
    Rectangle[] rectList = new Rectangle[5];
    // Create a Random object 
    Random r = new Random();
    
    // Loop through each index
    for (int i = 0; i < rectList.length; i++){
      rectList[i] = new Rectangle(r.nextInt(10) + 1, r.nextInt(10) + 1);
    }
    
    // Print the length of 3rd index value
    System.out.println(rectList[2].getLength());
    
    // Set the width of last index value to 5
    rectList[rectList.length - 1].setWidth(5);
    
    // Print the width of last index value
    System.out.println(rectList[rectList.length - 1].getWidth());
      
    // ArrayOutOfBoundsException
    // Try to get a value outside of the array bounds and catch it
    try {
      System.out.println(rectList[rectList.length]);
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }
    
    // NullPointerException
    // Try to get a value that doesn't exist
    try {
      String str = null;
      System.out.println(str.length());
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
  
  
}