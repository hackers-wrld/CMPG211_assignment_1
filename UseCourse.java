import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
      
        Scanner myScanner = new Scanner(System.in);
        
        // loop
        boolean loopRun = true;
        while (loopRun) {
            // department
            String department;
            System.out.print("Enter course department: ");
            department = myScanner.nextLine();
            // courseNumber
            String courseNumber;
            System.out.print("\nEnter course Number: ");
            courseNumber = myScanner.nextLine();
            // credits
            int credits;
            System.out.print("\nEnter course credits: ");
            credits = myScanner.nextInt();

            UniversityCourse myCourse = new UniversityCourse(department, courseNumber, credits);

            // labFee
            boolean IslabDepartment = false;
            String labDepartments[] = {"GEOM", "MCHE", "CMPG", "PHYM"};
            for (int i = 0; i < labDepartments.length; i++) {
                if (department.equals(labDepartments[i])){
                    // course department requires lab fees
                    IslabDepartment = true;
                    
                }
            }

            if (IslabDepartment) {
                // display Labcourse
                LabCourse myLab = new LabCourse(department, courseNumber, credits);
                myLab.displayData();
            } else {
                // normal uni course
                myCourse.displayData();
            }

            System.out.println("\nRun again? yes(1)/no(0)");
            int answer = myScanner.nextInt();
            if (answer == 0) {
                loopRun = false;
            }

        }
        
        myScanner.close();
    }
}
