package demo;

public class Demo implements IMdpJunitDemo {

	public boolean isEmpty(String s) {
		return s == null || s.equals("");
	}

	public String capitalize(String s) {
		if (s == null || s.equals("")) {
			return s;
		}

		String newString = s.substring(1, s.length());
		newString = newString.toLowerCase();
		char newChar = Character.toUpperCase(s.charAt(0));
		newString = newChar + newString;

		return newString;
	}

	public String reverse(String s) throws NullPointerException {
		String reverse = new StringBuffer(s).reverse().toString();

		return reverse;
	}

	public String join(String... strings) {
		if(strings.length==0){
			return "";
		}
		
		String newSTring = strings[0];

		for (int i = 1; i < strings.length - 1; i++) {
			newSTring= newSTring+" "+ strings[i];
		}

		return newSTring;
	}

}
