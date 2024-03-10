public class UniversityCourse {
    private String department;
    private String courseNumber;
    private int credits;
    private double fee;
    private double standardFee = 820;

    public UniversityCourse(String department, String courseNumber, int credits) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    public void displayData(){
        System.out.printf("Course Department: %s\n", getCourseDepartment());
        System.out.printf("Course Number: %s\n", getCourseNumber());
        System.out.printf("Course Credits: %d\n", getCredits());
        System.out.printf("Course Fees: %.2f\n", calculateFee());
    }

    public double calculateFee() {
        double calcFee =standardFee * credits;

        return calcFee;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourseNumber(String course) {
        this.courseNumber = course;
    }

    public void setCredits(int credit) {
        this.credits = credit;
    }

    public void setFee(){
        double calcFee = getCredits() * standardFee;
        this.fee = calcFee;
    }

    public String getCourseDepartment(){
        return this.department;
    }

    public String getCourseNumber() {
        return this.courseNumber;
    }

    public int getCredits() {
        return this.credits;
    }

    
}