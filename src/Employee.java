
public class Employee {
	
	
	private int id;
	private String name;
	private int age;
	private String dateofjoining;
	private Double salary;
	
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param dateofjoining
	 * @param salary
	 */
	public Employee(int id, String name, int age, String dateofjoining, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateofjoining = dateofjoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
