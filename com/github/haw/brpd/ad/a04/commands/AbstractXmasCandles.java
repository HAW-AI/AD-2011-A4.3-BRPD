package com.github.haw.brpd.ad.a04.commands;

import com.github.haw.brpd.ad.a04.implementations.Command;
import com.github.haw.brpd.ad.a04.interfaces.Enviroment;

public abstract class AbstractXmasCandles extends Command implements
		CandleCommand {

	public AbstractXmasCandles(String symbol) {
		super(symbol);
	}

	@Override
	public abstract void exec(Enviroment env);
	
	protected Integer get(Enviroment env) {
		String value = env.get(CANDLE_COUNTER_UUID);
		if (value == null) return 0;
		return Integer.valueOf(value);
	}
	
	protected void set(Enviroment env, Integer value) {
		env.set(CANDLE_COUNTER_UUID, String.valueOf(value));
	}
}
