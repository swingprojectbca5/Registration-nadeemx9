
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class signup extends javax.swing.JFrame
{

    int xMouse;
    int yMouse;

    Connection con;
    Statement statement;
    PreparedStatement pStatement;
    ResultSet result;

    public signup()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        txtUsrnm = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtPswd = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        chkShowPswd = new javax.swing.JCheckBox();
        txtCPswd = new javax.swing.JPasswordField();
        btnSignup = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblLoginHere = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(239, 90, 125));
        kGradientPanel2.setkGradientFocus(50);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 235, 252));
        kGradientPanel2.setOpaque(false);

        txtUsrnm.setBackground(new Color(0, 0, 0, 0));
        txtUsrnm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtUsrnm.setForeground(java.awt.Color.lightGray);
        txtUsrnm.setText("USERNAME");
        txtUsrnm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtUsrnm.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtUsrnmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtUsrnmFocusLost(evt);
            }
        });
        txtUsrnm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtUsrnmActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/padlock.png"))); // NOI18N

        txtPswd.setBackground(new Color(0, 0, 0, 0));
        txtPswd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtPswd.setText("PASSWORD");
        txtPswd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtPswd.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtPswdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtPswdFocusLost(evt);
            }
        });
        txtPswd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtPswdActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/padlock.png"))); // NOI18N

        chkShowPswd.setForeground(new java.awt.Color(204, 204, 204));
        chkShowPswd.setText("Show Password");
        chkShowPswd.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                chkShowPswdItemStateChanged(evt);
            }
        });

        txtCPswd.setBackground(new Color(0, 0, 0, 0));
        txtCPswd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtCPswd.setText("CONFIRM PASSWORD");
        txtCPswd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        txtCPswd.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtCPswdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtCPswdFocusLost(evt);
            }
        });

        btnSignup.setText("SIGN-UP");
        btnSignup.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSignup.setkBorderRadius(40);
        btnSignup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignupActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(60, 63, 65));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create an Account");

        jButton1.setBackground(new Color(0, 0, 0, 0)
        );
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Close_25px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Already have an Account ?");

        lblLoginHere.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLoginHere.setForeground(new java.awt.Color(204, 204, 204));
        lblLoginHere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginHere.setText("LOGIN HERE!");
        lblLoginHere.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLoginHere.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblLoginHereMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblLoginHereMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblLoginHereMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Get Connect with US!");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("&");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("OR");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblLoginHere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkShowPswd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPswd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(txtCPswd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsrnm, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(chkShowPswd)
                .addGap(39, 39, 39)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLoginHere)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        else if (isConfirmPasswordEmpty())
        {
            JOptionPane.showMessageDialog(null, "Confirm Password Field is Empty!");
            txtCPswd.grabFocus();
        }
        else if (!txtPswd.getText().equals(txtCPswd.getText()))
        {
            JOptionPane.showMessageDialog(null, "Password does not Match!");
            txtPswd.grabFocus();
            txtPswd.selectAll();
        }
        else if (isUsernameExist())
        {
            JOptionPane.showMessageDialog(null, "Username '" + txtUsrnm.getText() + "' already exist!");
            txtUsrnm.grabFocus();
            txtUsrnm.selectAll();
        }
        else
        {
            String query = "insert into registration values(?, ?)";

            try
            {
                pStatement = con.prepareStatement(query);
                pStatement.setString(1, txtUsrnm.getText());
                pStatement.setString(2, txtPswd.getText());

                int r = pStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Account Created Successfull!\nYour're Ready to Login.");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void txtCPswdFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtCPswdFocusLost
    {//GEN-HEADEREND:event_txtCPswdFocusLost
        if (txtCPswd.getText().equals(""))
        {
            txtCPswd.setText("CONFIRM PASSWORD");
            txtCPswd.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            txtCPswd.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtCPswdFocusLost

    private void txtCPswdFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtCPswdFocusGained
    {//GEN-HEADEREND:event_txtCPswdFocusGained
        if (txtCPswd.getText().equals("CONFIRM PASSWORD"))
        {
            txtCPswd.setText("");
            txtCPswd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            txtCPswd.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtCPswdFocusGained

    private void txtPswdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtPswdActionPerformed
    {//GEN-HEADEREND:event_txtPswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPswdActionPerformed

    private void txtPswdFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtPswdFocusLost
    {//GEN-HEADEREND:event_txtPswdFocusLost
        if (txtPswd.getText().equals(""))
        {
            txtPswd.setText("PASSWORD");
            txtPswd.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            txtPswd.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtPswdFocusLost

    private void txtPswdFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtPswdFocusGained
    {//GEN-HEADEREND:event_txtPswdFocusGained
        if (txtPswd.getText().equals("PASSWORD"))
        {
            txtPswd.setText("");
            txtPswd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            txtPswd.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtPswdFocusGained

    private void txtUsrnmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtUsrnmActionPerformed
    {//GEN-HEADEREND:event_txtUsrnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsrnmActionPerformed

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

    private void txtUsrnmFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtUsrnmFocusGained
    {//GEN-HEADEREND:event_txtUsrnmFocusGained
        if (txtUsrnm.getText().equals("USERNAME"))
        {
            txtUsrnm.setText("");
            txtUsrnm.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
            txtUsrnm.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtUsrnmFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblLoginHereMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLoginHereMouseClicked
    {//GEN-HEADEREND:event_lblLoginHereMouseClicked
        login frmLogin = new login();
        frmLogin.show();
        this.dispose();
    }//GEN-LAST:event_lblLoginHereMouseClicked

    private void chkShowPswdItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_chkShowPswdItemStateChanged
    {//GEN-HEADEREND:event_chkShowPswdItemStateChanged
        if (chkShowPswd.isSelected())
        {
            txtPswd.setEchoChar((char) 0);
            txtCPswd.setEchoChar((char) 0);
            chkShowPswd.setText("Hide Password");
        }
        else
        {
            txtPswd.setEchoChar('*');
            txtCPswd.setEchoChar('*');
            chkShowPswd.setText("Show Password");
        }
    }//GEN-LAST:event_chkShowPswdItemStateChanged

    private void lblLoginHereMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLoginHereMouseEntered
    {//GEN-HEADEREND:event_lblLoginHereMouseEntered
        lblLoginHere.setText("<html><u>LOGIN HERE!</u></html>");
        lblLoginHere.setFont(new Font("Segoe UI", Font.BOLD, 16));
    }//GEN-LAST:event_lblLoginHereMouseEntered

    private void lblLoginHereMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLoginHereMouseExited
    {//GEN-HEADEREND:event_lblLoginHereMouseExited
        lblLoginHere.setText("LOGIN HERE!");
        lblLoginHere.setFont(new Font("Segoe UI", Font.BOLD, 16));
    }//GEN-LAST:event_lblLoginHereMouseExited

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
                new signup().setVisible(true);
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

    boolean isConfirmPasswordEmpty()
    {
        if (txtCPswd.getText().equals("CONFIRM PASSWORD"))
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

//
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnSignup;
    private javax.swing.JCheckBox chkShowPswd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblLoginHere;
    private javax.swing.JPasswordField txtCPswd;
    private javax.swing.JPasswordField txtPswd;
    private javax.swing.JTextField txtUsrnm;
    // End of variables declaration//GEN-END:variables
}
