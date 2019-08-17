package day14List;

public class Person {
	private String name ;
	private int badge;
	
	public Person() {
		
		
	}

	public Person(String name, int badge) {
		super();
		this.name = name;
		this.badge = badge;
	}
	
	
	public void showName() {
		System.out.println("nihao"+name+";"+badge);
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}
	
	
	
	
	
	
	
	
}
