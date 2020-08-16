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

/**
 * @author Pawel
 */
public class StudentForm extends JPanel {
    private INewStudentFromSubmittedListener newStudentListener;
    
    public StudentForm(INewStudentFromSubmittedListener listener) {
        this.newStudentListener = listener;
        initComponents();
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
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
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
        // Prepare combobox with available options (gender)
        Gender[] genders = Gender.values();
        for (Gender gender : genders) {
            comboBoxGender.addItem(gender);
        }

        // prepare spinner Year Born                          initial value          minimum value    maximum value           stepsize
        spinnerYearBorn.setModel(new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(), 1));

       buttonSubmit.addActionListener(actionEvent -> {
           Student student = new Student();
           student.setName(textFieldName.getText());
           student.setLastName(textFieldLastName.getText());
           student.setGender((Gender) comboBoxGender.getSelectedItem());
           student.setYearBorn((Integer) spinnerYearBorn.getValue());
           student.setQuarantined(checkBoxQuarantined.isSelected());

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
