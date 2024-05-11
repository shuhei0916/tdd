package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void _1を渡すと文字列1を返す() throws Exception {
		// 準備Arrange
		FizzBuzz fizzbuzz = new FizzBuzz();
		// 実行Act&検証Assert
		assertEquals("1", fizzbuzz.convert(1));
		
	}
	
	// 1 assertion per test principle
	@Test
	void _2を渡すと文字列2を返す() throws Exception {
		// 準備Arrange
		FizzBuzz fizzbuzz = new FizzBuzz();
		// 実行Act&検証Assert
		assertEquals("2", fizzbuzz.convert(2));
		
	}

}
