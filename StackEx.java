/*Write a program to declare stack.Store 10 elements into it.Remove 4 elements from
 stack and display it.*/

package ksy_java;

import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		
        // Creating a Stack object to store Integer values
        Stack<Integer> obj = new Stack<>();
  
        // Array containing 10 values to push into the stack
        int[] val = {12, 87, 65, 42, 36, 12, 98, 78, 36, 66};
    
        // Pushing each element from the array into the stack
        for (int val1 : val) {
            obj.push(val1);
        }

        // Displaying the full stack after pushing elements
        System.out.println("Full Stack Elements: " + obj);
    
        // Removing the top 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            obj.pop();
        }
    
        // Displaying the stack after popping 4 elements
        System.out.println("After Popped Elements: " + obj);
	}
}
