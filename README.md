# tdd
## Description
テスト駆動開発の写経用レポジトリです。
~~第1部の他国通貨はeclipseで開発し、Git管理していません（eclipse-git間の連携があまりうまくいかなかったためです。要勉強）~~
~~そのため、第2部のpythonコードを管理します。~~ 

第1部の他国通貨も追加しました（2024/05/10）。

TDD-BootCamp2020で行われたFizzBuzz問題の写経を追加しました（2024/05/11）。
[TDD Boot Camp 2020 ライブコーディング](https://www.youtube.com/watch?v=Q-FJ3XmFlT8&t=1145s&ab_channel=TDDBC-Online)

## About TDD(Test Driven Development)
### The Cycle of TDD
1. 次の目標を考える
2. その目標を示すテストを書く
3. そのテストを実行して失敗させる(Red)
4. 目的のコードを書く
5. 2で書いたテストを成功させる(Green)
6. テストが通るまでリファクタリングを行う(Refactor)
7. 1~6を繰り返す

### The Skill of TDD
- 問題を小さく分割する
- 歩幅を調整する
    - テスト -> 仮実装 -> 三角測量 -> 実装
    - テスト -> 仮実装 -> 実装
    - テスト -> 明白な実装
- テストの構造化とリファクタリング