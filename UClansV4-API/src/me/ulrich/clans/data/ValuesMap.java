package me.ulrich.clans.data;

public class ValuesMap {
	
	private String values;

	public ValuesMap(int i) {
		this.values = String.valueOf(i);
	} 
	
	public int getValue() {

		return Integer.valueOf(this.values);
	}
	
	public int addValue(int value) {
		
		
		try {
			if(Integer.valueOf(this.values)>0) {
				this.values = String.valueOf(Integer.valueOf(this.values)+value);
			} else {
				this.values = String.valueOf(value);
			}
		} catch (Exception e) {}
	
		return Integer.valueOf(this.values);
	}
	

	public int removeValue(int value) {
		try {
			
				if(Integer.valueOf(this.values)>=value) {
					this.values = String.valueOf(Integer.valueOf(this.values)-value);
				} else {
					this.values = String.valueOf("0");
				}
			
		} catch (Exception e) {}

		return Integer.valueOf(this.values);
	}
	

	public boolean deleteValue() {
		this.values = String.valueOf("0");
		return true;
	}

}
