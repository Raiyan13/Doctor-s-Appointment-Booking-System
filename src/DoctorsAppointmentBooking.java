
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raiyan
 */
public class DoctorsAppointmentBooking extends javax.swing.JFrame {

    /**
     * Creates new form DoctorsAppointmentFrame
     */
    public DoctorsAppointmentBooking() {
          initComponents();
        //frameColor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patient = new javax.swing.JButton();
        appointment = new javax.swing.JButton();
        chamber = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        doctor = new javax.swing.JButton();
        hospital = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor's Appointment Booking System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        patient.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        patient.setText("Patient");
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });
        getContentPane().add(patient);
        patient.setBounds(734, 229, 170, 105);

        appointment.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        appointment.setText("Appointment");
        appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentActionPerformed(evt);
            }
        });
        getContentPane().add(appointment);
        appointment.setBounds(434, 229, 171, 105);

        chamber.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        chamber.setText("Chamber");
        chamber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamberActionPerformed(evt);
            }
        });
        getContentPane().add(chamber);
        chamber.setBounds(435, 394, 170, 105);

        employee.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        employee.setText("Employee");
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        getContentPane().add(employee);
        employee.setBounds(734, 394, 170, 105);

        doctor.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        doctor.setText("Doctor");
        doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorActionPerformed(evt);
            }
        });
        getContentPane().add(doctor);
        doctor.setBounds(110, 395, 171, 102);

        hospital.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        hospital.setText("Hospital");
        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });
        getContentPane().add(hospital);
        hospital.setBounds(110, 229, 170, 105);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Doctor's Appointment Booking");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(92, 44, 812, 60);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 320, 0, 0);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("System");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(431, 110, 174, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectStartingPicture.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentActionPerformed
        new Appointment().setVisible(true);
    }//GEN-LAST:event_appointmentActionPerformed

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        new Patient().setVisible(true);
    }//GEN-LAST:event_patientActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setBounds(180, 70, 1000, 600);
    }//GEN-LAST:event_formWindowActivated

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
        new Hospital().setVisible(true);
    }//GEN-LAST:event_hospitalActionPerformed

    private void doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorActionPerformed
        new Doctor().setVisible(true);
    }//GEN-LAST:event_doctorActionPerformed

    private void chamberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamberActionPerformed
        new Chamber().setVisible(true);
    }//GEN-LAST:event_chamberActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        new Employee().setVisible(true);
    }//GEN-LAST:event_employeeActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorsAppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorsAppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorsAppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorsAppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new DoctorsAppointmentBooking().setVisible(true);
                
            }
        });
    }

    private void frameColor() {
       Container c;
        JLabel imageLabel;
        ImageIcon img;

        c = this.getContentPane();
        c.setLayout(null);

        img = new ImageIcon(getClass().getResource("image.jpg"));
        imageLabel = new JLabel(img);
        imageLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
        
        
        c.add(imageLabel);

        //Icon Set
        img = new ImageIcon(getClass().getResource("image.jpg"));
        
        
        this.setIconImage(img.getImage());
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointment;
    private javax.swing.JButton chamber;
    private javax.swing.JButton doctor;
    private javax.swing.JButton employee;
    private javax.swing.JButton hospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton patient;
    // End of variables declaration//GEN-END:variables

}
