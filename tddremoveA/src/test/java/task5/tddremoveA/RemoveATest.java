package task5.tddremoveA;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class RemoveATest {
	
	/*
	 * TODO List:
	 * 1. First 2 char 'A' AABABA ==> BABA -success
	 * 2. First char 'A'   ABAABA ==> BAABA
	 * 3. Second char 'A'  BAAAAA ==> BAAAA
	 * 4. First 2 char 'A'(Total String) AA     ==> ""
	 * 5. First char 'A'(Total String)   ==>""
	 * 5. Empty char       " "    ==> " "
	 */
     RemoveA r;
     
	@BeforeEach
	void ObjectCreation()
	{
		r=new RemoveA();
	}
	@Test
	void testFirst2Char() {
		
		assertEquals("BABA",r.remove("AABABA"));
	}
	@Test
	void testFirstChar() {
		assertEquals("BAABA",r.remove("ABAABA"));
	}
	@Test
	void testSecondChar() {
		assertEquals("BAAAA",r.remove("BAAAAA"));
	}
	@Test
	void testTotalA() {
		assertEquals("",r.remove("AA"));
	}
	@Test
	void testOnlyA() {
		assertEquals("",r.remove("A"));
	}
	@Test
	void testEmptyString() {
		assertEquals(" ",r.remove(" "));
	}
	
	
	
	

}
