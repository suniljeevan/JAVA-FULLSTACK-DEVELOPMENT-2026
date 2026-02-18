import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class CustomerReview {
	private String custname;
	private String emailid;
	private String reviewtextforspot;
	private String reviewtextforhotel;
	private double rating;
	//add getter setter
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getReviewtextforspot() {
		return reviewtextforspot;
	}
	public void setReviewtextforspot(String reviewtextforspot) {
		this.reviewtextforspot = reviewtextforspot;
	}
	public String getReviewtextforhotel() {
		return reviewtextforhotel;
	}
	public void setReviewtextforhotel(String reviewtextforhotel) {
		this.reviewtextforhotel = reviewtextforhotel;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public CustomerReview(String custname, String emailid, String reviewtextforspot, String reviewtextforhotel,
			double rating) {
		super();
		this.custname = custname;
		this.emailid = emailid;
		this.reviewtextforspot = reviewtextforspot;
		this.reviewtextforhotel = reviewtextforhotel;
		this.rating = rating;
	}
	public CustomerReview() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerReview [custname=" + custname + ", emailid=" + emailid + ", reviewtextforspot="
				+ reviewtextforspot + ", reviewtextforhotel=" + reviewtextforhotel + ", rating=" + rating + "]";
	}
	
	
}
class Hotel {
	private String name;
	
	private double dist_from_location;
	private double charges;
	private List<CustomerReview> reviews;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDist_from_location() {
		return dist_from_location;
	}
	public void setDist_from_location(double dist_from_location) {
		this.dist_from_location = dist_from_location;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public List<CustomerReview> getReviews() {
		return reviews;
	}
	public void setReviews(List<CustomerReview> reviews) {
		this.reviews = reviews;
	}
	public Hotel(String name, double dist_from_location, double charges, List<CustomerReview> reviews) {
		super();
		this.name = name;
		this.dist_from_location = dist_from_location;
		this.charges = charges;
		this.reviews = reviews;
	}
	public Hotel() {
		super();
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", dist_from_location=" + dist_from_location + ", charges=" + charges
				+ ", reviews=" + reviews + "]";
	}
	
	
	
}

class PicnicSpot {
    String name;
    double distance;
    List<Hotel> hotels;
    double reviews;
    //add constructor with field
	public PicnicSpot(String name, double distance, List<Hotel> hotels, double reviews) {
		super();
		this.name = name;
		this.distance = distance;
		this.hotels = hotels;
		this.reviews = reviews;
	}
	public PicnicSpot() {
		super();
	}
	@Override
	public String toString() {
		return "PicnicSpot [name=" + name + ", distance=" + distance + ", hotels=" + hotels + ", reviews=" + reviews
				+ "]";
	}
	
    
    	
    
	
   
}

public class PicnicSpotsAnalyzer {
    public static void main(String[] args) {
    	List<CustomerReview> creview=new ArrayList<CustomerReview>();
    	creview.add(new CustomerReview("sunil","sahoo@yahoo.com","What I liked most about this spot is clean and good to visit for family","affordable",5));  
    	creview.add(new CustomerReview("sunil","sahoo@yahoo.com","What I liked most about this spot is clean and good to visit for family","affordable",5));  
    	creview.add(new CustomerReview("sunil","sahoo@yahoo.com","What I liked most about this spot is clean and good to visit for family","affordable",5));  
    	creview.add(new CustomerReview("sunil","sahoo@yahoo.com","What I liked most about this spot is clean and good to visit for family","affordable",5));  
    	creview.add(new CustomerReview("sunil","sahoo@yahoo.com","What I liked most about this spot is clean and good to visit for family","affordable",5));  
    	creview.add(new CustomerReview("sunil","sahoo@yahoo.com","What I liked most about this spot is clean and good to visit for family","affordable",5));  
    	List<Hotel> hotellist1=new ArrayList<Hotel>();
    	List<Hotel> hotellist2=new ArrayList<Hotel>();
    	List<Hotel> hotellist3=new ArrayList<Hotel>();
    	List<Hotel> hotellist4=new ArrayList<Hotel>();
    	List<Hotel> hotellist5=new ArrayList<Hotel>();
    	hotellist1.add(new Hotel("Taj",9,5000,creview));
    	hotellist1.add(new Hotel("Mayfair",7,4500,creview));
    	hotellist1.add(new Hotel("PalaceVilla",14,3500,creview));
    	hotellist2.add(new Hotel("Tajmahal",9,5000,creview));
    	hotellist2.add(new Hotel("Blue Lagoon",7,4500,creview));
    	hotellist2.add(new Hotel("MysoreTemple",14,3500,2.3));
    	hotellist2.add(new Hotel("KingsNight",14,3500,3.5));
    	hotellist3.add(new Hotel("Taj",9,5000,5));
    	hotellist3.add(new Hotel("Mayfair",7,4500,4));
    	hotellist3.add(new Hotel("PalaceVilla",14,3500,2.8));
    	hotellist3.add(new Hotel("Tajmahal",9,5000,4.8));
    	hotellist4.add(new Hotel("Blue Lagoon",7,4500,3.5));
    	hotellist4.add(new Hotel("MysoreTemple",14,3500,4.0));
    	hotellist4.add(new Hotel("KingsNight",14,3500,2));
    	hotellist5.add(new Hotel("PalaceVilla",14,3500,5));
    	hotellist5.add(new Hotel("Tajmahal",9,5000,4));
    	hotellist5.add(new Hotel("Blue Lagoon",7,4500,4.7));
    	hotellist5.add(new Hotel("MysoreTemple",14,3500,3.5));
    	hotellist5.add(new Hotel("KingsNight",14,3500,2.9));
    	
    	
    	
        // Creating a List of PicnicSpot objects
        List<PicnicSpot> picnicSpots = new ArrayList<PicnicSpot>();
        picnicSpots.add(new PicnicSpot("Beach", 10.5, hotellist1, 4.2));
        picnicSpots.add(new PicnicSpot("Mountain", 25.0, hotellist2, 4.5));
        picnicSpots.add(new PicnicSpot("Park", 5.2, hotellist3, 4.0));
        picnicSpots.add(new PicnicSpot("Lake", 15.8, hotellist4, 4.8));
        picnicSpots.add(new PicnicSpot("Forest", 30.3, hotellist5, 4.1));

        // Find the best spot as per distance and find the best hotel 
        // as per distance
        Hotel bestHotelByDistance = picnicSpots.stream()
                .min((x,y)->Double.compare(x.getDistance(),y.getDistance())).get()
                .getHotels().stream()
                .min((x,y)->Double.compare(x.getDist_from_location(), y.getDist_from_location()))
                .get();
                
        System.out.println("Best Hotel as per distance: " + bestHotelByDistance);
        // Find the best spot as per distance and find the best hotel 
        // as per price
        PicnicSpot best_spot_as_per_distance=
        picnicSpots.stream().min((x,y)->Double.compare(x.getDistance(), y.getDistance()))
        		.get();
        System.out.println("Best spot as per distance "+best_spot_as_per_distance);
        
       Hotel best_hotel_as_per_price= best_spot_as_per_distance.getHotels().stream()
        .min((x,y)->Double.compare(x.getCharges(), y.getCharges())).get();
        
       System.out.println("Best hotel as per price "+best_hotel_as_per_price);
        

        // Find the best spot as per reviews
        PicnicSpot bestSpotByReviews = picnicSpots.stream()
                .max((x,y)->Double.compare(x.getReviews(),y.getReviews())).get();
                
        System.out.println("Best spot as per reviews: " + bestSpotByReviews);

        // Find the best hotel from the best spot as per review
        
        
        
        
    }
}