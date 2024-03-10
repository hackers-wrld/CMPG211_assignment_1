public class LabCourse extends UniversityCourse {
    private double LabFee = 1050;;

    LabCourse(String department, String courseNumber, int credits) {
        
        
        super(department, courseNumber, credits);

    }
    @Override
    public void displayData() {
        System.out.printf("Course Department: %s\n", getCourseDepartment());
        System.out.printf("Course Number: %s\n", getCourseNumber());
        System.out.printf("Course Credits: %d\n", getCredits());
        System.out.printf("Course Fees: %.2f\n", calculateFee());
        System.out.printf("Course Lab fees: %.2f\n", LabFee);
        System.out.printf("Total fees: %.2f", calculateLabFeeLab());
    }

    public double calculateLabFeeLab() {
        double calcLabFee = LabFee + calculateFee();

        return calcLabFee;
    }
}
