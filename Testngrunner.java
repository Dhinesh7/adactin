package org.run;

import java.io.IOException;

import org.ad.BASE;
import org.first.Select;
import org.junit.runners.Parameterized.Parameters;
import org.last.Last;
import org.openqa.selenium.WebElement;
import org.pom.FirstPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngrunner extends BASE{

@Test
private void run() throws IOException, InterruptedException{
	getdriver();
	loadingurl("https://adactinhotelapp.com/");
	FirstPage d = new FirstPage();
	sendkey(d.getTxtusername(), excel(0, 0));
	sendkey(d.getTxtpassword(), excel(0, 0));
	clickbtn(d.getBtnlogin());
	
	
	Select s = new Select();
	
	WebElement location = s.getLocation();
	slctbyvalue(location, excel(1, 0));
	
	WebElement hotel = s.getHotel();
	slctbyvalue(hotel, excel(2, 0));
	
	WebElement roomtype = s.getRoomtype();
	slctbyvalue(roomtype, excel(3, 0));
	
	WebElement roomnos = s.getRoomnos();
	int i = Integer.parseInt(excel(4, 0));
	selctbyindex(roomnos, i);
	
	WebElement adults = s.getAdults();
	int j = Integer.parseInt(excel(4, 0));
	selctbyindex(adults, j);
	
	WebElement childs = s.getChilds();
	int k = Integer.parseInt(excel(4, 0));
	selctbyindex(childs, k);
	
	clickbtn(s.getSubmitbtn());
	
	Last a = new Last();
	
	clickbtn(a.getRadiobutton());
	
	clickbtn(a.getCntbtn());
	
	sendkey(a.getFrstname(), excel(0, 0));
	sendkey(a.getLstname(), excel(0, 0));
    sendkey(a.getAdrs(), "Tenkasi");
	sendkey(a.getCrdnum(), "4578457878451236");
	
	WebElement crdtype = a.getCrdtype();
	int l = Integer.parseInt(excel(4, 0));
	selctbyindex(crdtype, l);
	
	WebElement expmonth = a.getExpmonth();
	int m = Integer.parseInt(excel(4, 0));
	selctbyindex(expmonth, m);
	
	WebElement expyear = a.getExpyear();
	int n = Integer.parseInt(excel(4, 0));
	selctbyindex(expyear, n);
	
	sendkey(a.getCvvnum(), "456");
	
	clickbtn(a.getBookbtn());
	

    Thread.sleep(10000);
    
    WebElement locators = locators("id", "order_no");
    
    String ordrid = getattribute(locators);
    
//    toWritetoExcel(ordrid, 9, 0);
    	
}



   



	}





























