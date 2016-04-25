package ro.tm.siit.w20.FinalProject;

import java.util.Date;

public class Expense {
	
	enum Type {
		DAYLY,
		WEEKLY,
		MONTHLY
	}
	
	private String name;
	private int value;
	private Date date;
	private Type expenseType;
	
	public Expense(String name, int value, Date date, Type expenseType) {
		this.name = name;
		this.value = value;
		this.date = date;
		this.expenseType = expenseType;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public Date getDate() {
		return date;
	}

	public Type getExpenseType() {
		return expenseType;
	}

	@Override
	public String toString() {
		return "value: " + value + 
				"/n name: " + name +
				"/n date: " + date +
				"/n type: " + expenseType;
	}
	
	

}
