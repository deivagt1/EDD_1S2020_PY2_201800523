package edd_1s2020_py2_201800523;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import estructuras.*;

/**
 *
 * @author David
 */
public class testButtons extends javax.swing.JFrame {

    nodoArbolAvl[] cat;

    /**
     * Creates new form testButtons
     */
    public testButtons() {
	initComponents();
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cargar Libros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar users");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Graficar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("newLibro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Debug");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        nuevoLibro nuevo = new nuevoLibro();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Reportes reportes = new Reportes();
        if (reportes != null) {
            reportes.dispose();
            reportes = new Reportes();
        }
        reportes.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Datos de usuarios");
        selector.setMultiSelectionEnabled(false);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("json", "json");
        selector.setFileFilter(filtro);

        int abc = selector.showOpenDialog(this);
        File ti = selector.getSelectedFile();

        if (abc == JFileChooser.APPROVE_OPTION) {
            try {

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        JSONParser parser = new JSONParser();

        try {
            Object objeto = parser.parse(new InputStreamReader(new FileInputStream(ti), "UTF-8"));
            JSONObject objetoJson = (JSONObject) objeto;
            JSONArray arrayJson = (JSONArray) objetoJson.get("Usuarios");

            for (int i = 0; i < arrayJson.size(); i++) {
                JSONObject temp = (JSONObject) arrayJson.get(i);
                usuario nuevoUsuario = new usuario();
                nuevoUsuario.setCarnet(Integer.parseInt(temp.get("Carnet").toString()));
                nuevoUsuario.setNombre(temp.get("Nombre").toString());
                nuevoUsuario.setApellido(temp.get("Apellido").toString());
                nuevoUsuario.setCarrera(temp.get("Carrera").toString());
                nuevoUsuario.setPass(temp.get("Password").toString());
                Global.Globales.tablaDispersion.insertar(nuevoUsuario);
            }
            Global.Globales.tablaDispersion.imprimir();

        } catch (org.json.simple.parser.ParseException e) {

        } catch (IOException e) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Datos de libros");
        selector.setMultiSelectionEnabled(false);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("json", "json");
        selector.setFileFilter(filtro);

        int abc = selector.showOpenDialog(this);
        File ti = selector.getSelectedFile();

        if (abc == JFileChooser.APPROVE_OPTION) {
            try {

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        JSONParser parser = new JSONParser();

        try {
            Object objeto = parser.parse(new InputStreamReader(new FileInputStream(ti), "UTF-8"));
            JSONObject objetoJson = (JSONObject) objeto;
            JSONArray arrayJson = (JSONArray) objetoJson.get("Libros");

            for (int i = 0; i < arrayJson.size(); i++) {
                JSONObject temp = (JSONObject) arrayJson.get(i);
                libro nuevolibro = new libro();
                nuevolibro.setIsbn(Integer.parseInt(temp.get("ISBN").toString()));
                nuevolibro.setAno(Integer.parseInt(temp.get("Año").toString()));
                nuevolibro.setIdioma(temp.get("Idioma").toString());
                nuevolibro.setTitulo(temp.get("Titulo").toString());
                nuevolibro.setEditorial(temp.get("Editorial").toString());
                nuevolibro.setAutor(temp.get("Autor").toString());
                nuevolibro.setEdicion(Integer.parseInt(temp.get("Edicion").toString()));

                String categoria = temp.get("Categoria").toString();
                nuevolibro.setCategoria(categoria);

                nodoArbolAvl nodo = Global.Globales.arbolCategorias.buscar(categoria);

                if (nodo != null) {// categoria existe
                    nodo.librosCategoria.insertar(nuevolibro);
                    nodo.cantidad++;
                    nodo.librosCategoria.cantidad++;

                } else {
                    Global.Globales.arbolCategorias.raiz = Global.Globales.arbolCategorias.insertar(Global.Globales.arbolCategorias.raiz, categoria,
                        0);
                    nodoArbolAvl nodoNew = Global.Globales.arbolCategorias.buscar(categoria);
                    nodoNew.librosCategoria.insertar(nuevolibro);
                    nodoNew.cantidad++;
                    nodoNew.librosCategoria.cantidad++;

                }

            }
            cat = Global.Globales.arbolCategorias.listaCategorias();

            /*  for (int i = 0; i < cat.length; i++) {
                System.out.println(cat[i].categoria);
            }*/
        } catch (org.json.simple.parser.ParseException e) {

        } catch (IOException e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
	    java.util.logging.Logger.getLogger(testButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(testButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(testButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(testButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {

	    }
	});
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
