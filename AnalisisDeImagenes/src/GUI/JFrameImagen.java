/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Roberto Cruz Leija
 */
public class JFrameImagen extends javax.swing.JFrame {
    
    /**
     * Creates new form JFrameImagen
     */
    public JFrameImagen(Image imagenOriginal) {
        initComponents();
        // agregamos la imagen como icono en el jlabelimagen
        this.jLabelImagen.setIcon(new ImageIcon(imagenOriginal));
        setVisible(true);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelImagen)
                .addGap(0, 633, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelImagen)
                .addGap(0, 281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelImagen;
    // End of variables declaration//GEN-END:variables
}
