package java8projects;

public class Customer {
	int r_id;
	String name;
	String ph_no;
	String Email;
	String Location;
	/**
	 * @param r_id
	 * @param name
	 * @param ph_no
	 * @param email
	 * @param location
	 */
	public Customer(int r_id, String name, String ph_no, String email, String location) {
		super();
		this.r_id = r_id;
		this.name = name;
		this.ph_no = ph_no;
		Email = email;
		Location = location;
	}
	public int getR_id() {
		return r_id;
	}
//	public void setR_id(int r_id) {
//		this.r_id = r_id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh_no() {
		return ph_no;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Customer [r_id=" + r_id + ", name=" + name + ", ph_no=" + ph_no + ", Email=" + Email + ", Location="
				+ Location + "]";
	}
	
	
     
}
