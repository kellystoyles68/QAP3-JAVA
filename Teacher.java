public class Teacher  extends Person{
    protected String subject;
    protected double salary;
    
    public Teacher (String name, int age, String gender, String subject, double salary ){
        super (name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getsubjectm(){
        return subject; }

    public double getsalary () {
        return salary;   }

    public void setsubject (String subject) {
        this.subject = subject; }
    
    public void setsalary (double salary) {
        this.salary = salary; }

        @Override
        public String toString () {
            return super.toString() + ", Teacher's subject: " + subject + ", Salary: " + salary;
        }

      

    }
  
