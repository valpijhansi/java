/**
 * @author Jhansi
 * @version 3.0
 * @since 2021
 */
package College;
/**
 * The instance of class can used to store each student data
 * 
 * Class for student of SVU college of Engeneering
 */


public class Student {

    static String collegeCode = "SVUCM&CS";
    String name;

    /**
     * @param name
     */
    Student(String name) {
        this.name = name;
    
    }

    /**
     * @param regNo
     * @throws Exception
     */
    public void getIDcard(int regNo) throws Exception {

    }

    /**
     * @param str
     * @return
     */
    boolean HasScholarship(String str) {
        return true;
    }

    /**
     * @param regNo
     * @return
     */
    public String getName(int regNo) {
        return this.name;
    }

}
