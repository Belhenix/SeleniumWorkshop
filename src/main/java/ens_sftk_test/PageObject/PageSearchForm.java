package ens_sftk_test.PageObject;

import static ens_sftk_test.DataModels.DataCollections.getTestData;
import static ens_sftk_test.DataModels.DataCollections.getXPaths;
import static ens_sftk_test.WebUtils.DriverUtil.getDriver;
import static ens_sftk_test.WebUtils.ElementUtil.addToElement;

import ens_sftk_test.DataModels.DataTest;

public class PageSearchForm {

	public void runTest() {
    	for(DataTest row : getTestData()) {
    		searchFormSkipCaptcha(row);    		
    	}
	}
	
	private void searchFormSkipCaptcha(DataTest testRow) {
		
    	addToElement(getDriver(), getXPaths().get("inpNombre"), testRow.getNombre());
	}
}
