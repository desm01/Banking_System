package BankSystem;

public abstract class Person {

	private String _name;
	
	public Person(String name) {
		this._name = name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}


	public String getName() {
		return _name;
	}
	
	public String toString() {
		return null;
	}
}
