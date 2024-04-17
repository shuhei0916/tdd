# メソッドが走ったかどうかをテストするクラス
class WasRun:
    def __init__(self, name):
        self.wasRun = None
    def testMethod(self):
        self.wasRun = 1


test = WasRun("testMethod") # テストケースにフラグを用意
print(test.wasRun) # フラグがfalseであることを確認
test.testMethod() # テストメソッドを走らせる
print(test.wasRun) # フラグがtrueになったことを確認
