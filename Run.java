package org.run;

import java.io.IOException;

import org.ad.BASE;
import org.first.Select;
import org.last.Last;
import org.openqa.selenium.WebElement;
import org.pom.FirstPage;

public class Run extends BASE{
	public static void main(String[] args) throws IOException, InterruptedException {
	
	getdriver();
	loadingurl("https://adactinhotelapp.com/");
	
	
	FirstPage page = new FirstPage();
	
	sendkey(page.getTxtusername(),excel(1, 0) );
	sendkey(page.getTxtpassword(), excel(1,0));
	clickbtn(page.getBtnlogin());
	
	Select s = new Select();
	
	WebElement location = s.getLocation();
	int i = Integer.parseInt(excel(0, 2));
	selctbyindex(location, i);
	
	WebElement hotel = s.getHotel();
	int j = Integer.parseInt(excel(1, 0));
	selctbyindex(hotel, j);
	
	WebElement roomtype = s.getRoomtype();
	slctbyvalue(roomtype, excel(2, 0));
	
	WebElement roomnos = s.getRoomnos();
	int k = Integer.parseInt(excel(3, 0));
	selctbyindex(roomnos, k);
	
	WebElement adults = s.getAdults();
	int l = Integer.parseInt(excel(4, 0));
	selctbyindex(adults, l);
	
	WebElement childs = s.getChilds();
	int m = Integer.parseInt(excel(4, 0));
	selctbyindex(childs, m);
	
	clickbtn(s.getSubmitbtn());
	
	Last last = new Last();
	
	clickbtn(last.getRadiobutton());
	
	clickbtn(last.getCntbtn());
	
	sendkey(last.getFrstname(), excel(0, 0));
	
	sendkey(last.getLstname(), excel(5, 0));
	
	sendkey(last.getAdrs(), excel(6, 0));
	
	sendkey(last.getCrdnum(), excel(7, 0));
	
	WebElement crdtype = last.getCrdtype();
	int n = Integer.parseInt(excel(4, 0));
	selctbyindex(crdtype, n);
	
	WebElement expmonth = last.getExpmonth();
	int o = Integer.parseInt(excel(4, 0));
	selctbyindex(expmonth, o);
	
	WebElement expyear = last.getExpyear();
	int p = Integer.parseInt(excel(4, 0));
	selctbyindex(expyear, p);
	
    sendkey(last.getCvvnum(), excel(8, 0));
    
    clickbtn(last.getBookbtn());
    
    Thread.sleep(10000);
    
    WebElement locators = locators("id", "order_no");
    
    String ordrid = getattribute(locators);
    
    toWritetoExcel(ordrid, 9, 0);
    
    
	
	
	
	
	
	
	
	
	
	
	
	

}
}