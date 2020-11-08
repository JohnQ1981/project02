package firstpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {

		System.out.println("First commit from local master branch");
		System.out.println("Second commit from local master branch");
		System.out.println("Third commit from local Master Branch");
		System.out.println("Fourth commit from remote Master Branch");
		List<String> list1 = new ArrayList<>();
		list1.add("J");
		list1.add("T");
		list1.add("G");
		list1.add("F");
		for (int i=0; i<3;i++){
			System.out.println("From Git hub hello");
		}
		System.out.println(list1);

		System.out.println("Conflict2 from local master");

		System.out.println("Conflict4444 from local master");

		System.out.println("Conflict from local master");
		System.out.println("Merge Conflict from local master");

		list1.add("tr");

		list1.add("J");
		list1.add("T");
		list1.add("G");
		list1.add("F");
		list1.add("J");
		list1.add("t");
		list1.add("r");
		list1.add("u");
		System.out.println(list1);
		System.out.println("Changes from local John branch");

		System.out.println("Conflicts on local John");

		System.out.println("This will be conflict from GitHub");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the how many elements you want to have in list");
		int a = scan.nextInt();
		List<String> list = new ArrayList<>();
		for(int i =0 ; i<a; i++) {
			System.out.println("Now Enter Strings for the list");
			list.add(scan.nextLine());
		}
		System.out.println("Your list is "+ list);
	}

}
