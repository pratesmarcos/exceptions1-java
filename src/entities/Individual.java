package entities;

public class Individual extends TaxPayer {

	private Double heathExpeditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double heathExpeditures) {
		super(name, anualIncome);
		this.heathExpeditures = heathExpeditures;
	}

	public Double getHeathExpeditures() {
		return heathExpeditures;
	}

	public void setHeathExpeditures(Double heathExpeditures) {
		this.heathExpeditures = heathExpeditures;
	}

	@Override
	public double tax() {
		if (getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - heathExpeditures * 0.5;
		} else {

			return getAnualIncome() * 0.25 - heathExpeditures * 0.5;
		}
	}

}
