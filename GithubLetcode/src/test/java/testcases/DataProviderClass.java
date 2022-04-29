package testcases;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	
	@DataProvider(name = "gettingData")
	public String[][] getDataMethod()
	{
		String[][] data = new String[1][2];
		data[0][0] = "sheeladevitn@gmail.com";
		data[0][1] = "Guest123"; 
		//data[1][0] = "koushik1@letcode.in";
		//data[1][1] = "Pass123$";
		
		return data;
	}

}
