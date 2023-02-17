package Interface;

public interface WorldBank extends AXIS {

	public abstract void ppf();

	public abstract void draft();

	// here we are able to write default methods after java 8
	// but before java 8 its not possible to write non-abstract methods (default)
    //	default void develop() {
    //		
    //	}

}
