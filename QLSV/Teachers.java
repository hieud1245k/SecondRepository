
public class Teachers extends Persons {
	
	private String IDGV;

	private String faculty;
	
	public String getIDGV() {
		return IDGV;
	}

	public void setIDGV(String iDGV) {
		IDGV = iDGV;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	@Override
	public String toString() {
		return "IDGV: " + this.IDGV + ", faculty: " + this.faculty + super.toString();
	}

	public Teachers(String name, int age, String address, String iDGV, String faculty) {
		super(name, age, address);
		IDGV = iDGV;
		this.faculty = faculty;
	}
}
