
public class Students extends Persons {
	
	private int MSSV;
	
	private String className;
	
	public int getMSSV() {
		return MSSV;
	}

	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}
	
	@Override
	public String toString() {
		return "MSSV: " + this.MSSV + ", Class: " + this.className + super.toString();
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Students(String name, int age, String address, int mSSV, String className) {
		super(name, age, address);
		MSSV = mSSV;
		this.className = className;
	}
}
