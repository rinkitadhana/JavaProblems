import com.sun.jdi.connect.IllegalConnectorArgumentsException;
// setting some methods to privates makes less coupling and make code more readable

class Employee{ //class
    private int baseSalary; //field
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){ // constructor
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public Employee(int baseSalary){// constructor overloading for different parameter
        this(baseSalary,0);
    }
    public int calculateWage(int extraHours){ //method
        return baseSalary+ (getHourlyRate() *extraHours);
    }
    public int calculateWage(){ //method overloading, using this for different case
        return calculateWage(0);
    }
    private void setBaseSalary(int baseSalary) { //setter
        if(baseSalary<=0)
            throw new IllegalArgumentException("Salary Cannot be negative");

        this.baseSalary = baseSalary;
    }
    private int getBaseSalary(){ //getter
        return baseSalary;
    }

    private int getHourlyRate() { //getter
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) { //setter
        if (hourlyRate<=0)
            throw new IllegalArgumentException("Hourly Rate cannot be negative");
        this.hourlyRate = hourlyRate;
    }
}
public class P50_WageCalculator { //class include main method
    public static void main(String[] args) { // main method
        var Employee1 = new Employee(50_000,33 ); // creating object includes custom constructor
//        Employee1.setBaseSalary(-1); //calling setter
//        Employee1.setHourlyRate(700);
        int wage = Employee1.calculateWage(200);
        System.out.println(wage);

    }
}
