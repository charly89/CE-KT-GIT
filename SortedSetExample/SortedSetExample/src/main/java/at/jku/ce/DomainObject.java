package at.jku.ce;

public class DomainObject {

	private String id;
	private String name;

	public DomainObject(String id) {
		super();
		this.id = id;
	}
	/**
	* Default-Konstruktor
	*/
	public DomainObject() {
		super();
	}

	public String getID(){
		return id;
	}
}
