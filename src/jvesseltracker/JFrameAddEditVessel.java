package jvesseltracker;

public class JFrameAddEditVessel extends javax.swing.JFrame {

    public JFrameAddEditVessel(vessels selectedVessel, Boolean ifEditing) {
        
        initComponents();
        selectedVesselLocal = selectedVessel;
        
    }

    vessels selectedVesselLocal;
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jPanelContent = new javax.swing.JPanel();
        jLabelMMSI = new javax.swing.JLabel();
        jTextFieldMMSI = new javax.swing.JTextField();
        jLabelIMO = new javax.swing.JLabel();
        jTextFieldIMO = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Vessel");
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

        jButtonExit.setBackground(new java.awt.Color(0, 0, 0));
        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/mooringPoingExit.png"))); // NOI18N
        jButtonExit.setToolTipText("Close");
        jButtonExit.setBorder(null);
        jButtonExit.setFocusable(false);
        jButtonExit.setOpaque(false);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleLayout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jButtonExit)
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonExit)
        );

        jPanelContent.setBackground(new java.awt.Color(250, 248, 241));
        jPanelContent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(179, 73, 93)));

        jLabelMMSI.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelMMSI.setText("Enter MMSI (Required)");

        jTextFieldMMSI.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N

        jLabelIMO.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelIMO.setText("Enter IMO (Optional)");

        jTextFieldIMO.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N

        jLabelName.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelName.setText("Enter name (Required)");

        jTextFieldName.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N

        jButtonCancel.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCancel.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 107), 2, true));
        jButtonCancel.setContentAreaFilled(false);
        jButtonCancel.setFocusable(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAdd.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 107), 2, true));
        jButtonAdd.setContentAreaFilled(false);
        jButtonAdd.setFocusable(false);
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMMSI)
                    .addComponent(jTextFieldIMO)
                    .addComponent(jTextFieldName)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMMSI)
                            .addComponent(jLabelIMO)
                            .addComponent(jLabelName))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMMSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMMSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIMO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldIMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Mouse events">
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    //</editor-fold>
    
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
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        this.setVisible(false);
                        
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        
        switch(selectedVesselLocal){
            
            case vessel1:
                System.out.println("seitch statement equals" + selectedVesselLocal);
                break;
            
            case vessel2:
                System.out.println("seitch statement equals" + selectedVesselLocal);
                break;    
                
            case vessel3:
                System.out.println("seitch statement equals" + selectedVesselLocal);
                break;
            
            case vessel4:
                System.out.println("seitch statement equals" + selectedVesselLocal);
                break;
                
            case vessel5:
                System.out.println("seitch statement equals" + selectedVesselLocal);
                break;    
        }
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelIMO;
    private javax.swing.JLabel jLabelMMSI;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JTextField jTextFieldIMO;
    private javax.swing.JTextField jTextFieldMMSI;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
