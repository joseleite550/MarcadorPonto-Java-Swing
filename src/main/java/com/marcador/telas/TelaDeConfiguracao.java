package com.marcador.telas;

import com.marcador.util.PropertiesUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FilenameUtils;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose.Leite
 * @author Vitor.Santos
 */
public class TelaDeConfiguracao extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeConfiguracao
     */
    public TelaDeConfiguracao() {
        initComponents();
        txtCaminho.setEditable(false);
        carregarProperties(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        btnAtualizarPIS = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCaminho = new javax.swing.JTextField();
        txtPis = new javax.swing.JFormattedTextField();
        txtBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações de Arquivo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnAtualizarPIS.setText("Atualizar");
        btnAtualizarPIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarPISActionPerformed(evt);
            }
        });

        jLabel3.setText("Arquivo:");

        jLabel2.setText("Caminho:");

        jLabel1.setText("PIS:");

        try {
            txtPis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtBox.setEditable(true);
        txtBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("Procurar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaminho)
                            .addComponent(btnAtualizarPIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPis)
                            .addComponent(txtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPIS)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarPISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPISActionPerformed
        if (txtCaminho.getText().equals("") || txtPis.getText().equals("") || txtBox.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Atenção", JOptionPane.ERROR_MESSAGE);
        } else {
            if (txtPis.getText().matches("[0-9]*") && txtPis.getText().length() == 12) {
                carregarProperties(true);
                String[] ops = {"Ok"};
                int resp = JOptionPane.showOptionDialog(rootPane, "Configurações salvas", "Sucesso", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, ops, ops[0]);
                if (resp == 0) {
                    this.dispose();
                    TelaInicial tela = new TelaInicial();
                    tela.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "PIS deve conter somente numeros e 12 digitos", "Atenção", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAtualizarPISActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(txtCaminho.getText()));
        file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        file.showOpenDialog(this);
        File arquivo = file.getSelectedFile();
        if (arquivo != null) {
            txtCaminho.setText(arquivo.getPath());
            try {
                setArquivos();
            } catch (Exception ex) {
                Logger.getLogger(TelaDeConfiguracao.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtBox.requestFocus(true);
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarPIS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> txtBox;
    private javax.swing.JTextField txtCaminho;
    private javax.swing.JFormattedTextField txtPis;
    // End of variables declaration//GEN-END:variables
 private void carregarProperties(boolean atualizar) {
        try {
            if (atualizar) {
                PropertiesUtil.setPIS(txtPis.getText());
                PropertiesUtil.setCaminho(txtCaminho.getText());
                PropertiesUtil.setFileName(txtBox.getSelectedItem().toString());
                
                File file = PropertiesUtil.getFile();
                if (!file.exists()) {
                    file.createNewFile();
                    try (FileWriter fw = new FileWriter(file, true); 
                         BufferedWriter bw = new BufferedWriter(fw)) {
                        bw.write("PIS	Data	Hora");
                    }
                }
            } else {
                txtPis.setText(PropertiesUtil.getPIS());
                txtCaminho.setText(PropertiesUtil.getCaminho());
                setArquivos();
            }

        } catch (Exception ez) {
            Logger.getLogger(TelaDeConfiguracao.class.getName()).log(Level.SEVERE, null, ez);
        }
    }

    private void setArquivos() throws Exception {
        File file = new File(txtCaminho.getText());
        File[] arquivos = file.listFiles();
        List<String> filesList = new ArrayList<>();
        filesList.add("");
        for (File f : arquivos) {
            if (FilenameUtils.getExtension(f.getName()).equals("txt")) {

                try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
                    String result = "";
                    while (br.ready()) {
                        result += br.readLine();
                    }
                    if (result.contains("PIS")) {
                        filesList.add(f.getName().replace(".txt", ""));
                    }
                }
            }
        }
        String[] campos = new String[filesList.size()];
        int i = 0;
        for (String f : filesList) {
            campos[i] = f;
            i++;
        }
        txtBox.setModel(new DefaultComboBoxModel(campos));     
        i = 0;
        for (String a : filesList) {
            if (a.equals(PropertiesUtil.getFileName())) {
                txtBox.setSelectedIndex(i);
                break;
            }
            i++;
        }
    }
}
