package payrollsystem;

public abstract class Employee {
    
    //class variables
	
	private int empld;
	private String name;
	private Vehicle vehicle;
        
        //class constructors
        
        public Employee(){
            System.out.println("....inside default constructor");
            empld = 0;
            name = "";
        }
        
        public Employee (int pEmpld, String pName, Vehicle pV){
            System.out.println("....inside Employee non default constructor");
            empld = pEmpld;
            name = pName;
            this.vehicle = pV;
        }
         public Employee (int pEmpld, String pName, String pPlate, String pColour){
            System.out.println("....inside Employee non default constructor");
            empld = pEmpld;
            name = pName;
            this.vehicle = new Vehicle(pPlate,pColour);
        }


    
    public abstract double calculatePay();
    /**
     * @return the empld
     */
    public int getEmpld() {
        return empld;
    }

    /**
     * @param empld the empld to set
     */
    public void setEmpld(int empld) {
        this.empld = empld;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
	
	
}
