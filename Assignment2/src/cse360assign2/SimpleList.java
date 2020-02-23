package cse360assign2;

/**
 * 
 * @author Misgana Gebremariam
 *  
 * @Class_ID: 389
 * @Date: 02/10/2020
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
	 * @param input
	 */
	public void add(int input) 
	{
		if(count == 0) 
		{
			list[0] = input;
			count++;
		}
		else 
		{
			if(count == 10) count--;
			for(int index = count; index > 0; index--) 
			{
				list[index] = list[index - 1];
			}
			list[0] = input;
			count++;
			
			
		}
		
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
	 * if there are multiple same elements 
	 * Returns -1 if the element does not exits
	 * @param input 
	 */
	public void remove(int input) 
	{	
		int index = search(input);
		
		if (index != -1) 
		{
		    for (index = 0; index < count; index ++) 
		    {
		         list[index] = list[index + 1];
		    }
		         count--;
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
	
	
	
	/**
	 * Searches a given element from the list array and returns the index
	 * if element is not found return -1
	 * @param input
	 * @return index
	 */
	public int search(int input) 
	{
		for(int index = 0; index <= count;index++) 
		{
			if(input == list[index]) 
			{
				return index;
			}
		}
	 
		return -1;
	}

}

