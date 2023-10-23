package pl.hajduk.io.exceptions.v3;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    public static void printEmployeeDetails(List<Employee> employeesList, int indexToFetch) {
        Employee employeeByIndex = employeesList.get(indexToFetch);
        System.out.println(employeeByIndex);
    }
    public List<Employee> fetchEmployeeByLastName(List<Employee>list,String lastName)
    {
       return list.stream().filter(employee -> lastName.equalsIgnoreCase(employee.getLastName())).collect(Collectors.toList());
    }

    public void calculateRetirementYear(List<Employee> employeeList) {
        LocalDate currentDate = LocalDate.now();

        employeeList.stream()
                .forEach(employee -> {
                    int retirementAge = ("W".equalsIgnoreCase(employee.getSex())) ? 60 : 65;
                    int retirementYear = currentDate.getYear() - employee.getAge() + retirementAge;

                    System.out.printf("Rok przejścia na emeryturę dla pracownika %s %s to rok: %d",
                            employee.getFirstName(), employee.getLastName(), retirementYear);
                });
    }
}
