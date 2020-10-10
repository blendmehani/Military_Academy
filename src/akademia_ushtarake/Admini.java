/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akademia_ushtarake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.sql.DriverManager;
/**
 *
 * @author Blendi
 */
public class Admini extends javax.swing.JFrame {
 Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
 int xMouse;
 int yMouse;
    /**
     * Creates new form Admini
     */
    public Admini() {
        initComponents();
        this.setSize(screen.width, screen.height);
        FillAplikuesit();
        FillUshtaret();
        jPanelUshtaret.setVisible(false);
    }
    public static JTable listAplikuesit(JTable table) throws SQLException {
        Connection connection = null;
        Statement stmt = null;
        
        ResultSet rs = null;
        try{
            String SQL_LIST = "select A.AplikuesiId, A.EmriA, A.MbiemriA, A.DataLindjesA, A.GjiniaA, A.NrPersonalA, A.NrTelefonitA, A.EmailAdresaA, A.AdresaA.Qyteti, A.AdresaA.Rruga,  A.AdresaA.Numri from Aplikuesit A ORDER BY AplikuesiId DESC";
            connection = OracleDBConfig.getConnection();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(SQL_LIST);
            
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            
            while (rs.next()){
                int AplikuesiId = rs.getInt("AplikuesiId");
                String Emri = rs.getString("EmriA");
                String Mbiemri = rs.getString("MbiemriA");
                Date DataLindjes = rs.getDate("DataLindjesA");
                String Gjinia = rs.getString("GjiniaA");
                int NrPersonal = rs.getInt("NrPersonalA");
                String NrTelefonit = rs.getString("NrTelefonitA");
                String EmailAdresa = rs.getString("EmailAdresaA");
                String Qyteti = rs.getString("AdresaA.Qyteti");
                String Rruga = rs.getString("AdresaA.Rruga");
                int Numri =rs.getInt("AdresaA.Numri");
                
                dtm.addRow(new Object[]{AplikuesiId, Emri, Mbiemri, DataLindjes, Gjinia, NrPersonal, NrTelefonit, EmailAdresa, Qyteti+", "+Rruga+", "+Numri});
                
            }
            
        }
        catch(SQLException sql_ex){
            sql_ex.printStackTrace();
        }
        finally{
            if (connection !=null){
                connection.close();
            }
            if(stmt !=null){
                stmt.close();
            }
        }
        
        return table;
    }
    private void FillAplikuesit(){
        try{
            Admini.listAplikuesit(tblAplikuesit);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ka deshtuar Listimi", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static JTable listUshtaret(JTable table) throws SQLException {
        Connection connection = null;
        Statement stmt = null;
        
        ResultSet rs = null;
        try{
            String SQL_LIST = "select U.UshtariId, U.FjalekalimiU, U.EmriU, U.MbiemriU, U.DataLindjesU, U.GjiniaU, U.NrPersonalU, U.NrTelefonitU, U.EmailAdresaU, U.AdresaU.Qyteti, U.AdresaU.Rruga,  U.AdresaU.Numri, PozitaU from Ushtaret U ORDER BY UshtariId DESC";
            connection = OracleDBConfig.getConnection();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(SQL_LIST);
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            
            while (rs.next()){
                int UshtariId = rs.getInt("UshtariId");
                String Fjalekalimi = rs.getString("FjalekalimiU");
                String Emri = rs.getString("EmriU");
                String Mbiemri = rs.getString("MbiemriU");
                Date DataLindjes = rs.getDate("DataLindjesU");
                String Gjinia = rs.getString("GjiniaU");
                int NrPersonal = rs.getInt("NrPersonalU");
                String NrTelefonit = rs.getString("NrTelefonitU");
                String EmailAdresa = rs.getString("EmailAdresau");
                String Qyteti = rs.getString("AdresaU.Qyteti");
                String Rruga = rs.getString("AdresaU.Rruga");
                int Numri =rs.getInt("AdresaU.Numri");
                String Pozita=rs.getString("PozitaU");
                
                dtm.addRow(new Object[]{UshtariId, Fjalekalimi, Emri, Mbiemri, DataLindjes, Gjinia, NrPersonal, NrTelefonit, EmailAdresa, Qyteti+", "+Rruga+", "+Numri, Pozita});
                
            }
            
        }
        catch(SQLException sql_ex){
            sql_ex.printStackTrace();
        }
        finally{
            if (connection !=null){
                connection.close();
            }
            if(stmt !=null){
                stmt.close();
            }
        }
        
        return table;
    }
    private void FillUshtaret(){
        try{
            Admini.listUshtaret(tblUshtaret);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ka deshtuar Listimi", "Error", JOptionPane.ERROR_MESSAGE);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMbyllja = new javax.swing.JLabel();
        lblMinimizimi = new javax.swing.JLabel();
        jPanelAplikuesit = new javax.swing.JPanel();
        scrAplikuesit = new javax.swing.JScrollPane();
        tblAplikuesit = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblhead1 = new javax.swing.JLabel();
        lblhead2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNumriPersonal = new javax.swing.JLabel();
        txtNumriPersonal = new javax.swing.JTextField();
        lblVerifikoNumrinPersonal = new javax.swing.JLabel();
        txtVerifikoNumrinPersonal = new javax.swing.JTextField();
        btnRegjistro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDil = new javax.swing.JButton();
        jPanelUshtaret = new javax.swing.JPanel();
        scrUshtaret = new javax.swing.JScrollPane();
        tblUshtaret = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtFjalekalimiRi = new javax.swing.JTextField();
        lblNgritZbritNgritUshtarin = new javax.swing.JLabel();
        lblIdPozita = new javax.swing.JLabel();
        txtIdPozita = new javax.swing.JTextField();
        lblPozita = new javax.swing.JLabel();
        cmbPozita = new javax.swing.JComboBox<>();
        btnRuajPoziten = new javax.swing.JButton();
        lblFshijUshtarin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNdryshoFjalekalimin = new javax.swing.JLabel();
        lblFjalekalimiRi = new javax.swing.JLabel();
        txtIdFjalekalimi = new javax.swing.JTextField();
        lblIdFjalekalimi = new javax.swing.JLabel();
        btnRuajFjalekalimin = new javax.swing.JButton();
        txtIdFshij = new javax.swing.JTextField();
        btnRuajFshirjen = new javax.swing.JButton();
        lblIdFshij = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tglAplikuesit = new javax.swing.JToggleButton();
        tglUshtaret = new javax.swing.JToggleButton();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Miresevini");

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
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1417, Short.MAX_VALUE)
                .addComponent(lblMinimizimi)
                .addGap(18, 18, 18)
                .addComponent(lblMbyllja)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMbyllja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMinimizimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, -10, 1950, 90);

        jPanelAplikuesit.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(""), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanelAplikuesit.setOpaque(false);
        jPanelAplikuesit.setLayout(null);

        scrAplikuesit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scrAplikuesit.setOpaque(false);
        scrAplikuesit.getViewport().setOpaque(false);

        tblAplikuesit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblAplikuesit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nr", "Emri", "Mbiemri", "Data e Lindjes", "Gjinia", "Nr Personal", "Nr Telefonit", "Adresa Elektronike", "Adresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAplikuesit.setGridColor(new java.awt.Color(0, 0, 0));
        tblAplikuesit.setOpaque(false);
        tblAplikuesit.setSelectionBackground(new java.awt.Color(0, 153, 153));
        //tblAplikuesit.setGridColor(new java.awt.Color(100, 100, 100));
        //tblAplikuesit.setBackground(new java.awt.Color(100, 100, 100));
        tblAplikuesit.setRowHeight(30);
        tblAplikuesit.setShowHorizontalLines(true);
        tblAplikuesit.setShowVerticalLines(true);
        tblAplikuesit.getTableHeader().setFont(new java.awt.Font("Tahome", 0, 20));
        tblAplikuesit.getTableHeader().setBackground(new java.awt.Color(0, 0, 0));
        TableCellRenderer rendererFromHeader = tblAplikuesit.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        scrAplikuesit.setViewportView(tblAplikuesit);
        if (tblAplikuesit.getColumnModel().getColumnCount() > 0) {
            tblAplikuesit.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblAplikuesit.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblAplikuesit.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblAplikuesit.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblAplikuesit.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblAplikuesit.getColumnModel().getColumn(5).setPreferredWidth(40);
            tblAplikuesit.getColumnModel().getColumn(6).setPreferredWidth(70);
            tblAplikuesit.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblAplikuesit.getColumnModel().getColumn(8).setPreferredWidth(120);
        }
        tblAplikuesit.setFont(new java.awt.Font("Times New Roman", 0, 15));

        jPanelAplikuesit.add(scrAplikuesit);
        scrAplikuesit.setBounds(470, 120, 1380, 630);
        //jScrollPane1.setBackground(new java.awt.Color(255, 255, 255, 0));
        scrAplikuesit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikuesit");
        jPanelAplikuesit.add(jLabel1);
        jLabel1.setBounds(490, 70, 440, 40);

        lblhead1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblhead1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhead1.setText("<html><p>si Ushtare</p></html>");
        jPanelAplikuesit.add(lblhead1);
        lblhead1.setBounds(70, 170, 330, 50);

        lblhead2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblhead2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhead2.setText("<html><p>Regjistro Aplikuesin</p></html>");
        jPanelAplikuesit.add(lblhead2);
        lblhead2.setBounds(70, 130, 330, 50);

        jLabel4.setOpaque(true);
        jPanelAplikuesit.add(jLabel4);
        jLabel4.setBounds(30, 120, 420, 110);

        lblNumriPersonal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNumriPersonal.setForeground(new java.awt.Color(255, 255, 255));
        lblNumriPersonal.setText("Numri Personal");
        jPanelAplikuesit.add(lblNumriPersonal);
        lblNumriPersonal.setBounds(70, 420, 140, 20);

        txtNumriPersonal.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtNumriPersonal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtNumriPersonal.setForeground(new java.awt.Color(255, 255, 255));
        txtNumriPersonal.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtNumriPersonal.setSelectionColor(new java.awt.Color(0, 102, 102));
        jPanelAplikuesit.add(txtNumriPersonal);
        txtNumriPersonal.setBounds(70, 450, 330, 50);

        lblVerifikoNumrinPersonal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblVerifikoNumrinPersonal.setForeground(new java.awt.Color(255, 255, 255));
        lblVerifikoNumrinPersonal.setText("Verifiko Numrin Personal");
        jPanelAplikuesit.add(lblVerifikoNumrinPersonal);
        lblVerifikoNumrinPersonal.setBounds(70, 530, 200, 19);

        txtVerifikoNumrinPersonal.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtVerifikoNumrinPersonal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtVerifikoNumrinPersonal.setForeground(new java.awt.Color(255, 255, 255));
        txtVerifikoNumrinPersonal.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtVerifikoNumrinPersonal.setSelectionColor(new java.awt.Color(0, 102, 102));
        jPanelAplikuesit.add(txtVerifikoNumrinPersonal);
        txtVerifikoNumrinPersonal.setBounds(70, 560, 330, 50);

        btnRegjistro.setBackground(new java.awt.Color(51, 51, 51));
        btnRegjistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 25)); // NOI18N
        btnRegjistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegjistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/akademia_ushtarake/images/apliko.png"))); // NOI18N
        btnRegjistro.setText("Regjistro");
        btnRegjistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegjistro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRegjistro.setIconTextGap(20);
        btnRegjistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegjistroActionPerformed(evt);
            }
        });
        jPanelAplikuesit.add(btnRegjistro);
        btnRegjistro.setBounds(70, 630, 330, 73);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelAplikuesit.add(jLabel3);
        jLabel3.setBounds(30, 120, 420, 630);

        btnDil.setBackground(new java.awt.Color(51, 51, 51));
        btnDil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnDil.setForeground(new java.awt.Color(240, 240, 240));
        btnDil.setText("Dil");
        btnDil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDil.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnDil.setIconTextGap(20);
        btnDil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDilMouseClicked(evt);
            }
        });
        btnDil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDilActionPerformed(evt);
            }
        });
        jPanelAplikuesit.add(btnDil);
        btnDil.setBounds(1720, 10, 150, 30);

        getContentPane().add(jPanelAplikuesit);
        jPanelAplikuesit.setBounds(20, 170, 1880, 890);

        jPanelUshtaret.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelUshtaret.setOpaque(false);
        jPanelUshtaret.setLayout(null);

        scrUshtaret.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scrUshtaret.setOpaque(false);
        scrUshtaret.getViewport().setOpaque(false);

        tblUshtaret.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblUshtaret.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fjalekalimi", "Emri", "Mbiemri", "Data e Lindjes", "Gjinia", "Nr Personal", "Nr Telefonit", "Adresa Elektronike", "Adresa", "Pozita"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUshtaret.setGridColor(new java.awt.Color(0, 0, 0));
        tblUshtaret.setOpaque(false);
        tblUshtaret.setSelectionBackground(new java.awt.Color(0, 153, 153));
        //tblAplikuesit.setGridColor(new java.awt.Color(100, 100, 100));
        //tblAplikuesit.setBackground(new java.awt.Color(100, 100, 100));
        tblUshtaret.setRowHeight(30);
        tblUshtaret.setShowHorizontalLines(true);
        tblUshtaret.setShowVerticalLines(true);
        tblUshtaret.getTableHeader().setFont(new java.awt.Font("Tahome", 0, 20));
        tblUshtaret.getTableHeader().setBackground(new java.awt.Color(0, 0, 0));
        TableCellRenderer rendererFromHeader1 = tblUshtaret.getTableHeader().getDefaultRenderer();
        JLabel headerLabel1 = (JLabel) rendererFromHeader1;
        headerLabel1.setHorizontalAlignment(JLabel.CENTER);
        scrUshtaret.setViewportView(tblUshtaret);
        if (tblUshtaret.getColumnModel().getColumnCount() > 0) {
            tblUshtaret.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblUshtaret.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblUshtaret.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblUshtaret.getColumnModel().getColumn(4).setPreferredWidth(90);
            tblUshtaret.getColumnModel().getColumn(5).setPreferredWidth(10);
            tblUshtaret.getColumnModel().getColumn(6).setPreferredWidth(50);
            tblUshtaret.getColumnModel().getColumn(7).setPreferredWidth(70);
            tblUshtaret.getColumnModel().getColumn(8).setPreferredWidth(100);
            tblUshtaret.getColumnModel().getColumn(9).setPreferredWidth(120);
            tblUshtaret.getColumnModel().getColumn(10).setPreferredWidth(20);
        }
        tblUshtaret.setFont(new java.awt.Font("Times New Roman", 0, 15));

        jPanelUshtaret.add(scrUshtaret);
        scrUshtaret.setBounds(450, 50, 1400, 770);
        //jScrollPane1.setBackground(new java.awt.Color(255, 255, 255, 0));
        scrUshtaret.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ushtaret");
        jPanelUshtaret.add(jLabel5);
        jLabel5.setBounds(490, 10, 440, 40);

        txtFjalekalimiRi.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtFjalekalimiRi.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtFjalekalimiRi.setForeground(new java.awt.Color(255, 255, 255));
        txtFjalekalimiRi.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtFjalekalimiRi.setSelectionColor(new java.awt.Color(0, 102, 102));
        jPanelUshtaret.add(txtFjalekalimiRi);
        txtFjalekalimiRi.setBounds(90, 670, 270, 40);

        lblNgritZbritNgritUshtarin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNgritZbritNgritUshtarin.setForeground(new java.awt.Color(255, 255, 255));
        lblNgritZbritNgritUshtarin.setText("Ngrit/Zbrit nga detyra ushtarin");
        jPanelUshtaret.add(lblNgritZbritNgritUshtarin);
        lblNgritZbritNgritUshtarin.setBounds(90, 60, 320, 30);

        lblIdPozita.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblIdPozita.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPozita.setText("Id e Ushtarit");
        jPanelUshtaret.add(lblIdPozita);
        lblIdPozita.setBounds(90, 100, 260, 30);

        txtIdPozita.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtIdPozita.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtIdPozita.setForeground(new java.awt.Color(255, 255, 255));
        txtIdPozita.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtIdPozita.setSelectionColor(new java.awt.Color(0, 102, 102));
        jPanelUshtaret.add(txtIdPozita);
        txtIdPozita.setBounds(90, 130, 270, 40);

        lblPozita.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblPozita.setForeground(new java.awt.Color(255, 255, 255));
        lblPozita.setText("Pozita");
        jPanelUshtaret.add(lblPozita);
        lblPozita.setBounds(90, 170, 260, 30);

        cmbPozita.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbPozita.setForeground(new java.awt.Color(255, 255, 255));
        cmbPozita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ushtar", "Tetar", "Rreshter", "Kapter", "Rreshter Major", "Rreshter I Pare" }));
        cmbPozita.setToolTipText("");
        cmbPozita.setOpaque(false);
        jPanelUshtaret.add(cmbPozita);
        cmbPozita.setBounds(90, 200, 270, 30);
        cmbPozita.setBackground(new java.awt.Color(255, 255, 255 ));

        btnRuajPoziten.setBackground(new java.awt.Color(51, 51, 51));
        btnRuajPoziten.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnRuajPoziten.setForeground(new java.awt.Color(255, 255, 255));
        btnRuajPoziten.setText("Ruaj");
        btnRuajPoziten.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRuajPoziten.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRuajPoziten.setIconTextGap(20);
        btnRuajPoziten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuajPozitenActionPerformed(evt);
            }
        });
        jPanelUshtaret.add(btnRuajPoziten);
        btnRuajPoziten.setBounds(90, 240, 270, 40);

        lblFshijUshtarin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFshijUshtarin.setForeground(new java.awt.Color(255, 255, 255));
        lblFshijUshtarin.setText("Fshij Ushtarin");
        jPanelUshtaret.add(lblFshijUshtarin);
        lblFshijUshtarin.setBounds(90, 320, 250, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelUshtaret.add(jLabel7);
        jLabel7.setBounds(40, 50, 380, 250);

        lblNdryshoFjalekalimin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNdryshoFjalekalimin.setForeground(new java.awt.Color(255, 255, 255));
        lblNdryshoFjalekalimin.setText("Ndrysho Fjalekalimin e ushtarit");
        jPanelUshtaret.add(lblNdryshoFjalekalimin);
        lblNdryshoFjalekalimin.setBounds(90, 520, 310, 40);

        lblFjalekalimiRi.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblFjalekalimiRi.setForeground(new java.awt.Color(255, 255, 255));
        lblFjalekalimiRi.setText("Fjalekalimi i ri");
        jPanelUshtaret.add(lblFjalekalimiRi);
        lblFjalekalimiRi.setBounds(90, 640, 260, 30);

        txtIdFjalekalimi.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtIdFjalekalimi.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtIdFjalekalimi.setForeground(new java.awt.Color(255, 255, 255));
        txtIdFjalekalimi.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtIdFjalekalimi.setSelectionColor(new java.awt.Color(0, 102, 102));
        jPanelUshtaret.add(txtIdFjalekalimi);
        txtIdFjalekalimi.setBounds(90, 600, 270, 40);

        lblIdFjalekalimi.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblIdFjalekalimi.setForeground(new java.awt.Color(255, 255, 255));
        lblIdFjalekalimi.setText("Id e Ushtarit");
        jPanelUshtaret.add(lblIdFjalekalimi);
        lblIdFjalekalimi.setBounds(90, 570, 260, 30);

        btnRuajFjalekalimin.setBackground(new java.awt.Color(51, 51, 51));
        btnRuajFjalekalimin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnRuajFjalekalimin.setForeground(new java.awt.Color(255, 255, 255));
        btnRuajFjalekalimin.setText("Ruaj");
        btnRuajFjalekalimin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRuajFjalekalimin.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRuajFjalekalimin.setIconTextGap(20);
        btnRuajFjalekalimin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuajFjalekaliminActionPerformed(evt);
            }
        });
        jPanelUshtaret.add(btnRuajFjalekalimin);
        btnRuajFjalekalimin.setBounds(90, 720, 270, 40);

        txtIdFshij.setBackground(new java.awt.Color(255, 255, 255, 0));
        txtIdFshij.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtIdFshij.setForeground(new java.awt.Color(255, 255, 255));
        txtIdFshij.setMargin(new java.awt.Insets(2, 15, 2, 2));
        txtIdFshij.setSelectionColor(new java.awt.Color(0, 102, 102));
        jPanelUshtaret.add(txtIdFshij);
        txtIdFshij.setBounds(90, 390, 270, 40);

        btnRuajFshirjen.setBackground(new java.awt.Color(51, 51, 51));
        btnRuajFshirjen.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnRuajFshirjen.setForeground(new java.awt.Color(255, 255, 255));
        btnRuajFshirjen.setText("Ruaj");
        btnRuajFshirjen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRuajFshirjen.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRuajFshirjen.setIconTextGap(20);
        btnRuajFshirjen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuajFshirjenActionPerformed(evt);
            }
        });
        jPanelUshtaret.add(btnRuajFshirjen);
        btnRuajFshirjen.setBounds(90, 440, 270, 40);

        lblIdFshij.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblIdFshij.setForeground(new java.awt.Color(255, 255, 255));
        lblIdFshij.setText("Id e Ushtarit");
        jPanelUshtaret.add(lblIdFshij);
        lblIdFshij.setBounds(90, 360, 260, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelUshtaret.add(jLabel8);
        jLabel8.setBounds(40, 510, 380, 310);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelUshtaret.add(jLabel9);
        jLabel9.setBounds(40, 310, 380, 190);

        getContentPane().add(jPanelUshtaret);
        jPanelUshtaret.setBounds(20, 170, 1880, 890);

        buttonGroup1.add(tglAplikuesit);
        tglAplikuesit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tglAplikuesit.setSelected(true);
        tglAplikuesit.setText("Aplikuesit");
        tglAplikuesit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tglAplikuesit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglAplikuesitActionPerformed(evt);
            }
        });
        getContentPane().add(tglAplikuesit);
        tglAplikuesit.setBounds(20, 130, 130, 40);

        buttonGroup1.add(tglUshtaret);
        tglUshtaret.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tglUshtaret.setText("Ushtaret");
        tglUshtaret.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tglUshtaret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglUshtaretActionPerformed(evt);
            }
        });
        getContentPane().add(tglUshtaret);
        tglUshtaret.setBounds(150, 130, 140, 40);

        lblBg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Blendi\\Desktop\\dark.jpg")); // NOI18N
        getContentPane().add(lblBg);
        lblBg.setBounds(0, -90, 1920, 1270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMbylljaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMbylljaMouseClicked
        System.exit(0);
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

    private void tglAplikuesitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglAplikuesitActionPerformed
    if(tglAplikuesit.isSelected()){
        jPanelAplikuesit.setVisible(true);
        jPanelUshtaret.setVisible(false);
    }
    
    

    }//GEN-LAST:event_tglAplikuesitActionPerformed

    private void tglUshtaretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglUshtaretActionPerformed
        if(tglUshtaret.isSelected())
            jPanelUshtaret.setVisible(true);
        jPanelAplikuesit.setVisible(false);
        
    }//GEN-LAST:event_tglUshtaretActionPerformed

    private void btnRegjistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegjistroActionPerformed
        if(txtNumriPersonal.getText().equals(txtVerifikoNumrinPersonal.getText()))
        {
        Connection connection = null;
        Statement stmt = null;
        
        ResultSet rs = null;
        
        try{
            String pozita="Ushtar";
            String sql="Insert into Ushtaret(FjalekalimiU, EmriU, MbiemriU, DataLindjesU, GjiniaU, NrPersonalU, NrTelefonitU, EmailAdresaU, AdresaU) Select NrPersonalA as x1, EmriA, MbiemriA, DataLindjesA, GjiniaA, NrPersonalA as x2, NrTelefonitA, EmailAdresaA, A.AdresaA From Aplikuesit A  Where NrPersonalA ="+txtNumriPersonal.getText()+"";
            connection =OracleDBConfig.getConnection();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel)listUshtaret(tblUshtaret).getModel();
            model.setRowCount(0);         
            FillUshtaret();
         
       
            
            
           
                JOptionPane.showMessageDialog(this,"Aplikuesi u regjistrua, si ushtar");
            
            
            
            
        }
        catch(SQLException sql_ex){
            sql_ex.printStackTrace();
        }
           
        }
        else
            JOptionPane.showMessageDialog(null, "Verifikoni Numrin Personal", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnRegjistroActionPerformed

    private void btnRuajPozitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuajPozitenActionPerformed
        Connection connection = null;
        Statement stmt = null;
        
        ResultSet rs = null;
        
        try{
            String sql="Update Ushtaret set PozitaU='"+cmbPozita.getSelectedItem()+"' Where UshtariId="+txtIdPozita.getText()+"";
            
            connection = OracleDBConfig.getConnection();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            
            
           
                JOptionPane.showMessageDialog(this,"Ushtari u ngrit/zbrit nga pozita");
            
            
            
            
        }
        catch(SQLException sql_ex){
            sql_ex.printStackTrace();
        }
           
        
   
        
    }//GEN-LAST:event_btnRuajPozitenActionPerformed

    private void btnRuajFshirjenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuajFshirjenActionPerformed
            Connection connection = null;
        Statement stmt = null;
        
        ResultSet rs = null;
        
        try{
            String sql="Delete from Ushtaret where UshtariId="+txtIdFshij.getText()+"";
            
            connection = OracleDBConfig.getConnection();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            
            
            DefaultTableModel model = (DefaultTableModel)listUshtaret(tblUshtaret).getModel();
            model.setRowCount(0);         
            FillUshtaret();
            
           
                JOptionPane.showMessageDialog(this,"Ushtari u fshi");
            
            
            
            
        }
        catch(SQLException sql_ex){
            sql_ex.printStackTrace();
        }
       
        
        
    }//GEN-LAST:event_btnRuajFshirjenActionPerformed

    private void btnRuajFjalekaliminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuajFjalekaliminActionPerformed
         Connection connection = null;
        Statement stmt = null;
        
        ResultSet rs = null;
        
        try{
            String sql="Update Ushtaret set FjalekalimiU='"+txtFjalekalimiRi.getText()+"' where UshtariId="+txtIdFjalekalimi.getText()+"";
            
            connection = OracleDBConfig.getConnection();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            
            txtFjalekalimiRi.setText(null);
            txtIdFjalekalimi.setText(null);
            
            DefaultTableModel model = (DefaultTableModel)listUshtaret(tblUshtaret).getModel();
            model.setRowCount(0);         
            FillUshtaret();
            
           
                JOptionPane.showMessageDialog(this,"Fjalekalimi u nderrua");
            
            
            
            
        }
        catch(SQLException sql_ex){
            sql_ex.printStackTrace();
        }
       
        
    }//GEN-LAST:event_btnRuajFjalekaliminActionPerformed

    private void btnDilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDilMouseClicked

    private void btnDilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDilActionPerformed
        this.dispose();
        Ballina A= new Ballina();
        A.setVisible(true);
    }//GEN-LAST:event_btnDilActionPerformed

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
            java.util.logging.Logger.getLogger(Admini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDil;
    private javax.swing.JButton btnRegjistro;
    private javax.swing.JButton btnRuajFjalekalimin;
    private javax.swing.JButton btnRuajFshirjen;
    private javax.swing.JButton btnRuajPoziten;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbPozita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAplikuesit;
    private javax.swing.JPanel jPanelUshtaret;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblFjalekalimiRi;
    private javax.swing.JLabel lblFshijUshtarin;
    private javax.swing.JLabel lblIdFjalekalimi;
    private javax.swing.JLabel lblIdFshij;
    private javax.swing.JLabel lblIdPozita;
    private javax.swing.JLabel lblMbyllja;
    private javax.swing.JLabel lblMinimizimi;
    private javax.swing.JLabel lblNdryshoFjalekalimin;
    private javax.swing.JLabel lblNgritZbritNgritUshtarin;
    private javax.swing.JLabel lblNumriPersonal;
    private javax.swing.JLabel lblPozita;
    private javax.swing.JLabel lblVerifikoNumrinPersonal;
    private javax.swing.JLabel lblhead1;
    private javax.swing.JLabel lblhead2;
    private javax.swing.JScrollPane scrAplikuesit;
    private javax.swing.JScrollPane scrUshtaret;
    private javax.swing.JTable tblAplikuesit;
    private javax.swing.JTable tblUshtaret;
    private javax.swing.JToggleButton tglAplikuesit;
    private javax.swing.JToggleButton tglUshtaret;
    private javax.swing.JTextField txtFjalekalimiRi;
    private javax.swing.JTextField txtIdFjalekalimi;
    private javax.swing.JTextField txtIdFshij;
    private javax.swing.JTextField txtIdPozita;
    private javax.swing.JTextField txtNumriPersonal;
    private javax.swing.JTextField txtVerifikoNumrinPersonal;
    // End of variables declaration//GEN-END:variables
}
