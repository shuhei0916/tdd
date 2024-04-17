# メソッドが走ったかどうかをテストするクラス
class WasRun:
    def __init__(self, name):
        self.wasRun = None
        self.name = name
    def run(self):
        # self.testMethod() # runメソッドを呼べば、testMethodが間接的に呼び出される
        method = getattr(self, self.name)
        print(method)
        method()
    def testMethod(self):
        self.wasRun = 1


test = WasRun("testMethod") # テストケースにフラグを用意
print(test.wasRun) # フラグがfalseであることを確認
test.run() 
print(test.wasRun) # フラグがtrueになったことを確認
