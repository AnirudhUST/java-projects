package java8projects;

public class Products {
	  	int id; 
	  	String name;  
	    float price;
	    /**
		 * @param id
		 * @param name
		 * @param price
		 */
		public Products(int id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		public float getPrice() {
			return price;
		}
//		public void setPrice(float price) {
//			this.price = price;
//		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		  

}
