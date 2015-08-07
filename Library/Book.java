package Library;

public class Book {
	public int codeBookTemp = 0000;
	private int codeBook,amount ;
	private String nameBook,nameAuthor;
	
	Book(String nameBook, String nameAuthor, int amount){
		this.nameBook = nameBook;
		this.nameAuthor = nameAuthor;
		this.codeBook = codeBookTemp++;
		this.amount = amount;
	}
	Book(){
		this.nameAuthor ="noname";
		this.nameBook = "noname";
		this.codeBook = 0000;
		this.amount =0;
	}
	public int getCodeBookTemp() {
		return codeBookTemp;
	}
	public void setCodeBookTemp(int codeBookTemp) {
		this.codeBookTemp = codeBookTemp;
	}
	public int getCodeBook() {
		return codeBook;
	}
	public void setCodeBook(int codeBook) {
		this.codeBook = codeBook;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public String getNameAuthor() {
		return nameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
	
}
