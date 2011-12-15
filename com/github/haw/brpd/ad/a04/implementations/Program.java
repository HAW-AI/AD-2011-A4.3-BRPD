package com.github.haw.brpd.ad.a04.implementations;

import java.util.ArrayList;
import java.util.List;
import com.github.haw.brpd.ad.a04.factories.Enviroments;
import com.github.haw.brpd.ad.a04.interfaces.Command;
import com.github.haw.brpd.ad.a04.interfaces.Enviroment;

public class Program implements com.github.haw.brpd.ad.a04.interfaces.Program {
	public static final String SOURCE = "source";
	
	private Enviroment env = Enviroments.create();
	private List<Command> batch = new ArrayList<Command>();

	@Override
	public void exec() {
		env.set(SOURCE, this.toString());
		
		for (Command cmd : batch) {
			cmd.exec(env);
		}
	}

	@Override
	public void add(Command command) {
		this.batch.add(command);
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Command cmd : batch) {
			result.append(cmd.symbol());
		}
		return result.toString();
	}
}
