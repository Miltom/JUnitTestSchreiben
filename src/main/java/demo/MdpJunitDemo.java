package demo;

public class MdpJunitDemo implements IMdpJunitDemo {

	public boolean isEmpty(String s) {
		return s == null || s.equals("");
	}

	public String capitalize(String s) {
		if (s == null || s.equals("")) {
			return s;
		}

		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

	public String reverse(String s) throws NullPointerException {
		return new StringBuffer(s).reverse().toString();
	}

	public String join(String... strings) {
		if (strings == null) {
			return null;
		}

		String newString = strings[0];

		for (int i = 1; i < strings.length; i++) {
			newString = newString + " " + strings[i];
		}

		return newString;
	}

}
