/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Manejadores.Manejador_Principal;
import Modulos.Modulo_Principal;
//import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.awt.Color;
import static java.lang.Thread.sleep;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.UIManager;

/**
 *
 * @author INOVATEC
 */
public class Interfaz_Bienvenida extends javax.swing.JFrame {
    private String T;
    private String nombreUsu;
    private int id_usu;
 
    /**
     * Creates new form Principal
     */
    public Interfaz_Bienvenida(String T,String nombreUsu,int id_usu) {
        this.T = T;
        this.nombreUsu = nombreUsu;
        this.id_usu = id_usu;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setUndecorated(true);
        initComponents();
        IniciarCarga();
        mostrarCarga();
        setLocationRelativeTo(this);
        pack();
        this.getContentPane().setBackground(new Color(223, 223, 223));

    }

    private void IniciarCarga() {
        new Thread() {
            public void run() {
                int x = 0;
                double y = 0;
                while (x <= 101 && y <= 101) {
                    y += .5;
                    x += y;
                    barra.setValue(x);
                    labporcentaje.setText(x+"%");
                    try {
                        sleep(200);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

        }.start();

    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          

    private void mostrarCarga() {
        progreso().setForeground(Color.green);        
        //progreso().setStringPainted(true);
    }

    public javax.swing.JProgressBar progreso() {
        return barra;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JProgressBar();
        labporcentaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Empresa_Transparente.png")).getImage());
        setMaximumSize(new java.awt.Dimension(547, 319));
        setMinimumSize(new java.awt.Dimension(547, 319));
        setPreferredSize(new java.awt.Dimension(547, 319));
        setSize(new java.awt.Dimension(547, 319));
        getContentPane().setLayout(null);

        barra.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraStateChanged(evt);
            }
        });
        getContentPane().add(barra);
        barra.setBounds(0, 300, 547, 19);

        labporcentaje.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        labporcentaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labporcentaje.setText("1");
        getContentPane().add(labporcentaje);
        labporcentaje.setBounds(230, 270, 90, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_Empresa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, -40, 390, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void barraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraStateChanged

        if (barra.getValue() == 100) {
            this.dispose();
            Interfaz_Principal IP = new Interfaz_Principal();
            Modulo_Principal MP = new Modulo_Principal(T,nombreUsu,id_usu);
            Manejador_Principal MAP = new Manejador_Principal(IP, MP);
            IP.setVisible(true);
        }

    }//GEN-LAST:event_barraStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labporcentaje;
    // End of variables declaration//GEN-END:variables
}
