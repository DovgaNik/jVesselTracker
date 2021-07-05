package jvesseltracker;

import javax.swing.UIManager;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setAnimationInvisible();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jPanelSidebar = new javax.swing.JPanel();
        jPanelShip1 = new javax.swing.JPanel();
        jPaneShipl2 = new javax.swing.JPanel();
        jPanelShip3 = new javax.swing.JPanel();
        jPaneShipl4 = new javax.swing.JPanel();
        jPaneShip5 = new javax.swing.JPanel();
        jPanelShipAnim1 = new javax.swing.JPanel();
        jPanelShipAnim2 = new javax.swing.JPanel();
        jPanelShipAnim3 = new javax.swing.JPanel();
        jPanelShipAnim4 = new javax.swing.JPanel();
        jPanelShipAnim5 = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jVesselTracker");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jPanelTitle.setBackground(new java.awt.Color(179, 73, 93));
        jPanelTitle.setToolTipText("");
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
                .addContainerGap(955, Short.MAX_VALUE)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelSidebar.setBackground(new java.awt.Color(67, 66, 107));
        jPanelSidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelShip1.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShip1Layout = new javax.swing.GroupLayout(jPanelShip1);
        jPanelShip1.setLayout(jPanelShip1Layout);
        jPanelShip1Layout.setHorizontalGroup(
            jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelShip1Layout.setVerticalGroup(
            jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPanelShip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 296, 100));

        jPaneShipl2.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPaneShipl2Layout = new javax.swing.GroupLayout(jPaneShipl2);
        jPaneShipl2.setLayout(jPaneShipl2Layout);
        jPaneShipl2Layout.setHorizontalGroup(
            jPaneShipl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPaneShipl2Layout.setVerticalGroup(
            jPaneShipl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPaneShipl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 296, 100));

        jPanelShip3.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShip3Layout = new javax.swing.GroupLayout(jPanelShip3);
        jPanelShip3.setLayout(jPanelShip3Layout);
        jPanelShip3Layout.setHorizontalGroup(
            jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        jPanelShip3Layout.setVerticalGroup(
            jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPanelShip3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, -1, 100));

        jPaneShipl4.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPaneShipl4Layout = new javax.swing.GroupLayout(jPaneShipl4);
        jPaneShipl4.setLayout(jPaneShipl4Layout);
        jPaneShipl4Layout.setHorizontalGroup(
            jPaneShipl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPaneShipl4Layout.setVerticalGroup(
            jPaneShipl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPaneShipl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 344, 296, 100));

        jPaneShip5.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPaneShip5Layout = new javax.swing.GroupLayout(jPaneShip5);
        jPaneShip5.setLayout(jPaneShip5Layout);
        jPaneShip5Layout.setHorizontalGroup(
            jPaneShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPaneShip5Layout.setVerticalGroup(
            jPaneShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPaneShip5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 455, 296, 100));

        jPanelShipAnim1.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnim1Layout = new javax.swing.GroupLayout(jPanelShipAnim1);
        jPanelShipAnim1.setLayout(jPanelShipAnim1Layout);
        jPanelShipAnim1Layout.setHorizontalGroup(
            jPanelShipAnim1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnim1Layout.setVerticalGroup(
            jPanelShipAnim1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPanelShipAnim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 11, -1, -1));

        jPanelShipAnim2.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnim2Layout = new javax.swing.GroupLayout(jPanelShipAnim2);
        jPanelShipAnim2.setLayout(jPanelShipAnim2Layout);
        jPanelShipAnim2Layout.setHorizontalGroup(
            jPanelShipAnim2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnim2Layout.setVerticalGroup(
            jPanelShipAnim2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPanelShipAnim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 122, -1, -1));

        jPanelShipAnim3.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnim3Layout = new javax.swing.GroupLayout(jPanelShipAnim3);
        jPanelShipAnim3.setLayout(jPanelShipAnim3Layout);
        jPanelShipAnim3Layout.setHorizontalGroup(
            jPanelShipAnim3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnim3Layout.setVerticalGroup(
            jPanelShipAnim3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPanelShipAnim3, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 233, -1, -1));

        jPanelShipAnim4.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnim4Layout = new javax.swing.GroupLayout(jPanelShipAnim4);
        jPanelShipAnim4.setLayout(jPanelShipAnim4Layout);
        jPanelShipAnim4Layout.setHorizontalGroup(
            jPanelShipAnim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnim4Layout.setVerticalGroup(
            jPanelShipAnim4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPanelShipAnim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 344, -1, -1));

        jPanelShipAnim5.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnim5Layout = new javax.swing.GroupLayout(jPanelShipAnim5);
        jPanelShipAnim5.setLayout(jPanelShipAnim5Layout);
        jPanelShipAnim5Layout.setHorizontalGroup(
            jPanelShipAnim5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnim5Layout.setVerticalGroup(
            jPanelShipAnim5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelSidebar.add(jPanelShipAnim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 455, -1, -1));

        jPanelContent.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        getAccessibleContext().setAccessibleDescription("jVesselTracker window");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xMouse;
    int yMouse;
    
    private void jPanelTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTitleMousePressed
        xMouse  = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelTitleMousePressed

    private void jPanelTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanelTitleMouseDragged

    private void setAnimationInvisible(){
        jPanelShipAnim1.setVisible(false);
        jPanelShipAnim2.setVisible(false);
        jPanelShipAnim3.setVisible(false);
        jPanelShipAnim4.setVisible(false);
        jPanelShipAnim5.setVisible(false);
    }
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code">
        
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JPanel jPaneShip5;
    private javax.swing.JPanel jPaneShipl2;
    private javax.swing.JPanel jPaneShipl4;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelShip1;
    private javax.swing.JPanel jPanelShip3;
    private javax.swing.JPanel jPanelShipAnim1;
    private javax.swing.JPanel jPanelShipAnim2;
    private javax.swing.JPanel jPanelShipAnim3;
    private javax.swing.JPanel jPanelShipAnim4;
    private javax.swing.JPanel jPanelShipAnim5;
    private javax.swing.JPanel jPanelSidebar;
    private javax.swing.JPanel jPanelTitle;
    // End of variables declaration//GEN-END:variables
}
