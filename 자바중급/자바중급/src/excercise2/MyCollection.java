package excercise2;

import java.util.Enumeration;

public class MyCollection {
	private Enumeration<Order> _orders;

	public MyCollection(Enumeration<Order> _orders) {
		this._orders = _orders;
	}

	public Enumeration<Order> elements() {
		return _orders;
	}
}
