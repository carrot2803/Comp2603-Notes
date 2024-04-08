import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterButtonListener implements ActionListener {
    private StudentWindow studentWindow;
    private ArrayList<String> registeredStudents;
    private static final int MAX_REGISTRATIONS = 3;

    public RegisterButtonListener(StudentWindow studentWindow) {
        this.studentWindow = studentWindow;
        this.registeredStudents = new ArrayList<String>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstName = studentWindow.getFirstName();
        String lastName = studentWindow.getLastName();

        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            if (registeredStudents.size() < MAX_REGISTRATIONS) {
                // Record the registration
                registeredStudents.add(firstName + " " + lastName + "\n");
                studentWindow.clearData();
                studentWindow.setOutputText(getRegisteredStudentsAsString());
            } else {
                studentWindow.setOutputText(
                        getRegisteredStudentsAsString() + "Registration is full. Maximum registrations reached.");
            }
        } else {
            studentWindow.setOutputText("Error: Please enter both first name and last name.");
        }
    }

    // Getter method to get the list of registered students
    public String getRegisteredStudentsAsString() {
        String str = "Student Registered: " + registeredStudents.size() + "\n";
        for (String student : registeredStudents)
            str += student;
        return str;
    }

    public ArrayList<String> getRegisteredStudents() {
        return registeredStudents;
    }
}
