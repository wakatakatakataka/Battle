# アプリ名
Battle.Stadium〜火・水・草〜

＊ コード等の管理は、Android Studioで行っております。

  Android Studioで管理していたコードを手動でこちらに反映しているため、first commmitになっております。

# 概要
ミニゲームアプリを作成しました。

対象年齢は、6歳以下です。

3つの属性から攻撃する属性を選択し、選択された属性とコンピュータ（相手側）とのタイプ相性をランダムに確認できます。

選んだ属性によって、「効果は抜群だ」・「効果はいまひとつだ」を判定してくれます。

# 制作背景
現在、独学でAndroid Studio（Java・Kotlin)を学習中であり、その過程の中で、現状の学習した内容で実際にアプリを作成してみようと考え制作いたしました。

モチーフとしては、全世界で絶大な人気があるゲーム『ポケモン』のタイプ相性を参考にいたしました。

じゃんけんアプリを応用し、まずは代表的な３つのタイプの相性を再現してみました。

小さな子供さんでも気軽に遊ぶことができるアプリを目指しました。

![Animated GIF-downsized](https://user-images.githubusercontent.com/80372817/116233922-decf6980-a796-11eb-83d5-9d48fc1e8cd4.gif)

水の属性を選んだ場合、上記のようにランダムに相性が表示されます。  
対象が、火の場合、効果抜群になります。  
水の場合、効果がいまひとつになります。  
草の場合も同様に効果がいまひとつになります。


![Animated GIF-downsized (1)](https://user-images.githubusercontent.com/80372817/116234709-e7746f80-a797-11eb-9a4b-267981b8f451.gif)

火の属性を選んだ場合、上記のように表示されます。  
対象が、草の場合、効果抜群になります。  
火の場合、効果がいまひとつになります。  
水の場合も同様に効果がいまひとつになります。



![Animated GIF-downsized (2)](https://user-images.githubusercontent.com/80372817/116237143-d24d1000-a79a-11eb-8093-313f63889fa0.gif)

草の属性を表示した場合、上記のように表示されます。  
対象が、水の場合、効果抜群になります。  
草の場合、効果がいまひとつになります。  
火の場合も同様に効果がいまひとつになります






# 工夫したポイント
・どの属性を選択しても結果は必ずランダムに表示されるようにしました。

・ランダムに表示されることで、毎回違う結果を確認することができ、興味を持っていただけるようにしています。

・ランダム表示の際に、心理学を参考にしたロジックを設定しております。  
具体的には、勝負の結果により次の勝負の手が変わるようにしています。

・今後、現在よりもタイプ相性を増やした際にも楽しめるようにしたいです。

# 開発環境
macOS Big sur バージョン11.23

Andoroid Studio 4.1

# 課題や今後実装したい機能
・臨場感を演出するために、BGMの導入

→ 現在、サウンドファイルを導入するために勉学中

・対象の属性を現状よりも増やし、多くのタイプ相性を表示

・文字のエフェクト等を変更できるようになり、よりアプリ感を演出

・画像をアニメーション化したり、ゲームのようなドッド風の画像の導入

・属性を増やした際の条件分岐や確率をどう表現するのかが課題

・Google Playにてアプリの申請中

→ 現在、Google Playにて公開中
