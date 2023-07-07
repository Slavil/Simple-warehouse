package java_task;

public class Deal {
	private String date;
    private int mushroomType;
    private float quantity;
    private int quality;
    private String person;
	String variable_Quality;
	public String mushroomSort;
	public Deal(String date, int mushroomType, float quantity, int quality, String person) {
		super();
        this.date = date;
		this.mushroomType = mushroomType;
		this.quantity = quantity;
		this.quality = quality;
		this.person = person;
	}

	public String toString() {
		if (this.mushroomType == 1){
			mushroomSort = "Manatarka";
		}
		if (this.mushroomType == 2){
			mushroomSort = "Pechurka";
		}
		if (this.mushroomType == 3){
			mushroomSort = "Kladnica";
		}
		if (this.mushroomType == 4){
			mushroomSort = "Pachi Krak";
		}
		if (this.mushroomType == 5){
			mushroomSort = "Sarnela";
		}
		if (this.mushroomType == 6){
			mushroomSort = "Other type of mushroom";
		}
		
		if (quality == 1){
			variable_Quality = "-st";
		}
		if (quality == 2){
			variable_Quality = "-nd";
		}
		if (quality == 3){
			variable_Quality = "-rd";
		}
		return this.getDate().charAt(6)+""+this.getDate().charAt(7)+"."+ this.getDate().charAt(4)+""+this.getDate().charAt(5) + "." +
	             this.getDate().charAt(0)+ this.getDate().charAt(1)+ this.getDate().charAt(2)+ this.getDate().charAt(3) + " " +
	             this.getDate().charAt(8)+this.getDate().charAt(9)+":"+this.getDate().charAt(10)+this.getDate().charAt(11) + 
				 ", " + mushroomSort + ", " + this.getQuantity() + " kg., " + this.getQuality() + this.variable_Quality + ", " + this.getPerson();
		
	}

	public String getVariable_Quality() {
		return variable_Quality;
	}

	public void setVariable_Quality(String variable_Quality) {
		this.variable_Quality = variable_Quality;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMushroomType() {
		return mushroomType;
	}

	public void setMushroomType(int mushroomType) {
		this.mushroomType = mushroomType;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
}
