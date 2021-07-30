package ens_sftk_test.fr_01;

import ens_sftk_test.PageObject.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        Gson gson = new Gson();
//        List<DataXpath> xpaths;
        Map<String, DataXpath> xpaths;
        
        BufferedReader reader = null;
        try {
        	reader = Files.newBufferedReader(Paths.get(App.class.getResource("/data/xpaths.json").toURI()));
        	//list
//            xpaths = gson.fromJson(reader, new TypeToken<List<DataXpath>>(){}.getType());
//            DataXpath xpath = xpaths.stream().filter(x -> x.getName().equals("inpCurp")).findFirst().get();
        	//map
        	xpaths = gson.fromJson(reader, new TypeToken<Map<String, DataXpath>>(){}.getType());
            DataXpath xpath = xpaths.get("inpCurp");
            //print resultado
            System.out.println(xpaths);
            System.out.println(xpath);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    	PageSearchCurp testCurp = new PageSearchCurp();
    	PageSearchForm testForm = new PageSearchForm();
    	PageResults testResult = new PageResults();
    	testCurp.runTest();
    	testForm.runTest();
    	testResult.runTest();
    }
}
