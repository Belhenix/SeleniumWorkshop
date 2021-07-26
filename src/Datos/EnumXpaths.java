package Datos;


public enum EnumXpaths {

    INPUT_CURP("//input[@id='curpinput']"),
    BUTTON_SEARCH("//button[@id='searchButton']"),
	INPUT_NOMBRE("//input[@id='nombre']"),
	INPUT_PRIMERAPELLIDO("//input[@id='primerApellido']"),
	INPUT_SEGUNDOAPELLIDO("//input[@id='segundoApellido']"),
	SELECT_DIANACIMIENTO("//select[@id='diaNacimiento']"),
	SELECT_MESNACIMIENTO("//select[@id='mesNacimiento']"),
	INPUT_ANIONACIMIENTO("//input[@id='selectedYear']"),
	SELECT_SEXO("//select[@id='sexo']"),
	SELECT_ESTADO("//select[@id='claveEntidad']");
	
    private final String xpath;

    EnumXpaths(final String xpath) {
        this.xpath = xpath;
    }

    @Override
    public String toString() {
        return xpath;
    }
}
