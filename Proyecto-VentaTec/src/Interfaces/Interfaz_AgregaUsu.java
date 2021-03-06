package Interfaces;

/**
 *
 * @author INOVATEC
 */
public class Interfaz_AgregaUsu extends javax.swing.JInternalFrame {

    /**
     * Creates new form Interfaz_AgregaUsu
     */
    public Interfaz_AgregaUsu() {
        initComponents();
        this.setSize(630, 561);
        this.setLocation(200,50);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSubT = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jspTitulo = new javax.swing.JSeparator();
        lblSubT1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        txtNombreCom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblnomuser = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jspNombre = new javax.swing.JSeparator();
        jspID_Prod = new javax.swing.JSeparator();
        jspDescripcion = new javax.swing.JSeparator();
        txtConfirContra = new javax.swing.JTextField();
        lblconfirmar = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        cmbTipoUSU = new javax.swing.JComboBox<>();
        lbldomocilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        jspStock = new javax.swing.JSeparator();
        btnRegresar = new javax.swing.JButton();
        txtNombreUSU = new javax.swing.JTextField();
        jspID_Prod1 = new javax.swing.JSeparator();
        jspStock1 = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblSubT.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblSubT.setForeground(new java.awt.Color(66, 65, 70));
        lblSubT.setText("Nuevo Usuario");
        getContentPane().add(lblSubT);
        lblSubT.setBounds(20, 10, 210, 30);

        lblTitulo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(66, 65, 70));
        lblTitulo.setText("Campos Obligatorios *");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(300, 50, 210, 30);

        jspTitulo.setBackground(new java.awt.Color(99, 99, 101));
        jspTitulo.setForeground(new java.awt.Color(99, 99, 101));
        jspTitulo.setDoubleBuffered(true);
        jspTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jspTitulo.setMinimumSize(new java.awt.Dimension(650, 5));
        jspTitulo.setPreferredSize(new java.awt.Dimension(0, 5));
        getContentPane().add(jspTitulo);
        jspTitulo.setBounds(0, 40, 620, 10);

        lblSubT1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblSubT1.setForeground(new java.awt.Color(66, 65, 70));
        lblSubT1.setText("Información:");
        getContentPane().add(lblSubT1);
        lblSubT1.setBounds(80, 50, 130, 30);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/1.png"))); // NOI18N
        btnGuardar.setText("Guardar Usuario");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGuardar.setContentAreaFilled(false);
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(340, 440, 170, 70);

        lblnombre.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(66, 65, 70));
        lblnombre.setText("Nombre Completo: *");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(70, 90, 150, 30);

        txtNombreCom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreCom.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreCom.setBorder(null);
        txtNombreCom.setOpaque(false);
        txtNombreCom.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        getContentPane().add(txtNombreCom);
        txtNombreCom.setBounds(210, 100, 220, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/UserName_100px.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 50, 130, 120);

        lblnomuser.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblnomuser.setForeground(new java.awt.Color(66, 65, 70));
        lblnomuser.setText("Nombre Usuario: *");
        getContentPane().add(lblnomuser);
        lblnomuser.setBounds(70, 140, 130, 30);

        lblcontraseña.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(66, 65, 70));
        lblcontraseña.setText("Contraseña: *");
        getContentPane().add(lblcontraseña);
        lblcontraseña.setBounds(70, 190, 100, 30);

        txtContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseña.setBorder(null);
        txtContraseña.setOpaque(false);
        txtContraseña.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        getContentPane().add(txtContraseña);
        txtContraseña.setBounds(170, 190, 260, 22);

        jspNombre.setBackground(new java.awt.Color(99, 99, 101));
        jspNombre.setForeground(new java.awt.Color(99, 99, 101));
        jspNombre.setDoubleBuffered(true);
        getContentPane().add(jspNombre);
        jspNombre.setBounds(170, 210, 260, 20);

        jspID_Prod.setBackground(new java.awt.Color(99, 99, 101));
        jspID_Prod.setForeground(new java.awt.Color(99, 99, 101));
        jspID_Prod.setDoubleBuffered(true);
        getContentPane().add(jspID_Prod);
        jspID_Prod.setBounds(210, 120, 220, 20);

        jspDescripcion.setBackground(new java.awt.Color(99, 99, 101));
        jspDescripcion.setForeground(new java.awt.Color(99, 99, 101));
        jspDescripcion.setDoubleBuffered(true);
        getContentPane().add(jspDescripcion);
        jspDescripcion.setBounds(230, 260, 200, 20);

        txtConfirContra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtConfirContra.setForeground(new java.awt.Color(102, 102, 102));
        txtConfirContra.setBorder(null);
        txtConfirContra.setOpaque(false);
        txtConfirContra.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        getContentPane().add(txtConfirContra);
        txtConfirContra.setBounds(230, 240, 200, 22);

        lblconfirmar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblconfirmar.setForeground(new java.awt.Color(66, 65, 70));
        lblconfirmar.setText("Confirmar Contraseña:");
        getContentPane().add(lblconfirmar);
        lblconfirmar.setBounds(70, 240, 180, 30);

        lblCosto.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(66, 65, 70));
        lblCosto.setText("Tipo de Usuario:");
        getContentPane().add(lblCosto);
        lblCosto.setBounds(70, 290, 130, 30);

        lbltelefono.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbltelefono.setForeground(new java.awt.Color(66, 65, 70));
        lbltelefono.setText("Telefono:");
        getContentPane().add(lbltelefono);
        lbltelefono.setBounds(70, 330, 80, 40);

        cmbTipoUSU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbTipoUSU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G", "U" }));
        cmbTipoUSU.setOpaque(false);
        getContentPane().add(cmbTipoUSU);
        cmbTipoUSU.setBounds(220, 290, 50, 28);

        lbldomocilio.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbldomocilio.setForeground(new java.awt.Color(66, 65, 70));
        lbldomocilio.setText("Domicilio:");
        getContentPane().add(lbldomocilio);
        lbldomocilio.setBounds(70, 380, 80, 30);

        txtDomicilio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDomicilio.setForeground(new java.awt.Color(102, 102, 102));
        txtDomicilio.setBorder(null);
        txtDomicilio.setOpaque(false);
        txtDomicilio.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        getContentPane().add(txtDomicilio);
        txtDomicilio.setBounds(140, 390, 290, 20);

        jspStock.setBackground(new java.awt.Color(99, 99, 101));
        jspStock.setForeground(new java.awt.Color(99, 99, 101));
        jspStock.setDoubleBuffered(true);
        getContentPane().add(jspStock);
        jspStock.setBounds(140, 410, 290, 20);

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/10_1.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegresar.setContentAreaFilled(false);
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(120, 440, 160, 70);

        txtNombreUSU.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreUSU.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreUSU.setBorder(null);
        txtNombreUSU.setOpaque(false);
        txtNombreUSU.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        getContentPane().add(txtNombreUSU);
        txtNombreUSU.setBounds(200, 150, 230, 22);

        jspID_Prod1.setBackground(new java.awt.Color(99, 99, 101));
        jspID_Prod1.setForeground(new java.awt.Color(99, 99, 101));
        jspID_Prod1.setDoubleBuffered(true);
        getContentPane().add(jspID_Prod1);
        jspID_Prod1.setBounds(200, 170, 230, 20);

        jspStock1.setBackground(new java.awt.Color(99, 99, 101));
        jspStock1.setForeground(new java.awt.Color(99, 99, 101));
        jspStock1.setDoubleBuffered(true);
        getContentPane().add(jspStock1);
        jspStock1.setBounds(140, 360, 180, 20);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        txtTelefono.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(140, 340, 180, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Interfaz_AgregaUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_AgregaUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_AgregaUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_AgregaUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_AgregaUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JComboBox<String> cmbTipoUSU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jspDescripcion;
    private javax.swing.JSeparator jspID_Prod;
    private javax.swing.JSeparator jspID_Prod1;
    private javax.swing.JSeparator jspNombre;
    private javax.swing.JSeparator jspStock;
    private javax.swing.JSeparator jspStock1;
    private javax.swing.JSeparator jspTitulo;
    public javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblSubT;
    private javax.swing.JLabel lblSubT1;
    public javax.swing.JLabel lblTitulo;
    public javax.swing.JLabel lblconfirmar;
    public javax.swing.JLabel lblcontraseña;
    public javax.swing.JLabel lbldomocilio;
    public javax.swing.JLabel lblnombre;
    public javax.swing.JLabel lblnomuser;
    public javax.swing.JLabel lbltelefono;
    public javax.swing.JTextField txtConfirContra;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtDomicilio;
    public javax.swing.JTextField txtNombreCom;
    public javax.swing.JTextField txtNombreUSU;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
