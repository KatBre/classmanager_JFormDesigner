/*
 * Created by JFormDesigner on Sat Aug 15 14:22:53 CEST 2020
 */

package kb.classmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author unknown
 */
public class MainWindow extends JFrame implements ActionListener {
    public MainWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        panel1 = new JPanel();
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
        labelQuaratined = new JLabel();
        checkBoxQuarantined = new JCheckBox();
        vSpacer1 = new JPanel(null);
        vSpacer6 = new JPanel(null);
        vSpacer2 = new JPanel(null);
        vSpacer7 = new JPanel(null);
        vSpacer8 = new JPanel(null);
        buttonSubmit = new JButton();
        vSpacer3 = new JPanel(null);
        vSpacer9 = new JPanel(null);
        vSpacer4 = new JPanel(null);
        vSpacer10 = new JPanel(null);
        vSpacer5 = new JPanel(null);
        vSpacer11 = new JPanel(null);
        panel2 = new JPanel();
        labelResult = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 2));

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new GridLayout(12, 3, 1, 1));

            //---- labelHeadlineForm ----
            labelHeadlineForm.setText("Student Form:");
            labelHeadlineForm.setFont(labelHeadlineForm.getFont().deriveFont(labelHeadlineForm.getFont().getStyle() | Font.BOLD));
            panel1.add(labelHeadlineForm);
            panel1.add(hSpacer1);

            //---- labelName ----
            labelName.setText("Name:");
            panel1.add(labelName);
            panel1.add(textFieldName);

            //---- labelLastName ----
            labelLastName.setText("Last name:");
            panel1.add(labelLastName);
            panel1.add(textFieldLastName);

            //---- labelGender ----
            labelGender.setText("Gender");
            panel1.add(labelGender);
            panel1.add(comboBoxGender);

            //---- labelYearBorn ----
            labelYearBorn.setText("Year born:");
            panel1.add(labelYearBorn);
            panel1.add(spinnerYearBorn);

            //---- labelQuaratined ----
            labelQuaratined.setText("Quarantined:");
            panel1.add(labelQuaratined);
            panel1.add(checkBoxQuarantined);
            panel1.add(vSpacer1);
            panel1.add(vSpacer6);
            panel1.add(vSpacer2);
            panel1.add(vSpacer7);
            panel1.add(vSpacer8);

            //---- buttonSubmit ----
            buttonSubmit.setText("Submit");
            panel1.add(buttonSubmit);
            panel1.add(vSpacer3);
            panel1.add(vSpacer9);
            panel1.add(vSpacer4);
            panel1.add(vSpacer10);
            panel1.add(vSpacer5);
            panel1.add(vSpacer11);
        }
        contentPane.add(panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(1, 1));
            panel2.add(labelResult);
        }
        contentPane.add(panel2);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        // Prepare combobox with available options (gender)
        Gender[] genders = Gender.values();
        for (Gender gender : genders) {
            comboBoxGender.addItem(gender);
        }

        // prepare spinner Year Born                          initial value          minimum value    maximum value           stepsize
        spinnerYearBorn.setModel(new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(), 1));

        buttonSubmit.addActionListener(this);

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JPanel panel1;
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
    private JLabel labelQuaratined;
    private JCheckBox checkBoxQuarantined;
    private JPanel vSpacer1;
    private JPanel vSpacer6;
    private JPanel vSpacer2;
    private JPanel vSpacer7;
    private JPanel vSpacer8;
    private JButton buttonSubmit;
    private JPanel vSpacer3;
    private JPanel vSpacer9;
    private JPanel vSpacer4;
    private JPanel vSpacer10;
    private JPanel vSpacer5;
    private JPanel vSpacer11;
    private JPanel panel2;
    private JLabel labelResult;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
