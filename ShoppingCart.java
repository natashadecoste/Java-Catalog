
public class ShoppingCart extends User{
	private Item[] content;
	private int n = 0;
	public ShoppingCart(String u) {
		super(u);
	}
	public void addItem(Item i){ content[n] = i; n++; }
	public Item[] getContent(){ return content; }
}