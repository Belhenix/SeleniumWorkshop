package ens_sftk_test.DataModels;

public class DataXpath {
	private String name;
	private String path;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public String toString() {
		return String.format("{ \"name\": \"%s\", \"path\": \"%s\" }", this.name, this.path);
	}
}
