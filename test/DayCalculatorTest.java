import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DayCalculatorTest {
	
	DayCalculator dayCalculator;
	@Before
	public void setUp() throws Exception {
		dayCalculator = new DayCalculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test00010101() throws Throwable {
		assertEquals("Mon",dayCalculator.getDay(1,1,1));
	}
	@Test
	public void test00010102() throws Throwable {
		assertEquals("Tue",dayCalculator.getDay(1,1,2));
	}
	@Test
	public void test00010103() throws Throwable {
		assertEquals("Wen",dayCalculator.getDay(1,1,3));
	}
	@Test
	public void test00010104() throws Throwable {
		assertEquals("Thu",dayCalculator.getDay(1,1,4));
	}
	@Test
	public void test00010110() throws Throwable {
		assertEquals("Wen",dayCalculator.getDay(1,1,10));
	}
	@Test
	public void test00010201() throws Throwable {
		assertEquals("Thu",dayCalculator.getDay(1,2,1));
	}
	@Test
	public void test00010202() throws Throwable {
		assertEquals("Fri",dayCalculator.getDay(1,2,2));
	}
	@Test
	public void test00010301() throws Throwable {
		assertEquals("Thu",dayCalculator.getDay(1,3,1));
	}
	@Test
	public void test00010401() throws Throwable {
		assertEquals("Sun",dayCalculator.getDay(1,4,1));
	}
	@Test
	public void test00020101() throws Throwable {
		assertEquals("Tue",dayCalculator.getDay(2,1,1));
	}
	@Test
	public void test00030101() throws Throwable {
		assertEquals("Wen",dayCalculator.getDay(3,1,1));
	}
	@Test
	public void test00040101() throws Throwable {
		assertEquals("Thu",dayCalculator.getDay(4,1,1));
	}
	@Test
	public void test20160407() throws Throwable {
		assertEquals("Thu",dayCalculator.getDay(2016,4,7));
	}
	@Test
	public void testIsLeap1(){
		assertFalse(dayCalculator.IsLeap(1));
	}
	@Test
	public void testIsLeap2(){
		assertFalse(dayCalculator.IsLeap(2));
	}
	@Test
	public void testIsLeap3(){
		assertFalse(dayCalculator.IsLeap(3));
	}
	@Test
	public void testIsLeap4(){
		assertTrue(dayCalculator.IsLeap(4));
	}
	@Test
	public void testIsLeap5(){
		assertFalse(dayCalculator.IsLeap(5));
	}
	@Test
	public void testIsLeap8(){
		assertTrue(dayCalculator.IsLeap(8));
	}
	@Test
	public void testIsLeap100(){
		assertFalse(dayCalculator.IsLeap(100));
	}
	@Test
	public void testIsLeap200(){
		assertFalse(dayCalculator.IsLeap(200));
	}
	@Test
	public void testIsLeap400(){
		assertTrue(dayCalculator.IsLeap(400));
	}
	@Test(expected = Exception.class)
	public void test20160450() throws Exception{
		dayCalculator.getDay(2016, 4, 50);
	}
}
