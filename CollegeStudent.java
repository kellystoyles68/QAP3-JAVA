public class CollegeStudent extends Student {
    protected String major;
    protected int year;

    public CollegeStudent (String name, int age, String gender, String idNum,double gpa,  int year, String major){
        super (name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;}

        public String major () {
            return major;}
          
        public int year () {
            return year;}

        public void setmajor (String major){
            this. major = major;}

        public void setyear (int year){
            this.year = year;}


@Override
public String toString() {
    return  super.toString () + " major is " + major + "and the year is" + year;}
  
}
