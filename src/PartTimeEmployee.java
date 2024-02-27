public class PartTimeEmployee extends Employee{
  private double hourseWorkd;
  private double hourlyRate;

  /**
   * Constructor
   * @param name
   * @param id
   * @param hourseWorkd
   * @param hourlyRate
   */
  public PartTimeEmployee(String name, int id, double hourseWorkd, double hourlyRate){
    super(name, id);
    this.hourseWorkd = hourseWorkd;
    this.hourlyRate = hourlyRate;
  }

  @Override
  public double calculateSalary() {
    return hourseWorkd * hourlyRate;
  }

  @Override
  public String toString(){
    return "Part-Time Employee --> name=" + getName() + ", id=" + getId() + ", salary=" + calculateSalary();
  }

  
  
}
