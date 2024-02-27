import java.util.ArrayList;

public class PayrollManagement {
  private ArrayList<Employee> employeeList;

  /**
   * constructor for the arraylist
   */
  public PayrollManagement(){
    employeeList = new ArrayList<>();
  }

  /**
   * Adding the employee to the list
   * @param employee
   */
  public void addEmployee(Employee employee){
    employeeList.add(employee);
  }

  /**
   * Remove the employee
   * @param id
   */
  public void removeEmployee(int id){
    //finding an emplyee with his ID and then adding him to this variable
    Employee employeeToRemove = null;

    //finding the employee from the employeeList
    for (Employee employee : employeeList) {
      if(employee.getId() == id){
        employeeToRemove = employee;
        break;
      }
    }
    //now removing that employee from the list
    if(employeeToRemove != null){
      employeeList.remove(employeeToRemove);
    }
  }
}
