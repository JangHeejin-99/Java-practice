package chapter10_practice.date;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	boolean isVaild = true;
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day < 1 || day > 31) {
					isVaild = false;
				}
				else {
					this.day = day;
				}
			case 4: case 6: case 9: case 11:
				if(day < 1|| day> 30) {
					isVaild = false;
				}
				else {
					this.day = day;
				}
			case 2:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					if(day < 1 || day > 29) {
						isVaild = false;
					}
					else {
						this.day = day;
					}
				}
				else {
					if (day < 1 || day > 28) {
						isVaild = false;
					}
					else {
						this.day = day;
					}
				}
			default:
				isVaild = false;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isVaild = false;
		}
		else 
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		return getYear()*10000  +getMonth()*100 + getDay();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.getDay() == date.getDay() && this.getMonth() == date.getMonth() && this.getYear() == date.getYear()) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
	
	
	
}
