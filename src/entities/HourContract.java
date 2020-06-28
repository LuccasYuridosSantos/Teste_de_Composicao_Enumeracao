package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract () {
	}
	
	public HourContract(Date date, Double valuePerHours, Integer hours) {
		this.date=date;
		this.valuePerHour=valuePerHours;
		this.hours=hours;
	}
	
	public Date getdate(){
		return date;
	}
	
	public void setdate(Date date){
		this.date=date;
	}
	
	public Double getvaluePerHour() {
		return valuePerHour;
	}
	
	public void setvaluePerHour(Double valuePerHour) {
		this.valuePerHour=valuePerHour;
	}
	
	public Integer gethours(){
		return hours;		
	}
	
	public void sethours(Integer hours) {
		this.hours=hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
	
	
}