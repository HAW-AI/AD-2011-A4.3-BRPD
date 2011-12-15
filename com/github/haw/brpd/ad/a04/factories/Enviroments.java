package com.github.haw.brpd.ad.a04.factories;

import com.github.haw.brpd.ad.a04.interfaces.Enviroment;

public class Enviroments {
	public static Enviroment create() {
		return new com.github.haw.brpd.ad.a04.implementations.Enviroment();
	}
}
