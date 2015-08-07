package Library;

public class Reader {
	public int codeReaderTemp = 0000;
	private  String nameReader, place, numberPhone;
	private int codeReader;
	public Reader(String nameReader, String place, String numberPhone, int codeReader) {
		
		this.nameReader = nameReader;
		this.place = place;
		this.numberPhone = numberPhone;
		this.codeReader = codeReader;
	}
	public Reader(){
		this.nameReader = "No name";
		this.place ="No information";
		this.numberPhone ="No information";
		this.codeReader = codeReaderTemp++;
	}
	public int getCodeReaderTemp() {
		return codeReaderTemp;
	}
	public void setCodeReaderTemp(int codeReaderTemp) {
		this.codeReaderTemp = codeReaderTemp;
	}
	public String getNameReader() {
		return nameReader;
	}
	public void setNameReader(String nameReader) {
		this.nameReader = nameReader;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public int getCodeReader() {
		return codeReader;
	}
	public void setCodeReader(int codeReader) {
		this.codeReader = codeReader;
	}
	
}
