public class Librarians implements User {
	private String name;
	
	public Librarians(String name) {
		this.name = name;
	}
	
	public void showRole() {
		System.out.println(name + "is a Librarian.");
	}
	
	public void update(String message) {
		System.out.println(name + "notified : " + message);
		
	}
	

}
