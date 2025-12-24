//Program to demonstrate generic method
package com.tnsif.generics;

public class GenericMethod {
	//Generic Method
		public <E> void displayArrayElements(E[] elements) {
	//enhanced for loop or foreach loop		
			for (E element : elements) {
			
				System.out.println("element is: " + element);
			}
		}
}
