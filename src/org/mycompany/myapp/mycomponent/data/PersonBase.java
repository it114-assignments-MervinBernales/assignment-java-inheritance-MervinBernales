/**
 * 
 */
package org.mycompany.myapp.mycomponent.data;

/**
 * @author Mervin
 *
 */
public class PersonBase implements Person {
	protected String name;
	protected Integer age;
	public PersonBase(String _name, Integer _age){
		name = _name;
		age = _age;
	}
	public PersonBase() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see org.mycompany.myapp.mycomponent.data.Person#getName()
	 */
	@Override
	public String getName() {

		return name;
	}

	/* (non-Javadoc)
	 * @see org.mycompany.myapp.mycomponent.data.Person#getAge()
	 */
	@Override
	public Integer getAge() {
		return age;
	}

}
