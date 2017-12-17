import java.time.YearMonth;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		Student s = new Student();
		int result = s.getAttendance();
		System.out.println("The Student attended " + result + " days this semester");
		
		Teacher t = new Teacher();
		int result2 = t.getAttendance();
		System.out.println("The Teacher attended " + result + " days this semester");
		
		Staff s1 = new Staff();
		int result3 = t.getAttendance();
		System.out.println("The Staff has attended " + result + " days this semester");
	
	  Date now = new Date();
	  System.out.println(now);
	
	  YearMonth y = YearMonth.of(1000, 2);
	
	System.out.println(y.isLeapYear());
	}
}


