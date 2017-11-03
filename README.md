
# Clase Employee
~~~ 
public abstract class Employee {
    public String name; //public
    private int hireYear; //private
    protected String country;
    
    public void setHireYear(int hireYear){
        this.hireYear = hireYear;
    }
    public int getHireYear(){
        return this.hireYear;
    }
  protected abstract double monthlyPay();
  protected abstract double annualPay();

}
~~~
Esta clase le hereda sus propiedades a las Clases "SalariedEmployee" y "HoutlyEmployee"...
~~~
public abstract class SalariedEmployee extends Employee {
    
    int annualSalary;
    
    public SalariedEmployee(){
       setHireYear(1999);
       name = "Sara";
       country = "Guatemala";
    }
    @Override
    protected double monthlyPay(){
        return 1000;
    }
    
     public abstract double annualPay();
}
public abstract class HourlyEmployee extends Employee{
    int hoursPerWeek;
    double hourlyWage;
   
    public HourlyEmployee(){
       setHireYear(1999);
       name = "Sara";
       country = "Guatemala";
    }
    
    @Override
    protected double monthlyPay(){
        return 2000;
    }
    
    public abstract double annualPay();
    
}
~~~
De la clase "SalariedEmployee" se heredan dos clases denominadas "Manager" y "Staf"...
~~~
public class PartTime extends HourlyEmployee {
     
    public double annualPay(){
        return this.monthlyPay()*1.12;
    }
   
}

public class Staff extends SalariedEmployee{
    @Override
    public double annualPay(){
        return this.monthlyPay()*12;
    }
}
~~~
Y de la clase "HourlyEmployee" salen las clases FullTime, PartTime...
~~~
public class PartTime extends HourlyEmployee {
     
    public double annualPay(){
        return this.monthlyPay()*1.12;
    }
   
}
public class FullTime extends HourlyEmployee {
    
    public double annualPay(){
        return this.monthlyPay()*1.12;
    }
}

~~~
