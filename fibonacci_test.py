import unittest
from fibonacci import fib

class TestFibonacci(unittest.TestCase):
    # 0を返す
    def test_zero(self):
        self.assertEqual(0, fib(0))
    
if __name__ == '__main__':
    unittest.main()