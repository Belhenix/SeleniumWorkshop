package ens_sftk_test.PageObject;

import static ens_sftk_test.DataModels.DataCollections.*;
import static ens_sftk_test.WebUtils.DriverUtil.*;
import static ens_sftk_test.WebUtils.ElementUtil.*;

import ens_sftk_test.DataModels.DataTest;

public class PageSearchCurp {
	
	public void runTest() {
    	for(DataTest row : getTestData()) {
    		searchCurpSkipCaptcha(row);    		
    	}
	}

    private void searchCurpSkipCaptcha(DataTest testRow) {
    	addToElement(getDriver(), getXPaths().get("inpCurp"), testRow.getCurp());
    	clickElement(getDriver(), getXPaths().get("btnSearch"));
    }
}
