class TestCase:
    def __init__(self, name):
        self.name = name
    def run(self):
        method = getattr(self, self.name)
        method()


# メソッドが走ったかどうかをテストするクラス
class WasRun(TestCase):
    def __init__(self, name):
        self.wasRun = None
        super().__init__(name)
    def testMethod(self):
        self.wasRun = 1


class TestCaseTest(TestCase):
    def testRunning(self):
        test = WasRun("testMethod") # テストケースにフラグを用意
        assert(not test.wasRun) # フラグがfalseであることを確認
        test.run() 
        assert(test.wasRun) # フラグがtrueになったことを確認

TestCaseTest("testRunning").run()
