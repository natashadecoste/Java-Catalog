
public class Audio extends Item{
	protected String artistName;
	protected String name;
	public Audio(int s, String n, String a, int p, int q){
		sNo = s;
		name = n;
		artistName = a;
		price = p;
		quantity = q;
	}
	public String getInfo(){
		return String.valueOf(sNo)+name+artistName+
				String.valueOf(price)+String.valueOf(quantity);
	}
	public double getPrice() { return price; }
}
