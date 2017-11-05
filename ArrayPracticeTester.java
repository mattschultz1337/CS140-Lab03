package lab03;
import java.util.Arrays;
import static lab03.ArrayPractice.*;
public class ArrayPracticeTester{
    public static void test(String expected, int[] actual) {
        System.out.println("Expected: " + expected + ", received: " + Arrays.toString(actual));
    }

    public static void test(int[] expected, int[] actual) {
        System.out.println("Expected: " + Arrays.toString(expected) + ", received: " + Arrays.toString(actual));
    }

    public static void test(boolean expected, boolean actual) {
        System.out.println("Expected: " + expected + ", received: " + actual);
    }




    public static void main(String[] args){
        
        
        //Testing arrays
        int[] ArrayFromInt1={1,2,3,4,5,6};
        int[] ArrayFromInt2={6,5,4,3,2,1};
        int[] ArrayFromInt3={};
        int[] ArrayFromInt4=null;
        int[] ArrayFromInt5={5,9,2,0,0,8,1};
        int[] ArrayFromInt6={1,8,0,0,2,9,5};
        
        
        
        
        //Average tests
        System.out.println("//Average Test: ");
        System.out.println("Expected: 3.5" + " Received: "+ average(ArrayFromInt1));
        System.out.println("Expected: 3.5" + " Received: "+ average(ArrayFromInt2));
        System.out.println("Expected: 0.0" + " Received: "+ average(ArrayFromInt3));
        try{
            average(ArrayFromInt4);
            System.out.println("Test Failed: Exception not thrown!");
        }catch(IllegalArgumentException e){
            System.out.println("Caught the illegal argument exception!");
        }
           
        
        //Reverse tests
        System.out.println("\n//Reverse Test: ");
        test(ArrayFromInt2,reverse(ArrayFromInt1));
        test(ArrayFromInt1,reverse(ArrayFromInt2));
        test(ArrayFromInt3,reverse(ArrayFromInt3));
        test(ArrayFromInt4,reverse(ArrayFromInt4));
        test(ArrayFromInt6,reverse(ArrayFromInt5));        
        
        //EvenIndicesOnly tests
        System.out.println("\n//EvenIndicesOnly Test: ");
        test("[1,3,5]",evenIndicesOnly(ArrayFromInt1));
        test("[6,4,2]",evenIndicesOnly(ArrayFromInt2));
        test("[]",evenIndicesOnly(ArrayFromInt3));
        test("Null",evenIndicesOnly(ArrayFromInt4));
        
        //Concatenate tests
        System.out.println("\n//Concatenate Test: ");
        test("[1,2,3,4,5,6,6,5,4,3,2,1]",concatenate(ArrayFromInt1,ArrayFromInt2));
        test("[6,5,4,3,2,1,1,2,3,4,5,6]",concatenate(ArrayFromInt2,ArrayFromInt1));
        test("[]",concatenate(ArrayFromInt3,ArrayFromInt3));
        test("[1,2,3,4,5,6]",concatenate(ArrayFromInt3,ArrayFromInt1));
        test("[1,2,3,4,5,6]",concatenate(ArrayFromInt1,ArrayFromInt3));
        try{
            test("Null",concatenate(ArrayFromInt4,ArrayFromInt4));
            System.out.println("Test Failed: Exception not thrown!");
        }catch(IllegalArgumentException e){
            System.out.println("Caught the illegal argument exception!");
        }
        
        //IsIncreasing tests
        System.out.println("\n//IsIncreasing Test: ");
        test(true,isIncreasing(ArrayFromInt1));
        test(false,isIncreasing(ArrayFromInt2));
        test(false,isIncreasing(ArrayFromInt3));
        test(false,isIncreasing(ArrayFromInt4));  
        
        //EndtoEnd tests
        System.out.println("\n//EndtoEnd Test: ");
        test("[1,2,3,4,5,6,6,5,4,3,2,1]",endToEnd(ArrayFromInt1,ArrayFromInt1));
        test("[6,5,4,3,2,1,1,2,3,4,5,6]",endToEnd(ArrayFromInt2,ArrayFromInt2));
        test("[]",endToEnd(ArrayFromInt3,ArrayFromInt3));
        test("[6,5,4,3,2,1]",endToEnd(ArrayFromInt3,ArrayFromInt1));
        test("[1,2,3,4,5,6]",endToEnd(ArrayFromInt1,ArrayFromInt3));
        try{
            test("Null",endToEnd(ArrayFromInt4,ArrayFromInt4));
            System.out.println("Test Failed: Exception not thrown!");
        }catch(IllegalArgumentException e){
            System.out.println("Caught the illegal argument exception!");
        }
        
        
        //ReverseInPlaces tests
        System.out.println("\n//ReverseInPlace Test: ");
        reverseInPlace(ArrayFromInt1);
        test("[6,5,4,3,2,1]",ArrayFromInt1);
        reverseInPlace(ArrayFromInt2);
        test("[1,2,3,4,5,6]",ArrayFromInt2);
        reverseInPlace(ArrayFromInt3);
        test("[]",ArrayFromInt3);
        reverseInPlace(ArrayFromInt4);
        test("Null",ArrayFromInt4);
        reverseInPlace(ArrayFromInt6);
        test("[5,9,2,0,0,8,1]",ArrayFromInt6);
        
        
        
    }
    
    
}