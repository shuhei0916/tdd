package money;

// Expression（式）
// interfaceはあまりにも曖昧すぎて特別扱いされた抽象クラス
interface Expression {
	Expression times(int multiplier);
	Expression plus(Expression addend);
	Money reduce(Bank bank, String to);
}

// 抽象メソッドは現時点では何をするのかを確定できないメソッド
// 抽象クラスは抽象メソッドを含むクラス