
import Database.DatabaseManager;
import java.awt.Container;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raiyan13
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form DoctorFrame
     */
    public Doctor() {

        initComponents();

        //frameColor();
        getDoctor();

        setComboBox();

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        doctor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        degree = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        speacial = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        src = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctor Details");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        doctor.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        doctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Phone", "Email", "Degree", "Speacialization", "Practice From", "Fee"
            }
        ));
        jScrollPane1.setViewportView(doctor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(264, 134, 855, 454);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Doctor Details");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 80, 320, 29);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New Entry");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 90, 154, 34);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Doctor Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(72, 142, 110, 22);

        name.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(name);
        name.setBounds(28, 170, 200, 29);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(62, 255, 60, 11);

        male.setBackground(new java.awt.Color(255, 255, 255));
        male.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setSelected(true);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(142, 217, 53, 16);

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        getContentPane().add(female);
        female.setBounds(140, 248, 73, 18);

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Contact Number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(55, 277, 140, 22);

        mail.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mail);
        mail.setBounds(30, 370, 200, 30);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 340, 50, 22);

        phone.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(phone);
        phone.setBounds(28, 305, 200, 30);

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Degree");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 410, 60, 22);

        degree.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        degree.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(degree);
        degree.setBounds(30, 440, 200, 30);

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Practice From");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(62, 551, 130, 22);

        speacial.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        speacial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speacialActionPerformed(evt);
            }
        });
        getContentPane().add(speacial);
        speacial.setBounds(28, 511, 200, 30);

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Speacialization");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(53, 483, 150, 22);

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Fee");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 614, 30, 22);

        fee.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        fee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(fee);
        fee.setBounds(30, 640, 200, 30);

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Select");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(64, 219, 60, 11);

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Search Here");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1168, 305, 132, 34);

        src.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        src.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        src.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srcKeyReleased(evt);
            }
        });
        getContentPane().add(src);
        src.setBounds(1145, 345, 181, 36);

        insert.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        getContentPane().add(insert);
        insert.setBounds(421, 634, 170, 47);

        delete.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(774, 634, 170, 47);

        date.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(date);
        date.setBounds(30, 580, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectInnerPicture.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, -10, 1360, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try {
            setDoctor();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Inserted Successfully!" + ex, "Connection Status", JOptionPane.INFORMATION_MESSAGE);

            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_insertActionPerformed

    private void srcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srcKeyReleased

        ResultSet rs;
        DatabaseManager doctorData = DatabaseManager.getInstace();
        PreparedStatement pst;
        String search = src.getText();

        try {
            if (search.matches("^[0-9]+$") && search.charAt(0) != '0') {
                String query = "Select * from tbl_doctor where doctorId = " + search + " or dr_fees <= " + search;
                pst = doctorData.getPreparedStatement(query);
                rs = pst.executeQuery();
                doctor.setModel(DbUtils.resultSetToTableModel(rs));
            } else {
                String query = "Select * from tbl_doctor where dr_name Like '%" + search + "%' or dr_gender Like '" + search + "%' or dr_degree Like '%" + search + "%' or dr_email Like '%" + search + "%' or dr_specialization Like '%" + search + "%' or dr_contact Like '%" + search + "%' or dr_practice_from Like '%" + search + "%'";
                pst = doctorData.getPreparedStatement(query);
                rs = pst.executeQuery();
                doctor.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        //getDoctor();
    }//GEN-LAST:event_srcKeyReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int row = doctor.getSelectedRow();
        Delete(row);
    }//GEN-LAST:event_deleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setSize(1400, 760);
    }//GEN-LAST:event_formWindowOpened

    private void speacialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speacialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speacialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField degree;
    private javax.swing.JButton delete;
    private javax.swing.JTable doctor;
    private javax.swing.JTextField fee;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<TypeEnum> speacial;
    private javax.swing.JTextField src;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        name.setText("");
        phone.setText("");
        mail.setText("");
        fee.setText("");
        degree.setText("");
        male.setSelected(true);
    }

    private void setComboBox() {
        speacial.setModel(new DefaultComboBoxModel<>((TypeEnum.values())));
    }

    private void getDoctor() {

        DefaultTableModel mod = (DefaultTableModel) doctor.getModel();
        while (mod.getRowCount() > 0) {
            mod.removeRow(0);
        }

        DatabaseManager doctorData = DatabaseManager.getInstace();
        //System.out.println(patient.checkConnection());

        if (doctorData.checkConnection()) {
            String query = "Select * from tbl_doctor";
            ResultSet rset = null;
            try {
                rset = doctorData.getResult(query);
            } catch (SQLException ex) {
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (rset.next()) {
                    int id = rset.getInt("doctorId");
                    String name = rset.getString("dr_name");
                    String contact = rset.getString("dr_contact");
                    String email = rset.getString("dr_email");
                    int fs = rset.getInt("dr_fees");
                    String deg = rset.getString("dr_degree");
                    String gen = rset.getString("dr_gender");
                    String prac = rset.getString("dr_practice_from");
                    String spe = rset.getString("dr_specialization");

                    Object[] row = {id, name, gen, contact, email, deg, spe, prac, fs};

                    DefaultTableModel model = (DefaultTableModel) doctor.getModel();

                    model.addRow(row);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setDoctor() throws SQLException {

        String nam = name.getText();
        String deg = degree.getText();
        String ph = phone.getText();
        String email = mail.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String prac = sdf.format(date.getDate());
        String fees = fee.getText();
        int fs = parseInt(fees);
        String gen = null;

        String spe = speacial.getSelectedItem().toString();

        if (male.isSelected()) {
            gen = "male";
        } else {
            gen = "female";
        }
        //String add = address.getText();
        String add = null;
        if (nam.isEmpty() || ph.isEmpty() || email.isEmpty() || deg.isEmpty() || gen.isEmpty() || fees.isEmpty() || prac.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill The Entry Form Correctly", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                DatabaseManager doctorData = DatabaseManager.getInstace();

                String query = "INSERT INTO tbl_doctor(dr_name,dr_gender,dr_contact,dr_email,dr_degree,dr_specialization,dr_practice_from,dr_fees)VALUES(?,?,?,?,?,?,?,?)";
                PreparedStatement pst = doctorData.getPreparedStatement(query);

                pst.setString(1, nam);
                pst.setString(2, gen);
                pst.setString(3, ph);
                pst.setString(4, email);
                pst.setString(5, deg);
                pst.setString(6, spe);
                pst.setString(7, prac);
                pst.setInt(8, fs);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data Inserted Successfully!", "Connection Status", JOptionPane.INFORMATION_MESSAGE);

                getDoctor();

                clear();
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Please Check The Connection Settings!\nOr Fill The From Correctly", "Error!", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    private void frameColor() {
        Container c;
        JLabel imageLabel;
        ImageIcon img;

        c = this.getContentPane();
        c.setLayout(null);

        img = new ImageIcon(getClass().getResource("img2.jpg"));
        imageLabel = new JLabel(img);
        imageLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(imageLabel);

        //Icon Set
        img = new ImageIcon(getClass().getResource("img2.jpg"));
        this.setIconImage(img.getImage());
    }

    private void Delete(int row) {

        Object index = doctor.getValueAt(row, 0);

        try {
            DatabaseManager doctorData = DatabaseManager.getInstace();

            String query = "DELETE FROM tbl_doctor Where doctorID = " + index;
            PreparedStatement pst = doctorData.getPreparedStatement(query);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Deleted Successfully!", "Connection Status", JOptionPane.INFORMATION_MESSAGE);

            getDoctor();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Please Check The Connection Settings!\nOr Fill The From Correctly", "Error!", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void setDoctorComboBox(JComboBox doctorComboBox) {
        DatabaseManager doctorData = DatabaseManager.getInstace();

        if (doctorData.checkConnection()) {
            ResultSet rset = null;
            try {
                String query = "Select * from tbl_doctor";
                rset = doctorData.getResult(query);
            } catch (SQLException ex) {
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (rset.next()) {
                    String hospitalName = rset.getString("dr_name");
                    doctorComboBox.addItem(hospitalName);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public int getDoctorID(String doctorName) {
        DatabaseManager doctorData = DatabaseManager.getInstace();
        int doctorID = 0;
        if (doctorData.checkConnection()) {
            ResultSet rset = null;
            try {
                String query = "Select doctorID from tbl_doctor where dr_name = " + "'" + doctorName + "';";
                rset = doctorData.getResult(query);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (rset.next()) {
                    doctorID = Integer.parseInt(rset.getString("doctorId"));
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return doctorID;

    }

}
