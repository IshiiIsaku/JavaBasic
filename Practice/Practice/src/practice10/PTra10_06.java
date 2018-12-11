package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car=new Car();



		final int distance = 300;


	int sum = 0;
    int i=0;



		while (distance>sum) {

			int num = car.run();

			i++;

			if (num < 0){
				 System.out.println("目的地に到達できませんでした");
				 break;
			}

			sum += num;
		}

		if(distance<=sum) {
			System.out.println("目的地まで"+i+"時間かかりました。残りのガソリンは、"+car.gasoline+"リットルです");


		}












		Car car1=new Car();


		final int distance1 = 300;


		int sum1 = 0;
	    int i1=0;

		while (distance1>sum1) {

			int num1 = car1.run1();

			i1++;

			if (num1 < 0){
				 System.out.println("目的地に到達できませんでした");
				 break;
			}

			sum1 += num1;
		}

		if(distance1<=sum1) {
			System.out.println("目的地まで"+i1+"時間かかりました。残りのガソリンは、"+car1.gasoline1+"リットルです");


		}










		Car car2=new Car();


final int distance2 = 300;


		int sum2 = 0;
	    int i2=0;

		while (distance2>sum2) {

			int num2 = car2.run2();

			i2++;

			if (num2 < 0){
				 System.out.println("目的地に到達できませんでした");
				 break;
			}

			sum2 += num2;
		}

		if(distance2<=sum2) {
			System.out.println("目的地まで"+i2+"時間かかりました。残りのガソリンは、"+car2.gasoline2+"リットルです");


		}





	}

	}


