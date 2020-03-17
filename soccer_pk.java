//PK戦のゲーム
public class mun1J17E218{
	public static void main(String[] args){
		int p = 1;
		int coursep;
		int resultp = 0;
		int resultc = 0;
		System.out.println("これから5本勝負のPK戦を行います");
		
		
		//先攻後攻決める
		System.out.println("まずはじゃんけん先攻後攻を決めましょう");
		System.out.println("じゃんけんで勝った方が先攻です");
		
		int resultj = 0;
		int ja = 0;
		int handp = 1;
		while(ja>=0 && ja<1){
			System.out.println("1:ぐー,2:ちょき,3:ぱー");
			String str = "";
			
			
			try{
			  str = new java.util.Scanner(System.in).next();
			  handp = Integer.parseInt(str);
			} catch (java.lang.NumberFormatException ex){
			  handp=4;
			}
			
			
			switch(handp){
				case 1:
					System.out.println("あなたはぐー");
					break;
				case 2:
					System.out.println("あなたはちょき");
					break;
				case 3:
					System.out.println("あなたはぱー");
					break;
			}
			int handC = new java.util.Random().nextInt(3);
			int handc = handC++;
			switch(handc){
				case 1:
					System.out.println("あいてはぐー");
					break;
				case 2:
					System.out.println("あいてはちょき");
					break;
				case 3:
					System.out.println("あいてはぱー");
					break;
			}
			if(handp == handc){
				System.out.println("あいこ");
			}else if((handp == 1 && handc == 2)||(handp ==2 && handc ==3)||(handp ==3 && handc == 1)){
				System.out.println("あなたの勝ちなので、あなたは先攻です");
				ja++;
				resultj++;
			}else if((handc == 1 && handp == 2)||(handc ==2 && handp ==3)||(handc ==3 && handp ==1)){
				System.out.println("コンピュータの勝ちなので、あなたは後攻です");
				ja++;
			}
		}
		//先攻後攻決まった。resultjが１なら先攻、resultjが０なら後攻
		
		
		switch(resultj){
		//プレイヤー先攻
		case 1:
			
			int all1 = 0;
			while(all1 >=0 && all1 <5){
				
				//プレイヤーの蹴る番
				System.out.println("あなたが蹴る番です");
				int countp = 0;
				while(countp >=0 && countp <1){
					String [] b = {"左","真ん中","右"};
					System.out.println("1:"+"左"+"2:"+"中央"+"3:"+"右");
					System.out.println("数字を入力してシュートする方向を選んでね");
					String str ="";
					try{//エラーが出そうな入力を指定する
					str = new java.util.Scanner(System.in).next();//とりあえず文字で入力する
					p = Integer.parseInt(str);//変数に変換しようとして、できなかったらエラーが出る。できたらここは通過。
					} catch (java.lang.NumberFormatException ex){//キャッチするものを指定して、それが出た時の処理を指定する。
					//System.out.println(ex.toString());
					p=4;
					}
					switch(p){
						case 1:
							System.out.println(b[0] + "にシュートを打った！");
							countp++;
							break;
						case 2:
							System.out.println(b[1] + "にシュートを打った！");
							countp++;
							break;
						case 3:
							System.out.println(b[2] + "にシュートを打った！");
							countp++;
							break;
					}
				}
				int R1 = new java.util.Random().nextInt(3);
				int r1 = R1 + 1;
				if(p == r1){
					coursep = 0;//シュート先とキーパーが飛んだ先が同じ
				}else{
					coursep = 1;//成功
				}
				
				
				int r2 = new java.util.Random().nextInt(100);//10％の確率でシュートを外す仕様にした。
				if(r2>10 && coursep == 1){
					System.out.println("ゴール!");
					resultp++;
				}else if(r2>10 && coursep == 0){
					System.out.println("キーパーに止められてしまった、、、");
				}else if(r2<=10 && coursep == 1){
					System.out.println("シュートはゴールの枠を捉えられなかった、、、");
				}else if(r2<=10 && coursep == 0){
					System.out.println("シュートはゴールの枠を捉えられなかった、、、");
				}
				
				
				
				
				//コンピュータの蹴る番
				int c = 1;
				int coursec;
				System.out.println("コンピュータが蹴る番です");
				int countc = 0;
				while(countc >=0 && countc <1){
					String [] b = {"左","真ん中","右"};
					System.out.println("1:"+"左"+"2:"+"中央"+"3:"+"右");
					System.out.println("数字を入力して護る場所を選んでね");
					String str ="";
					try{
					str = new java.util.Scanner(System.in).next();
					c = Integer.parseInt(str);
					} catch (java.lang.NumberFormatException ex){
					}
					switch(c){
						case 1:
							System.out.println(b[0] + "を護った！");
							countc++;
							break;
						case 2:
							System.out.println(b[1] + "を護った！");
							countc++;
							break;
						case 3:
							System.out.println(b[2] + "を護った！");
							countc++;
							break;
					}
				}
				int T1 = new java.util.Random().nextInt(3);
				int t1 = T1 + 1;
				if(c == t1){
					coursec = 0;//シュート先とキーパーが飛んだ先が同じ＝成功
				}else{
					coursec = 1;//失点
				}
				int t2 = new java.util.Random().nextInt(100);
				if(t2>10 && coursec == 1){
					System.out.println("シュートを決められた、、、");
					resultc++;
				}else if(t2>10 && coursec == 0){
					System.out.println("ボールを止めた！");
				}else if(t2<=10 && coursec == 1){
					System.out.println("シュートは枠の外へ外れた！");
				}else if(t2<=10 && coursec == 0){
					System.out.println("シュートは枠の外へ外れた！");
				}
			
			
			all1++;
			}
		
		break;
		//プレイヤー先攻の場合が終わり
		
		case 0:
		
		//コンピュータ先攻始まり
			int all2 = 0;
			while(all2 >=0 && all2 <5){
			
				//コンピュータの蹴る番
				int c = 1;
				int coursec;
				System.out.println("コンピュータが蹴る番です");
				int countc = 0;
				while(countc >=0 && countc <1){
					String [] b = {"左","真ん中","右"};
					System.out.println("1:"+"左"+"2:"+"中央"+"3:"+"右");
					System.out.println("数字を入力して護る場所を選んでね");
					String str ="";
					try{
					str = new java.util.Scanner(System.in).next();
					c = Integer.parseInt(str);
					} catch (java.lang.NumberFormatException ex){
					}
					switch(c){
						case 1:
							System.out.println(b[0] + "を護った！");
							countc++;
							break;
						case 2:
							System.out.println(b[1] + "を護った！");
							countc++;
							break;
						case 3:
							System.out.println(b[2] + "を護った！");
							countc++;
							break;
					}
				}
				int T1 = new java.util.Random().nextInt(3);
				int t1 = T1 + 1;
				if(c == t1){
					coursec = 0;//シュート先とキーパーが飛んだ先が同じ＝成功
				}else{
					coursec = 1;//失点
				}
				int t2 = new java.util.Random().nextInt(100);
				if(t2>10 && coursec == 1){
					System.out.println("シュートを決められた、、、");
					resultc++;
				}else if(t2>10 && coursec == 0){
					System.out.println("ボールを止めた！");
				}else if(t2<=10 && coursec == 1){
					System.out.println("シュートは枠の外へ外れた！");
				}else if(t2<=10 && coursec == 0){
					System.out.println("シュートは枠の外へ外れた！");
				}
		
		
				//プレイヤーの蹴る番
				System.out.println("あなたが蹴る番です");
				int countp = 0;
				while(countp >=0 && countp <1){
					String [] b = {"左","真ん中","右"};
					System.out.println("1:"+"左"+"2:"+"中央"+"3:"+"右");
					System.out.println("数字を入力してシュートする方向を選んでね");
					String str ="";
					try{//エラーが出そうな入力を指定する
					str = new java.util.Scanner(System.in).next();//とりあえず文字で入力する
					p = Integer.parseInt(str);//変数に変換しようとして、できなかったらエラーが出る。できたらここは通過。
					} catch (java.lang.NumberFormatException ex){//キャッチするものを指定して、それが出た時の処理を指定する。
					//System.out.println(ex.toString());
					p=4;
					}
					switch(p){
						case 1:
							System.out.println(b[0] + "にシュートを打った！");
							countp++;
							break;
						case 2:
							System.out.println(b[1] + "にシュートを打った！");
							countp++;
							break;
						case 3:
							System.out.println(b[2] + "にシュートを打った！");
							countp++;
							break;
					}
				}
				int R1 = new java.util.Random().nextInt(3);
				int r1 = R1 + 1;
				if(p == r1){
					coursep = 0;//シュート先とキーパーが飛んだ先が同じ
				}else{
					coursep = 1;//成功
				}
				//入った入らなかっただけではなく、ポストに当たって入る入らないを加えたいかも。
				//多分ここをメソッド化する。
				int r2 = new java.util.Random().nextInt(100);
				if(r2>10 && coursep == 1){
					System.out.println("ゴール!");
					resultp++;
				}else if(r2>10 && coursep == 0){
					System.out.println("キーパーに止められてしまった、、、");
				}else if(r2<=10 && coursep == 1){
					System.out.println("シュートはゴールの枠を捉えられなかった、、、");
				}else if(r2<=10 && coursep == 0){
					System.out.println("シュートはゴールの枠を捉えられなかった、、、");
				}
			
			all2++;
			}
		
		break;
		//コンピュータ先攻終わり
		}
		
		
		//結果発表
		RESULT(resultp , resultc);
		System.out.println("ゲーム終了");
	}
	
	
	
	
	public static void RESULT(int p, int c){
		if(p>c){
			System.out.println("あなた対コンピュータの結果は" + p + "対" + c + "であなたの勝ち！");
		}else if(p<c){
			System.out.println("あなた対コンピュータの結果は" + p + "対" + c + "であなたの負け");
		}else if(p==c){
			System.out.println("あなた対コンピュータの結果は" + p + "対" + c + "で引き分け");
		}
	}
}