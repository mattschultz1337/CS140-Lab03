package lab03;
import java.util.Arrays;

public class ArrayTester{
	public static void main(String[] args){
		int numArgs = args.length;
		if(numArgs ==1){
			ArrayFromFile testArr = new ArrayFromFile(args[0]);
			System.out.println("Expected Output: [20, 8, 13, 46, 7]");
			System.out.println("Actual Output:   " + testArr);
			testArr.removeOddElements();
			System.out.println();
			System.out.println("Remove Odd");
			System.out.println("Expected Output: [20, 8, 46]");
			System.out.println("Actual Output:   " + testArr);
		}
		else{
			throw new IllegalArgumentException("The Program requires exactly one args");	
		}
		int[] intArr = new int[5];
		System.out.println(Arrays.toString(intArr));
		int n = 0;
		for (int i : intArr) {
  			i = n;
    			n++; // shorthand to increment by 1
		}	
		System.out.println(Arrays.toString(intArr));	
		String[] s = {"This","lab","is","easy!"};
		for(String word: s){
			System.out.print(word + " " + word.length() + " ");
		}
	}
}
