import java.util.Scanner;

enum Gender{
	M,F;
}
public class Person {
	private String firstName,lastName;
	private Gender gender;
	private long phone;
	private float age;
	public Person(String firstName, String lastName, Gender gender, long phone,
			float age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
	}
	
	public Person(String firstName) {
		super();
		this.firstName = firstName;
	}

	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public Person(String firstName, String lastName, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public Person() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public long getPhone() {
			return phone;
	}
	public void setPhone(long phone) {
			this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", phone=" + phone + "]";
	}
	public long inputPhone(){
		Scanner i = new Scanner(System.in);
		System.out.println("Enter Phone Number");
		long p = i.nextLong();
		return p;
	}
	public void displayDetails(){
		System.out.println(toString());
	}
}
