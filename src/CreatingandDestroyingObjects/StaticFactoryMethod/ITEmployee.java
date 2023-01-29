package CreatingandDestroyingObjects.StaticFactoryMethod;

public class ITEmployee extends Employee{
    public ITEmployee(String name, int salary) {
        super(name, salary, "IT");
    }
}
