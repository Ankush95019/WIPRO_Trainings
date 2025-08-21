package day12;

public class PallindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "aba";
		String revData = "";
		
		for(int i = data.length()-1;i >= 0;i--) {
			revData += data.charAt(i);
		}
		
		if(data.equals(revData)) {
			System.out.println(data+" is Pallindrome");
		}
		else {
			System.out.println(data+" is not Pallindrome");			
		}
	}

}
