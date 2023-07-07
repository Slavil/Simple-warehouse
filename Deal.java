

public abstract class Deal {
	
	private int date;
    private int mushroomType;
    private int quantity;
    private int quality;
    private String person;
	
	public Deal(int date, int mushroomType, int quantity, int quality, String person) {
		super();
        this.date = date;
		this.mushroomType = mushroomType;
		this.quantity = quantity;
		this.quality = quality;
		this.person = person;
	}
	
	public String prepareString(String middle) {
		
		return this.date + ", " + this.mushroomType + ", " 
				+ ", " + this.quantity + ", " + this.quality + ", " + this.person;
		
	}
}
