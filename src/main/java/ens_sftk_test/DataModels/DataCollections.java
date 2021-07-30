package ens_sftk_test.DataModels;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import ens_sftk_test.fr_01.App;

public class DataCollections {
	
	private static Map<String, String> xPaths = null;
	private static List<DataTest> testData = null;
	
	private static void getData() {
        Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        BufferedReader reader = null;
        //xpaths
        try {
        	reader = Files.newBufferedReader(Paths.get(App.class.getResource("/data/xpaths.json").toURI()));
        	xPaths = gson.fromJson(reader, new TypeToken<Map<String, String>>(){}.getType());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //testdata
        reader = null;
        try {
        	reader = Files.newBufferedReader(Paths.get(App.class.getResource("/data/testdata.json").toURI()));
            testData = gson.fromJson(reader, new TypeToken<List<DataTest>>(){}.getType());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}

	public static Map<String, String> getXPaths() {
		if(xPaths == null) getData();
		return xPaths;
	}

	public static List<DataTest> getTestData() {
		if(testData == null) getData();
		return testData;
	}
}
