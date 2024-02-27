public class Main {
  public static void main(String[] args) {
    PayrollManagement payrollManagement = new PayrollManagement();

    FullTimeEmployee emp1 = new FullTimeEmployee("Afif Asad", 7172, 6000);
    FullTimeEmployee emp2 = new FullTimeEmployee("Camilo sanches", 7173, 10000);

    PartTimeEmployee emp3 = new PartTimeEmployee("Mitansh Mistry", 1211, 20, 16);

    //adding them to the arraylist
    payrollManagement.addEmployee(emp1);
    payrollManagement.addEmployee(emp2);
    payrollManagement.addEmployee(emp3);

    System.out.println("Initial Employee details: ");
    payrollManagement.displayEmployees();

    //removoe
    payrollManagement.removeEmployee(1211);
    payrollManagement.displayEmployees();
  }
}
