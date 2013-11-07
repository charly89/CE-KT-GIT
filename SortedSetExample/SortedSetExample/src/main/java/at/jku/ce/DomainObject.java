package at.jku.ce;

public class DomainObject {

	private String uuid =  UUID.randomUUID().toString();
	private String name;
	private String comment; 

	public DomainObject(String name, String comment) {
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
	
	public String getComment() { 
		return comment; 
	} 
	
	public void setComment(String comment) { 
		this.comment = comment; 
	}
	
	public String getName() { 
		return name; 
	} 
	
	public void setName(String pname) {
		this.name = pname; 
	}
}
