public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;
    
    public Student(String name, int age, String gender, String idNum, double gpa){
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }
    
    public String getidNum (){
        return myIdNum;}

    public double getgpa () {
        return myGPA;}

            public void setidNum (String idNum) {
                myIdNum = idNum;}

            public void setGPA ( double gpa ){
                myGPA = gpa;}
        
        @Override
        public String toString () {
            return super.toString() + ", Student ID: " + myIdNum + ", GPA: " + myGPA;
            }
            }

    


