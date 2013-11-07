package at.jku.ce;

public class DomainObject {

<<<<<<< HEAD
	private String id;
=======
	public String uuid =  UUID.randomUUID().toString();
>>>>>>> 2499bb1094e9e209fa6a9437b82801491a798222
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
