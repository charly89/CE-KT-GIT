package at.jku.ce;

public class DomainObject {

	public String uuid =  UUID.randomUUID().toString();
	private String name;

	public DomainObject(String uuid) {
		super();
		this.uuid = uuid;
	}
	/**
	* Default-Konstruktor
	*/
	public DomainObject() {
		super();
	}

	public String getUuid(){
		return uuid;
	}
}
