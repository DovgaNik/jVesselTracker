//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker;

public class JFrameAskMap extends javax.swing.JFrame {

    public JFrameAskMap(Vessel vessel) {
        
        initComponents();
        vesselLocal = vessel;

    }

    Vessel vesselLocal;
    jvesseltracker.webRequests.Browse browse = new jvesseltracker.webRequests.Browse();
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jLabelMMSI = new javax.swing.JLabel();
        jButtonGoogleMaps = new javax.swing.JButton();
        jButtonOpenSeaMap = new javax.swing.JButton();
        jButtonYandexMaps = new javax.swing.JButton();
        jButtonOpanStreetMap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Vessel");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
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
        jLabelTitle.setText("Open map");

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

        jLabelMMSI.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelMMSI.setText("Please select a preferable web service for displaying the ship on a map");

        jButtonGoogleMaps.setBackground(new java.awt.Color(0, 0, 0));
        jButtonGoogleMaps.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jButtonGoogleMaps.setText("Google Maps");
        jButtonGoogleMaps.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 107), 2, true));
        jButtonGoogleMaps.setContentAreaFilled(false);
        jButtonGoogleMaps.setFocusable(false);
        jButtonGoogleMaps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogleMapsActionPerformed(evt);
            }
        });

        jButtonOpenSeaMap.setBackground(new java.awt.Color(0, 0, 0));
        jButtonOpenSeaMap.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jButtonOpenSeaMap.setText("OpenSeaMap");
        jButtonOpenSeaMap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 107), 2, true));
        jButtonOpenSeaMap.setContentAreaFilled(false);
        jButtonOpenSeaMap.setFocusable(false);
        jButtonOpenSeaMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenSeaMapActionPerformed(evt);
            }
        });

        jButtonYandexMaps.setBackground(new java.awt.Color(0, 0, 0));
        jButtonYandexMaps.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jButtonYandexMaps.setText("Yandex Maps");
        jButtonYandexMaps.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 107), 2, true));
        jButtonYandexMaps.setContentAreaFilled(false);
        jButtonYandexMaps.setFocusable(false);
        jButtonYandexMaps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYandexMapsActionPerformed(evt);
            }
        });

        jButtonOpanStreetMap.setBackground(new java.awt.Color(0, 0, 0));
        jButtonOpanStreetMap.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jButtonOpanStreetMap.setText("OpenStreetMap");
        jButtonOpanStreetMap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 107), 2, true));
        jButtonOpanStreetMap.setContentAreaFilled(false);
        jButtonOpanStreetMap.setFocusable(false);
        jButtonOpanStreetMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpanStreetMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMMSI)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jButtonGoogleMaps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOpenSeaMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonYandexMaps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOpanStreetMap)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMMSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGoogleMaps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOpenSeaMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonYandexMaps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOpanStreetMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
    private void jButtonYandexMapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYandexMapsActionPerformed
        
        browse.browse("https://yandex.ru/maps/?pt=" + vesselLocal.lon + "," + vesselLocal.lat + "&z=17&l=map");
        this.setVisible(false);                
        
    }//GEN-LAST:event_jButtonYandexMapsActionPerformed

    private void jButtonOpanStreetMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpanStreetMapActionPerformed
        
        browse.browse("http://www.openstreetmap.org/?mlat=" + vesselLocal.lat + "&mlon=" + vesselLocal.lon + "&zoom=16&layers=M");
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonOpanStreetMapActionPerformed

    private void jButtonGoogleMapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogleMapsActionPerformed
        
        browse.browse("https://www.google.com/maps/search/?api=1&query=" + vesselLocal.lat + ", " + vesselLocal.lon);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonGoogleMapsActionPerformed

    private void jButtonOpenSeaMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenSeaMapActionPerformed
        
        browse.browse("http://map.openseamap.org/?zoom=17&lat=" + vesselLocal.lat + "&lon=" + vesselLocal.lon + "&layers=BFTFFTTFFTF0FFFTFFFFTT");
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonOpenSeaMapActionPerformed

    //</editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonGoogleMaps;
    private javax.swing.JButton jButtonOpanStreetMap;
    private javax.swing.JButton jButtonOpenSeaMap;
    private javax.swing.JButton jButtonYandexMaps;
    private javax.swing.JLabel jLabelMMSI;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelTitle;
    // End of variables declaration//GEN-END:variables
}
