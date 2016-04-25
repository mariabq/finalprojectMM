package ro.tm.siit.w20.FinalProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;

import javax.sound.sampled.EnumControl.Type;

public class ExpenseManager {

	enum Forecast {
		month,
		year
	}
	
	private static final int HashMap = 0;
	private List<Expense> expenses = new ArrayList<Expense>();
	private HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
	
	private List<Expense> daylyExpenses = new ArrayList<Expense>();
	private List<ArrayList> weeklyExpenses = new ArrayList<ArrayList>();
	private List<ArrayList> monthlyExpenses = new ArrayList<ArrayList>();
	
	/*
	 * creates new expense and adds it to the daylyExpense list according to the date
	 * if expenseType is:
	 * 	- dayly, it creates an identincal expense for every day of the year
	 *  - weekly, it creates an identincal expense for every week of the year
	 *  - monthly, it creates an identincal expense for every month of the year
	 */
	public void addExpense(String name, int value, Date date, Expense.Type expenseType) {
		//cum creem un daylyExpense pt fiecare zi? 
		//e nevoie sau e suficient sa grupam in functie de data cand e nevoie?
		//if (date...)
		// adauga la lista in functie de data
			daylyExpenses.add(new Expense(name, value, date, expenseType));
		switch (expenseType) {
		case DAYLY:
			//some code that creates an identincal expense for every day of the year
			break;
		case WEEKLY:
			//some code that creates an identincal expense for every week of the year
			break;
		case MONTHLY:
			//some code that creates an identincal expense for every month of the year
			break;
		}
	}
	
	/*
	 *expenses list (view by default) 
	 */
	public void printExpenses() {
		for (Expense exp : expenses) {
			System.out.println(exp.toString());
		}
	}
	
	/*
	 * lookup expense method by type
	 */
	public int lookUpExpenses(Expense.Type expType){
		int sum = 0;
		for (Expense exp : expenses) {
			if (exp.getExpenseType().equals(expType)) {
				sum += exp.getValue();
			}
		}
		return sum;
	}
	
	/*
	 * lookup expense method by date
	 */
	public int lookUpExpenses(Date date){
		int sum = 0;
		for (Expense exp : expenses) {
			if (exp.getDate().equals(date)) {
				sum += exp.getValue();
			}
		}
		return sum;
	}
	
	/*
	 * lookup expense method by period
	 */
	public void lookUpExpenses(Date start, Date end){
		int sum = 0;
		for (Expense exp : expenses) {
			if (exp.getDate().after(start) == true && exp.getDate().before(end) == true) {
				sum += exp.getValue();
			}
		}
	}
	
	public void calculateForecast(Forecast period) {
		switch (period) {
		case month:
			//some code
			break;
		case year:
			//some code
			break;
		}
	}
	
	/*
	 * prints the biggest expense for the selected period
	 */
	public void printBiggestExpensePerMonth(Date month) {	
		for (Expense exp : expenses) {
			if (exp.getDate().equals(month)) {		
				tempMap.put(exp.getName(), exp.getValue()); 
				//HashMap o sa blocheze adaugarea de intrari noi atunci cand numele exista deja. 
				//Cum facem sa sumam valorile atunci cand intalneste o key-e deja existenta?
			}
			//itereaza prin tempMap si returneaza numele si valoarea celei mai mari cheltuieli
			//golim tempMap pt a putea fi folosit ulterior
		}
	}
	
	
}
