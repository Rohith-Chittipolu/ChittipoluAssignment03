package q23;
public final class Employee {
	 
    private final String name;
    private final int age;
    private final String gender;
 
    public Employee(final String name, final int age, final String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
 
    public String toString() {
        return "[" + name + " " + age + " " + gender + "]";
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public String getGender() {
        return gender;
    }
     
    public static void main(String[] args) {
        Employee employee = new Employee("Richard", 25, "Male");
        System.out.println(employee);
    }}


