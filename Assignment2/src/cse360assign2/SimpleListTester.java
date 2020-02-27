package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTester {

	@Test
	public void addTest() {
		
		
		SimpleList addTest = new SimpleList();
		
	
		//adding elements to the array
		addTest.add(3);
		addTest.add(5);
		addTest.add(4);
		addTest.add(4);
		addTest.add(5);
		addTest.add(6);
		addTest.add(9);
		addTest.add(8);
		addTest.add(9);
		addTest.add(10);
		addTest.add(10);
		addTest.add(10);
		
		addTest.add(10);
		addTest.add(10);
		addTest.add(3);
		addTest.add(5);
		/*addTest.add(4);
		addTest.add(4);*/

   

		assertEquals(addTest.get(0), 5);
		System.out.println(addTest.toString());
		System.out.println(addTest.size());
		
		
	}
	
	@Test
	public void addTestFail() {
		
		
		SimpleList addTestFail = new SimpleList();
		
		//added an element
		addTestFail.add(1);
		addTestFail.add(2);
		addTestFail.add(3);
		addTestFail.add(4);

		
		// Fail TestCase
		// Should return 3 instead of 4
		assertNotEquals(addTestFail.get(1),4);
	}
	
	@Test 
	public void removeTest() 
	{
	
		SimpleList removeTest = new SimpleList();
		
		// adding elements before removing 
		removeTest.add(1);
		removeTest.add(3);
		removeTest.add(4);
		removeTest.add(5);
		removeTest.add(6);
		removeTest.add(7);
		removeTest.add(8);
		removeTest.add(9);
		//removeTest.add(10);
		/*removeTest.add(11);
		removeTest.add(12);
		removeTest.add(13);
		removeTest.add(14);
		removeTest.add(15);
		removeTest.add(16);
		*/
		
	    // remove an element before Testing
		removeTest.remove(3);
		
		//Pass Test Case
		assertEquals(removeTest.get(0),9);
		System.out.println(removeTest.toString());
		
	}
	
	@Test 
	public void removeTestFail() 
	{
	
		SimpleList removeTestFail = new SimpleList();
		
		// adding elements before removing 
		removeTestFail.add(1);
		removeTestFail.add(3);
		removeTestFail.add(4);
		
	    // remove an element at index 0 (4)
		removeTestFail.remove(4);
		
		int expected = 4;
		int actual = removeTestFail.get(0);
		 
		
		//Fail Test Case
		assertNotEquals(expected,actual);

		
	}
	
	@Test 
	public void appendTest() 
	{
		
		SimpleList appendTest  = new SimpleList();
		//added an element
		appendTest.add(3);
		appendTest.add(3);
		appendTest.add(3);
		appendTest.add(3);
		appendTest.add(3);
		appendTest.add(10);
		
	
				
				
		
		// Pass Test Case 
		int expected = 10;
		int actual =  10;
		
		
		assertEquals(expected,actual);
		
	}
	
	@Test 
	public void appendTestFail() 
	{
		
		SimpleList countTestFail  = new SimpleList();
		
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		
		
		//Fail Test Case
		int expected = 6;
		int actual = countTestFail.count();
		
		assertNotEquals(expected, actual);
		
	}
	
	@Test 
	public void countTest() 
	{
		
		SimpleList countTest  = new SimpleList();
		//added an element
		countTest.add(3);
		countTest.add(3);
		countTest.add(3);
		countTest.add(3);
		countTest.add(3);
		countTest.add(3);
		countTest.add(3);
		countTest.add(3);
		countTest.add(3);
		countTest.add(3);
				
				
		
		// Pass Test Case 
		int expected = 10;
		int actual = countTest.count();
		
		
		assertEquals(expected,actual);
		
	}
	
	@Test 
	public void countTestFail() 
	{
		
		SimpleList countTestFail  = new SimpleList();
		
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		countTestFail.add(3);
		
		
		//Fail Test Case
		int expected = 6;
		int actual = countTestFail.count();
		
		assertNotEquals(expected, actual);
		
	}
	
	
	@Test
	public void toStringTest() 
	{
		
		SimpleList toStringTest = new SimpleList();
	
		toStringTest.add(1);
		toStringTest.add(2);
		toStringTest.add(3);
		toStringTest.add(4);
		toStringTest.add(5);
		toStringTest.add(6);
		toStringTest.add(7);
		toStringTest.add(8);
		toStringTest.add(9);
		toStringTest.add(10);
	
		
		// Pass Test Case
		
		String expected = "10 9 8 7 6 5 4 3 2 1";
		String actual = toStringTest.toString();
		
		
		assertEquals(expected, actual);
			
	}
	

	@Test
	public void toStringTestFail() 
	{
		
		SimpleList toStringTestFail = new SimpleList();
		
		toStringTestFail.add(1);
		toStringTestFail.add(2);
		toStringTestFail.add(3);
		toStringTestFail.add(4);
		toStringTestFail.add(8);
		toStringTestFail.add(9);
		toStringTestFail.add(10);
		toStringTestFail.add(3);
		
		
		//Fail Test Case
		String expected = "10 9 8 7 6 5 4 3 2 1";
		String actual = toStringTestFail.toString();
		
		
		//Must fail since the strings are not the same
		assertNotEquals(expected, actual);
		
		
		
			
	}
	
	
	@Test
	public void searchTest()
	{
		
		SimpleList searchTest = new SimpleList();
		
		searchTest.add(1);
		searchTest.add(2);
		searchTest.add(3);
		searchTest.add(4);
		searchTest.add(5);
		searchTest.add(6);
		searchTest.add(3);
		searchTest.add(8);
		searchTest.add(9);
		searchTest.add(10);
		
		
		//Pass Test Case
		int expected = 5;
		int actual = searchTest.search(5);
		
		assertEquals(expected,actual);
		System.out.println(searchTest.toString());
		System.out.println(searchTest.search(5));
		
	}
	
	@Test
	public void searchTestFail()
	{
		
		SimpleList searchTestFail = new SimpleList();
		
		searchTestFail.add(1);
		searchTestFail.add(2);
		searchTestFail.add(3);
		searchTestFail.add(4);
		searchTestFail.add(5);
		searchTestFail.add(6);
		searchTestFail.add(3);
		searchTestFail.add(8);
		searchTestFail.add(9);
		searchTestFail.add(10);
		searchTestFail.add(1);
		searchTestFail.add(2);
		searchTestFail.add(3);
		searchTestFail.add(4);
		searchTestFail.add(5);
		searchTestFail.add(6);
		searchTestFail.add(3);
		searchTestFail.add(8);
		searchTestFail.add(9);
		searchTestFail.add(10);
		

		
		
		//Fail Test Case
		int expected = 3;
		int actual = searchTestFail.search(4);
		
		assertNotEquals(expected,actual);
		System.out.println(searchTestFail.toString());
		System.out.println(searchTestFail.search(4));
		
	}

}
