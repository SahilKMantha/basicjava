
public class Application {

	public static void main(String[] args) {
		School s1 = new School(); 
		Student s = new Student(); 
		s.name = "Sahil"; 
		s1.enroll(s);
		
		Address a = new Address(); 
		a.street = "5853 NW Redfox Dr";
		a.zip = 97229;
		a.city = "Portland";
		a.state = "Oregon"; 
	}

}
