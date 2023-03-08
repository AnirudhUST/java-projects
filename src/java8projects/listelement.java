package java8projects;

import java.util.List;

public class listelement {
	String cname,phno;
	/**
	 * @param cname
	 * @param phno
	 * @param list
	 */
	public listelement(String cname, String phno, List list) {
		super();
		this.cname = cname;
		this.phno = phno;
		this.list = list;
	}
	List list;
	@Override
	public String toString() {
		return "listelement [cname=" + cname + ", phno=" + phno + ", list=" + list + "]";
	}
	

	

}
