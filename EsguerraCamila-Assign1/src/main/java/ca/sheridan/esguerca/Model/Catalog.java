package ca.sheridan.esguerca.Model;

public class Catalog {
	
	//make all the objects private my default
	private String productName;
	private int productCode;
	private String productBrand;
	private int productQuant;
	private double productPrice;
	
	
	
	//create a proper no-arg constructor
	public Catalog () {}
	
	
	//setters for every attribute that was created
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	public void setProductQuant(int productQuant) {
		this.productQuant = productQuant;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	///////
	
	//getters for the attributes as well
	
	public String getProductName() {
		return this.productName;
	}
	
	public int getProductCode() {
		return this.productCode;
	}
	
	public String getProductBrand() {
		return this.productBrand;
	}
	
	public int getProductQuant() {
		return this.productQuant;
	}
	
	public double getProductPrice() {
		return this.productPrice;
	}
	
	
	
}//closing for catalog
