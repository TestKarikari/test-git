package main;

import java.util.Date;

public class HelloWorld {

	/**
	 * メインクラス
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Date());	
		System.out.println(Consts.hello);
		System.out.println(Consts.testGit);
		System.out.println("2×2＝"+ Calc.kakezan(2, 2));		
		System.exit(Consts.EXIT_OK);
	}
}