package firstpackage;

import java.util.ArrayList;
import java.util.List;

public class FirstClass {

	public static void main(String[] args) {

		System.out.println("First commit from local master branch");
		System.out.println("Second commit from local master branch");
		System.out.println("Third commit from local Master Branch");
		System.out.println("Fourth commit from remote Master Branch");
		List<String> list = new ArrayList<>();
		list.add("J");
		list.add("T");
		list.add("G");
		list.add("F");
		for (int i=0; i<3;i++){
			System.out.println("From Git hub hello");
		}
		System.out.println(list);
		System.out.println("Conflict from local master");
		System.out.println("Merge Conflict from local master");

	}

}
