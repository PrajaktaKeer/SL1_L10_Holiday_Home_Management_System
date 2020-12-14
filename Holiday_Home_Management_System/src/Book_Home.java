
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
public class Book_Home extends javax.swing.JFrame {

    /**
     * Creates new form Book_Home
     */
    public Book_Home() {
        initComponents();
       // setSize(800, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Happy Holidays");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
logo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("logo.jpeg")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        logo2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("logo1.png")).getImage().getScaledInstance(260, 86, Image.SCALE_SMOOTH)));
        this.makeFrameFullSize(this);
show_db();
    }
private void makeFrameFullSize(JFrame aFrame) {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    aFrame.setSize(screenSize.width, screenSize.height);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void show_db() {
        String sql="select * from view_houses";
        try {
            Connection con = MysqlConnect.ConnectDb();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            table_book.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
             JOptionPane.showMessageDialog(null, e);
        }
        //to stop table from being edited and selection is allowed
        table_book.setDefaultEditor(Object.class, null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmb_search = new javax.swing.JComboBox<>();
        btn_search = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        home_img = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_book = new javax.swing.JTable();
        logo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        s_date = new datechooser.beans.DateChooserCombo();
        jLabel15 = new javax.swing.JLabel();
        end_date = new datechooser.beans.DateChooserCombo();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_fac = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        btn_payment = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cust = new javax.swing.JMenu();
        menu_host = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menu_rent = new javax.swing.JMenu();
        menu_profile = new javax.swing.JMenu();
        menu_logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(181, 240, 233));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        logo2.setText("jLabel2");

        jLabel10.setFont(new java.awt.Font("Algerian", 2, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Book home");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel18.setText("Search By Location");

        cmb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Pune", "Goa" }));

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel14.setText("Image of Home");

        home_img.setText("jLabel1");

        table_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_bookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_book);

        logo.setText("jLabel1");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setText("Start Date");

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel15.setText("End Date");

        table_fac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_fac);

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel19.setText("Facilities");

        btn_payment.setText("Procced To Payment");
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_search)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(home_img, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btn_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_search)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(home_img, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_payment)
                .addGap(18, 18, 18))
        );

        menu_cust.setText("Register As Customer");
        menu_cust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_custMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_cust);

        menu_host.setText("Register As Host");
        menu_host.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_hostMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_host);

        jMenu3.setText("Book A Home");
        jMenuBar1.add(jMenu3);

        menu_rent.setText("Rent A Home");
        menu_rent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_rentMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_rent);

        menu_profile.setText("Update Profile");
        menu_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_profileMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_profile);

        menu_logout.setText("LogOut");
        menu_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_logoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_logout);

        setJMenuBar(jMenuBar1);

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

    private void menu_custMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_custMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Customer")) {
            this.setVisible(false);
            new Reg_Customer().setVisible(true);
         }
         else {
            JOptionPane.showMessageDialog(null, "You have not logged in Customer", "Access Denied", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_menu_custMouseClicked

    private void menu_hostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_hostMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Host")) {
            this.setVisible(false);
            new Reg_Host().setVisible(true);
         }
         else {
            JOptionPane.showMessageDialog(null, "You have not logged in as Host", "Access Denied", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_menu_hostMouseClicked

    private void menu_rentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_rentMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Host")) {
            this.setVisible(false);
            new Rent_Home().setVisible(true);
         }
         else {
            JOptionPane.showMessageDialog(null, "You have not logged in as Customer", "Access Denied", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_menu_rentMouseClicked

    private void menu_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_profileMouseClicked
        // TODO add your handling code here:
        if(Login_Form.special_account_type.equals("Customer")) {
            this.setVisible(false);
            new Update_Profile().setVisible(true);
         }
         else {
            this.setVisible(false);
            new Update_Profile_Host().setVisible(true);
        }
        
    }//GEN-LAST:event_menu_profileMouseClicked

    private void menu_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_logoutMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
        new Login_Form().setVisible(true);
        
    }//GEN-LAST:event_menu_logoutMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        String sql="select * from view_houses where location = '" + cmb_search.getSelectedItem() + "'";
        try {
            Connection con = MysqlConnect.ConnectDb();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            table_book.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, e);
        }
        //to stop table from being edited and selection is allowed
        table_book.setDefaultEditor(Object.class, null);
    }//GEN-LAST:event_btn_searchActionPerformed

    private void table_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_bookMouseClicked
        // TODO add your handling code here:
        row1 = table_book.getSelectedRow();
        Connection con = MysqlConnect.ConnectDb();

        if(row1 != -1) {
            int house_id = Integer.parseInt(table_book.getModel().getValueAt(row1, 0).toString());

            //searching image file
            try {

                PreparedStatement ps = con.prepareStatement("select img_file from house where house_id = " + house_id);
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {
                    byte [] img = rs.getBytes("img_file");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image home_img1 = im.getScaledInstance(home_img.getWidth(), home_img.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newimg = new ImageIcon(home_img1);
                    home_img.setIcon(newimg);
                }
            }
            catch(SQLException ex) {
                System.out.println("Login Error" + ex);
            }

            String q1 = "select facility_name from facilities where house_id = " + house_id;
            try {

                PreparedStatement ps = con.prepareStatement(q1);
                ResultSet rs = ps.executeQuery();

                table_fac.setModel(DbUtils.resultSetToTableModel(rs));

            }
            catch(SQLException ex) {
                System.out.println("Login Error" + ex);

            }
        }
    }//GEN-LAST:event_table_bookMouseClicked

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        // TODO add your handling code here:
        int row = table_book.getSelectedRow(), house_id = 0;
        if(row1 != -1) {
            house_id = Integer.parseInt(table_book.getModel().getValueAt(row, 0).toString());
            cost = table_book.getModel().getValueAt(row, 1).toString();
            av_from = table_book.getModel().getValueAt(row, 2).toString();
            av_to = table_book.getModel().getValueAt(row, 3).toString();
            //img_file = table_book.getModel().getValueAt(row, 3).toString();
            loc = table_book.getModel().getValueAt(row, 4).toString();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sdate = sdf.format(s_date.getSelectedDate().getTime());
            String edate = sdf.format(end_date.getSelectedDate().getTime());
            Date sdate1 = null, edate1 = null, av_from1 = null, av_to1 = null;

            try {
                sdate1 = sdf.parse(sdate);
                edate1 = sdf.parse(edate);
                av_from1 = sdf.parse(av_from);
                av_to1 = sdf.parse(av_to);

                if(sdate1.compareTo(av_from1) >= 0 && edate1.compareTo(av_to1) <= 0 && edate1.compareTo(sdate1) >= 0) {

                    //extracting cust_id

                    try {
                        Connection con = MysqlConnect.ConnectDb();
                        PreparedStatement ps = con.prepareStatement("select customer_id from customer where person_id = " + Login_Form.special_person_id);
                        ResultSet rs = ps.executeQuery();
                        if(rs.next()) {
                            cust_id = rs.getInt(1);
                        }
                    }
                    catch(SQLException ex) {
                        System.out.println("Login Error" + ex);
                    }

                    if(cust_id != 0) {

                        //extract house id
                        try {
                            Connection con = MysqlConnect.ConnectDb();
                            PreparedStatement ps = con.prepareStatement("select house_id from house where availablity_to = ? and availablity_from = ? and cost = ? and location = ?");
                            ps.setString(1, av_to);
                            ps.setString(2, av_from);
                            ps.setString(3, cost);
                            //ps.setString(4, img_file);
                            ps.setString(4, loc);
                            //ps.setString(4, fname);
                            ResultSet rs = ps.executeQuery();

                            if(rs.next()) {
                                house_id = rs.getInt(1);
                            }
                        }
                        catch(SQLException ex) {
                            System.out.println("House Id Error" + ex);
                        }
                        //System.out.println(house_id);

                        //inserting into booking table

                        String sql = "insert into booking(customer_id, home_id, start_date, end_date, status) values (" + cust_id + "," + house_id + ",'" + sdf.format(s_date.getSelectedDate().getTime()) + "','" + sdf.format(end_date.getSelectedDate().getTime()) + "','Confirmed')";
                        try {
                            Connection conn = MysqlConnect.ConnectDb();
                            Statement st = conn.createStatement();
                            st.executeUpdate(sql);
                            JOptionPane.showMessageDialog(null, "Booking Successful");
                        }
                        catch(SQLException ex) {
                            System.out.println("Insert Error" + ex);
                        }

                        this.setVisible(false);
                        new Payment().setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "You need to first register as a Customer");
                        this.setVisible(false);
                        new Reg_Customer().setVisible(true);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Please check the available dates");
                }

            }
            catch(Exception ex) {
                System.out.println("Login Error" + ex);
            }

        }
    }//GEN-LAST:event_btn_paymentActionPerformed

    public static String cost, av_to, av_from, img_file = "", loc;
    public static int cust_id = 0, row1 = 0;
    
   
    
    
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
            java.util.logging.Logger.getLogger(Book_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_payment;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cmb_search;
    private datechooser.beans.DateChooserCombo end_date;
    private javax.swing.JLabel home_img;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    private javax.swing.JMenu menu_cust;
    private javax.swing.JMenu menu_host;
    private javax.swing.JMenu menu_logout;
    private javax.swing.JMenu menu_profile;
    private javax.swing.JMenu menu_rent;
    private datechooser.beans.DateChooserCombo s_date;
    private javax.swing.JTable table_book;
    private javax.swing.JTable table_fac;
    // End of variables declaration//GEN-END:variables
}
