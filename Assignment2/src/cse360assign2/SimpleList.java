package cse360assign2;

/**
 * 
 * @author Misgana Gebremariam
 * @Class_ID: 389
 * @Date: 02/26/2020
 * CSE360 Assignment 1
 * 
 * @Description:
 * SimpleList class contains one constructor and five methods which allows to add,search,remove,print and count
 * array elements.
 * 
 * Methods: Add, remove,count,search and toString
 * 
 * There is additional get method which being used to retrieve elements and used to work with the other methods 
 *  
 */
import java.util.*;
import java.util.Arrays;

public class SimpleList 
{
	
	private int [] list;
	private int count;

	/**
	 * Constructs and initializes an integer array containing 10 elements
	 * @param list     An array with size of 10 elements
	 * @param count    number of elements in  the list array 
	 * 
	 */
	public SimpleList()
	{
		this.list = new int[10];
		this.count = 0;
	}
	
	
	/**
	 * Adds elements to index 0 of list array
	 * Count will be incremented by one each time an element is added
	 * Existing elements will shift to the right by one
	 * Increases the array size by 50 percent if the array is full when adding element
	 * @param input
	 */
	public void add(int input) 
	{
		if(count == 0) 
		{
			list[0] = input;
			count++;
		}
		else if(count < 10)
		{
			for(int index = count; index > 0; index--) 
			{
				list[index] = list[index - 1];
			}
			list[0] = input;
			count++;
		}
		else 
		{
			if(count < list.length) 
			{
				//add elements in the new array
				for(int index = count; index >= 1; index--) 
				{
					list[index] = list[index - 1];
				}
				list[0] = input;
				count++;
			}
			else 
			{
				//increase the size of the array by 50% (by 5)
				int increaseBy = list.length/2;
				
				list = Arrays.copyOf(list, (list.length + increaseBy));
				
				for(int index = count; index >= 1; index--) 
				{
					list[index] = list[index - 1];
				}
				list[0] = input;
				count++;
			}
		}
			
			
	 }
		
	
	/**
	 * add an element at the end of the array
	 * 
	 */
	
	public void append(int input) 
	{
		if(count == 0) 
		{
			list[0] = input;
			count++;
		}
		else
		{
			if(count < 10) 
			{
				list[count] = input;
				count++;
				
			}
			else 
			{
				//increase the size of the array by 50% 
				int increaseBy = list.length/2;
				
				list = Arrays.copyOf(list, (list.length + increaseBy));
				
				list[count + 1] = input;
				count++;
			}
			
		}
		
	} 
	
	
	
	/**
	 *  Returns the first element otherwise it will return -1
	 * @return
	 */
	public int first()
	{
		if(count > 0) 
		{
			return list[0];
		}
		return -1;
		
	}
	/***
	 *  Returns the last element of the List Array
	 * @return
	 */
	public int last()
	{
		if(count > 0) 
		{
			return list[count];
		}
		return -1;
		
	}
	
	/**
	 *  Returns the size of the List Array
	 * @return
	 */
	
	public int size() 
	{
		return list.length;
	}
	
	
	/**
	 *  Returns element value when an index passed 
	 * @param input  
	 * @return
	 */
	public int get(int input)
	{
		if(input >= 9) return -1;
		return list[input];
	}
	
	
	/**
	 * Removes an element with with the lowest index value
	 * Decrease the array size by 25%  if there are empty slots
	 * if there are multiple same elements 
	 * Returns -1 if the element does not exits
	 * @param input 
	 */
	public void remove(int input) 
	{	
		int index = search(input);
		
		// loop through and remove the element when found 
		if (index != -1) 
		{
		
		     list[index] = list[index + 1];
		     count--; 
		        
	     } 
		
		int emptySpaces = list.length - count ;     // number of empty spaces
		int limit = (list.length)/4;
		
		if(emptySpaces >= limit && count > 10) 
		{
	 	 	list = Arrays.copyOf(list, (list.length - limit));
	 	 	//count = count - limit; // update count 
	 	}
		
		
	}
	

	/**
	 * Returns the number of elements in the list 
	 * Count is less or equal to 10 
	 * @return   Integer between 1 - 10 
	 */
	public int count() 
	{
		return count;
	}
	
	
	
	/**
	 * Searches a given element from the list array and returns the index
	 * if element is not found return -1
	 * @param input
	 * @return index
	 */
	public int search(int input) 
	{
		for(int index = 0; index <= list.length;index++) 
		{
			if(input == list[index]) 
			{
				return index;
			}
		}
	 
		return -1;
	}
	
	
	
	/**
	 * Returns the elements of the list array with spaces in between except
	 * the last index (index 9) element will not have a space at the end.
	 * @return  Must a string with integers 
	 */
	public String toString() 
	{
		// Temporary String variable to hold elements before returning
		String temp = "";
		
        for(int index = 0; index < count; index++) 
      {
	    	 if(index < count - 1) 
	    	 {
	    		 temp = temp + list[index] + " ";
	    	 }
	    	 else 
	    	 {
	    		 temp += list[index]; 
	    	 }
   	 
      }
  
		return temp;
	}
	
}

