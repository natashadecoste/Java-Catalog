
public class CD extends Audio{
	public CD(int s, String n, String a, int p, int q){
		super(s, n, a, p, q);
	}
	public double price(){ return price*1.02; }
}