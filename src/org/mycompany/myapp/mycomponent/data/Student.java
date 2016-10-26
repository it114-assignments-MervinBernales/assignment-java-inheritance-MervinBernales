/**
 * 
 */
package org.mycompany.myapp.mycomponent.data;

/**
 * @author Mervin
 *
 */
public class Student extends PersonBase implements Person, Studying {
//	protected String name;
//	private Integer age;
	private String grade;
	private String id;
	
	
	public Student(){
//		super();
		super("Mervin", 20);
	}
	public Student(String _name, Integer _age){
		super(_name, _age);
//		name = _name;
//		age = _age;

	}
//	public Student(String _name, Integer _age, String _grade){
//		super.name = _name;
//		this.name = _name + "istop";
//		name = _name + "interesting";
//		super.age = _age +10 ;
//		this.age = _age;
//		age = _age;
//		grade = _grade;
//		
//	}
	public Student(String _name, Integer _age, String _grade){
		this(_name, _age);
//		name = _name;
//		age = _age;
		grade = _grade;
	}
	public Student(String _name, Integer _age, String _grade, String _id){
		this(_name, _age, _grade);
		id = _id;
	}
//	@Override
	public String getName(String _name, Integer _age) {
		return name;
	}
	public String getName(String _lastName) {

		return name + _lastName;
	}

	/* (non-Javadoc)
	 * @see org.mycompany.myapp.mycomponent.data.Person#getAge()
	 */
	@Override
	public Integer getAge() {

		return age-10;
	}
	@Override
	public String studyFor() {
		// TODO Auto-generated method stub
		return "JAVA";
	}

}
