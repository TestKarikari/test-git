package main;
public class Calc {
	
	public String tashizan(int x, int y){
		return tashi(x,y).toString();
	}
	public String hikizan(int x, int y){
		return hiki(x,y).toString();
	}
	public String kakezan(int x, int y){
		return kake(x,y).toString();
	}
	public String warizan(int x,int y){
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

	public Integer tashi(int x,int y){
		return x + y;
	}
	
	public Integer hiki(int x,int y){
		return x + y;
	}
	
	private Integer kake(int x,int y){
		return x * y;
	}

	private Integer wari(int x,int y){
		return x / y;
	}
}
