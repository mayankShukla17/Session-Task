package com.stackroute;
/*Write a Java Program
1. Create a method to accept the 10 String elements in an ArrayList. If user try to 
	add more than 10 elements program must throw an error
2. Create a method to arrange the elements in ascending order.
3. Create a method to display the elements, program must stop displaying the elements 
if null found.
*/
import java.util.*;
public class CollectionProgram {
	//Main Method Code Runner
	public static void main(String[] args) throws Exception {
		CollectionProgram cp=new CollectionProgram();
		List<String> elements=new ArrayList<String>();
		elements=cp.intputProducts();
		System.out.println(elements);
		elements=cp.ascendingOrder(elements);
		System.out.println("Sorted Elements "+elements);
		cp.displayOutput(elements);
	}

	//Method for taking Input
	public List<String> intputProducts() throws Exception {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Elements");
		String string=scanner.nextLine();
		String[] array=string.split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		if(list.size()>10)
			throw new Exception("Size must be below 10");
		return list;
	}
	//Method for ascending order
	public List<String> ascendingOrder(List<String> list){
		Collections.sort(list);
		return list;
	}

	//Method for displaying output
	public void displayOutput(List<String> list) {
		List<String> outputEle=list;
		boolean nonNullElemExist= false;
		for (String string:outputEle) {
		  if (string == null) {
		     nonNullElemExist = true;
		     break;
		  }
		  else 
			  System.out.println(string);
		}
	}
}
