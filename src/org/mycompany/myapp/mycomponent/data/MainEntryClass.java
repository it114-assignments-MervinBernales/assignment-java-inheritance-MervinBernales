/**
 * 
 */
package org.mycompany.myapp.mycomponent.data;

/**
 * @author Mervin
 *
 */
public class MainEntryClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		Student s1 = new Student("Mervin", 20, "College", "123");
		System.out.println("s1 name :" + s1.getName());
		Professor p1 = new Professor("Albert", 420, "ORdinarius");
		System.out.println("p1 name:" + p1.getName()); 
		Person person1 =s1; 
		System.out.println("person1 name :" + person1.getName());
		Studying studying1 = s1;
		System.out.println("studying1 studyFor:" + studying1.studyFor());
		Person person2 = new Student("Mervin", 20, "College", "123");
		System.out.println("person1 name:" + person2.getName());

	}

}
