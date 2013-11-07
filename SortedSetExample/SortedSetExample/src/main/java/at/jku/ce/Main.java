package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
		
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(newDomainObjectComparator()); 
		objectSet.add(new DomainFactory.createDomainObject("Helga"), "Kommentar"); 
		objectSet.add(new DomainFactory.createDomainObject("Walter"), "Kommentar"); 
		objectSet.add(new DomainFactory.createDomainObject("Hans"), "Kommentar"); 
		objectSet.add(new DomainFactory.createDomainObject("Paul"), "Kommentar"); 
		objectSet.add(new DomainFactory.createDomainObject("Claudia"), "Kommentar"); 
		
		for (DomainObject domainObject : objectSet) { 
			LOGGER.debug(domainObject.toString); 
		}
	}

}
