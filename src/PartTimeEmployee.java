public class PartTimeEmployee extends Employee{
  private double hourseWorkd;
  private double hourlyRate;

  public PartTimeEmployee(String name, int id, double hourseWorkd, double hourlyRate){
    super(name, id);
    this.hourseWorkd = hourseWorkd;
    this.hourlyRate = hourlyRate;
  }

  @Override
  public double calculateSalary() {
    return hourseWorkd * hourlyRate;
  }

  
  
}
