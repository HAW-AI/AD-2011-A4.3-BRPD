package com.github.haw.brpd.ad.a04.implementations;

import java.util.HashMap;
import java.util.Map;

public class Enviroment implements
		com.github.haw.brpd.ad.a04.interfaces.Enviroment {
	
	private final Map<String, String> map = new HashMap<String,String>();

	@Override
	public void set(String key, String value) {
		this.map.put(key, value);
	}

	@Override
	public String get(String key) {
		return this.map.get(key);
	}

}
