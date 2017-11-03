/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.NiveldeAcceso.Usuarios;
import gt.edu.url.NivelDeAcceso.Usuarios.Employee;

/**
 *
 * @author t203
 */
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
