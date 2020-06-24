package Interfaces;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;

/**
 *
 * @author INOVATEC
 * 
* DECLARACIÓN DE VARIABLES - vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
*/
public class Interfaz_Principal extends javax.swing.JFrame implements Runnable{
    public char Tipo_Usuario;
    public Interfaz_Inventario INN = new Interfaz_Inventario();
    public Interfaz_Documentacion IDD = new Interfaz_Documentacion();
    public Interfaz_Venta IVV = new Interfaz_Venta();
    public Interfaz_Registro IRR = new Interfaz_Registro();
/**
* DECLARACIÓN DE VARIABLES - ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
*/        
        
    /**
     * Creates new form Principal
     */
    public Interfaz_Principal(){
        IniCom();
        lblFecha.setText(fechaSystem());
        h1=new Thread(this);
        h1.start();
    }
    
    public void IniCom(){
        initComponents();
        this.setSize(1285, 740);
        this.setExtendedState(this.MAXIMIZED_BOTH);        
        this.getContentPane().setBackground(new Color(223, 223, 223));
        Jpanel_Botones.setBackground(new Color(223, 223 ,223));
        JPanel_Principal.setBackground(new Color(223, 223, 223));
        jPanel1.setBackground(new Color(223, 223, 223));
        /*99; 208; 205*/
        Ventana_JPanelPrincipal.add(INN);
        Ventana_JPanelPrincipal.add(IRR);
        Ventana_JPanelPrincipal.add(IDD);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel_Botones = new javax.swing.JPanel();
        btn_VentanaDocumentos = new javax.swing.JButton();
        btn_AbrirCaja = new javax.swing.JButton();
        btn_VentanaRegistrarProducto = new javax.swing.JButton();
        btn_CerrarSesion = new javax.swing.JButton();
        btn_VentanaInventario = new javax.swing.JButton();
        btn_VentanaNuevaVenta = new javax.swing.JButton();
        btn_CerrarCaja = new javax.swing.JButton();
        btn_CrearUsuario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JPanel_Principal = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        Ventana_JPanelPrincipal = new javax.swing.JDesktopPane();
        lbl_IconoEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VentaTec - Abarrotes \"Los Ayala\"");
        setBackground(new java.awt.Color(177, 216, 211));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Empresa_Transparente.png")).getImage());
        setSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        Jpanel_Botones.setBackground(new java.awt.Color(51, 204, 0));
        Jpanel_Botones.setForeground(new java.awt.Color(102, 255, 102));
        Jpanel_Botones.setLayout(null);

        btn_VentanaDocumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_Documentos.png"))); // NOI18N
        btn_VentanaDocumentos.setText("Documentos");
        btn_VentanaDocumentos.setName("btn_Rendimiento"); // NOI18N
        Jpanel_Botones.add(btn_VentanaDocumentos);
        btn_VentanaDocumentos.setBounds(10, 300, 198, 86);

        btn_AbrirCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/CAJAGUARDAR.png"))); // NOI18N
        btn_AbrirCaja.setName("btn_Usuarios"); // NOI18N
        Jpanel_Botones.add(btn_AbrirCaja);
        btn_AbrirCaja.setBounds(2, 11, 100, 84);

        btn_VentanaRegistrarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_RegistrarProducto.png"))); // NOI18N
        btn_VentanaRegistrarProducto.setText("Registrar Producto");
        btn_VentanaRegistrarProducto.setName("btn_RegistrarProducto"); // NOI18N
        Jpanel_Botones.add(btn_VentanaRegistrarProducto);
        btn_VentanaRegistrarProducto.setBounds(10, 200, 198, 85);

        btn_CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_Salir.png"))); // NOI18N
        btn_CerrarSesion.setText("Cerrar Sesión");
        btn_CerrarSesion.setToolTipText("Salir");
        btn_CerrarSesion.setName("btn_CerrarSesion"); // NOI18N
        Jpanel_Botones.add(btn_CerrarSesion);
        btn_CerrarSesion.setBounds(10, 600, 198, 89);

        btn_VentanaInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_Inventario.png"))); // NOI18N
        btn_VentanaInventario.setText("Inventario");
        btn_VentanaInventario.setToolTipText("Facturas & Recibos");
        btn_VentanaInventario.setName("btn_Recibos"); // NOI18N
        Jpanel_Botones.add(btn_VentanaInventario);
        btn_VentanaInventario.setBounds(10, 400, 198, 93);

        btn_VentanaNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_NuevaVenta.png"))); // NOI18N
        btn_VentanaNuevaVenta.setText("Nueva Venta!");
        btn_VentanaNuevaVenta.setToolTipText("");
        btn_VentanaNuevaVenta.setEnabled(false);
        btn_VentanaNuevaVenta.setName("btn_NuevaVenta"); // NOI18N
        Jpanel_Botones.add(btn_VentanaNuevaVenta);
        btn_VentanaNuevaVenta.setBounds(10, 100, 200, 89);

        btn_CerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/CERRARCAJA_1.png"))); // NOI18N
        btn_CerrarCaja.setEnabled(false);
        btn_CerrarCaja.setName("btn_Usuarios"); // NOI18N
        Jpanel_Botones.add(btn_CerrarCaja);
        btn_CerrarCaja.setBounds(110, 10, 100, 84);

        btn_CrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/inicioseses.png"))); // NOI18N
        btn_CrearUsuario.setText("Crear Usuario");
        Jpanel_Botones.add(btn_CrearUsuario);
        btn_CrearUsuario.setBounds(10, 500, 198, 87);

        getContentPane().add(Jpanel_Botones);
        Jpanel_Botones.setBounds(8, 0, 210, 700);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        JPanel_Principal.setBackground(new java.awt.Color(0, 255, 0));
        JPanel_Principal.setLayout(null);

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JPanel_Principal.add(lblHora);
        lblHora.setBounds(860, 610, 160, 30);

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JPanel_Principal.add(lblFecha);
        lblFecha.setBounds(860, 650, 160, 30);

        lbl_IconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/background.jpg"))); // NOI18N

        Ventana_JPanelPrincipal.setLayer(lbl_IconoEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Ventana_JPanelPrincipalLayout = new javax.swing.GroupLayout(Ventana_JPanelPrincipal);
        Ventana_JPanelPrincipal.setLayout(Ventana_JPanelPrincipalLayout);
        Ventana_JPanelPrincipalLayout.setHorizontalGroup(
            Ventana_JPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_JPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IconoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        Ventana_JPanelPrincipalLayout.setVerticalGroup(
            Ventana_JPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_JPanelPrincipalLayout.createSequentialGroup()
                .addComponent(lbl_IconoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        JPanel_Principal.add(Ventana_JPanelPrincipal);
        Ventana_JPanelPrincipal.setBounds(-30, 0, 1280, 771);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 0, 1030, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      if (showConfirmDialog(rootPane, "¿Desea salir del sistema?",
            "Salir del sistema", YES_NO_OPTION) == YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Principal ppp = new Interfaz_Principal();
                ppp.setVisible(true);
                //ppp.IniCom();
            }
        });
    }
    
    String H,M,S,AMPM;
    Calendar  calendario;
    Thread h1;        
    public void run() {
        Thread ct=Thread.currentThread();
        while(ct==h1){
           calcula();
           lblHora.setText(H+":"+M+":"+S + " "+AMPM);
           JPanel_Principal.repaint();
           try{
               Thread.sleep(1000);
           }catch(InterruptedException e){}
        }
    }   
    private void calcula() {
        Calendar calendar=new GregorianCalendar();
        Date fechaHoraActual=new Date();
        calendar.setTime(fechaHoraActual);
        AMPM=calendar.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(AMPM.equals("AM")){
            H=calendar.get(Calendar.HOUR_OF_DAY)>9?""+
              calendar.get(Calendar.HOUR_OF_DAY):"0"+
              calendar.get(Calendar.HOUR_OF_DAY);
        }else{
            int h=calendar.get(Calendar.HOUR_OF_DAY)-12;
            H=h>9?""+h:"0"+h;
       }
        M=calendar.get(Calendar.MINUTE)>9?""+
          calendar.get(Calendar.MINUTE):"0"+
          calendar.get(Calendar.MINUTE);
        S=calendar.get(Calendar.SECOND)>9?""+
          calendar.get(Calendar.SECOND):"0"+
          calendar.get(Calendar.SECOND);
    
    } 
     //obtener la hora del SYSTEM VENVATEC :vVLSVKDFBJVBJSDBHNVSDJB
     private static String fechaSystem(){
      Date fecha=new Date();
      SimpleDateFormat formatoF= new SimpleDateFormat("dd/MM/YYYY");
      return formatoF.format(fecha);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JPanel_Principal;
    private javax.swing.JPanel Jpanel_Botones;
    public javax.swing.JDesktopPane Ventana_JPanelPrincipal;
    public javax.swing.JButton btn_AbrirCaja;
    public javax.swing.JButton btn_CerrarCaja;
    public javax.swing.JButton btn_CerrarSesion;
    public javax.swing.JButton btn_CrearUsuario;
    public javax.swing.JButton btn_VentanaDocumentos;
    public javax.swing.JButton btn_VentanaInventario;
    public javax.swing.JButton btn_VentanaNuevaVenta;
    public javax.swing.JButton btn_VentanaRegistrarProducto;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHora;
    public javax.swing.JLabel lbl_IconoEmpresa;
    // End of variables declaration//GEN-END:variables
}
