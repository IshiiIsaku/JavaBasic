package practice10;

import java.util.Scanner;

/*
 * PTra10_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_03 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください

		User us = new User();
		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください


		System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		Scanner scanner = new Scanner(System.in);

		// ★ 入力された値を、String型の変数lineに格納してください
		String line = scanner.nextLine();


		// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
		String[] us1 = line.split(",");

		// ★ 配列にした値を、usの各フィールドに代入してください
		// ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
		int us2 = Integer.parseInt(us1[0]);

		us.userId = us2;
		us.userNm = us1[1];
		us.mail=us1[2];
		us.password=us1[3];

		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

		System.out.println(us.userId);
		System.out.println(us.userNm);
		System.out.println(us. mail);
		System.out.println(us.password);

	}
}
