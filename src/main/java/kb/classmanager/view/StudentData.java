/*
 * Created by JFormDesigner on Sun Aug 16 15:35:47 CEST 2020
 */

package kb.classmanager.view;

import java.awt.*;
import javax.swing.*;

/**
 * @author Pawel
 */
public class StudentData extends JPanel {
    public StudentData() {
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
        buttonSave = new JButton();
        buttonDelete = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))
        throw new RuntimeException();}});
        setLayout(new GridLayout(7, 2));

        //---- labelHeadlineForm ----
        labelHeadlineForm.setText("Student Data:");
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

        //---- buttonSave ----
        buttonSave.setText("Save");
        buttonSave.setBackground(new Color(0, 204, 0));
        buttonSave.setForeground(Color.white);
        buttonSave.setEnabled(false);
        buttonSave.setFont(new Font("Segoe UI", Font.BOLD, 20));
        add(buttonSave);

        //---- buttonDelete ----
        buttonDelete.setText("Delete");
        buttonDelete.setBackground(new Color(255, 0, 51));
        buttonDelete.setForeground(Color.white);
        buttonDelete.setEnabled(false);
        buttonDelete.setFont(new Font("Segoe UI", Font.BOLD, 20));
        add(buttonDelete);
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
    private JButton buttonSave;
    private JButton buttonDelete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
