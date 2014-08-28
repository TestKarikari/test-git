package main;

import java.util.Date;

public class HelloWorld {

	/**
	 * メインクラス
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Consts.goodBye);
		System.out.println(Consts.hello);
		System.out.println(Consts.helloGoodBye);
		System.out.println(Consts.testGit);
		System.out.println(new Date());	
		System.out.println("test");
		System.exit(Consts.EXIT_OK);
	}
}