import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the student Number");
		int numberOfStudents = sc.nextInt();
		
		HashMap<String , ArrayList<String>> mp = new HashMap<>();
		
		while(numberOfStudents > 0) {
			System.out.println("Please Enter the student Name");
			String name = sc.next();
			System.out.println("Please Enter the college Name");
			String college = sc.next();
			System.out.println("Please Enter the student rollnumber");
			int rollNumber = sc.nextInt();
		
			if(mp.containsKey(college)) {
				ArrayList<String> tmp = mp.get(college);
				tmp.add(name);
				mp.put(college, tmp);
			}else {
				ArrayList<String> tmp = new ArrayList<>();
				tmp.add(name);
				mp.put(college, tmp);
			}
			numberOfStudents--;
		}
//		System.out.println(mp);
		System.out.println("Please Enter the college Name");
		String clg = sc.next();
		
		if(mp.containsKey(clg)) {
			System.out.println(mp.get(clg));
		}else {
			System.out.println("404 college not found");
		}
		
	}
}
