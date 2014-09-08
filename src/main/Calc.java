package main;
public class Calc {
	// test
	public static int tashi(int x,int y){
		return x + y;
	}
	
	public static int hiki(int x,int y){
		return x + y;
	}
	
	public static String kakezan(int x, int y){
		return kake(x,y).toString();
	}
	public static String warizan(int x,int y){
		// 整数しか返せない
		if(x < y){
			return "結果が少数になる割り算はできません。";			
		}
		// 数学上は正しくないが0を返す
		if(y == 0 ){
			return "0除算はできません。";
		}		
		return wari(x,y).toString();
	}
	
	private static Integer kake(int x,int y){
		return x * y;
	}

	private static Integer wari(int x,int y){
		return x / y;
	}
}
