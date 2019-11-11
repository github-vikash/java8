package StaticMethod;

interface Remunerator {
    //public abstract double deductFoodFee();                   
    final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
    final double PENSION_PERCENTAGE = 5.0;
    
    public default double deductHealthInsurancePremium(double employeeSalary) {    
        return (employeeSalary * HEALTH_INSURANCE_PERCENTAGE / 100);
    }
 
    public static double deductForPension(double employeeSalary) {    // Static method of the interface
		return (employeeSalary * PENSION_PERCENTAGE / 100);
    }
}

class RenumeratorTest implements Remunerator  {
    public static void main (String[] args) {
        Double pension = Remunerator.deductForPension(20000);
        RenumeratorTest ff=new RenumeratorTest();
        Double insurance = ff.deductHealthInsurancePremium(10000);
        System.out.println(insurance);
        System.out.println(pension);
    }
}