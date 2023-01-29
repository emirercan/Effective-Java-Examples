package CreatingandDestroyingObjects.StaticFactoryMethod;

public class EmployeeFactory {
    public static Employee getEmployee(String name, int salary, String department){
        switch (department) {
            case "" -> {
                return null;
            }
            case "HR" -> {
                return new HREmployee(name, salary);
            }
            case "IT" -> {
                return new ITEmployee(name, salary);
            }
            case "Marketing" -> {
                return new MarketingEmployee(name, salary);
            }
        }
        return null;
    }
}
