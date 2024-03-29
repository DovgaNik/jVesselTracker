//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.UIManager;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() throws IOException {
        
        initComponents();
        setAnimationInvisible();
        
        //<editor-fold defaultstate="collapsed" desc="Checking if folder exists and .vesseldata files">
        
        if (!folder.exists()){
            
            folder.mkdirs();
            
            config.createNewFile();
            
            vesselData1.createNewFile();
            vesselData2.createNewFile();
            vesselData3.createNewFile();
            vesselData4.createNewFile();
            vesselData5.createNewFile();
                           
        }else{
        
            if(!config.exists())
                config.createNewFile();
            
            if(!vesselData1.exists())
                vesselData1.createNewFile();
                
            if(!vesselData2.exists())
                vesselData2.createNewFile();
            
            if(!vesselData3.exists())
                vesselData3.createNewFile();
            
            if(!vesselData4.exists())
                vesselData4.createNewFile();
            
            if(!vesselData5.exists())
                vesselData5.createNewFile();
            
        }
           
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Initialazing objects">
        
        try {
           
            configuration = new Configuration(config);
        
            JFrameError jFrameErrorAPINowWorking = new JFrameError("API not working");
            
            vessel1 = new Vessel(vesselData1, configuration.apiPS07, configuration.apiVD01, jFrameErrorAPINowWorking);
            vessel2 = new Vessel(vesselData2, configuration.apiPS07, configuration.apiVD01, jFrameErrorAPINowWorking);
            vessel3 = new Vessel(vesselData3, configuration.apiPS07, configuration.apiVD01, jFrameErrorAPINowWorking);
            vessel4 = new Vessel(vesselData4, configuration.apiPS07, configuration.apiVD01, jFrameErrorAPINowWorking);
            vessel5 = new Vessel(vesselData5, configuration.apiPS07, configuration.apiVD01, jFrameErrorAPINowWorking);
            
        } catch (IOException ex){
            
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
                        
        //</editor-fold>
                
        updateSidebar();
        
        getAll();
        
        updateSidebar();
        
        clearDisplayedData();
        
        
        updateTimer();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Creating objects">
    
    File folder = new File("cache");
    
    File config = new File("cache/config");

    File vesselData1 = new File("cache/vessel1.vesseldata");
    File vesselData2 = new File("cache/vessel2.vesseldata");
    File vesselData3 = new File("cache/vessel3.vesseldata");
    File vesselData4 = new File("cache/vessel4.vesseldata");
    File vesselData5 = new File("cache/vessel5.vesseldata");

    
    Configuration configuration;
       
    Vessel vessel1;
    Vessel vessel2;
    Vessel vessel3;
    Vessel vessel4;
    Vessel vessel5;
    
    Vessel selectedVessel;
    
    
    Color oldGloryWhite = new Color(250, 248, 241);
    Color oldGloryNavy = new Color(67 ,66 ,107);
    
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jButtonAddNewShip = new javax.swing.JButton();
        jButtonDeleteShip = new javax.swing.JButton();
        jButtonEditShip = new javax.swing.JButton();
        jButtonMap = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jButtonConfigure = new javax.swing.JButton();
        jButtonAbout = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(1000, 640));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

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
        jButtonAddNewShip.setToolTipText("Add a new ship");
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
        jButtonDeleteShip.setToolTipText("Delete the selected ship");
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
        jButtonEditShip.setToolTipText("Edit the selected ship");
        jButtonEditShip.setBorder(null);
        jButtonEditShip.setBorderPainted(false);
        jButtonEditShip.setContentAreaFilled(false);
        jButtonEditShip.setFocusable(false);
        jButtonEditShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditShipActionPerformed(evt);
            }
        });

        jButtonMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/map.png"))); // NOI18N
        jButtonMap.setToolTipText("Open map");
        jButtonMap.setBorder(null);
        jButtonMap.setBorderPainted(false);
        jButtonMap.setContentAreaFilled(false);
        jButtonMap.setFocusable(false);
        jButtonMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMapActionPerformed(evt);
            }
        });

        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/refresh.png"))); // NOI18N
        jButtonRefresh.setToolTipText("Refresh all the ships");
        jButtonRefresh.setBorder(null);
        jButtonRefresh.setBorderPainted(false);
        jButtonRefresh.setContentAreaFilled(false);
        jButtonRefresh.setFocusable(false);
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonConfigure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/settings.png"))); // NOI18N
        jButtonConfigure.setToolTipText("Open configuretion panel");
        jButtonConfigure.setBorder(null);
        jButtonConfigure.setBorderPainted(false);
        jButtonConfigure.setContentAreaFilled(false);
        jButtonConfigure.setFocusable(false);
        jButtonConfigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigureActionPerformed(evt);
            }
        });

        jButtonAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/info.png"))); // NOI18N
        jButtonAbout.setToolTipText("Open configuretion panel");
        jButtonAbout.setBorder(null);
        jButtonAbout.setBorderPainted(false);
        jButtonAbout.setContentAreaFilled(false);
        jButtonAbout.setFocusable(false);
        jButtonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboutActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(250, 248, 241));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonExit.setBackground(new java.awt.Color(179, 73, 93));
        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jvesseltracker/icons/mooringPoingExit.png"))); // NOI18N
        jButtonExit.setToolTipText("Close");
        jButtonExit.setBorder(null);
        jButtonExit.setBorderPainted(false);
        jButtonExit.setContentAreaFilled(false);
        jButtonExit.setFocusable(false);
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
                .addComponent(jButtonMap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfigure, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddNewShip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(jButtonDeleteShip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditShip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConfigure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelSidebar.setBackground(new java.awt.Color(67, 66, 107));

        jPanelShipRoot1.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip1.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip1MousePressed(evt);
            }
        });

        jLabelVesselName1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelVesselName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName1.setText("N/A");
        jLabelVesselName1.setToolTipText("");

        jLabelVesselCoordinates1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
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
                .addComponent(jLabelVesselName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates1)
                .addContainerGap())
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
                    .addComponent(jPanelShip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelShipRoot2.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip2.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip2MousePressed(evt);
            }
        });

        jLabelVesselCoordinates2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabelVesselCoordinates2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselCoordinates2.setText("N/A");

        jLabelVesselName2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
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
                .addComponent(jLabelVesselName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates2)
                .addContainerGap())
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
                    .addComponent(jPanelShip2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelShipRoot3.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip3.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip3MousePressed(evt);
            }
        });

        jLabelVesselName3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelVesselName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName3.setText("N/A");

        jLabelVesselCoordinates3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
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
                .addComponent(jLabelVesselName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates3)
                .addContainerGap())
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
                    .addComponent(jPanelShip3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelShipRoot4.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip4.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip4MousePressed(evt);
            }
        });

        jLabelVesselName4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelVesselName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName4.setText("N/A");

        jLabelVesselCoordinates4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
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
                .addComponent(jLabelVesselName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates4)
                .addContainerGap())
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
                    .addComponent(jPanelShip4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelShipRoot5.setBackground(new java.awt.Color(0, 0, 0));

        jPanelShip5.setBackground(new java.awt.Color(250, 248, 241));
        jPanelShip5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelShip5MousePressed(evt);
            }
        });

        jLabelVesselName5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelVesselName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVesselName5.setText("N/A");

        jLabelVesselCoordinates5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
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
                .addComponent(jLabelVesselName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVesselCoordinates5)
                .addContainerGap())
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
                    .addComponent(jPanelShip5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(jPanelShipRoot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContent.setBackground(new java.awt.Color(250, 248, 241));

        jLabelVesselImage.setFont(new java.awt.Font("Open Sans", 0, 86)); // NOI18N
        jLabelVesselImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelVesselIMO.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelVesselIMO.setText("IMO:");

        jLabelVesselMMSI.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelVesselMMSI.setText("MMSI:");

        jLabelVesselCourse.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelVesselCourse.setText("Course:");

        jLabelVesselDifferenceCourseHeading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelVesselDifferenceCourseHeading.setText("Difference:");

        jLabelVesselSpeed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelVesselSpeed.setText("Speed:");

        jLabelVesselHeading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelVesselHeading.setText("Heading:");

        jLabelRequestTimestamp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelRequestTimestamp.setText("Timestamp:");

        jLabelVesselStatus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
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
            .addComponent(jPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 45, Short.MAX_VALUE))
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
        
        jLabelVesselImage.setIcon(null);
        jLabelVesselImage.setText("jVesselTracker");
        jLabelTitle.setText(null);
        jLabelVesselMMSI.setText("");
        jLabelVesselIMO.setText("");
        jLabelVesselHeading.setText("");
        jLabelVesselCourse.setText("");
        jLabelVesselDifferenceCourseHeading.setText("");
        jLabelVesselSpeed.setText("");
        jLabelVesselStatus.setText("");
        jLabelRequestTimestamp.setText("");
        
    }
    
    private void setDisplayedData(BufferedImage photo, String MMSI, String IMO, int heading, int course, int differenceCourseHeading, int speed, byte status, String timestamp){
        
        jLabelVesselImage.setIcon(new ImageIcon(photo));
        jLabelVesselImage.setText(null);
        jLabelTitle.setText("jVesselTracker");
        jLabelVesselMMSI.setText("MMSI: " + MMSI); //Right
        jLabelVesselIMO.setText("IMO: " + IMO);
        
        if (heading == 511){
            
            jLabelVesselHeading.setText("Heading: N/A"); //Right
            
        } else{
            
            jLabelVesselHeading.setText("Heading: " + heading); //Right
            
        }
        
        jLabelVesselCourse.setText("Course: " + course);
        jLabelVesselDifferenceCourseHeading.setText("Difference: " + differenceCourseHeading); //Right
        jLabelVesselSpeed.setText("Speed: " + speed + " knots");
        jLabelVesselStatus.setText("Status: " + status); //Right
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
    
    public void updateTimer() {
    TimerTask task = new TimerTask() {
        public void run() {
            try {
                
                getAll();
                updateTimer();
                
            } catch (IOException ex) {
                
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
        }
    };
    Timer timer = new Timer("Update timer");
    
    long delay = configuration.interval;
    timer.schedule(task, delay);
}
    
    void getAll() throws IOException{
 
        if (!vessel1.isEmpty)        
            vessel1.get(1000);
        
        if (!vessel2.isEmpty)        
            vessel2.get(1000);
        
        if (!vessel3.isEmpty)        
            vessel3.get(1000);
        
        if (!vessel4.isEmpty)        
            vessel4.get(1000);
        
        if (!vessel5.isEmpty)        
            vessel5.get(1000);
        
    }
    
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
    
    private void updateContent(){
                
        if (!selectedVessel.isEmpty)
            setDisplayedData(selectedVessel.photo, selectedVessel.MMSI, selectedVessel.IMO, selectedVessel.heading, selectedVessel.course, countDifference(selectedVessel.course, selectedVessel.heading), selectedVessel.speed, selectedVessel.status, selectedVessel.year + "." + selectedVessel.month + "." + selectedVessel.day);
        
    }
    
    private void updateSidebar(){
        
        if(!vessel1.isEmpty)
            setDisplayedDataSidebar1(vessel1.name, vessel1.lat + " / " + vessel1.lon);
        
        if(!vessel2.isEmpty)
        setDisplayedDataSidebar2(vessel2.name, vessel2.lat + " / " + vessel2.lon);
        
        if(!vessel3.isEmpty)
            setDisplayedDataSidebar3(vessel3.name, vessel3.lat + " / " + vessel3.lon);
        
        if(!vessel4.isEmpty)
            setDisplayedDataSidebar4(vessel4.name, vessel4.lat + " / " + vessel4.lon);
        
        if(!vessel5.isEmpty)
            setDisplayedDataSidebar5(vessel5.name, vessel5.lat + " / " + vessel5.lon);
        
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mouse Events">
    
    //<editor-fold defaultstate="collapsed" desc="Buttons in the title bar">
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonAddNewShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewShipActionPerformed
                
        add();
        
    }//GEN-LAST:event_jButtonAddNewShipActionPerformed

    private void add(){
    
        if (selectedVessel == null) {
        
            setAnimationInvisible();        
            selectedVessel = vessel1;

        }
        
        JFrameAddEditVessel jFrameAddVessel = new JFrameAddEditVessel(false, selectedVessel);
        jFrameAddVessel.setVisible(true);
        
    }
    
    private void jButtonDeleteShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteShipActionPerformed
        
        delete();
        
    }//GEN-LAST:event_jButtonDeleteShipActionPerformed

    private void delete(){
    
        JFrameRemoveVessel jFrameRemoveVessel = new JFrameRemoveVessel(selectedVessel);
        jFrameRemoveVessel.setVisible(true);
        
    }
    
    private void jButtonEditShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditShipActionPerformed
        
        edit();
                
    }//GEN-LAST:event_jButtonEditShipActionPerformed

    private void edit() {
    
        if (selectedVessel != null) {
        
            JFrameAddEditVessel jFrameEditVessel = new JFrameAddEditVessel(true, selectedVessel);
            jFrameEditVessel.setVisible(true);

        }else {
        
            System.out.println("You haven't chosen anything");
        
        }
        
    }
    
    private void jButtonConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigureActionPerformed
        
        configure();
        
    }//GEN-LAST:event_jButtonConfigureActionPerformed

    private void configure() {
    
        JFrameConfigure jFrameConfigure;
        try {
            
            jFrameConfigure = new JFrameConfigure(configuration);
            jFrameConfigure.setVisible(true);
            
        } catch (IOException ex) {
            
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
                
        System.out.println("Opening Configure frame");
    
    }
    
    //</editor-fold>
    
    private void jPanelShip1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip1MousePressed
        
        Ship1();
        
    }//GEN-LAST:event_jPanelShip1MousePressed

    private void Ship1(){
    
        setAnimationInvisible();        
        selectedVessel = vessel1;
        
        if(!selectedVessel.isEmpty){
        
            jPanelShipAnimation1.setBackground(oldGloryWhite);
            updateContent();
            
        }else {
        
            clearDisplayedData();
            
        }
        updateSidebar();
    
    }
    
    private void jPanelShip2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip2MousePressed
        
        Ship2();
        
    }//GEN-LAST:event_jPanelShip2MousePressed

    private void Ship2(){
    
        setAnimationInvisible();        
        selectedVessel = vessel2;
        if(!selectedVessel.isEmpty){
        
            jPanelShipAnimation2.setBackground(oldGloryWhite);
            updateContent();
            
        }else {
        
            clearDisplayedData();
            
        }
        updateSidebar();
    
    }
    
    private void jPanelShip3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip3MousePressed
        
        Ship3();

    }//GEN-LAST:event_jPanelShip3MousePressed

    private void Ship3(){
    
        setAnimationInvisible();        
        selectedVessel = vessel3;
        if(!selectedVessel.isEmpty){
        
            jPanelShipAnimation3.setBackground(oldGloryWhite);
            updateContent();
            
        }else {
        
            clearDisplayedData();
            
        }
        updateSidebar();
    
    }
    
    private void jPanelShip4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip4MousePressed
        
        Ship4();

    }//GEN-LAST:event_jPanelShip4MousePressed

    private void Ship4(){
    
        setAnimationInvisible();        
        selectedVessel = vessel4;
        if(!selectedVessel.isEmpty){
        
            jPanelShipAnimation4.setBackground(oldGloryWhite);
            updateContent();
            
        }else {
        
            clearDisplayedData();
            
        }
        updateSidebar();
    
    }
    
    private void jPanelShip5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelShip5MousePressed
        
        Ship5();

    }//GEN-LAST:event_jPanelShip5MousePressed

    private void Ship5(){
    
        setAnimationInvisible();        
        selectedVessel = vessel5;
        if(!selectedVessel.isEmpty){
        
            jPanelShipAnimation5.setBackground(oldGloryWhite);
            updateContent();
            
        }else {
        
            clearDisplayedData();
            
        }
        updateSidebar();
    
    }
    
    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        
        refresh();
        
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void refresh() {
    
        try {
            
            getAll();
            
        } catch (IOException ex) {
            
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        updateSidebar();
        
    }
    
    private void jButtonMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMapActionPerformed
        
        map();
        
    }//GEN-LAST:event_jButtonMapActionPerformed

    private void map() {
    
        JFrameAskMap jFrameAskMap = new JFrameAskMap(selectedVessel);
        jFrameAskMap.setVisible(true);
        
    }
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
                
        switch (evt.getKeyCode()){
        
            case 27:
                clearDisplayedData();
                setAnimationInvisible();
                break;
               
            case 112:
                Ship1();
                break;
            
            case 113:
                Ship2();
                break;
                
            case 114:
                Ship3();
                break;
               
            case 115:
                Ship4();
                break;
            
            case 116:
                Ship5();
                break;
                
            case 117:
                add();
                break;
               
            case 118:
                delete();
                break;
            
            case 119:
                edit();
                break;
                
            case 120:
                configure();
                break;
               
            case 121:
                refresh();
                break;
            
            case 122:
                map();
                break;
            case 123:
                about();
                break;                  
        }
        
    }//GEN-LAST:event_formKeyPressed

    private void jButtonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAboutActionPerformed
        
        about();
        
    }//GEN-LAST:event_jButtonAboutActionPerformed
    
    public void about() {
    
        JFrameAbout jFrameAbout = new JFrameAbout();
        jFrameAbout.setVisible(true);
    
    }
    
    //</editor-fold>
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc="Look and feel setting code">
        
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");
        
        try {
            
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }

        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            
            try {
                new MainFrame().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
    }

    //<editor-fold defaultstate="collapsed" desc="Variable declaration">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbout;
    private javax.swing.JButton jButtonAddNewShip;
    private javax.swing.JButton jButtonConfigure;
    private javax.swing.JButton jButtonDeleteShip;
    private javax.swing.JButton jButtonEditShip;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMap;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JLabel jLabelRequestTimestamp;
    private javax.swing.JLabel jLabelTitle;
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