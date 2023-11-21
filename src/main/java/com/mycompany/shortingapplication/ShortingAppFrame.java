/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.shortingapplication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author KUMAR ADITYA
 */
public class ShortingAppFrame extends javax.swing.JFrame {
     private int[] elements; // Array to store elements
// Array to store elements

    /**
     * Creates new form ShortingAppFrame
     */
    public ShortingAppFrame() {
        initComponents();
         addEventListeners(); // Call the method to add action listeners
    }
     private void addEventListeners() {
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortWithBubbleSort();
            }
        });

        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortWithSelectionSort();
            }
        });

        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortWithInsertionSort();
            }
        });
    }
    
      private void sortWithBubbleSort() {
        try {
            // Convert input to an array of integers
            elements = Arrays.stream(jTextField1.getText().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // Apply Bubble Sort algorithm
            for (int i = 0; i < elements.length - 1; i++) {
                for (int j = 0; j < elements.length - i - 1; j++) {
                    if (elements[j] > elements[j + 1]) {
                        // Swap elements[j] and elements[j+1]
                        int temp = elements[j];
                        elements[j] = elements[j + 1];
                        elements[j + 1] = temp;
                    }
                }
            }

            // Update the res text field with the sorted result
            res.setText(Arrays.toString(elements));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter integers separated by spaces.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void sortWithSelectionSort() {
        // Implement Selection Sort logic similar to the above method
        try {
        // Convert input to an array of integers
        elements = Arrays.stream(jTextField1.getText().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Apply Selection Sort algorithm
        int n = elements.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements[i] and elements[minIndex]
            int temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;
        }

        // Update the res text field with the sorted result
        res.setText(Arrays.toString(elements));
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter integers separated by spaces.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    private void sortWithInsertionSort() {
        // Implement Insertion Sort logic similar to the above method
        try {
        // Convert input to an array of integers
        elements = Arrays.stream(jTextField1.getText().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Apply Insertion Sort algorithm
        int n = elements.length;
        for (int i = 1; i < n; ++i) {
            int key = elements[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && elements[j] > key) {
                elements[j + 1] = elements[j];
                j = j - 1;
            }
            elements[j + 1] = key;
        }

        // Update the res text field with the sorted result
        res.setText(Arrays.toString(elements));
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter integers separated by spaces.", "Error", JOptionPane.ERROR_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        res = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Enter Element :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, 30));

        B1.setText("Bubble Sort");
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

        B2.setText("Selection Sort");
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, 30));

        B3.setText("Insertion Sort");
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Result :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 30));
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 230, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Sorting Application");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 180, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(ShortingAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShortingAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShortingAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShortingAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShortingAppFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField res;
    // End of variables declaration//GEN-END:variables
}
