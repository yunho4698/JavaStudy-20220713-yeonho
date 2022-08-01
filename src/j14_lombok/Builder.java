package j14_lombok;

public class Builder extends CarBuilder {
	
	
	
	@Override
	public CarBuilder color(String color) {
		car.setColor(color);
		return null;
	}
	
	@Override
	public CarBuilder company(String company) {
		car.setCompany(company);
		return null;
	}
	
	
	@Override
	public CarBuilder model(String model) {
		car.setModel(model);
		return null;
	}
	
}
