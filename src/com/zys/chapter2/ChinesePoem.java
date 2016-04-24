package com.zys.chapter2;

public class ChinesePoem implements Poem {
	private static String[] poem = {
			"白日依山尽,",
			"黄河入海流.",
			"欲穷千里目,",
			"更上一层楼."
	};
	public ChinesePoem() {
		
	}
	@Override
	public void recite() {
		int length = poem.length;
		for (int i = 0; i != length; ++i) {
			System.out.println(poem[i]);
		}
	}

}
