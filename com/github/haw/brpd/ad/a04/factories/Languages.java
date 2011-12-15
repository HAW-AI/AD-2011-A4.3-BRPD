package com.github.haw.brpd.ad.a04.factories;

import com.github.haw.brpd.ad.a04.interfaces.Language;

public class Languages {
	public static Language create() {
		return new com.github.haw.brpd.ad.a04.implementations.Language();
	}
}
