/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Estergema
 */
public class juego extends javax.swing.JFrame {
JFileChooser seleccionado = new JFileChooser();
File archivo;  
FileInputStream entrada;
FileOutputStream salida;
String path;
panel mipanel;

    public juego() {
        initComponents();
        setTitle("Proyecto1");
       
    }
   
  public String AbrirATexto(File archivo){
        String contenido="";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci = entrada.read())!= -1){
                char carcater = (char)ascci;
                contenido += carcater;
            }
        } catch (Exception e) {
        }
        return contenido;
  }
   /*Guardar archivo de texto*/
    public String GuardarATexto(File archivo, String contenido){
        String respuesta=null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta = "Se guardo con exito el archivo";
        } catch (Exception e) {
        }
        return respuesta;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        txteditor = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        nuevoarchivo = new javax.swing.JMenuItem();
        abrirarchivo = new javax.swing.JMenuItem();
        guardararchivo = new javax.swing.JMenuItem();
        guardarcomoarch = new javax.swing.JMenuItem();
        cerrar = new javax.swing.JMenuItem();
        Compilar = new javax.swing.JMenu();
        configuracion = new javax.swing.JMenuItem();
        escenario = new javax.swing.JMenuItem();
        secuencia = new javax.swing.JMenuItem();
        ejecutar = new javax.swing.JMenuItem();
        errores = new javax.swing.JMenuItem();
        simbolos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        manualu = new javax.swing.JMenuItem();
        manualt = new javax.swing.JMenuItem();
        acerca = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txteditor.setColumns(20);
        txteditor.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        txteditor.setRows(5);
        jScrollPane1.setViewportView(txteditor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu2.setText("ARCHIVO");

        nuevoarchivo.setText("Nuevo");
        nuevoarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoarchivoActionPerformed(evt);
            }
        });
        jMenu2.add(nuevoarchivo);

        abrirarchivo.setText("Abrir");
        abrirarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirarchivoActionPerformed(evt);
            }
        });
        jMenu2.add(abrirarchivo);

        guardararchivo.setText("Guardar");
        guardararchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardararchivoActionPerformed(evt);
            }
        });
        jMenu2.add(guardararchivo);

        guardarcomoarch.setText("Guardar Como");
        guardarcomoarch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarcomoarchActionPerformed(evt);
            }
        });
        jMenu2.add(guardarcomoarch);

        cerrar.setText("SALIR");
        jMenu2.add(cerrar);

        jMenuBar1.add(jMenu2);

        Compilar.setText("EJECUTAR");

        configuracion.setText("Compilar Configuracion");
        configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionActionPerformed(evt);
            }
        });
        Compilar.add(configuracion);

        escenario.setText("Compilar Escenario");
        escenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escenarioActionPerformed(evt);
            }
        });
        Compilar.add(escenario);

        secuencia.setText("Compilar Secuencia de Escenario");
        secuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuenciaActionPerformed(evt);
            }
        });
        Compilar.add(secuencia);

        ejecutar.setText("Ejecutar Juego");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });
        Compilar.add(ejecutar);

        errores.setText("Errores");
        Compilar.add(errores);

        simbolos.setText("Tabla de Simbolos");
        Compilar.add(simbolos);

        jMenuBar1.add(Compilar);

        jMenu6.setText("AYUDA");

        manualu.setText("Manual de Usuario");
        jMenu6.add(manualu);

        manualt.setText("Manual Tecnico");
        manualt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualtActionPerformed(evt);
            }
        });
        jMenu6.add(manualt);

        acerca.setText("Acerca de...");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        jMenu6.add(acerca);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoarchivoActionPerformed
    txteditor.setText("");
    archivo=null;
    }//GEN-LAST:event_nuevoarchivoActionPerformed

    private void abrirarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirarchivoActionPerformed
     
        if(seleccionado.showDialog(null, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("conf")){
                    String contenido = this.AbrirATexto(archivo);
                    txteditor.setText(contenido);                   
                   
                }else{                  
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de configuracion");
                    
                }
            }
        }
    }//GEN-LAST:event_abrirarchivoActionPerformed

    private void manualtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manualtActionPerformed

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
        JOptionPane.showMessageDialog(null,"Estrellita Armas- 201212919");

    }//GEN-LAST:event_acercaActionPerformed

    private void guardararchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardararchivoActionPerformed
        String contenido = txteditor.getText();
        String respuesta = this.GuardarATexto(archivo, contenido);
                if(respuesta!=null){
                    JOptionPane.showMessageDialog(null, respuesta);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar texto.");
                }
    }//GEN-LAST:event_guardararchivoActionPerformed

    private void guardarcomoarchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarcomoarchActionPerformed
       //GUARDAR COMO ARCHIVO DE CONFIGURACION
        if(seleccionado.showDialog(null, "GUARDAR TEXTO") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("conf")){
                String contenido = txteditor.getText();
                String respuesta = this.GuardarATexto(archivo, contenido);
                if(respuesta!=null){
                    JOptionPane.showMessageDialog(null, respuesta);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar texto.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El texto se debe guardar en un formato de texto.");
            }
        }
    }//GEN-LAST:event_guardarcomoarchActionPerformed

    private void configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionActionPerformed
   String input=txteditor.getText(); //compila documento1 de configuracion
                  //SE INICIALIZA EL ANALISIS LEXICO SE PASA COMO PARAMETRO LA CADENA DE ENTRADA
       
           try {  
               //Yylex y = new Yylex(new BufferedReader( new StringReader(input)));
                parser1 p = new parser1 (new analizador1(new BufferedReader( new StringReader(input)))) ;
            p.parse();
                   System.out.print("Analisis Satisfactorio");
            
        }  catch(Exception e) { System.out.println(e.getMessage());}
           
    }//GEN-LAST:event_configuracionActionPerformed

    private void escenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escenarioActionPerformed
       String input=txteditor.getText(); // compila documento2 posicion escenario
                  //SE INICIALIZA EL ANALISIS LEXICO SE PASA COMO PARAMETRO LA CADENA DE ENTRADA
       
           try {  
               //Yylex y = new Yylex(new BufferedReader( new StringReader(input)));
                parser2 p = new parser2 (new analizador2(new BufferedReader( new StringReader(input)))) ;
            p.parse();
                   System.out.print("Analisis Satisfactorio");
            
        }  catch(Exception e) { System.out.println(e.getMessage());}
            
        
        
    }//GEN-LAST:event_escenarioActionPerformed

    private void secuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuenciaActionPerformed
         String input=txteditor.getText(); //compila documento3 ESCENARIO
                  //SE INICIALIZA EL ANALISIS LEXICO SE PASA COMO PARAMETRO LA CADENA DE ENTRADA
       
           try {  
               //Yylex y = new Yylex(new BufferedReader( new StringReader(input)));
                parser3 p = new parser3 (new analizador3(new BufferedReader( new StringReader(input)))) ;
            p.parse();
                   System.out.print("Analisis Satisfactorio");
                 
            
        }  catch(Exception e) { System.out.println(e.getMessage());}
           
        
    }//GEN-LAST:event_secuenciaActionPerformed

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
   //se crea instancia a panel y se añade a la interfaz
      
        
        mipanel=new panel( this.jPanel1.getSize() );
        this.jPanel1.add(mipanel);
        this.repaint();
        System.out.println("Se ha creado panel");
    }//GEN-LAST:event_ejecutarActionPerformed
     
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
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Compilar;
    private javax.swing.JMenuItem abrirarchivo;
    private javax.swing.JMenuItem acerca;
    private javax.swing.JMenuItem cerrar;
    private javax.swing.JMenuItem configuracion;
    private javax.swing.JMenuItem ejecutar;
    private javax.swing.JMenuItem errores;
    private javax.swing.JMenuItem escenario;
    private javax.swing.JMenuItem guardararchivo;
    private javax.swing.JMenuItem guardarcomoarch;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem manualt;
    private javax.swing.JMenuItem manualu;
    private javax.swing.JMenuItem nuevoarchivo;
    private javax.swing.JMenuItem secuencia;
    private javax.swing.JMenuItem simbolos;
    private javax.swing.JTextArea txteditor;
    // End of variables declaration//GEN-END:variables
}
