package traversingListsandCustomTypes;

public class Animal {
 

String name;
 int age;
 
 public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Animal [name=" + name + ", age=" + age + "]";
}
 
 
}
