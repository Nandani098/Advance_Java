package in.co.rays.Marksheet;

public class MarksheetBean {
	private int id;
	private int rollno;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	
	
	public void setId(int id) {
		this.id= id;
	}
	public int getId() {
		return id;	
	}
	
	public void setRollNo(int rollno) {
		this.rollno= rollno;	
	}
	public int getRollNo() {
		return rollno;
	}
	
	public void setName(String  name) {
		this.name= name;	
	}
	public String getName() {
		return name;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
		
}

