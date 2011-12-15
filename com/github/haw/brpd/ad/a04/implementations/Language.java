package com.github.haw.brpd.ad.a04.implementations;

import java.util.HashMap;
import java.util.Map;

import com.github.haw.brpd.ad.a04.factories.Programs;
import com.github.haw.brpd.ad.a04.interfaces.Command;
import com.github.haw.brpd.ad.a04.interfaces.Program;


public class Language implements com.github.haw.brpd.ad.a04.interfaces.Language {

	private final Map<String, Command> commands = new HashMap<String, Command>();
	
	@Override
	public void add(Command cmd) {
		this.commands.put(cmd.symbol(), cmd);
	}

	@Override
	public Program create(String source) {
		Program result = Programs.create();
		
		for (char c : source.toCharArray()) {
			if (commands.containsKey(String.valueOf(c))) {
				result.add(commands.get(String.valueOf(c)));
			}
			else {
				return Programs.nap();
			}
		}
		
		return result;
	}

}
