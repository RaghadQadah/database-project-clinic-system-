
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static javafx.beans.binding.Bindings.and;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class patientapp1 extends javax.swing.JFrame {

    /**
     * Creates new form patientapp1
     */
    public int id;
    
    public patientapp1() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientapp = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        warning = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        choice1 = new java.awt.Choice();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        patientapp.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("My Appointments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("My Drugs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 102, 102));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 102, 102));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jToggleButton1.setBackground(new java.awt.Color(0, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Reserve an appointment");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel appointment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        choice1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        choice1.setForeground(new java.awt.Color(0, 102, 102));
        choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice1MouseEntered(evt);
            }
        });
        choice1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                choice1MouseMoved(evt);
            }
        });
        choice1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                choice1KeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Menu");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout patientappLayout = new javax.swing.GroupLayout(patientapp);
        patientapp.setLayout(patientappLayout);
        patientappLayout.setHorizontalGroup(
            patientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(patientappLayout.createSequentialGroup()
                .addGroup(patientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientappLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patientappLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1)))
                .addGap(92, 92, 92)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(patientappLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(patientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientappLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(patientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton1)))
                .addGap(29, 29, 29))
        );
        patientappLayout.setVerticalGroup(
            patientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientappLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(patientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(patientappLayout.createSequentialGroup()
                        .addGroup(patientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(patientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(patientappLayout.createSequentialGroup()
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patientapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(748, 441));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void setchoice1(){
     Connection myconn=null;
        Statement myStmt=null;
        ResultSet myrs=null;
        ResultSet myrs2=null;
        ResultSet myrs1=null;

        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost/clinic?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow","root","root");
            myStmt=myconn.createStatement();
              // myrs1 = myStmt.executeQuery("select * from takeapp p, doctor r where (p.pid = '"+id+"'and p.Did=r.eid)");
            int pid=getid();
            myrs1 = myStmt.executeQuery("select * from takeapp where pid ='"+pid+"'");
               choice1.add("");
                          
                  while(myrs1.next()){
//                     
                   
                    // System.out.println(myrs1.getString("date"));
                                                 
        choice1.add(myrs1.getString("adate")+"," +myrs1.getString("time")+"," + myrs1.getString("pid")+"\n");
            }
          

        
          

        }

        catch( Exception exc ){
            exc.printStackTrace();
        }
        
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
     
        Connection myconn=null;
        Statement myStmt=null;
        ResultSet myrs=null;

        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost/clinic?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow","root","root");
            myStmt=myconn.createStatement();
            myrs=myStmt.executeQuery("select * from takeapp where pid = '"+id+"'" );

            jTextArea1.setText("ano"+"  " + "adate"+"  " + "time"+"  " + "description"+"\n");
            while(myrs.next()){
                jTextArea1.append(myrs.getString("ano")+"  " + myrs.getString("adate")+"  " + myrs.getString("time")+"  " + myrs.getString("description")+"\n");
            }

          

        } catch( Exception exc ){
            exc.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           Connection myconn=null;
        Statement myStmt=null;
        ResultSet myrs=null;
        ResultSet myrs2=null;
        ResultSet myrs1=null;

        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost/clinic?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow","root","root");
            myStmt=myconn.createStatement();
               myrs1 = myStmt.executeQuery("select d.description,r.name from prescripe p,drugs d,doctor r where (p.pid = '"+id+"'and r.eid = p.eid and d.did=p.did)");
               
                    jTextArea2.setText("Drugs:\n");
                          
                  while(myrs1.next()){
//                       int did =Integer.parseInt(myrs1.getString("did"));
//                       jTextArea2.append(""+did);
//                        int eid =Integer.parseInt(myrs1.getString("eid"));
//                       myrs=myStmt.executeQuery("select * from drugs where did = '"+did+"'");
//                 myrs2=myStmt.executeQuery("select * from doctor where eid = '"+eid+"'");
                   
                      
                                                 
          jTextArea2.append(""+myrs1.getString("description")+" ,prescriped by: " + myrs1.getString("name")+"\n");
            }
          

        
          

        }

        catch( Exception exc ){
            exc.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        patientreserve p = new patientreserve();
        p.id=id;
        p.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Connection myconn=null;
        Statement myStmt=null;
        ResultSet myrs=null;
        ResultSet myrs2=null;
        ResultSet myrs1=null;

        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost/clinic?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow","root","root");
            myStmt=myconn.createStatement();
            String array[]=choice1.getSelectedItem().split(",");
            int pid=getid();
            String date=array[0];
            String time=array[1];
            
          myStmt.executeUpdate("delete from takeapp where pid ='"+pid+"' and time='"+time+"' and adate='"+date+"'");
              
            choice1.add("");
                          myrs1= myStmt.executeQuery("select * from takeapp where pid='"+pid+"'");
                  while(myrs1.next()){
//                     
                   
                    // System.out.println(myrs1.getString("date"));
                                                 
        choice1.add(myrs1.getString("adate")+"," +myrs1.getString("time")+"," + myrs1.getString("pid")+"\n");
            }
          myrs2=myStmt.executeQuery("select * from takeapp where pid='"+pid+"'");

         jTextArea1.setText("ano"+"  " + "adate"+"  " + "time"+"  " + "description"+"\n");
            while(myrs2.next()){
                jTextArea1.append(myrs2.getString("ano")+"  " + myrs2.getString("adate")+"  " + myrs2.getString("time")+"  " + myrs2.getString("description")+"\n");
            }
          
          

        }

        catch( Exception exc ){
            exc.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void choice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_choice1MouseClicked

    private void choice1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseMoved
        
    
    }//GEN-LAST:event_choice1MouseMoved

    private void choice1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_choice1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_choice1KeyPressed

    private void choice1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseEntered
        // TODO add your handling code here:
          Connection myconn=null;
        Statement myStmt=null;
        ResultSet myrs=null;
        ResultSet myrs2=null;
        ResultSet myrs1=null;
        choice1.removeAll();

        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost/clinic?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow","root","root");
            myStmt=myconn.createStatement();
              // myrs1 = myStmt.executeQuery("select * from takeapp p, doctor r where (p.pid = '"+id+"'and p.Did=r.eid)");
            int pid=getid();
        
               choice1.add("");
                         myrs1=myStmt.executeQuery("select * from takeapp where pid = '"+id+"'");
                  while(myrs1.next()){
                  
                   
                 
                                                 
        choice1.add(myrs1.getString("adate")+"," +myrs1.getString("time")+"," + myrs1.getString("pid")+"\n");
            }
          

        
          

        }

        catch( Exception exc ){
            exc.printStackTrace();
        }
        
    }//GEN-LAST:event_choice1MouseEntered

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        patientlog1 f=new patientlog1();
        f.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(patientapp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientapp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientapp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientapp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientapp1().setVisible(true);
            }
        });
    }
public void setid(int x){
 this.id=x;
}
public int getid(){
    
    return this.id;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel patientapp;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
