package java8ustfood;

import java.util.List;

public class PersonDetails {

	private int Uid;
	private  String name;
	private List l1;
	/**
	 * @param uid
	 * @param name
	 */
	public PersonDetails(int uid, String name,List l1) {
		super();
		Uid = uid;
		this.name = name;
		this.l1=l1;
	}
	@Override
	public String toString() {
		return "PersonDetails [Uid=" + Uid + ", name=" + name + ", l1=" + l1 + "]";
	}
	
	
	
	
}
