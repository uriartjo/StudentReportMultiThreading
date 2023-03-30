import java.util.ArrayList;

public class StudentReportSystemLambda {
    /*
        Your goal is this:
            • You will use multithreading to complete the methods found below.
            • Each method will use two threads to scan the passed ArrayList
                • One thread will start at the front
                • A second thread will start at the end
                • Each thread, upon finding a valid Student object, will add the found entry into a new ArrayList
                    •That new ArrayList is what will be returned
                • Must use a Lambda expression to create a Runnable object to relay within the methods
     */

    /** PRECONDITIONS:
     * classList not null
     * min >= 0.0
     * max <= 4.0
     */
    public static ArrayList<Student> findStudentsWithinGPARange(ArrayList<Student> classList,double min, double max) {
        return null;
    }

    /** PRECONDITIONS:
     * classList not null
     * numOfAbsences >= 0 && <= 10
     */
    public static ArrayList<Student> findStudentsWithinGPARange(ArrayList<Student> classList,int numOfAbsences) {
        return null;
    }
}
