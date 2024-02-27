abstract class Employee {
  private String name;
  private int id;

  /**
   * constructor
   * @param name
   * @param id
   */
  public Employee(String name, int id){
    this.name = name;
    this.id = id;
  }

  //Encapsulation --> user can check the value of any variable without directly accessing the variable. this increases the security of the code. 
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }

  //abstruct method
  /**
   * @return
   */
  public abstract double calculateSalary();

  @Override
  public String toString(){
    return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
  }
}
