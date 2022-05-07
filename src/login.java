
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class login extends javax.swing.JFrame
{

    Connection con;
    Statement statement;
    PreparedStatement pStatement;
    ResultSet result;

    int xMouse;
    int yMouse;

    public login()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsrnm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPswd = new javax.swing.JPasswordField();
        chkShowPswd = new javax.swing.JCheckBox();
        btnSignup = new com.k33ptoo.components.KButton();
        jLabel5 = new javax.swing.JLabel();
        lblRegisterHere = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 235, 252));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(239, 90, 125));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Close_25px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/permission.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(60, 63, 65));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN FORM");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N

        txtUsrnm.setBackground(new Color(0, 0, 0, 0));
        txtUsrnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtUsrnm.setForeground(java.awt.Color.lightGray);
        txtUsrnm.setText("USERNAME");
        txtUsrnm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtUsrnm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsrnmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsrnmFocusLost(evt);
            }
        });
        txtUsrnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsrnmActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/padlock.png"))); // NOI18N

        txtPswd.setBackground(new Color(0, 0, 0, 0));
        txtPswd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtPswd.setText("PASSWORD");
        txtPswd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtPswd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPswdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPswdFocusLost(evt);
            }
        });
        txtPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPswdActionPerformed(evt);
            }
        });

        chkShowPswd.setForeground(new java.awt.Color(102, 102, 102));
        chkShowPswd.setText("Show Password");
        chkShowPswd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkShowPswdItemStateChanged(evt);
            }
        });

        btnSignup.setText("LOGIN");
        btnSignup.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSignup.setkBorderRadius(40);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Don't have an Account ?");

        lblRegisterHere.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblRegisterHere.setForeground(new java.awt.Color(102, 102, 102));
        lblRegisterHere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegisterHere.setText("REGISTER NOW!");
        lblRegisterHere.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegisterHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterHereMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterHereMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterHereMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("OR");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 99, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(lblRegisterHere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtUsrnm)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPswd)
                    .addComponent(chkShowPswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(txtPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(chkShowPswd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(lblRegisterHere))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMousePressed
    {//GEN-HEADEREND:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseDragged
    {//GEN-HEADEREND:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtUsrnmFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtUsrnmFocusGained
    {//GEN-HEADEREND:event_txtUsrnmFocusGained
        if (txtUsrnm.getText().equals("USERNAME"))
        {
            txtUsrnm.setText("");
            txtUsrnm.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            txtUsrnm.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtUsrnmFocusGained

    private void txtUsrnmFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtUsrnmFocusLost
    {//GEN-HEADEREND:event_txtUsrnmFocusLost
        if (txtUsrnm.getText().equals(""))
        {
            txtUsrnm.setText("USERNAME");
            txtUsrnm.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            txtUsrnm.setForeground(Color.LIGHT_GRAY);
        }
        else
        {
            txtUsrnm.setForeground(Color.WHITE);
            txtUsrnm.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        }
    }//GEN-LAST:event_txtUsrnmFocusLost

    private void txtUsrnmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtUsrnmActionPerformed
    {//GEN-HEADEREND:event_txtUsrnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsrnmActionPerformed

    private void txtPswdFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtPswdFocusGained
    {//GEN-HEADEREND:event_txtPswdFocusGained
        if (txtPswd.getText().equals("PASSWORD"))
        {
            txtPswd.setText("");
            txtPswd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            txtPswd.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtPswdFocusGained

    private void txtPswdFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtPswdFocusLost
    {//GEN-HEADEREND:event_txtPswdFocusLost
        if (txtPswd.getText().equals(""))
        {
            txtPswd.setText("PASSWORD");
            txtPswd.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            txtPswd.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtPswdFocusLost

    private void txtPswdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtPswdActionPerformed
    {//GEN-HEADEREND:event_txtPswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPswdActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSignupActionPerformed
    {//GEN-HEADEREND:event_btnSignupActionPerformed
        if (isUsernameEmpty())
        {
            JOptionPane.showMessageDialog(null, "Username Field is Empty!");
            txtUsrnm.grabFocus();
        }
        else if (isPasswordEmpty())
        {
            JOptionPane.showMessageDialog(null, "Password Field is Empty!");
            txtPswd.grabFocus();
        }
        else
        {
            String query = "select * from registration where usrnm = '" + txtUsrnm.getText() + "' and pswd = '" + txtPswd.getText() + "'";
            try
            {

                statement = con.createStatement();
                result = statement.executeQuery(query);

                if (result.next())
                {
                    JOptionPane.showMessageDialog(null, "WELCOME!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Not Registered Yet! \n Create an Account First.");
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void lblRegisterHereMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblRegisterHereMouseClicked
    {//GEN-HEADEREND:event_lblRegisterHereMouseClicked
        signup frmSignup = new signup();
        frmSignup.show();
        this.dispose();
    }//GEN-LAST:event_lblRegisterHereMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        if (!isDriverLoaded())
        {
            JOptionPane.showMessageDialog(null, "Failed to Load JDBC Driver");
            System.exit(0);
        }
        else if (!isDBConnected())
        {
            JOptionPane.showMessageDialog(null, "Failed to Establish Connection!");
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowOpened

    private void chkShowPswdItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_chkShowPswdItemStateChanged
    {//GEN-HEADEREND:event_chkShowPswdItemStateChanged
        if (chkShowPswd.isSelected())
        {
            txtPswd.setEchoChar((char) 0);
            chkShowPswd.setText("Hide Password");

        }
        else
        {
            txtPswd.setEchoChar('*');
            chkShowPswd.setText("Show Password");
        }
    }//GEN-LAST:event_chkShowPswdItemStateChanged

    private void lblRegisterHereMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblRegisterHereMouseEntered
    {//GEN-HEADEREND:event_lblRegisterHereMouseEntered
        lblRegisterHere.setText("<html><u>REGISTER NOW!</u></html>");
        lblRegisterHere.setFont(new Font("Segoe UI", Font.BOLD, 16));
    }//GEN-LAST:event_lblRegisterHereMouseEntered

    private void lblRegisterHereMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblRegisterHereMouseExited
    {//GEN-HEADEREND:event_lblRegisterHereMouseExited
        lblRegisterHere.setText("REGISTER NOW!");
        lblRegisterHere.setFont(new Font("Segoe UI", Font.BOLD, 16));
    }//GEN-LAST:event_lblRegisterHereMouseExited

    public static void main(String args[])
    {
        try
        {
            UIManager.setLookAndFeel(new FlatAtomOneDarkIJTheme());
        }
        catch (Exception e)
        {
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new login().setVisible(true);
            }
        });
    }

    // Custom Methods
    boolean isDriverLoaded()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    boolean isDBConnected()
    {
        try
        {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/nedjdbc", "root", "");
            return true;
        }
        catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return false;
        }
    }

    boolean isUsernameEmpty()
    {
        if (txtUsrnm.getText().equals("USERNAME"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isPasswordEmpty()
    {
        if (txtPswd.getText().equals("PASSWORD"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isUsernameExist()
    {
        String query = "select * from registration where usrnm like '" + txtUsrnm.getText() + "'";

        try
        {
            statement = con.createStatement();
            result = statement.executeQuery(query);
            if (result.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnSignup;
    private javax.swing.JCheckBox chkShowPswd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblRegisterHere;
    private javax.swing.JPasswordField txtPswd;
    private javax.swing.JTextField txtUsrnm;
    // End of variables declaration//GEN-END:variables
}
