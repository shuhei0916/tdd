package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
//	実装が関数ひとつだけなため、テストクラスの中に実装コードも書く。
	int fib(int n) {
		if (n == 0) return 0;
		if (n == 2) return 1;
		return fib(n - 1) + fib(n - 2);
		
	}
	@Test
	public void testFibonacci() {
		int cases[][] = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
		for (int i = 0; i < cases.length; i++)
			assertEquals(cases[i][1], fib(cases[i][0])); // 第1引数が期待値、第2引数が実測値
	}
}
