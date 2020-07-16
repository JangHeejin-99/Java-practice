package chapter5_practice.hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isVaild = true;
	
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
			if (day < 1 || day > 31) {
				isVaild = false;
			}
			else
				this.day = day;
		case 4: case 6: case 9: case 11:
			if (day < 1 || day > 30) {
				isVaild = false;
			}
			else
				this.day = day;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if (day < 1 || day > 29) {
					isVaild = false;
				}
				else
					this.day = day;
			}
			else {
				if (day < 1 || day > 28) {
					isVaild = false;
				}
				else
					this.day = day;
			}
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12)
			isVaild = false;
		else
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isVaild() {
		if (isVaild)
			return true;
		else
			return false;
	}
	
	
}
