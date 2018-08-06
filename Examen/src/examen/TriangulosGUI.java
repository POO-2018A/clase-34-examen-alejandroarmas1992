/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class TriangulosGUI extends javax.swing.JFrame {
     List<String> listaFiguras = new ArrayList<String>();
    
     DefaultComboBoxModel listaFigurasModel = 
            new DefaultComboBoxModel(listaFiguras.toArray());

    /**
     * Creates new form TriangulosGUI
     */
    public TriangulosGUI() {
        initComponents();
         listaFigurasModel.addElement("Equilatero");
        listaFigurasModel.addElement("Escaleno");
        listaFigurasModel.addElement("Isosceles");
        listaFigurasModel.addElement("Rectangulo");
        cmbTipoTriangulo.setModel(listaFigurasModel);
        jPanelLados.setVisible(false);
        jPanelResultados.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTipoTriangulo = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        jPanelLados = new javax.swing.JPanel();
        lblLado1 = new javax.swing.JLabel();
        lblLado2 = new javax.swing.JLabel();
        lblLado3 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        jPanelResultados = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtImpArea = new javax.swing.JTextField();
        txtImpPerimetro = new javax.swing.JTextField();
        txtImpAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbTipoTriangulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipoTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoTrianguloActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblLado1.setText("Lado 1");

        lblLado2.setText("Lado 2");

        lblLado3.setText("Lado 3");

        javax.swing.GroupLayout jPanelLadosLayout = new javax.swing.GroupLayout(jPanelLados);
        jPanelLados.setLayout(jPanelLadosLayout);
        jPanelLadosLayout.setHorizontalGroup(
            jPanelLadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLadosLayout.createSequentialGroup()
                        .addComponent(txtLado1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLado1))
                    .addGroup(jPanelLadosLayout.createSequentialGroup()
                        .addComponent(txtLado2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLado2))
                    .addGroup(jPanelLadosLayout.createSequentialGroup()
                        .addComponent(txtLado3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLado3)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanelLadosLayout.setVerticalGroup(
            jPanelLadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado1)
                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLado2)
                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLado3)
                    .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setText("RESULTADOS");

        lblArea.setText("Area");

        jLabel2.setText("Perimetro");

        lblAltura.setText("Altura");

        javax.swing.GroupLayout jPanelResultadosLayout = new javax.swing.GroupLayout(jPanelResultados);
        jPanelResultados.setLayout(jPanelResultadosLayout);
        jPanelResultadosLayout.setHorizontalGroup(
            jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadosLayout.createSequentialGroup()
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lblTitulo))
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblArea)
                            .addComponent(lblAltura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtImpAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtImpPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(txtImpArea)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanelResultadosLayout.setVerticalGroup(
            jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtImpArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtImpPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtImpAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(cmbTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(btnCalcular)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelLados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cmbTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoTrianguloActionPerformed
        // TODO add your handling code here:
        String eleccion=(String) cmbTipoTriangulo.getSelectedItem();
        if(eleccion.equals("Equilatero")||eleccion.equals("Escaleno")){
            jPanelLados.setVisible(true);
         
            }else if (eleccion.equals("Isosceles")){
                jPanelLados.setVisible(true);
                txtLado3.setVisible(false);
                lblLado1.setText("Lado Repetido");
                lblLado3.setVisible(false);
            }else if (eleccion.equals("Rectangulo")){
                jPanelLados.setVisible(true);
               
                lblLado1.setText("Hipotenusa");
                
            }
        
    }//GEN-LAST:event_cmbTipoTrianguloActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String eleccion1=(String) cmbTipoTriangulo.getSelectedItem();
        if(eleccion1.equals("Equilatero")){
           
            Validacion();
            double a=Double.parseDouble(txtLado1.getText());
            double b=Double.parseDouble(txtLado2.getText());
            double c=Double.parseDouble(txtLado3.getText());
             if(a==b && b==c && a==c){
            Equilatero e=new Equilatero(a,b,c) {};
            txtImpArea.setText(""+(e.CalcularArea()));
            txtImpPerimetro.setText(""+(e.CalcularPerimetro()));
            txtImpAltura.setText(""+(e.CalcularAltura()));
            txtImpArea.enable(false);
            txtImpPerimetro.enable(false);
            txtImpAltura.enable(false);}
             else {
                 JOptionPane.showMessageDialog(rootPane, "Los lados deben ser iguales", "Error", HEIGHT);
             }
            
              
            }else if (eleccion1.equals("Escaleno")){
                 Validacion();
                 double a=Double.parseDouble(txtLado1.getText());
                 double b=Double.parseDouble(txtLado2.getText());
                 double c=Double.parseDouble(txtLado3.getText());
                 if(a==b || a==c || b==c){
                     JOptionPane.showMessageDialog(rootPane, "Los lados de un triangulo escaleno no pueden ser iguales", "Error", HEIGHT);
                     Limpiar();
                 }
                 else{
                     JOptionPane.showMessageDialog(rootPane, "Los lados de un triangulo escaleno no pueden ser iguales", "Error", HEIGHT);
                     Limpiar();
                     Escaleno e1=new Escaleno(a,b,c) {};
                 txtImpArea.setText(""+(e1.CalcularArea()));
                 txtImpPerimetro.setText(""+(e1.CalcularPerimetro()));
                 txtImpAltura.setText(""+(e1.CalcularAltura()));
                 txtImpArea.enable(false);
                 txtImpPerimetro.enable(false);
                 txtImpAltura.enable(false);
                 }
            }else if(eleccion1.equals("Isosceles")){
                
                 double a=Double.parseDouble(txtLado1.getText());
                 double b=Double.parseDouble(txtLado2.getText());
                 
                
                 Isosceles i=new Isosceles(a,b) {};
                 txtImpArea.setText(""+(i.CalcularArea()));
                 txtImpPerimetro.setText(""+(i.CalcularPerimetro()));
                 txtImpAltura.setText(""+(i.CalcularAltura()));
                 jPanelResultados.setVisible(true);
                 txtImpArea.enable(false);
                 txtImpPerimetro.enable(false);
                 txtImpAltura.enable(false);
            }else if(eleccion1.equals("Rectangulo")){
                 Validacion();
               
            double a=Double.parseDouble(txtLado1.getText());
            double b=Double.parseDouble(txtLado2.getText());
            double c=Double.parseDouble(txtLado3.getText());
            if(Math.pow(b,2)+Math.pow(c, 2)==Math.pow(a, 2)){
            Rectangulo r=new Rectangulo(a,b,c) {};
            txtImpArea.setText(""+(r.CalcularArea()));
            txtImpPerimetro.setText(""+(r.CalcularPerimetro()));
            txtImpAltura.setText(""+(r.CalcularAltura()));
            txtImpArea.enable(false);
            txtImpPerimetro.enable(false);
            txtImpAltura.enable(false);}
            else{
                JOptionPane.showMessageDialog(rootPane, "No es un triangulo rectangulo", "Error", HEIGHT);
            }
                
            }
    }//GEN-LAST:event_btnCalcularActionPerformed
 public void Validacion(){
            double a=Double.parseDouble(txtLado1.getText());
            double b=Double.parseDouble(txtLado2.getText());
            double c=Double.parseDouble(txtLado3.getText());
           if (a+b>c && a+c>b && b+c>a){
               txtLado1.enable(false);
               txtLado2.enable(false);
               txtLado3.enable(false);
               jPanelResultados.setVisible(true);
           } else {
               txtLado1.setText("");
               txtLado2.setText("");
               txtLado3.setText("");
               JOptionPane.showMessageDialog(rootPane, "Los datos ingresados no corresponden a un triangulo", "Correccion", HEIGHT);
           }
 }
 public void Limpiar(){
     txtLado1.setText("");
     txtLado2.setText("");
     txtLado3.setText("");
 }
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
            java.util.logging.Logger.getLogger(TriangulosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriangulosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriangulosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriangulosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriangulosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbTipoTriangulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelLados;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtImpAltura;
    private javax.swing.JTextField txtImpArea;
    private javax.swing.JTextField txtImpPerimetro;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    // End of variables declaration//GEN-END:variables
}