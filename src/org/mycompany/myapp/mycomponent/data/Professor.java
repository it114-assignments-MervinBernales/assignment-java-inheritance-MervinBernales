/**
 * 
 */
package org.mycompany.myapp.mycomponent.data;

/**
 * @author Mervin
 *
 */
public class Professor extends PersonBase implements Person {

	private String title;
	/* (non-Javadoc)
	 * @see org.mycompany.myapp.mycomponent.data.Person#getName()
	 */
	public Professor(String _name, Integer _age, String _title){
		super(_name, _age);
		title = _title;
	}
	@Override
	public String getName() {
	
		return "Prof: " + super.getName();
	}

	/* (non-Javadoc)
	 * @see org.mycompany.myapp.mycomponent.data.Person#getAge()
	 */
	//@Override
	

}
