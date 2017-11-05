package lab03;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayFromFile{
	
	private int[] array;
	public ArrayFromFile(String filename){
		try(Scanner sc = new Scanner(new File(filename))){
			int length = sc.nextInt();
			array = new int[length];
			for(int i=0;i<length;i++){
				array[i] = sc.nextInt();
			}		
		} catch(Exception e) {
		array = new int[0];
		}	
	}
	
	public void removeOddElements(){
		int numEven = 0;
		for(int x: array){
			if(x%2==0){
				numEven++;
			}
		}
		int[] tempArr = new int[numEven];
		int index=0;
		for(int x: array){
			if(x%2==0){
				tempArr[index]=x;
				index++;
			}
		}
		array = tempArr;
	}

	public int[] getArray(){
		return array;
	}
	
	public String toString(){
		return Arrays.toString(array);
	}
}
