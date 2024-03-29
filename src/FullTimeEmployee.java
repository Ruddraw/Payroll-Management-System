public class FullTimeEmployee extends Employee {
  private double monthlySalary;

  
  /**
   * constructor
   * @param name
   * @param id
   * @param monthlySalary
   */

   //since it is the extension of the employee class we don't have to creat the name and id variable again.
  public FullTimeEmployee(String name, int id, double monthlySalary){
    //using the parent class's constructor
    super(name, id);
    this.monthlySalary = monthlySalary;

  }

  //implementing the abstruct method
  @Override
  public double calculateSalary() {
    return monthlySalary;
  }

  @Override
  public String toString(){
    return "Full-Time Employee --> name=" + getName() + ", id=" + getId() + ", salary=" + calculateSalary();
  }
}
