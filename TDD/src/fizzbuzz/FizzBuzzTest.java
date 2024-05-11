package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	
	private FizzBuzz fizzbuzz;
	@BeforeEach
	void 前準備() {
		fizzbuzz = new FizzBuzz();
	}
	
	@Test
	void _1を渡すと文字列1を返す() throws Exception {
		assertEquals("1", fizzbuzz.convert(1));
		
	}
	
	// 1 assertion per test principle
	@Test
	void _2を渡すと文字列2を返す() throws Exception {
		assertEquals("2", fizzbuzz.convert(2));
		
	}
	@Test
	void _3を渡すと文字列Fizzを返す() throws Exception {
		assertEquals("Fizz", fizzbuzz.convert(3));
		
	}
	@Test
	void _5を渡すと文字列Buzzを返す() throws Exception {
		assertEquals("Buzz", fizzbuzz.convert(5));
		
	}

}
