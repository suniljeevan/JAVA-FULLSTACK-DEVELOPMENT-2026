import java.util.*;
class Product {
	private int id;
	private String name;
	private double price;
	private String category;
	//alt shift s
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product(int id, String name, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Product() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
}
class IDComparator implements Comparator<Product>{
	public int compare(Product ob1,Product ob2) {
		return ob1.getId()-ob2.getId();
	}
}
class NameComparator implements Comparator<Product>{
	public int compare(Product ob1,Product ob2) {
		return ob1.getName().compareTo(ob2.getName());
	}
	
}
class PriceComparator implements Comparator<Product>{
	public int compare(Product ob1,Product ob2) {
		return Double.compare(ob1.getPrice(), ob2.getPrice());
	}
}
class CategoryComparator implements Comparator<Product> {
	public int compare(Product ob1,Product ob2) {
		return ob1.getCategory().compareTo(ob2.getCategory());
	}
}
public class TEST7 {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(56,"Iphone",160000,"Electronics"));
		list.add(new Product(12,"Laptop",75000,"Electronics"));
		list.add(new Product(7,"Mouse",700,"CSE"));
		list.add(new Product(1,"Charger",2500,"Electrical"));
		list.add(new Product(2,"Watch",8000,"Smart Technology"));
		list.add(new Product(56,"Jacket",10000,"Clothes"));
		System.out.println("List before sorting");
		System.out.println(list);
		Collections.sort(list, new IDComparator());
		System.out.println("after sorting by ID");
		System.out.println(list);
		Collections.sort(list, new NameComparator());
		System.out.println("after sorting by Name");
		System.out.println(list);
		Collections.sort(list, new PriceComparator());
		System.out.println("after sorting by Price");
		System.out.println(list);
		Collections.sort(list, new CategoryComparator());
		System.out.println("after sorting by Category");
		System.out.println(list);

	}

}



