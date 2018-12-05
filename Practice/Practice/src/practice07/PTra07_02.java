package practice07;
/*
 * PTra07_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_02 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言し、1000個の領域で確保してください
int[] array=new int[1000];

		// ★ 配列arrayに [1,2,3,4,5,6,7,・・・・,998,999,1000] を代入してください
array[0] = 1;
array[1] = 2;
array[2] = 3;
array[3] = 4;
array[4] = 5;
array[5] = 6;
array[6] = 7;
array[7] = 998;
array[8] = 999;
array[9] = 1000;

		// ★ 変数arrayに格納されている値を前から順番に全て表示してください

System.out.println(array[0]);
System.out.println(array[1]);
System.out.println(array[2]);
System.out.println(array[3]);
System.out.println(array[4]);
System.out.println(array[5]);
System.out.println(array[6]);
System.out.println(array[7]);
System.out.println(array[8]);
System.out.println(array[9]);



	}
}
