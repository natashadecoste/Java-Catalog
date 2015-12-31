public class Readable extends Item{

	protected String authorName;
	protected String bookName;
	public Readable (int s, String n, String a, int p, int q){
		sNo=s;
		bookName = n;
		authorName=a;
		price=p;
		quantity=q;
	}

	public String getInfo() {
		return sNo + bookName + authorName + price + quantity; 
	}

	public double getPrice() { // override
		return price;
	}
}
