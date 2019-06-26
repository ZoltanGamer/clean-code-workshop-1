package hu.gyeekclub.workshop;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String title;
	private int priceCode;

	public Movie(String title, int priceCode) {
		if(title == null){
			throw new IllegalArgumentException();
		}
		this.title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int arg) {
		if(arg > 2 || arg < 0){
			throw new IllegalArgumentException();
		}
		priceCode = arg;
	}

	public String getTitle() {
		return title;
	}
}
