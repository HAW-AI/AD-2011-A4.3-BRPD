package com.github.haw.brpd.ad.a04.commands;

import com.github.haw.brpd.ad.a04.implementations.Command;
import com.github.haw.brpd.ad.a04.interfaces.Enviroment;

public class XmasGreetings extends Command {
	public static final String NOTICE_XMAS = "Frohe Weihnachten!";
	
	public XmasGreetings() {
		super("W");
	}

	@Override
	public void exec(Enviroment env) {
		System.out.println(NOTICE_XMAS);
	}
}
