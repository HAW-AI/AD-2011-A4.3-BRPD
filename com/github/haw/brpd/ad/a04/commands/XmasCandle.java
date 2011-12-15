package com.github.haw.brpd.ad.a04.commands;

import com.github.haw.brpd.ad.a04.interfaces.Enviroment;

public class XmasCandle extends AbstractXmasCandles {
	public static final String NOTICE_CANDLE = "Wir zŸnden %d Kerzlein an!";
	
	public XmasCandle() {
		super("C");
	}

	@Override
	public void exec(Enviroment env) {
		Integer candles = Integer.valueOf(get(env));
		if (candles > 0) {
			for (int i = 1; i <= candles; i++) {
				System.out.println(String.format(NOTICE_CANDLE, i));
			}
		}
	}
}
