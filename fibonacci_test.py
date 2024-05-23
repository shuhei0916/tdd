import unittest
from fibonacci import fib

class TestFibonacci(unittest.TestCase):
    # fib(0)は0を返す
    def test_fib(self):
        for n, expected in ((0, 0), (1, 1), (2, 1), (3, 2)):
            with self.subTest(n=n):
                self.assertEqual(fib(n), expected) # expectedが第2引数（Juinitと逆！）
    
    
if __name__ == '__main__':
    unittest.main()