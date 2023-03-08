/**
 * 
 */
package java8projects;

/**
 * @author Administrator
 *
 */
public class Hotelnames {
	 private int id;
	 private String hotelname;
	 private double price;
	@Override
	public String toString() {
		return "Hotelnames [id=" + id + ", hotelname=" + hotelname + ", price=" + price + "]";
	}
	/**
	 * @param id
	 * @param hotelname
	 * @param price
	 */
	public Hotelnames(int id, String hotelname, double price) {
		super();
		this.id = id;
		this.hotelname = hotelname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
	 

}
