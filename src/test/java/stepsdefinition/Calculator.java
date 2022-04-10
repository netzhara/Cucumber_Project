package stepsdefinition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class Calculator {
	
	int result;
	int row;
	
	@Given("user open calculator")
	public void user_open_calculator() {
		
		System.out.println("Inside Calculator");
	}

	@When("user add {int} and {int}")
	public void user_add_and(int number_1, int number_2) {
		
		result = number_1 + number_2;
	}

	@Then("user should get the result as {int}")
	public void user_should_get_the_result_as(int resul) {
		
		Assert.assertEquals(resul, result);
	    
	}

	@When("user sub {int} and {int}")
	public void user_sub_and(int number_1, int number_2) {
		
		result = number_1 - number_2;
	}
	
	@When("user add below variables")
	public void user_add_below_variables(io.cucumber.datatable.DataTable dataTable) {
	    
		row = dataTable.height();
		
		for(int index=0; index<row; index++) 
			result = result + Integer.parseInt(dataTable.cell(index, 0));
		
	}
	
	@When("user add list of numbers")
	public void user_add_list_of_numbers(List <Integer> numbers) {
	    
		for (Integer list : numbers )
			result = result + list;
	}
	
	@When("user order below items")
	public void user_order_below_items(Map<String, Integer> map) {
	    
		for(String price : map.keySet())
			
			result = result + map.get(price);
	}
	
	@When("user order list of quantity")
	public void user_order_list_of_quantity(io.cucumber.datatable.DataTable dataTable) {
	   
		row = dataTable.height();
		
		for(int index=0; index<row; index++) {
			
			int items = Integer.parseInt(dataTable.cell(index, 1));
			int price = Integer.parseInt(dataTable.cell(index, 2));
			
			result = result + items*price;
			
	   }


   }
}
