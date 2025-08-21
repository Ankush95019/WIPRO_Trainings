package day05;

class SortingNamesFromArray{
	String[] names = {"Rahul","Rohit","Ankush","Gagan Kumar","Harshit Rana","Vishal Rana"};
	
	void sortingNames() {
		for(int i = 0; i < names.length;i++) {
			for(int j = 0;j < names.length-i-1;j++) {
				String name1 = names[j].toLowerCase();
				String name2 = names[j+1].toLowerCase();
				if(name1.compareTo(name2)>0) {
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
	}
	
	void displayArray() {
		for(int i = 0; i < names.length;i++) {
			System.out.println(names[i]);
		}
	}
}

public class SortingNamesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingNamesFromArray s1 = new SortingNamesFromArray();
		System.out.println("***** Before Sorting *****");
		s1.displayArray();
		System.out.println("\n***** After Sorting *****");
		s1.sortingNames();
		s1.displayArray();
	}

}
