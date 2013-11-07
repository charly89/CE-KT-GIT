package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
		
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(newDomainObjectComparator()); 
		objectSet.add(new DomainObject("Helga"), "Kommentar"); 
		objectSet.add(new DomainObject("Walter"), "Kommentar"); 
		objectSet.add(new DomainObject("Hans"), "Kommentar"); 
		objectSet.add(new DomainObject("Paul"), "Kommentar"); 
		objectSet.add(new DomainObject("Claudia"), "Kommentar"); 
		
		for (DomainObject domainObject : objectSet) { 
			LOGGER.debug(domainObject.toString); 
		}
	}

}
