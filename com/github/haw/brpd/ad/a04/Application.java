package com.github.haw.brpd.ad.a04;

import com.github.haw.brpd.ad.a04.commands.CandleDecrement;
import com.github.haw.brpd.ad.a04.commands.CandleIncrement;
import com.github.haw.brpd.ad.a04.commands.Print;
import com.github.haw.brpd.ad.a04.commands.XmasCandle;
import com.github.haw.brpd.ad.a04.commands.XmasGreetings;
import com.github.haw.brpd.ad.a04.factories.Languages;
import com.github.haw.brpd.ad.a04.interfaces.Language;

public class Application {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Language language = Languages.create();
		language.add(new CandleDecrement());
		language.add(new CandleIncrement());
		language.add(new XmasCandle());
		language.add(new XmasGreetings());
		language.add(new Print());
		
		String[] inputs = new String[] {"W+W+WCPC","W--CP+++C"};
		for (String e : inputs) {
			language.create(e).exec();
		}
	}
}
