package Generics;

public class Person2<T> {

	private T id;

	public Person2(T id) {
		super();
		this.id = id;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
	
}
