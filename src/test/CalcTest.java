package test;

import static org.junit.Assert.*;
import main.Calc;

import org.junit.Test;

public class CalcTest {

	@Test
	public void 掛け算テスト() {
		int kekka = 12;
		assertSame(kekka,new Calc().kakezan(3, 4));
	}
	@Test
	public void 掛け算テスト2() {
		int kekka = 30;
		assertSame(kekka,new Calc().kakezan(15, 2));
	}
	@Test
	public void 割り算テスト() {
		int kekka = 5;
		assertSame(kekka,new Calc().warizan(15, 3));
	}
	@Test
	public void ゼロ除算テスト() {
		int kekka = 0;
		assertSame(kekka,new Calc().warizan(15, 0));
	}
}
