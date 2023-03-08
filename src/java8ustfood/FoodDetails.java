package java8ustfood;

public class FoodDetails {

	private String fname;
	private int fprice;
	/**
	 * @param fname
	 * @param fprice
	 */
	public FoodDetails(String fname, int fprice) {
		super();
		this.fname = fname;
		this.fprice = fprice;
	}
	@Override
	public String toString() {
		return "FoodDetails [fname=" + fname + ", fprice=" + fprice + "]";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	

}
