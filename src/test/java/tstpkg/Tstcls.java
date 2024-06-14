package tstpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import bass.Basec;
import excel.Exceluti;
import pagepkg.Pagevls;

public class Tstcls extends Basec {

	
	
	@Test 
	public void test() throws IOException
	{
		Pagevls ob = new Pagevls(driver);
		String xl = "C:\\Users\\User\\Desktop\\Book2.xlsx";
		String Sheet = "Sheet1";
		int rowcount = Exceluti.getrowcount(xl, Sheet);
		for(int i =1;i<= rowcount;i++)
		{
			String username = Exceluti.getcellvalue(xl, Sheet, i, 0);
			String paswword = Exceluti.getcellvalue(xl, Sheet, i, 1);
			ob.setvalues(username, paswword);
			ob.click();
		}
	}
	
	
	
}
