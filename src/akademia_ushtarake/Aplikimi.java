/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akademia_ushtarake;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 *
 * @author Blendi
 */
public class Aplikimi extends javax.swing.JFrame {
 
     int xMouse;
    int yMouse;
    /**
     * Creates new form Aplikimi
     */
    public Aplikimi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /*public static void insertAplikimi (String emriA, String mbiemriA, String dataLindjesA,String gjiniaA, String nrPersonalA, String nrTelefonitA, String emailAdresaA,String adresaA)
    throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        
        try {
            String INSERT_APLIKIMI = "insert into Aplikuesit (EmriA, MbiemriA, DataLindjesA, GjiniaA, NrPersonalA, NrTelefonitA, EmailAdresaA,AdresaA) values (?,?,?,?,?,?,?,?)";
            
            connection = OracleDBConfig.getConnection();
            stmt = connection.prepareStatement(INSERT_APLIKIMI);
            stmt.setString(1, emriA);
            stmt.setString(2, mbiemriA);
            stmt.setString(3, dataLindjesA);
            stmt.setString(4, gjiniaA);
            stmt.setString(5, nrPersonalA);
            stmt.setString(6, nrTelefonitA);
            stmt.setString(7, emailAdresaA);
            stmt.setString(8, adresaA);
            
            stmt.executeUpdate(INSERT_APLIKIMI);
            System.out.println("Aplikuesi u regjistrua");
        }
    
        catch(SQLException sql_ex){
            sql_ex.printStackTrace();
        }
        finally{
            if (connection != null){
                connection.close();
            }
            if (stmt != null){
                stmt.close();
            }
        }
        
    
    }*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rbtMashkull = new javax.swing.JRadioButton();
        rbtFemer = new javax.swing.JRadioButton();
        cmbViti = new javax.swing.JComboBox<>();
        cmbMuaji = new javax.swing.JComboBox<>();
        cmbDita = new javax.swing.JComboBox<>();
        lblAdresaElektronike = new javax.swing.JLabel();
        lblDataLindjes = new javax.swing.JLabel();
        lblNumriTelefonit = new javax.swing.JLabel();
        lblNumriPersonal = new javax.swing.JLabel();
        lblGjinia = new javax.swing.JLabel();
        lblEmri = new javax.swing.JLabel();
        lblMbiemri = new javax.swing.JLabel();
        txtEmri = new javax.swing.JTextField();
        txtMbiemri = new javax.swing.JTextField();
        txtNumriTelefonit = new javax.swing.JTextField();
        txtNumriPersonal = new javax.swing.JTextField();
        txtAdresaElektronike = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblAplikimi = new javax.swing.JLabel();
        lblMbyllja = new javax.swing.JLabel();
        lblMinimizimi = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblQyteti = new javax.swing.JLabel();
        lblRruga = new javax.swing.JLabel();
        lblNumri = new javax.swing.JLabel();
        txtRruga = new javax.swing.JTextField();
        txtQyteti = new javax.swing.JTextField();
        txtNumri = new javax.swing.JTextField();
        btnApliko = new javax.swing.JButton();
        lblAdresa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rbtMashkull);
        rbtMashkull.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        rbtMashkull.setText("M");
        rbtMashkull.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbtMashkull, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 50, -1));

        buttonGroup1.add(rbtFemer);
        rbtFemer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        rbtFemer.setText("F");
        rbtFemer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbtFemer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 50, -1));

        cmbViti.setBackground(new java.awt.Color(255, 255, 255, 0));
        cmbViti.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        cmbViti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992" }));
        cmbViti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cmbViti, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 90, 60));

        cmbMuaji.setBackground(new java.awt.Color(255, 255, 255, 0));
        cmbMuaji.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        cmbMuaji.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janar", "Shkurt", "Mars", "Prill", "Maj", "Qershor", "Korrik", "Gusht", "Shtator", "Tetor", "Nentor", "Dhjetor" }));
        cmbMuaji.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cmbMuaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 300, 130, 60));

        cmbDita.setBackground(new java.awt.Color(255, 255, 255, 0));
        cmbDita.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        cmbDita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cmbDita, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, 60));

        lblAdresaElektronike.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblAdresaElektronike.setForeground(new java.awt.Color(255, 255, 255));
        lblAdresaElektronike.setText("Adresa Elektronike");
        getContentPane().add(lblAdresaElektronike, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 160, 16));

        lblDataLindjes.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblDataLindjes.setForeground(new java.awt.Color(255, 255, 255));
        lblDataLindjes.setText("Data e Lindjes");
        getContentPane().add(lblDataLindjes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, 16));

        lblNumriTelefonit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNumriTelefonit.setForeground(new java.awt.Color(255, 255, 255));
        lblNumriTelefonit.setText("Numri i Telefonit");
        getContentPane().add(lblNumriTelefonit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 150, 16));

        lblNumriPersonal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNumriPersonal.setForeground(new java.awt.Color(255, 255, 255));
        lblNumriPersonal.setText("Numri Personal");
        getContentPane().add(lblNumriPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 16));

        lblGjinia.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblGjinia.setForeground(new java.awt.Color(255, 255, 255));
        lblGjinia.setText("Gjinia");
        getContentPane().add(lblGjinia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, 16));

        lblEmri.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblEmri.setForeground(new java.awt.Color(255, 255, 255));
        lblEmri.setText("Emri");
        getContentPane().add(lblEmri, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 16));

        lblMbiemri.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblMbiemri.setForeground(new java.awt.Color(255, 255, 255));
        lblMbiemri.setText("Mbiemri");
        getContentPane().add(lblMbiemri, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 16));

        txtEmri.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtEmri.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtEmri.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtEmri.setSelectionColor(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtEmri, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 50));

        txtMbiemri.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtMbiemri.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtMbiemri.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtMbiemri.setSelectionColor(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtMbiemri, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 340, 50));

        txtNumriTelefonit.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtNumriTelefonit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtNumriTelefonit.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtNumriTelefonit.setSelectionColor(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtNumriTelefonit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 340, 50));

        txtNumriPersonal.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtNumriPersonal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtNumriPersonal.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtNumriPersonal.setSelectionColor(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtNumriPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 340, 50));

        txtAdresaElektronike.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtAdresaElektronike.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtAdresaElektronike.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtAdresaElektronike.setSelectionColor(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtAdresaElektronike, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 340, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(55, 66, 58)));
        jPanel2.setName(""); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        lblAplikimi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 35)); // NOI18N
        lblAplikimi.setForeground(new java.awt.Color(255, 255, 255));
        lblAplikimi.setText("Aplikimi");

        lblMbyllja.setIcon(new javax.swing.ImageIcon("C:\\Users\\Blendi\\Desktop\\ICONS\\exit.png")); // NOI18N
        lblMbyllja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMbyllja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMbylljaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMbylljaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMbylljaMouseExited(evt);
            }
        });

        lblMinimizimi.setIcon(new javax.swing.ImageIcon("C:\\Users\\Blendi\\Desktop\\ICONS\\minimize.png")); // NOI18N
        lblMinimizimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizimiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizimiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizimiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblAplikimi, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(lblMinimizimi)
                .addGap(18, 18, 18)
                .addComponent(lblMbyllja)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAplikimi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMbyllja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMinimizimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);

        lblQyteti.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblQyteti.setForeground(new java.awt.Color(240, 240, 240));
        lblQyteti.setText("Qyteti");

        lblRruga.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblRruga.setForeground(new java.awt.Color(240, 240, 240));
        lblRruga.setText("Rruga");

        lblNumri.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblNumri.setForeground(new java.awt.Color(240, 240, 240));
        lblNumri.setText("Numri");

        txtRruga.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtRruga.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtRruga.setForeground(new java.awt.Color(255, 255, 255));
        txtRruga.setMargin(new java.awt.Insets(2, 10, 2, 2));
        txtRruga.setOpaque(false);
        txtRruga.setSelectionColor(new java.awt.Color(0, 102, 102));

        txtQyteti.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtQyteti.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtQyteti.setForeground(new java.awt.Color(255, 255, 255));
        txtQyteti.setMargin(new java.awt.Insets(2, 10, 2, 2));
        txtQyteti.setOpaque(false);
        txtQyteti.setSelectionColor(new java.awt.Color(0, 102, 102));

        txtNumri.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtNumri.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtNumri.setForeground(new java.awt.Color(255, 255, 255));
        txtNumri.setMargin(new java.awt.Insets(2, 10, 2, 2));
        txtNumri.setOpaque(false);
        txtNumri.setSelectionColor(new java.awt.Color(0, 102, 102));
        txtNumri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblRruga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(lblQyteti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRruga, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(txtQyteti)
                    .addComponent(txtNumri))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQyteti)
                    .addComponent(txtQyteti, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRruga)
                    .addComponent(txtRruga, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumri)
                    .addComponent(txtNumri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, -1, -1));

        btnApliko.setBackground(new java.awt.Color(43, 69, 56));
        btnApliko.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnApliko.setForeground(new java.awt.Color(240, 240, 240));
        btnApliko.setIcon(new javax.swing.ImageIcon("C:\\Users\\Blendi\\Desktop\\apliko.png")); // NOI18N
        btnApliko.setText("Apliko");
        btnApliko.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApliko.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnApliko.setIconTextGap(20);
        btnApliko.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAplikoMouseClicked(evt);
            }
        });
        btnApliko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplikoActionPerformed(evt);
            }
        });
        getContentPane().add(btnApliko, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 920, 340, -1));

        lblAdresa.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblAdresa.setForeground(new java.awt.Color(255, 255, 255));
        lblAdresa.setText("Adresa");
        getContentPane().add(lblAdresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Blendi\\Desktop\\wallpaper2you_54292 - Copy.jpg")); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 1010));

        setSize(new java.awt.Dimension(611, 1009));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMbylljaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMbylljaMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblMbylljaMouseClicked

    private void lblMbylljaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMbylljaMouseEntered
        ImageIcon A = new ImageIcon(getClass().getResource("images/exit1.png"));
        lblMbyllja.setIcon(A);
    }//GEN-LAST:event_lblMbylljaMouseEntered

    private void lblMbylljaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMbylljaMouseExited
        ImageIcon A = new ImageIcon(getClass().getResource("images/exit.png"));
        lblMbyllja.setIcon(A);
    }//GEN-LAST:event_lblMbylljaMouseExited

    private void lblMinimizimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizimiMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizimiMouseClicked

    private void lblMinimizimiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizimiMouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("images/minimize1 .png"));
        lblMinimizimi.setIcon(B);

    }//GEN-LAST:event_lblMinimizimiMouseEntered

    private void lblMinimizimiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizimiMouseExited
        ImageIcon B = new ImageIcon(getClass().getResource("images/minimize.png"));
        lblMinimizimi.setIcon(B);
    }//GEN-LAST:event_lblMinimizimiMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
         xMouse = evt.getX();
         yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xMouse = evt.getX();
         yMouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void btnAplikoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAplikoMouseClicked
      
    }//GEN-LAST:event_btnAplikoMouseClicked

    private void btnAplikoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplikoActionPerformed
        try{
            String muaji = null;
            if( cmbMuaji.getSelectedItem() == "Janar")
                muaji = "JAN";
            if( cmbMuaji.getSelectedItem() == "Shkurt")
                muaji = "FEB";
            if( cmbMuaji.getSelectedItem() == "Mars")
                muaji = "MAR";
            if( cmbMuaji.getSelectedItem() == "Prill")
                muaji = "JAN";
            if( cmbMuaji.getSelectedItem() == "Maj")
                muaji = "MAY";
            if( cmbMuaji.getSelectedItem() == "Qershor")
                muaji = "JUN";
            if( cmbMuaji.getSelectedItem() == "Korrik")
                muaji = "JUL";
            if( cmbMuaji.getSelectedItem() == "Gusht")
                muaji = "AUG";
            if( cmbMuaji.getSelectedItem() == "Shtator")
                muaji = "SEP";
            if( cmbMuaji.getSelectedItem() == "Tetor")
                muaji = "OCT";
            if( cmbMuaji.getSelectedItem() == "Nentor")
                muaji = "NOV";
            if( cmbMuaji.getSelectedItem() == "Dhjetor")
                muaji = "DEC";
            
            
            if( (cmbMuaji.getSelectedItem()=="Shkurt") && (Integer.parseInt(cmbDita.getSelectedItem().toString()) > 28) & !((Integer.parseInt(cmbViti.getSelectedItem().toString())%4 ==0 )&(Integer.parseInt(cmbDita.getSelectedItem().toString()) < 30) ) )
            {
             
             JOptionPane optionPane = new JOptionPane("Muaji shkurt nuk ka me teper se 28 dite, perveq vitit te brishte qe i ka 29", JOptionPane.ERROR_MESSAGE);
             JDialog dialog = optionPane.createDialog("Deshtoi");
             dialog.setAlwaysOnTop(true);
             dialog.setVisible(true);
            }else if( (cmbMuaji.getSelectedItem()=="Prill") && (Integer.parseInt(cmbDita.getSelectedItem().toString()) > 30))
            {
             
             JOptionPane optionPane = new JOptionPane("Muaji prill i ka 30 dite, jo 31", JOptionPane.ERROR_MESSAGE);
             JDialog dialog = optionPane.createDialog("Deshtoi");
             dialog.setAlwaysOnTop(true);
             dialog.setVisible(true);
            }else if( (cmbMuaji.getSelectedItem()=="Qershor") && (Integer.parseInt(cmbDita.getSelectedItem().toString()) > 30))
            {
             
             JOptionPane optionPane = new JOptionPane("Muaji qershor i ka 30 dite, jo 31", JOptionPane.ERROR_MESSAGE);
             JDialog dialog = optionPane.createDialog("Deshtoi");
             dialog.setAlwaysOnTop(true);
             dialog.setVisible(true);
            }else if( (cmbMuaji.getSelectedItem()=="Shtator") && (Integer.parseInt(cmbDita.getSelectedItem().toString()) > 30))
            {
             
             JOptionPane optionPane = new JOptionPane("Muaji shtator i ka 30 dite, jo 31", JOptionPane.ERROR_MESSAGE);
             JDialog dialog = optionPane.createDialog("Deshtoi");
             dialog.setAlwaysOnTop(true);
             dialog.setVisible(true);
            }else if( (cmbMuaji.getSelectedItem()=="Nentor") && (Integer.parseInt(cmbDita.getSelectedItem().toString()) > 30))
            {
             
             JOptionPane optionPane = new JOptionPane("Muaji nentor i ka 30 dite, jo 31", JOptionPane.ERROR_MESSAGE);
             JDialog dialog = optionPane.createDialog("Deshtoi");
             dialog.setAlwaysOnTop(true);
             dialog.setVisible(true);
            }
            
            else{
            String datelindja = cmbDita.getSelectedItem().toString()+"-"+muaji+"-"+cmbViti.getSelectedItem().toString();
            Connection connection = OracleDBConfig.getConnection();
            //Statement stmt = connection.createStatement();
            
            String insertTest = "Insert into Aplikuesit(EmriA,MbiemriA,DataLindjesA,GjiniaA,NrPersonalA,NrTelefonitA,EmailAdresaA,AdresaA)  Values ('"+txtEmri.getText()+"','"+txtMbiemri.getText()+"','"+datelindja+"','"+buttonGroup1.getElements().nextElement().getText()+"','"+txtNumriPersonal.getText()+"','"+txtNumriTelefonit.getText()+"','"+txtAdresaElektronike.getText()+"',Adresa('"+txtQyteti.getText()+"','"+txtRruga.getText()+"','"+txtNumri.getText()+"'))";
            Statement st=connection.createStatement();
            int n=st.executeUpdate(insertTest);
            
            if(n==1){
                JOptionPane.showMessageDialog(this,"Te dhenat u regjistruan");
            }
            else{
             JOptionPane.showMessageDialog(this,"Te dhenat nuk u regjistruan");
            }
            connection.close();
            }
            }
            
        catch(Exception e){e.printStackTrace();}}
           
            
            //('"+txtEmri.getText()+"','"+txtMbiemri.getText()+"','"+datelindja+"','"+buttonGroup1.getSelection().toString()+"','"+txtNumriPersonal.getText()+"','"+txtNumriTelefonit.getText()+"','"+txtAdresaElektronike.getText()+"',"+null+")";
           // String adresa = txtQyteti.getText()+","+txtRruga.getText()+","+txtNumri.getText();
            //OracleDBConfig insertAplikimi1 = new OracleDBConfig();
            //insertAplikimi(txtEmri.getText(),txtMbiemri.getText(),datelindja,buttonGroup1.getSelection().toString(),txtNumriPersonal.getText(),txtNumriTelefonit.getText(),txtAdresaElektronike.getText(),null); 
           
       /* }} catch(Exception e){
            JOptionPane.showMessageDialog(null, "blabla");
                
                }
    }//GEN-LAST:event_btnAplikoActionPerformed
*/
    
    void FshijTeDhenat(){
    txtEmri.setText("");
    txtMbiemri.setText("");
    cmbDita.equals(1);
    cmbMuaji.equals("Janar");
    cmbViti.equals(2001);
    buttonGroup1.clearSelection();
    txtNumriPersonal.setText("");
    txtNumriTelefonit.setText("");
    txtAdresaElektronike.setText("");
    txtQyteti.setText("");
    txtRruga.setText("");
    txtNumri.setText("");
    }
    private void txtNumriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumriActionPerformed

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
            java.util.logging.Logger.getLogger(Aplikimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplikimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplikimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApliko;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbDita;
    private javax.swing.JComboBox<String> cmbMuaji;
    private javax.swing.JComboBox<String> cmbViti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdresa;
    private javax.swing.JLabel lblAdresaElektronike;
    private javax.swing.JLabel lblAplikimi;
    private javax.swing.JLabel lblDataLindjes;
    private javax.swing.JLabel lblEmri;
    private javax.swing.JLabel lblGjinia;
    private javax.swing.JLabel lblMbiemri;
    private javax.swing.JLabel lblMbyllja;
    private javax.swing.JLabel lblMinimizimi;
    private javax.swing.JLabel lblNumri;
    private javax.swing.JLabel lblNumriPersonal;
    private javax.swing.JLabel lblNumriTelefonit;
    private javax.swing.JLabel lblQyteti;
    private javax.swing.JLabel lblRruga;
    private javax.swing.JRadioButton rbtFemer;
    private javax.swing.JRadioButton rbtMashkull;
    private javax.swing.JTextField txtAdresaElektronike;
    private javax.swing.JTextField txtEmri;
    private javax.swing.JTextField txtMbiemri;
    private javax.swing.JTextField txtNumri;
    private javax.swing.JTextField txtNumriPersonal;
    private javax.swing.JTextField txtNumriTelefonit;
    private javax.swing.JTextField txtQyteti;
    private javax.swing.JTextField txtRruga;
    // End of variables declaration//GEN-END:variables
}