package jvesseltracker;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        
        initComponents();
        setAnimationInvisible();
        
        File folder = new File("cache");
        
        if (!folder.exists()){
            
            folder.mkdirs();
                
        }
        
        //<editor-fold defaultstate="collapsed" desc="Initialazing objects">
        
        try {
           
            vessel1 = new Vessel(new File("cache/vessel1.vesseldata"));
            vessel2 = new Vessel(new File("cache/vessel2.vesseldata"));
            vessel3 = new Vessel(new File("cache/vessel3.vesseldata"));
            vessel4 = new Vessel(new File("cache/vessel4.vesseldata"));
            vessel5 = new Vessel(new File("cache/vessel5.vesseldata"));
            
        } catch (IOException ex){
            
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        //</editor-fold>
        
        fullUpdate();
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="Creating objects">
    
    vessels vessel;
    
    Vessel vessel1;
    Vessel vessel2;
    Vessel vessel3;
    Vessel vessel4;
    Vessel vessel5;
    
    Color oldGloryWhite = new Color(250, 248, 241);
    Color oldGloryNavy = new Color(67 ,66 ,107);
    
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jButtonAddNewShip = new javax.swing.JButton();
        jButtonDeleteShip = new javax.swing.JButton();
        jButtonEditShip = new javax.swing.JButton();
        jButtonConfigure = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jPanelSidebar = new javax.swing.JPanel();
        jPanelShipRoot1 = new javax.swing.JPanel();
        jPanelShip1 = new javax.swing.JPanel();
        jLabelVesselName1 = new javax.swing.JLabel();
        jLabelVesselCoordinates1 = new javax.swing.JLabel();
        jPanelShipAnimation1 = new javax.swing.JPanel();
        jPanelShipRoot2 = new javax.swing.JPanel();
        jPanelShip2 = new javax.swing.JPanel();
        jLabelVesselCoordinates2 = new javax.swing.JLabel();
        jLabelVesselName2 = new javax.swing.JLabel();
        jPanelShipAnimation2 = new javax.swing.JPanel();
        jPanelShipRoot3 = new javax.swing.JPanel();
        jPanelShip3 = new javax.swing.JPanel();
        jLabelVesselName3 = new javax.swing.JLabel();
        jLabelVesselCoordinates3 = new javax.swing.JLabel();
        jPanelShipAnimation3 = new javax.swing.JPanel();
        jPanelShipRoot4 = new javax.swing.JPanel();
        jPanelShip4 = new javax.swing.JPanel();
        jLabelVesselName4 = new javax.swing.JLabel();
        jLabelVesselCoordinates4 = new javax.swing.JLabel();
        jPanelShipAnimation4 = new javax.swing.JPanel();
        jPanelShipRoot5 = new javax.swing.JPanel();
        jPanelShip5 = new javax.swing.JPanel();
        jLabelVesselName5 = new javax.swing.JLabel();
        jLabelVesselCoordinates5 = new javax.swing.JLabel();
        jPanelShipAnimation5 = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();
        jLabelVesselImage = new javax.swing.JLabel();
        jLabelVesselIMO = new javax.swing.JLabel();
        jLabelVesselMMSI = new javax.swing.JLabel();
        jLabelVesselCourse = new javax.swing.JLabel();
        jLabelVesselDifferenceCourseHeading = new javax.swing.JLabel();
        jLabelVesselSpeed = new javax.swing.JLabel();
        jLabelVesselHeading = new javax.swing.JLabel();
        jLabelRequestTimestamp = new javax.swing.JLabel();
        jLabelVesselStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jVesselTracker");
        setBackground(new java.awt.Color(0, 0, 0));
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

        jButtonAddNewShip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/add.png"))); // NOI18N
        jButtonAddNewShip.setBorder(null);
        jButtonAddNewShip.setBorderPainted(false);
        jButtonAddNewShip.setContentAreaFilled(false);
        jButtonAddNewShip.setFocusable(false);
        jButtonAddNewShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewShipActionPerformed(evt);
            }
        });

        jButtonDeleteShip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/delete.png"))); // NOI18N
        jButtonDeleteShip.setBorder(null);
        jButtonDeleteShip.setBorderPainted(false);
        jButtonDeleteShip.setContentAreaFilled(false);
        jButtonDeleteShip.setFocusable(false);
        jButtonDeleteShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteShipActionPerformed(evt);
            }
        });

        jButtonEditShip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/edit.png"))); // NOI18N
        jButtonEditShip.setBorder(null);
        jButtonEditShip.setBorderPainted(false);
        jButtonEditShip.setContentAreaFilled(false);
        jButtonEditShip.setFocusable(false);
        jButtonEditShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditShipActionPerformed(evt);
            }
        });

        jButtonConfigure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/settings.png"))); // NOI18N
        jButtonConfigure.setBorder(null);
        jButtonConfigure.setBorderPainted(false);
        jButtonConfigure.setContentAreaFilled(false);
        jButtonConfigure.setFocusable(false);
        jButtonConfigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigureActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jButtonAddNewShip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteShip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditShip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfigure, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 791, Short.MAX_VALUE)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonAddNewShip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonDeleteShip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonEditShip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonConfigure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelSidebar.setBackground(new java.awt.Color(67, 66, 107));

        jPanelShipRoot1.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip1.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip1MousePressed(evt);
            }
        });

        jLabelVesselName1.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabelVesselName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName1.setText("N/A");
        jLabelVesselName1.setToolTipText("");

        jLabelVesselCoordinates1.setFont(new java.awt.Font("Lato Light", 0, 24)); // NOI18N
        jLabelVesselCoordinates1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselCoordinates1.setText("N/A");

        javax.swing.GroupLayout jPanelShip1Layout = new javax.swing.GroupLayout(jPanelShip1);
        jPanelShip1.setLayout(jPanelShip1Layout);
        jPanelShip1Layout.setHorizontalGroup(
            jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVesselName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelVesselCoordinates1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelShip1Layout.setVerticalGroup(
            jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShip1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelShipAnimation1.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnimation1Layout = new javax.swing.GroupLayout(jPanelShipAnimation1);
        jPanelShipAnimation1.setLayout(jPanelShipAnimation1Layout);
        jPanelShipAnimation1Layout.setHorizontalGroup(
            jPanelShipAnimation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnimation1Layout.setVerticalGroup(
            jPanelShipAnimation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelShipRoot1Layout = new javax.swing.GroupLayout(jPanelShipRoot1);
        jPanelShipRoot1.setLayout(jPanelShipRoot1Layout);
        jPanelShipRoot1Layout.setHorizontalGroup(
            jPanelShipRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShipRoot1Layout.createSequentialGroup()
                .addComponent(jPanelShip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelShipAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelShipRoot1Layout.setVerticalGroup(
            jPanelShipRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShipRoot1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelShipRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelShipAnimation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelShip1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)))
        );

        jPanelShipRoot2.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip2.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip2MousePressed(evt);
            }
        });

        jLabelVesselCoordinates2.setFont(new java.awt.Font("Lato Light", 0, 24)); // NOI18N
        jLabelVesselCoordinates2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselCoordinates2.setText("N/A");

        jLabelVesselName2.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabelVesselName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName2.setText("N/A");

        javax.swing.GroupLayout jPanelShip2Layout = new javax.swing.GroupLayout(jPanelShip2);
        jPanelShip2.setLayout(jPanelShip2Layout);
        jPanelShip2Layout.setHorizontalGroup(
            jPanelShip2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVesselName2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelVesselCoordinates2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelShip2Layout.setVerticalGroup(
            jPanelShip2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShip2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelShipAnimation2.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnimation2Layout = new javax.swing.GroupLayout(jPanelShipAnimation2);
        jPanelShipAnimation2.setLayout(jPanelShipAnimation2Layout);
        jPanelShipAnimation2Layout.setHorizontalGroup(
            jPanelShipAnimation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnimation2Layout.setVerticalGroup(
            jPanelShipAnimation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelShipRoot2Layout = new javax.swing.GroupLayout(jPanelShipRoot2);
        jPanelShipRoot2.setLayout(jPanelShipRoot2Layout);
        jPanelShipRoot2Layout.setHorizontalGroup(
            jPanelShipRoot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShipRoot2Layout.createSequentialGroup()
                .addComponent(jPanelShip2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelShipAnimation2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelShipRoot2Layout.setVerticalGroup(
            jPanelShipRoot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShipRoot2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelShipRoot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelShipAnimation2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelShip2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)))
        );

        jPanelShipRoot3.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip3.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip3MousePressed(evt);
            }
        });

        jLabelVesselName3.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabelVesselName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName3.setText("N/A");

        jLabelVesselCoordinates3.setFont(new java.awt.Font("Lato Light", 0, 24)); // NOI18N
        jLabelVesselCoordinates3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselCoordinates3.setText("N/A");

        javax.swing.GroupLayout jPanelShip3Layout = new javax.swing.GroupLayout(jPanelShip3);
        jPanelShip3.setLayout(jPanelShip3Layout);
        jPanelShip3Layout.setHorizontalGroup(
            jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVesselName3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelVesselCoordinates3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelShip3Layout.setVerticalGroup(
            jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShip3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelShipAnimation3.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnimation3Layout = new javax.swing.GroupLayout(jPanelShipAnimation3);
        jPanelShipAnimation3.setLayout(jPanelShipAnimation3Layout);
        jPanelShipAnimation3Layout.setHorizontalGroup(
            jPanelShipAnimation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnimation3Layout.setVerticalGroup(
            jPanelShipAnimation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelShipRoot3Layout = new javax.swing.GroupLayout(jPanelShipRoot3);
        jPanelShipRoot3.setLayout(jPanelShipRoot3Layout);
        jPanelShipRoot3Layout.setHorizontalGroup(
            jPanelShipRoot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShipRoot3Layout.createSequentialGroup()
                .addComponent(jPanelShip3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelShipAnimation3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelShipRoot3Layout.setVerticalGroup(
            jPanelShipRoot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShipRoot3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelShipRoot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelShipAnimation3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelShip3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)))
        );

        jPanelShipRoot4.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip4.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip4MousePressed(evt);
            }
        });

        jLabelVesselName4.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabelVesselName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName4.setText("N/A");

        jLabelVesselCoordinates4.setFont(new java.awt.Font("Lato Light", 0, 24)); // NOI18N
        jLabelVesselCoordinates4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselCoordinates4.setText("N/A");

        javax.swing.GroupLayout jPanelShip4Layout = new javax.swing.GroupLayout(jPanelShip4);
        jPanelShip4.setLayout(jPanelShip4Layout);
        jPanelShip4Layout.setHorizontalGroup(
            jPanelShip4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVesselName4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelVesselCoordinates4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelShip4Layout.setVerticalGroup(
            jPanelShip4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShip4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelShipAnimation4.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnimation4Layout = new javax.swing.GroupLayout(jPanelShipAnimation4);
        jPanelShipAnimation4.setLayout(jPanelShipAnimation4Layout);
        jPanelShipAnimation4Layout.setHorizontalGroup(
            jPanelShipAnimation4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnimation4Layout.setVerticalGroup(
            jPanelShipAnimation4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelShipRoot4Layout = new javax.swing.GroupLayout(jPanelShipRoot4);
        jPanelShipRoot4.setLayout(jPanelShipRoot4Layout);
        jPanelShipRoot4Layout.setHorizontalGroup(
            jPanelShipRoot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShipRoot4Layout.createSequentialGroup()
                .addComponent(jPanelShip4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelShipAnimation4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelShipRoot4Layout.setVerticalGroup(
            jPanelShipRoot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShipRoot4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelShipRoot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelShipAnimation4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelShip4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)))
        );

        jPanelShipRoot5.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip5.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip5MousePressed(evt);
            }
        });

        jLabelVesselName5.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabelVesselName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName5.setText("N/A");

        jLabelVesselCoordinates5.setFont(new java.awt.Font("Lato Light", 0, 24)); // NOI18N
        jLabelVesselCoordinates5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselCoordinates5.setText("N/A");

        javax.swing.GroupLayout jPanelShip5Layout = new javax.swing.GroupLayout(jPanelShip5);
        jPanelShip5.setLayout(jPanelShip5Layout);
        jPanelShip5Layout.setHorizontalGroup(
            jPanelShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVesselName5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelVesselCoordinates5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelShip5Layout.setVerticalGroup(
            jPanelShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShip5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelShipAnimation5.setBackground(new java.awt.Color(250, 248, 241));

        javax.swing.GroupLayout jPanelShipAnimation5Layout = new javax.swing.GroupLayout(jPanelShipAnimation5);
        jPanelShipAnimation5.setLayout(jPanelShipAnimation5Layout);
        jPanelShipAnimation5Layout.setHorizontalGroup(
            jPanelShipAnimation5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelShipAnimation5Layout.setVerticalGroup(
            jPanelShipAnimation5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelShipRoot5Layout = new javax.swing.GroupLayout(jPanelShipRoot5);
        jPanelShipRoot5.setLayout(jPanelShipRoot5Layout);
        jPanelShipRoot5Layout.setHorizontalGroup(
            jPanelShipRoot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShipRoot5Layout.createSequentialGroup()
                .addComponent(jPanelShip5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelShipAnimation5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelShipRoot5Layout.setVerticalGroup(
            jPanelShipRoot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShipRoot5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelShipRoot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelShipAnimation5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelShip5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelSidebarLayout = new javax.swing.GroupLayout(jPanelSidebar);
        jPanelSidebar.setLayout(jPanelSidebarLayout);
        jPanelSidebarLayout.setHorizontalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelShipRoot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShipRoot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShipRoot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShipRoot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShipRoot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelSidebarLayout.setVerticalGroup(
            jPanelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSidebarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContent.setBackground(new java.awt.Color(250, 248, 241));

        jLabelVesselIMO.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelVesselIMO.setText("IMO:");

        jLabelVesselMMSI.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelVesselMMSI.setText("MMSI:");

        jLabelVesselCourse.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelVesselCourse.setText("Course:");

        jLabelVesselDifferenceCourseHeading.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelVesselDifferenceCourseHeading.setText("Difference:");

        jLabelVesselSpeed.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelVesselSpeed.setText("Speed:");

        jLabelVesselHeading.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelVesselHeading.setText("Heading:");

        jLabelRequestTimestamp.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelRequestTimestamp.setText("Timestamp:");

        jLabelVesselStatus.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabelVesselStatus.setText("Status:");

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVesselImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelRequestTimestamp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVesselStatus))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelVesselIMO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVesselMMSI))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelVesselCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVesselDifferenceCourseHeading))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelVesselSpeed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVesselHeading)))
                .addContainerGap())
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVesselImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVesselIMO)
                    .addComponent(jLabelVesselMMSI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVesselDifferenceCourseHeading)
                    .addComponent(jLabelVesselCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVesselSpeed)
                    .addComponent(jLabelVesselHeading))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelSidebar.getAccessibleContext().setAccessibleName("Sidebar");
        jPanelContent.getAccessibleContext().setAccessibleName("Content Pane");

        getAccessibleContext().setAccessibleDescription("jVesselTracker window");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //<editor-fold defaultstate="collapsed" desc="Drag and move window">
    
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

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Working with on-screen data">
    
    private void setAnimationInvisible(){
       
        jPanelShipAnimation1.setBackground(oldGloryNavy);
        jPanelShipAnimation2.setBackground(oldGloryNavy);
        jPanelShipAnimation3.setBackground(oldGloryNavy);
        jPanelShipAnimation4.setBackground(oldGloryNavy);
        jPanelShipAnimation5.setBackground(oldGloryNavy);
        
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
    
    private void setDisplayedDataSidebar1 (String name, String coordinates){
   
        jLabelVesselName1.setText(name);
        jLabelVesselCoordinates1.setText(coordinates);
   
    }
    
    private void setDisplayedDataSidebar2 (String name, String coordinates){
    
        jLabelVesselName2.setText(name);
        jLabelVesselCoordinates2.setText(coordinates);
   
    }
    
    private void setDisplayedDataSidebar3 (String name, String coordinates){
    
        jLabelVesselName3.setText(name);
        jLabelVesselCoordinates3.setText(coordinates);
    
    }
    
    private void setDisplayedDataSidebar4 (String name, String coordinates){
    
        jLabelVesselName4.setText(name);
        jLabelVesselCoordinates4.setText(coordinates);
    
    }
    
    private void setDisplayedDataSidebar5 (String name, String coordinates){
    
        jLabelVesselName5.setText(name);
        jLabelVesselCoordinates5.setText(coordinates);
    
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Updating data">
    
    int countDifference(int course, int heading){
        
        int difference = 0;
               
        if (heading > course)
            difference = heading - course;

        if (heading < course) 
            difference = course - heading;

        if (heading == course) 
            difference = 0;
              
        return difference;
    }
    
    private void update1(){
                
        setDisplayedData("image", vessel1.MMSI, vessel1.IMO, vessel1.heading, vessel1.course, Integer.toString(countDifference(Integer.parseInt(vessel1.course), Integer.parseInt(vessel1.heading))), vessel1.speed, vessel1.status, vessel1.year + "." + vessel1.month + "." + vessel1.day);
        
    }
    
    private void update2(){
        
        setDisplayedData("image", vessel2.MMSI, vessel2.IMO, vessel2.heading, vessel2.course, Integer.toString(countDifference(Integer.parseInt(vessel2.course), Integer.parseInt(vessel2.heading))), vessel2.speed, vessel2.status, vessel2.year + "." + vessel2.month + "." + vessel2.day);
        
    }
    
    private void update3(){
        
        setDisplayedData("image", vessel3.MMSI, vessel3.IMO, vessel3.heading, vessel3.course, Integer.toString(countDifference(Integer.parseInt(vessel3.course), Integer.parseInt(vessel3.heading))), vessel3.speed, vessel3.status, vessel3.year + "." + vessel3.month + "." + vessel3.day);   
        
    }
    
    private void update4(){
        
        setDisplayedData("image", vessel4.MMSI, vessel4.IMO, vessel4.heading, vessel4.course, Integer.toString(countDifference(Integer.parseInt(vessel4.course), Integer.parseInt(vessel4.heading))), vessel4.speed, vessel4.status, vessel4.year + "." + vessel4.month + "." + vessel4.day); 
        
    }
    
    private void update5(){
        
        setDisplayedData("image", vessel5.MMSI, vessel5.IMO, vessel5.heading, vessel5.course, Integer.toString(countDifference(Integer.parseInt(vessel5.course), Integer.parseInt(vessel5.heading))), vessel5.speed, vessel5.status, vessel5.year + "." + vessel5.month + "." + vessel5.day);
        
    }
    
    private void fullUpdate(){
        
        setDisplayedDataSidebar1(vessel1.name, vessel1.lat + " / " + vessel1.lon);
        setDisplayedDataSidebar2(vessel2.name, vessel2.lat + " / " + vessel2.lon);
        setDisplayedDataSidebar3(vessel3.name, vessel3.lat + " / " + vessel3.lon);
        setDisplayedDataSidebar4(vessel4.name, vessel4.lat + " / " + vessel4.lon);
        setDisplayedDataSidebar5(vessel5.name, vessel5.lat + " / " + vessel5.lon);
        
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mouse Events">
    
    //<editor-fold defaultstate="collapsed" desc="Buttons in the title bar">
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        System.out.println("Exiting");

        System.exit(0);
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonAddNewShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewShipActionPerformed
        
        Vessel selectedVessel;
        
        switch (vessel){
            
            case vessel1:
                
                selectedVessel = vessel1;
                
                break;
                
            case vessel2:
                                
                selectedVessel = vessel2;
                
                break;
            
            case vessel3:
                
                selectedVessel = vessel3;
                
                break;
                
            case vessel4:
                
                selectedVessel = vessel4;
                
                break;
            
            case vessel5:
                
                selectedVessel = vessel5;
                
                break;
            
            default:
                
                selectedVessel = vessel1;
        }
        JFrameAddEditVessel jFrameAddVessel = new JFrameAddEditVessel(false, selectedVessel);
        jFrameAddVessel.setVisible(true);
        
        System.out.println("Opening Add frame");
        
    }//GEN-LAST:event_jButtonAddNewShipActionPerformed

    private void jButtonDeleteShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteShipActionPerformed
        
        JFrameRemoveVessel jFrameRemoveVessel = new JFrameRemoveVessel();
        jFrameRemoveVessel.setVisible(true);
        
        System.out.println("Opening Remove frame");
        
    }//GEN-LAST:event_jButtonDeleteShipActionPerformed

    private void jButtonEditShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditShipActionPerformed
        
        JFrameAddEditVessel jFrameEditVessel = new JFrameAddEditVessel(true, vessel1);
        jFrameEditVessel.setVisible(true);
        
        System.out.println("Opening Edit frame");
        
    }//GEN-LAST:event_jButtonEditShipActionPerformed

    private void jButtonConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigureActionPerformed
        
        JFrameConfigure jFrameConfigure = new JFrameConfigure();
        jFrameConfigure.setVisible(true);
        
        System.out.println("Opening Configure frame");
        
    }//GEN-LAST:event_jButtonConfigureActionPerformed

    //</editor-fold>
    
    private void jPanelShip1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip1MousePressed
        
        setAnimationInvisible();
        vessel = vessels.vessel1;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnimation1.setBackground(oldGloryWhite);
        update1();
        fullUpdate();
        
    }//GEN-LAST:event_jPanelShip1MousePressed

    private void jPanelShip2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip2MousePressed
        
        setAnimationInvisible();
        vessel = vessels.vessel2;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnimation2.setBackground(oldGloryWhite);
        update2();
        fullUpdate();
        
    }//GEN-LAST:event_jPanelShip2MousePressed

    private void jPanelShip3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip3MousePressed
        
        setAnimationInvisible();
        vessel = vessels.vessel3;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnimation3.setBackground(oldGloryWhite);
        update3();
        fullUpdate();
        
    }//GEN-LAST:event_jPanelShip3MousePressed

    private void jPanelShip4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip4MousePressed
        
        setAnimationInvisible();
        vessel = vessels.vessel4;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnimation4.setBackground(oldGloryWhite);
        update4();
        fullUpdate();
        
    }//GEN-LAST:event_jPanelShip4MousePressed

    private void jPanelShip5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip5MousePressed
        
        setAnimationInvisible();
        vessel = vessels.vessel5;
        System.out.println("Ship selected is " + vessel);
        jPanelShipAnimation5.setBackground(oldGloryWhite);
        update5();
        fullUpdate();
        
    }//GEN-LAST:event_jPanelShip5MousePressed
    
    //</editor-fold>
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc="Look and feel setting code">
        
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

    //<editor-fold defaultstate="collapsed" desc="Variable declaration">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewShip;
    private javax.swing.JButton jButtonConfigure;
    private javax.swing.JButton jButtonDeleteShip;
    private javax.swing.JButton jButtonEditShip;
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
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelShip1;
    private javax.swing.JPanel jPanelShip2;
    private javax.swing.JPanel jPanelShip3;
    private javax.swing.JPanel jPanelShip4;
    private javax.swing.JPanel jPanelShip5;
    private javax.swing.JPanel jPanelShipAnimation1;
    private javax.swing.JPanel jPanelShipAnimation2;
    private javax.swing.JPanel jPanelShipAnimation3;
    private javax.swing.JPanel jPanelShipAnimation4;
    private javax.swing.JPanel jPanelShipAnimation5;
    private javax.swing.JPanel jPanelShipRoot1;
    private javax.swing.JPanel jPanelShipRoot2;
    private javax.swing.JPanel jPanelShipRoot3;
    private javax.swing.JPanel jPanelShipRoot4;
    private javax.swing.JPanel jPanelShipRoot5;
    private javax.swing.JPanel jPanelSidebar;
    private javax.swing.JPanel jPanelTitle;
    // End of variables declaration//GEN-END:variables
    
    //</editor-fold>
}