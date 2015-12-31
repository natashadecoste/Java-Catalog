
public class Book extends Readable{

	public Book(int s, String n, String a, int p, int q) {
		super(s, n, a, p, q);
}
	public double getPrice(){
		return price*1.02;
	}
	
}
