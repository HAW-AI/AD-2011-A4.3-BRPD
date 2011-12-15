package com.github.haw.brpd.ad.a04.commands;

import com.github.haw.brpd.ad.a04.implementations.Command;
import com.github.haw.brpd.ad.a04.implementations.Program;
import com.github.haw.brpd.ad.a04.interfaces.Enviroment;

public class Print extends Command {
	public Print() {
		super("P");
	}

	@Override
	public void exec(Enviroment env) {
		System.out.println(env.get(Program.SOURCE));
	}
}
