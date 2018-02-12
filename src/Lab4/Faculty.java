package Lab4;

public class Faculty extends Employee implements Rules {

    private String[] courses;

    /**
     * Constructor
     * @param newName Name
     * @param newSalary Salary
     * @param newCourses Array of Courses
     */
    public Faculty(String newName, double newSalary, String[] newCourses) {
        super.salary = newSalary;
        super.name = newName;
        setCourses(newCourses);
    }

    /**
     * Returns name of Employee with 'Professor' in front
     * @return Professor + Name
     */
    @Override
    public String getName() {
        String prompt = "Professor " + name;
        return prompt;
    }

    /**
     * Returns array of courses
     * @return Copy of array
     */
    public String[] getCourses() {
        String[] temp = new String[courses.length];
        for (int i = 0; i < courses.length; i++) {
            temp[i] = "" + courses[i];
        }

        return temp;
    }

    /**
     * Returns String of course names
     * @return String
     */
    public String getCourseNames() {
        String prompt = "";
        for (int i = 0; i <  courses.length; i++) {
            prompt += courses[i] + "\n";
        }

        return prompt;
    }

    /**
     * Sets courses (Referenced in constructor)
     * @param newCourses List of courses
     */
    public void setCourses(String[] newCourses) {
        String[] temp = new String[newCourses.length];
        for (int i = 0; i < newCourses.length; i++) {
            temp[i] = "" + newCourses[i];
        }

        courses = temp;
    }


    /**
     * Returns information on faculty
     * @return String
     */
    @Override
    public String toString() {
        String prompt = "" + getName() + "\nSalary: " + getSalary() + "\nCourses:\n";
        for (int i = 0; i < courses.length; i++) {
            prompt += String.format("  %-8s\n", courses[i]);
        }

        return prompt;
    }
}
