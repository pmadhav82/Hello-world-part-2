package farmer;

public class Stall {
	
	private String stallName;
	private String woner;
	private String items;
	
	
	
	public Stall(String stallName, String woner, String items){
		 this.stallName = stallName;
		 this.woner = woner;
		 this.items = items;
				 
	}



	public String getStallName() {
		return stallName;
	}



	public void setStallName(String stallName) {
		this.stallName = stallName;
	}



	public String getWoner() {
		return woner;
	}



	public void setWoner(String woner) {
		this.woner = woner;
	}



	public String getItems() {
		return items;
	}



	public void setItems(String items) {
		this.items = items;
	}
	
	public void stallDetails(){
		System.out.println("Stall name is " + stallName + " woned by " + woner + " and selling items are " + items  );
		
	}
	
	
	

}
