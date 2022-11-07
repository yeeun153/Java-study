package hw;

public class MemberTest {
	public static void main(String[] args) {
		Member mem1 = new Member("대한민국", "apple", "1234", 20);
		System.out.println("이름:" + mem1.getName());
		System.out.println("아이디:" + mem1.getId());
		System.out.println("나이:" + mem1.getAge());
	}
}

class Member{
	String name;
	String id;
	String pw;
	int age;
	
	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return name;} 
	
	public void setId(String id) {this.id = id;}
	public String getId() {return id;} 
	
	public void setPw(String pw) {this.pw = pw;}
	public String getPw() {return pw;} 
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;} 
}