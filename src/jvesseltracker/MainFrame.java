package jvesseltracker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import jvesseltracker.jSingleVesselPosition.JPosition;
import jvesseltracker.jSingleVesselPosition.JSingleVesselPositionParsed;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setAnimationInvisible();
        fullUpdate();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jPanelSidebar = new javax.swing.JPanel();
        jPanelShip1 = new javax.swing.JPanel();
        jLabelVesselName1 = new javax.swing.JLabel();
        jLabelVesselCoordinates1 = new javax.swing.JLabel();
        jPaneShipl2 = new javax.swing.JPanel();
        jLabelVesselName2 = new javax.swing.JLabel();
        jLabelVesselCoordinates2 = new javax.swing.JLabel();
        jPanelShip3 = new javax.swing.JPanel();
        jLabelVesselName3 = new javax.swing.JLabel();
        jLabelVesselCoordinates3 = new javax.swing.JLabel();
        jPaneShipl4 = new javax.swing.JPanel();
        jLabelVesselName4 = new javax.swing.JLabel();
        jLabelVesselCoordinates4 = new javax.swing.JLabel();
        jPaneShip5 = new javax.swing.JPanel();
        jLabelVesselName5 = new javax.swing.JLabel();
        jLabelVesselCoordinates5 = new javax.swing.JLabel();
        jPanelShipAnim1 = new javax.swing.JPanel();
        jPanelShipAnim2 = new javax.swing.JPanel();
        jPanelShipAnim3 = new javax.swing.JPanel();
        jPanelShipAnim4 = new javax.swing.JPanel();
        jPanelShipAnim5 = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();
        jLabelVesselImage = new javax.swing.JLabel();
        jLabelVesselMMSI = new javax.swing.JLabel();
        jLabelVesselIMO = new javax.swing.JLabel();
        jLabelVesselHeading = new javax.swing.JLabel();
        jLabelVesselCourse = new javax.swing.JLabel();
        jLabelVesselDifferenceCourseHeading = new javax.swing.JLabel();
        jLabelVesselSpeed = new javax.swing.JLabel();
        jLabelVesselStatus = new javax.swing.JLabel();
        jLabelRequestTimestamp = new javax.swing.JLabel();

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
            .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanelSidebar.setBackground(new java.awt.Color(67, 66, 107));
        jPanelSidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelShip1.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip1MousePressed(evt);
            }
        });

        jLabelVesselName1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelVesselName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName1.setMaximumSize(new java.awt.Dimension(280, 42));

        jLabelVesselCoordinates1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelVesselCoordinates1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelShip1Layout = new javax.swing.GroupLayout(jPanelShip1);
        jPanelShip1.setLayout(jPanelShip1Layout);
        jPanelShip1Layout.setHorizontalGroup(
            jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShip1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVesselName1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabelVesselCoordinates1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelShip1Layout.setVerticalGroup(
            jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShip1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVesselCoordinates1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelSidebar.add(jPanelShip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 296, 100));

        jPaneShipl2.setBackground(new java.awt.Color(250, 248, 241));
        jPaneShipl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPaneShipl2MousePressed(evt);
            }
        });

        jLabelVesselName2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelVesselName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName2.setMaximumSize(new java.awt.Dimension(280, 42));

        jLabelVesselCoordinates2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelVesselCoordinates2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPaneShipl2Layout = new javax.swing.GroupLayout(jPaneShipl2);
        jPaneShipl2.setLayout(jPaneShipl2Layout);
        jPaneShipl2Layout.setHorizontalGroup(
            jPaneShipl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneShipl2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneShipl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVesselCoordinates2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabelVesselName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPaneShipl2Layout.setVerticalGroup(
            jPaneShipl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneShipl2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVesselCoordinates2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelSidebar.add(jPaneShipl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 296, 100));

        jPanelShip3.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip3MousePressed(evt);
            }
        });

        jLabelVesselName3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelVesselName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName3.setMaximumSize(new java.awt.Dimension(280, 42));

        jLabelVesselCoordinates3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelVesselCoordinates3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelShip3Layout = new javax.swing.GroupLayout(jPanelShip3);
        jPanelShip3.setLayout(jPanelShip3Layout);
        jPanelShip3Layout.setHorizontalGroup(
            jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShip3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVesselName3, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabelVesselCoordinates3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelShip3Layout.setVerticalGroup(
            jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShip3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVesselCoordinates3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelSidebar.add(jPanelShip3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, -1, 100));

        jPaneShipl4.setBackground(new java.awt.Color(250, 248, 241));
        jPaneShipl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPaneShipl4MousePressed(evt);
            }
        });

        jLabelVesselName4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelVesselName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName4.setMaximumSize(new java.awt.Dimension(280, 42));

        jLabelVesselCoordinates4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelVesselCoordinates4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPaneShipl4Layout = new javax.swing.GroupLayout(jPaneShipl4);
        jPaneShipl4.setLayout(jPaneShipl4Layout);
        jPaneShipl4Layout.setHorizontalGroup(
            jPaneShipl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneShipl4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneShipl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVesselName4, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabelVesselCoordinates4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPaneShipl4Layout.setVerticalGroup(
            jPaneShipl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneShipl4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVesselCoordinates4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelSidebar.add(jPaneShipl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 344, 296, 100));

        jPaneShip5.setBackground(new java.awt.Color(250, 248, 241));
        jPaneShip5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPaneShip5MousePressed(evt);
            }
        });

        jLabelVesselName5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelVesselName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName5.setMaximumSize(new java.awt.Dimension(280, 42));

        jLabelVesselCoordinates5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelVesselCoordinates5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPaneShip5Layout = new javax.swing.GroupLayout(jPaneShip5);
        jPaneShip5.setLayout(jPaneShip5Layout);
        jPaneShip5Layout.setHorizontalGroup(
            jPaneShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneShip5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVesselName5, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabelVesselCoordinates5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPaneShip5Layout.setVerticalGroup(
            jPaneShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneShip5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVesselCoordinates5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabelVesselMMSI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVesselMMSI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVesselMMSI.setText("MMSI");

        jLabelVesselIMO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVesselIMO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelVesselIMO.setText("IMO");

        jLabelVesselHeading.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVesselHeading.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelVesselHeading.setText("Heading");

        jLabelVesselCourse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVesselCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselCourse.setText("Course");

        jLabelVesselDifferenceCourseHeading.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVesselDifferenceCourseHeading.setText("Difference");

        jLabelVesselSpeed.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVesselSpeed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVesselSpeed.setText("Speed");

        jLabelVesselStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelVesselStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelVesselStatus.setText("Status");

        jLabelRequestTimestamp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRequestTimestamp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRequestTimestamp.setText("Timestamp");

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVesselImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelVesselMMSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVesselIMO))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContentLayout.createSequentialGroup()
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVesselCourse)
                            .addComponent(jLabelVesselSpeed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVesselHeading, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelVesselDifferenceCourseHeading, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelRequestTimestamp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVesselStatus)))
                .addContainerGap())
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVesselDifferenceCourseHeading)
                    .addComponent(jLabelVesselSpeed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVesselHeading)
                    .addComponent(jLabelVesselCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVesselMMSI)
                    .addComponent(jLabelVesselIMO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRequestTimestamp)
                    .addComponent(jLabelVesselStatus))
                .addContainerGap())
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
    
    vessels vessel;
    
    static String MMSI1 = "353136000";
    static String name1 = "EVER GIVEN";
    static String speed1;
    static String course1;
    static String heading1;
    static String status1;
    static String timestamp1;
    static String description1;
    
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
    
    private void clearDisplayedData(){
        jLabelVesselImage.setText("");
        jLabelVesselMMSI.setText("");
        jLabelVesselIMO.setText("");
        jLabelVesselHeading.setText("");
        jLabelVesselCourse.setText("");
        jLabelVesselDifferenceCourseHeading.setText("");
        jLabelVesselSpeed.setText("");
        jLabelVesselStatus.setText("");
        jLabelRequestTimestamp.setText("");
    }
    
    private void setDisplayedData(String linkToIcon, String MMSI, String IMO, String heading, String course, String differenceCourseHeading, String speed, String status, String timestamp){
        jLabelVesselImage.setIcon(new ImageIcon(linkToIcon));
        jLabelVesselMMSI.setText("MMSI :" + MMSI);
        jLabelVesselIMO.setText("IMO :" + IMO);
        jLabelVesselHeading.setText("Heading :" + heading);
        jLabelVesselCourse.setText("Course :" + course);
        jLabelVesselDifferenceCourseHeading.setText("Difference :" + differenceCourseHeading);
        jLabelVesselSpeed.setText("Speed:" + speed);
        jLabelVesselStatus.setText("Status: " + status);
        jLabelRequestTimestamp.setText("Timestamp: " + timestamp);
    }
    
    private void update(){
        
    }
    
    private void fullUpdate(){
        try {
            String json = JPosition.get(MMSI1, 100, "66d817df5ba972bec458f47448d7c5bf2b9d3ed7", "Mozilla/5.0");
            JSingleVesselPositionParsed parser = new JSingleVesselPositionParsed(json);
            jLabelVesselCoordinates1.setText(parser.lat + " / " + parser.lon);
            jLabelVesselName1.setText(name1);
            
            clearDisplayedData();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.out.println("Exiting");
        
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jPanelShip1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip1MousePressed
        setAnimationInvisible();
        vessel = vessels.vessel1;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnim1.setVisible(true);
        update();
    }//GEN-LAST:event_jPanelShip1MousePressed

    private void jPaneShipl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneShipl2MousePressed
        setAnimationInvisible();
        vessel = vessels.vessel2;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnim2.setVisible(true);
        update();
    }//GEN-LAST:event_jPaneShipl2MousePressed

    private void jPanelShip3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip3MousePressed
        setAnimationInvisible();
        vessel = vessels.vessel3;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnim3.setVisible(true);
        update();
    }//GEN-LAST:event_jPanelShip3MousePressed

    private void jPaneShipl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneShipl4MousePressed
        setAnimationInvisible();
        vessel = vessels.vessel4;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnim4.setVisible(true);
        update();
    }//GEN-LAST:event_jPaneShipl4MousePressed

    private void jPaneShip5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneShip5MousePressed
        setAnimationInvisible();
        vessel = vessels.vessel5;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnim5.setVisible(true);
        update();
    }//GEN-LAST:event_jPaneShip5MousePressed
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code">
        
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelRequestTimestamp;
    private javax.swing.JLabel jLabelVesselCoordinates1;
    private javax.swing.JLabel jLabelVesselCoordinates2;
    private javax.swing.JLabel jLabelVesselCoordinates3;
    private javax.swing.JLabel jLabelVesselCoordinates4;
    private javax.swing.JLabel jLabelVesselCoordinates5;
    private javax.swing.JLabel jLabelVesselCourse;
    private javax.swing.JLabel jLabelVesselDifferenceCourseHeading;
    private javax.swing.JLabel jLabelVesselHeading;
    private javax.swing.JLabel jLabelVesselIMO;
    private javax.swing.JLabel jLabelVesselImage;
    private javax.swing.JLabel jLabelVesselMMSI;
    private javax.swing.JLabel jLabelVesselName1;
    private javax.swing.JLabel jLabelVesselName2;
    private javax.swing.JLabel jLabelVesselName3;
    private javax.swing.JLabel jLabelVesselName4;
    private javax.swing.JLabel jLabelVesselName5;
    private javax.swing.JLabel jLabelVesselSpeed;
    private javax.swing.JLabel jLabelVesselStatus;
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