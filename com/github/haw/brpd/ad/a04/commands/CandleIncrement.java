package com.github.haw.brpd.ad.a04.commands;

import com.github.haw.brpd.ad.a04.interfaces.Enviroment;

public class CandleIncrement extends AbstractXmasCandles {

	public CandleIncrement() {
		super("+");
	}

	@Override
	public void exec(Enviroment env) {
		set(env, get(env) +1);
	}

}
