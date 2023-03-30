package Steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class PackageDetails {

	HomePage home = new HomePage(Hooks.getDriver());
@Given("I naviagate to STC TV website")
public void i_naviagate_to_stc_tv_website() {
    // Write code here that turns the phrase above into concrete actions
	 home.goToUrl("https://subscribe.stctv.com/");
}


@Then("I validate that there are available packages")
public void i_validate_that_there_are_available_packages(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	List<List<String>> list = dataTable.asLists(String.class);
for(int i=0; i<3; i++) {
	Assert.assertEquals(list.get(i).get(0), home.getPackage(i));
	Assert.assertEquals(Integer.parseInt(list.get(i).get(1)), home.getPackagePrice(i));
	Assert.assertEquals(list.get(i).get(2), home.getPackageCurrency(i));
}
	
   
}

}
