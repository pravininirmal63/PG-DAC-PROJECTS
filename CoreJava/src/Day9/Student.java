package Day9;

public class Student 
{
	private int rollno;
	private String cname,address,course;
	public Student(int rollno, String cname, String address, String course) {
		super();
		this.rollno = rollno;
		this.cname = cname;
		this.address = address;
		this.course = course;
	}
	public void getAddress(String address)
	{
		this.address=address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getCname() {
		return cname;
	}
	@Override
	public String toString()
	{
		return "Roll no: "+rollno+" name: "+cname+" address: "+address+" course: "+course;
	}
	
}
