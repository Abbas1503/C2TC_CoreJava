package c13;

public class Demartment {
	private String hodname;
	private int nostu;
	public Demartment() {
		super();
		
	}
	public Demartment(String hodname, int nostu) {
		super();
		this.hodname = hodname;
		this.nostu = nostu;
	}
	public String getHodname() {
		return hodname;
	}
	public void setHodname(String hodname) {
		this.hodname = hodname;
	}
	public int getNostu() {
		return nostu;
	}
	public void setNostu(int nostu) {
		this.nostu = nostu;
	}
	@Override
	public String toString() {
		return "Demartment [hodname=" + hodname + ", nostu=" + nostu + ", getHodname()=" + getHodname()
				+ ", getNostu()=" + getNostu() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
