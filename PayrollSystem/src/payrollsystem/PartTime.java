package payrollsystem;

public class PartTime extends Employee{
     private double rate;
        private double hoursWorked;
        
        
public PartTime(int id, String name, double rate, double hoursWorked2, Vehicle vi){
    
    super (id, name, vi);
    this.rate = rate;
    this.hoursWorked = hoursWorked2;
}
    @Override
    public double calculatePay() {
       
        System.out.println("Part time employee");
        return(this.getHoursWorked() * this.getRate());
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    

}
