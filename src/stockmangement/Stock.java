package stockmangement;

public class Stock {
	int noOfShares;
	int sharePrice;
	String shareName;

	public Stock(String shareName, int noOfShares, int sharePrice) {
		this.shareName = shareName;
		this.noOfShares = noOfShares;
		this.sharePrice = sharePrice;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public String getShareName() {
		return shareName;
	}

	public int calculateValue() {
		return sharePrice * noOfShares;
	}
}
