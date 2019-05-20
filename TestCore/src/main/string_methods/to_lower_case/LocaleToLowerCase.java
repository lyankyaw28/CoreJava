package main.string_methods.to_lower_case;

import java.util.Locale;

public class LocaleToLowerCase {
	public static void main(String[] args) {
		String s = "JAVATPOINT HELLO stRIng";
		String eng = s.toLowerCase(Locale.ENGLISH);
		System.out.println(eng);
		String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); // It shows i without dot
		System.out.println(turkish);
	}
}
