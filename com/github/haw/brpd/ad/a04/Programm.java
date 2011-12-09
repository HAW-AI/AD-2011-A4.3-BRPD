package com.github.haw.brpd.ad.a04;

public class Programm {
	public static final String NOTICE_XMAS = "Frohe Weihnachten!";
	public static final String NOTICE_CANDLE = "Wir zŸnden %d Kerzlein an!";
	
	private final String source;
	private int cc = 0; // CandleCounter
	public Programm(String source) {
		this.source = source;
	}
	
	public void exec() {
		for (char c : source.toCharArray()) {
			switch(c) {
			case 'W':
			case 'w':
				System.out.println(NOTICE_XMAS);
				break;
			case 'C':
			case 'c':
				if (cc > 0) {
					for (int i = 1; i <= cc; i++) {
						System.out.println(String.format(NOTICE_CANDLE, i));
					}
				}
				break;
			case 'P':
			case 'p':
				System.out.println(source);
				break;
			case '+':
				cc++;
				break;
			case '-':
				cc--;
				break;
			}
		}
	}

	public static Programm programm(String source) {
		return new Programm(source);
	}
	public static void exec(Programm programm) {
		programm.exec();
	}
}
