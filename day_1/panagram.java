package day_1;

public class panagram {

	public static void main(String[] args) {
		String panagram1 = "The quick brown fox jumps over the lazy dog";
		
		System.out.println( panagram1 + " is a panagram " + panagramcheck(panagram1) );

	}
	public static boolean panagramcheck(String panagram) {
		if(panagram == null || panagram.isEmpty()) {
			return false;
		}
		String tolowercase = panagram.toLowerCase();
		int n = panagram.length();
		
		boolean[] alphabet = new boolean[26]; //0-25
	
		for(int i = 0 ; i < n ; i++) {
			char ch = tolowercase.charAt(i);
			if(ch >= 'a' &&  ch <= 'z') {
				alphabet[ch - 'a'] = true;
			}
		}
		for(int i = 0; i < 26 ; i++) {
			if(!alphabet[i]) {
				return false;
			}
		}
		
		return true;
	}

}
