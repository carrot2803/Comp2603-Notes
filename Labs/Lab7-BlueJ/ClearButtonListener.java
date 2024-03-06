import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {
    private StudentWindow studentWindow;

    public ClearButtonListener(StudentWindow studentWindow) {
        this.studentWindow = studentWindow;
    }

    public void actionPerformed(ActionEvent e) {
        studentWindow.clearData();
    }
}