/*
 * Created by JFormDesigner on Sun Aug 16 14:07:48 CEST 2020
 */

package kb.classmanager.view;

import kb.classmanager.interfaces.INewStudentFromSubmittedListener;
import kb.classmanager.model.Gender;
import kb.classmanager.model.Student;

import java.awt.*;
import java.time.LocalDate;
import javax.swing.*;


public class StudentForm extends JPanel {
    private INewStudentFromSubmittedListener newStudentListener;

    public StudentForm(INewStudentFromSubmittedListener listener) {
        this.newStudentListener = listener;
        initComponents();

        Gender[] genders = Gender.values();
        for (Gender gender : genders) {
            comboBoxGender.addItem(gender);
        }
        // Prepare spinner Year Born                        .. Wartość początkowa    minimum             maksimum               skok
        spinnerYearBorn.setModel(new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(), 1));

        buttonSubmit.addActionListener(actionEvent -> {
            Student student = new Student();
            student.setName(textFieldName.getText());
            student.setLastName(textFieldLastName.getText());
            student.setQuarantined(checkBoxQuarantined.isSelected());
            student.setYearBorn((Integer) spinnerYearBorn.getValue());
            student.setGender((Gender) comboBoxGender.getSelectedItem());

            if (newStudentListener != null) {
                newStudentListener.studentCreated(student);
            }
            clearForm();
        });
    }

    void clearForm() {
        textFieldName.setText("");
        textFieldLastName.setText("");
        checkBoxQuarantined.setSelected(false);
        spinnerYearBorn.setValue(LocalDate.now().getYear());
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        labelHeadlineForm = new JLabel();
        hSpacer1 = new JPanel(null);
        labelName = new JLabel();
        textFieldName = new JTextField();
        labelLastName = new JLabel();
        textFieldLastName = new JTextField();
        labelGender = new JLabel();
        comboBoxGender = new JComboBox();
        labelYearBorn = new JLabel();
        spinnerYearBorn = new JSpinner();
        labelQuaratined2 = new JLabel();
        checkBoxQuarantined = new JCheckBox();
        vSpacer1 = new JPanel(null);
        buttonSubmit = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
        EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
        . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
        java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
        { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )
        throw new RuntimeException( ) ;} } );
        setLayout(new GridLayout(7, 2));

        //---- labelHeadlineForm ----
        labelHeadlineForm.setText("Student Form:");
        labelHeadlineForm.setFont(labelHeadlineForm.getFont().deriveFont(labelHeadlineForm.getFont().getStyle() | Font.BOLD));
        add(labelHeadlineForm);
        add(hSpacer1);

        //---- labelName ----
        labelName.setText("Name:");
        add(labelName);
        add(textFieldName);

        //---- labelLastName ----
        labelLastName.setText("Last name:");
        add(labelLastName);
        add(textFieldLastName);

        //---- labelGender ----
        labelGender.setText("Gender");
        add(labelGender);
        add(comboBoxGender);

        //---- labelYearBorn ----
        labelYearBorn.setText("Year born:");
        add(labelYearBorn);
        add(spinnerYearBorn);

        //---- labelQuaratined2 ----
        labelQuaratined2.setText("Quarantined:");
        add(labelQuaratined2);
        add(checkBoxQuarantined);
        add(vSpacer1);

        //---- buttonSubmit ----
        buttonSubmit.setText("Submit");
        add(buttonSubmit);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JLabel labelHeadlineForm;
    private JPanel hSpacer1;
    private JLabel labelName;
    private JTextField textFieldName;
    private JLabel labelLastName;
    private JTextField textFieldLastName;
    private JLabel labelGender;
    private JComboBox comboBoxGender;
    private JLabel labelYearBorn;
    private JSpinner spinnerYearBorn;
    private JLabel labelQuaratined2;
    private JCheckBox checkBoxQuarantined;
    private JPanel vSpacer1;
    private JButton buttonSubmit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
