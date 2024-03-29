//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrameRemoveVessel extends javax.swing.JFrame {

    public JFrameRemoveVessel(Vessel selectedVessel) {
        
        initComponents();
        selectedVesselLocal = selectedVessel;
        
    }

    Vessel selectedVesselLocal;
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jLabelFirst = new javax.swing.JLabel();
        jButtonDisagree = new javax.swing.JButton();
        jButtonAgree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remove Vessel");
        setLocationByPlatform(true);
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);

        jPanelTitle.setBackground(new java.awt.Color(179, 73, 93));
        jPanelTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelTitleMouseDragged(evt);
            }
        });
        jPanelTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelTitleMousePressed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(179, 73, 93));
        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/mooringPoingExit.png"))); // NOI18N
        jButtonExit.setToolTipText("Close");
        jButtonExit.setBorder(null);
        jButtonExit.setContentAreaFilled(false);
        jButtonExit.setFocusable(false);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(250, 248, 241));
        jLabelTitle.setText("Remove vessel");

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit)
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonExit)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelContent.setBackground(new java.awt.Color(250, 248, 241));
        jPanelContent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(179, 73, 93)));

        jLabelFirst.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelFirst.setText("Do you really want to remove the vessel");
        jLabelFirst.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButtonDisagree.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDisagree.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jButtonDisagree.setText("No, cancel");
        jButtonDisagree.setActionCommand("");
        jButtonDisagree.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 107), 2, true));
        jButtonDisagree.setContentAreaFilled(false);
        jButtonDisagree.setFocusable(false);
        jButtonDisagree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisagreeActionPerformed(evt);
            }
        });

        jButtonAgree.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAgree.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jButtonAgree.setText("Yes");
        jButtonAgree.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 107), 2, true));
        jButtonAgree.setContentAreaFilled(false);
        jButtonAgree.setFocusable(false);
        jButtonAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelFirst)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jButtonDisagree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAgree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDisagree)
                    .addComponent(jButtonAgree))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Mouse events">
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonExitActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc="Move JFrame">
    
    int xMouse;
    int yMouse;
    
    private void jPanelTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTitleMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
 
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_jPanelTitleMouseDragged

    private void jPanelTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTitleMousePressed
        
        xMouse  = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_jPanelTitleMousePressed

    //</editor-fold>
        
    private void jButtonDisagreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisagreeActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonDisagreeActionPerformed

    private void jButtonAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgreeActionPerformed
        
        selectedVesselLocal.clear();
        try {
            selectedVesselLocal.write();
        } catch (IOException ex) {
            Logger.getLogger(JFrameRemoveVessel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonAgreeActionPerformed
    
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgree;
    private javax.swing.JButton jButtonDisagree;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelFirst;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelTitle;
    // End of variables declaration//GEN-END:variables
}
