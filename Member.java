package project;

public class Member {

	private String name;
	private String tel;

	public Member(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString() {
		return (name + tel);
	}

	public static void main(String[] args) {}	
}


