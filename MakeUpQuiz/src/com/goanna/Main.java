package com.goanna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	
    	
    //1.create a new array list, add some colors (string) and print out the collection.
    	List<String> list_Strings = new ArrayList<String>();
    	list_Strings.add("Blue");
    	list_Strings.add("Purple");
    	list_Strings.add("Green");
    	list_Strings.add("White");
    	list_Strings.add("Yellow");
    	
    	System.out.println(list_Strings);

    //2.iterate through all elements in the array list and print each one to the console.
    	ArrayList<String> coloursList = new ArrayList<String>(Arrays.asList("blue", "purple", "green", "white", "yellow"));
    	
    	for(String colour : coloursList) {
    		System.out.prinln(colour);
    	}
    	

    //3.remove the third element from an array list.
    	list_Strings.remove(3);
    }
}





