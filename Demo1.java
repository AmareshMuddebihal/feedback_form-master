/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ENVY
 */
public class Demo1 extends javax.swing.JFrame {

    /**
     * Creates new form Demo1
     */
    public Demo1() {
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        createDatabaseAndTables();
        initComponents();
    }

    private void createDatabaseAndTables()
    {
        try
        {
           Statement stmt;
           ResultSet rs;
           boolean boExists;
           Connection con;
           
           Class.forName("com.mysql.cj.jdbc.Driver"); //deprecated - com.mysql.jdbc.Driver
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","123456");  
           //here sonoo is database name, root is username and password  
           if (null != con)
           {
               String dbname = "feedback";
               rs = con.getMetaData().getCatalogs();
               boExists = false;
               while(rs.next())
               {
                   String catalogs = rs.getString(1);
                   if(dbname.equals(catalogs)){
                           boExists = true;
                           break;
                   }
               }

               if (!boExists)
               {
                    stmt=con.createStatement();  
                    if (null != stmt)
                    {
                        String db = "create database"+ dbname;
                        stmt.executeUpdate(db);
                        stmt.close();
                    }
               }
               con.close();
           }
           
           createTable("feedback_ques", "create table feedback_ques(id int NOT NULL primary key auto_increment, question varchar(1000) not null)");
           createTable("faculty_details", "create table faculty_details(id int NOT NULL primary key auto_increment, name varchar(100) not null, course varchar(50) not null, department varchar(100) not null, subject varchar(100) not null, year varchar(3) not null, division varchar(2) not null)");
           createTable("student", "create table student(sid int NOT NULL primary key auto_increment, name varchar(100) not null, course varchar(50) not null, department varchar(100) not null, year varchar(3) not null, division varchar(2) not null)");
           createTable("feedback", "create table feedback(fid int NOT NULL primary key auto_increment, sid int not null, foreign key(sid) references student(sid), q1 int not null, q1a int not null,q2 int not null, q2a int not null,q3 int not null, q3a int not null,q4 int not null, q4a int not null,q5 int not null, q5a int not null,q6 int not null, q6a int not null,q7 int not null, q7a int not null,q8 int not null, q8a int not null,q9 int not null, q9a int not null,q10 int not null, q10a int not null)");
           /*con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","shivani");  
           if  (null != con)
           {
               boExists = false;
               rs = con.getMetaData().getTables(null, null, "feedback_ques", new String[] {"TABLE"});
               while(rs.next())
               {
                    String tablename = rs.getString("TABLE_NAME");
                    if(tablename.equals("feedback_ques")){
                         boExists = true;
                         break;
                    }
               }

               if (!boExists)
               {
                    stmt=con.createStatement();  
                    if (null != stmt)
                    {
                        String table = "create table feedback_ques(id int NOT NULL primary key auto_increment, question varchar(1000) not null)";
                        stmt.executeUpdate(table);
                        stmt.close();
                    }
                    else
                    {
                        jLabel10.setText("Operation not successful!! Question table couldn't created");
                    }
               }
           }

           if (null != con)
               con.close();

           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","shivani");  
           if  (null != con)
           {
               boExists = false;
               rs = con.getMetaData().getTables(null, null, "faculty_details", new String[] {"TABLE"});
               while(rs.next())
               {
                    String tablename = rs.getString("TABLE_NAME");
                    if(tablename.equals("faculty_details")){
                         boExists = true;
                         break;
                    }
               }

               if (!boExists)
               {
                    stmt=con.createStatement();  
                    if (null != stmt)
                    {
                        String table = "create table faculty_details(id int NOT NULL primary key auto_increment, name varchar(100) not null, course varchar(50) not null, department varchar(100) not null, subject varchar(100) not null, year varchar(3) not null, division varchar(2) not null)";
                        stmt.executeUpdate(table);
                        stmt.close();
                    }
                    else
                    {
                        jLabel10.setText("Operation not successful!! Faculty table couldn't created");
                    }
               }
           }

           if (null != con)
               con.close();*/

           
           
        }
        catch(Exception e)
        {
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Administrator");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        student stud = new student();
        stud.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void createTable(String tableName, String query)
    {
        try
        {
            Statement stmt;
            ResultSet rs;
            boolean boExists;
            Connection con;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","123456");  
            if  (null != con)
            {
                boExists = false;
                rs = con.getMetaData().getTables(null, null, tableName, new String[] {"TABLE"});
                while(rs.next())
                {
                     String table = rs.getString("TABLE_NAME");
                     if(table.equals(tableName)){
                          boExists = true;
                          break;
                     }
                }

                if (!boExists)
                {
                     stmt=con.createStatement();  
                     if (null != stmt)
                     {
                         stmt.executeUpdate(query);
                         stmt.close();
                     }
                }
            }

            if (null != con)
               con.close();
        }
        catch(Exception e)
        {
            
        }

    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        administrator admin = new administrator();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Demo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Demo1 demo = new Demo1();
               demo.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
   
    //for Student
   /* 
    private javax.swing.JButton jbtnFillFeedback;
    private javax.swing.JButton jbtnNext;
    private javax.swing.JComboBox<String> jComboBoxCourse;
    private javax.swing.JComboBox<String> jComboBoxYear;
    private javax.swing.JComboBox<String> jComboBoxDept;
    private javax.swing.JComboBox<String> jComboBoxDiv;
    private javax.swing.JLabel jLabelStudName;
    private javax.swing.JLabel jLabelTeacherName;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JLabel jLabelDept;
    private javax.swing.JLabel jLabelDiv;
    private javax.swing.JLabel jLabelSub;
    private javax.swing.JLabel jLabelTeacher;
    private javax.swing.JLabel jLabelSubName;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldStudName;
*/
}
