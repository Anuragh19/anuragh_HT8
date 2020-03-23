package com.vnr.anuragh;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTask {

	static RemoveAFromStart2Positions removeA;
	@BeforeEach
	void init() {
		removeA=new RemoveAFromStart2Positions();
	}
	/*
	 * emptyString: "" -> "" 
	 * singleA: "A" -> ""    
	 * twoA's: "AA" -> ""  
	 * 3 A's: "AAA"->"A"
	 * A only at position 2: "BA" -> "B"  
	 * A only at position 1: "AB" -> "B"
	 * string starting with 2 A's : "AABECDA" -> "BECDA" 
	 * string without any starting 2 A's: "BCDAAA"->"BCDAAA"
	 */
	@Test
	void emptyString() {
		assertEquals("",removeA.removingA(""));
	}
	@Test
	void singleAOfLength1()
	{
		assertEquals("",removeA.removingA("A"));
	}
	@Test
	void doubleAAtStartingTwoPositions()
	{
		assertEquals("",removeA.removingA("AA"));
	}
	@Test
	void stringWith3A()
	{
		assertEquals("A",removeA.removingA("AAA"));
	}
	@Test
	void stringOfSize2HavingAAtIndex0()
	{
		assertEquals("B",removeA.removingA("AB"));
	}
	@Test
	void stringOfSize2HavingAAtIndex1()
	{
		assertEquals("B",removeA.removingA("BA"));
	}
	@Test
	void stringWithStarting2A()
	{
		assertEquals("BCDA",removeA.removingA("AABCDA"));
	}
	@Test
	void RandomString()
	{
		assertEquals("BCDAAA",removeA.removingA("BCDAAA"));
	}
}
