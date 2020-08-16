/*
 * Created by JFormDesigner on Sat Aug 15 14:22:53 CEST 2020
 */

package kb.classmanager.view;

import kb.classmanager.model.Student;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class MainWindow extends JFrame {
    public MainWindow() {
        initComponents();

        // sekcja inicjalizacji zmiennych
        studentForm = new StudentForm(student -> {
            studentListModel.add(0, student);
        });

        // sekcja konfiguracji widoku
        leftPanel.add(studentForm);

        studentListModel = new DefaultListModel<>();
        studentListPanel.setModel(studentListModel);



    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        leftPanel = new JPanel();
        rightPanel = new JPanel();
        labelList = new JLabel();
        scrollPanel = new JScrollPane();
        studentListPanel = new JList();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 2));

        //======== leftPanel ========
        {
            leftPanel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dialo\u0067", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,leftPanel. getBorder () ) ); leftPanel. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );
            leftPanel.setLayout(new GridLayout(1, 1, 1, 1));
        }
        contentPane.add(leftPanel);

        //======== rightPanel ========
        {
            rightPanel.setLayout(new GridBagLayout());
            ((GridBagLayout)rightPanel.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)rightPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
            ((GridBagLayout)rightPanel.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)rightPanel.getLayout()).rowWeights = new double[] {1.0, 0.0, 0.0, 1.0E-4};

            //---- labelList ----
            labelList.setText("Student List:");
            rightPanel.add(labelList, new GridBagConstraints(0, 0, 1, 1, 0.0, 1.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //======== scrollPanel ========
            {
                scrollPanel.setViewportView(studentListPanel);
            }
            rightPanel.add(scrollPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 10.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(rightPanel);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JLabel labelList;
    private JScrollPane scrollPanel;
    private JList studentListPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private final StudentForm studentForm;
    private DefaultListModel<Student> studentListModel;

}
