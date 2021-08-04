package jvesseltracker;

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
        jPanelShipAnimation1 = new javax.swing.JPanel();
        jPanelShipRoot2 = new javax.swing.JPanel();
        jPanelShip2 = new javax.swing.JPanel();
        jPanelShipAnimation2 = new javax.swing.JPanel();
        jPanelShipRoot3 = new javax.swing.JPanel();
        jPanelShip3 = new javax.swing.JPanel();
        jPanelShipAnimation3 = new javax.swing.JPanel();
        jPanelShipRoot4 = new javax.swing.JPanel();
        jPanelShip4 = new javax.swing.JPanel();
        jPanelShipAnimation4 = new javax.swing.JPanel();
        jPanelShipRoot5 = new javax.swing.JPanel();
        jPanelShip5 = new javax.swing.JPanel();
        jPanelShipAnimation5 = new javax.swing.JPanel();

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

        jPanelShipRoot1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelShip1Layout = new javax.swing.GroupLayout(jPanelShip1);
        jPanelShip1.setLayout(jPanelShip1Layout);
        jPanelShip1Layout.setHorizontalGroup(
            jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanelShip1Layout.setVerticalGroup(
            jPanelShip1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
                .addGroup(jPanelShipRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelShipAnimation1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShip1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelShipRoot2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelShip2Layout = new javax.swing.GroupLayout(jPanelShip2);
        jPanelShip2.setLayout(jPanelShip2Layout);
        jPanelShip2Layout.setHorizontalGroup(
            jPanelShip2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanelShip2Layout.setVerticalGroup(
            jPanelShip2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
                .addGroup(jPanelShipRoot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelShipAnimation2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShip2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelShipRoot3.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelShip3Layout = new javax.swing.GroupLayout(jPanelShip3);
        jPanelShip3.setLayout(jPanelShip3Layout);
        jPanelShip3Layout.setHorizontalGroup(
            jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanelShip3Layout.setVerticalGroup(
            jPanelShip3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
                .addGroup(jPanelShipRoot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelShipAnimation3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShip3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelShipRoot4.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelShip4Layout = new javax.swing.GroupLayout(jPanelShip4);
        jPanelShip4.setLayout(jPanelShip4Layout);
        jPanelShip4Layout.setHorizontalGroup(
            jPanelShip4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanelShip4Layout.setVerticalGroup(
            jPanelShip4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
                .addGroup(jPanelShipRoot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelShipAnimation4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShip4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelShipRoot5.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelShip5Layout = new javax.swing.GroupLayout(jPanelShip5);
        jPanelShip5.setLayout(jPanelShip5Layout);
        jPanelShip5Layout.setHorizontalGroup(
            jPanelShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanelShip5Layout.setVerticalGroup(
            jPanelShip5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
                .addGroup(jPanelShipRoot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelShipAnimation5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelShip5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap()
                .addComponent(jPanelShipRoot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelShipRoot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelShipRoot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelSidebar.getAccessibleContext().setAccessibleName("Sidebar");

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
//        
//        jPanelShipAnim1.setVisible(false);
//        jPanelShipAnim2.setVisible(false);
//        jPanelShipAnim3.setVisible(false);
//        jPanelShipAnim4.setVisible(false);
//        jPanelShipAnim5.setVisible(false);
//        
    }
    
    private void clearDisplayedData(){
//        
//        jLabelVesselImage.setText("");
//        jLabelVesselMMSI.setText("");
//        jLabelVesselIMO.setText("");
//        jLabelVesselHeading.setText("");
//        jLabelVesselCourse.setText("");
//        jLabelVesselDifferenceCourseHeading.setText("");
//        jLabelVesselSpeed.setText("");
//        jLabelVesselStatus.setText("");
//        jLabelRequestTimestamp.setText("");
//        
    }
    
    private void setDisplayedData(String linkToIcon, String MMSI, String IMO, String heading, String course, String differenceCourseHeading, String speed, String status, String timestamp){
//        
//        jLabelVesselImage.setIcon(new ImageIcon(linkToIcon));
//        jLabelVesselMMSI.setText("MMSI :" + MMSI);
//        jLabelVesselIMO.setText("IMO :" + IMO);
//        jLabelVesselHeading.setText("Heading :" + heading);
//        jLabelVesselCourse.setText("Course :" + course);
//        jLabelVesselDifferenceCourseHeading.setText("Difference :" + differenceCourseHeading);
//        jLabelVesselSpeed.setText("Speed:" + speed);
//        jLabelVesselStatus.setText("Status: " + status);
//        jLabelRequestTimestamp.setText("Timestamp: " + timestamp);
//        
    }
    
    private void setDisplayedDataSidebar1 (String name, String coordinates){
//    
//        jLabelVesselName1.setText(name);
//        jLabelVesselCoordinates1.setText(coordinates);
//    
    }
    
    private void setDisplayedDataSidebar2 (String name, String coordinates){
//    
//        jLabelVesselName2.setText(name);
//        jLabelVesselCoordinates2.setText(coordinates);
//    
    }
    
    private void setDisplayedDataSidebar3 (String name, String coordinates){
//    
//        jLabelVesselName3.setText(name);
//        jLabelVesselCoordinates3.setText(coordinates);
//    
    }
    
    private void setDisplayedDataSidebar4 (String name, String coordinates){
//    
//        jLabelVesselName4.setText(name);
//        jLabelVesselCoordinates4.setText(coordinates);
    
    }
    
    private void setDisplayedDataSidebar5 (String name, String coordinates){
    
//        jLabelVesselName5.setText(name);
//        jLabelVesselCoordinates5.setText(coordinates);
    
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Updating data">
    
    private void update1(){
        
        int difference = 0;
        int heading = Integer.parseInt(vessel1.heading);
        int course = Integer.parseInt(vessel1.course);
        
        
        if (heading > course) {
            difference = heading - course;
        }
        
        if (heading < course) {
            difference = course - heading;

        }
        
        if (heading == course) {
            difference = 0;
        }
        
        setDisplayedData("image", vessel1.MMSI, vessel1.IMO, vessel1.heading, vessel1.course, String.valueOf(difference), vessel1.speed, vessel1.status, vessel1.year + "." + vessel1.month + "." + vessel1.day);
        
    }
    
    private void update2(){
        
        
        
    }
    
    private void update3(){
        
        
        
    }
    
    private void update4(){
        
        
        
    }
    
    private void update5(){
        
        
        
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
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        System.out.println("Exiting");

        System.exit(0);
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonAddNewShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewShipActionPerformed

        JFrameAddVessel jFrameAddVessel = new JFrameAddVessel();
        jFrameAddVessel.setVisible(true);
        
        System.out.println("Opening Add frame");
        
    }//GEN-LAST:event_jButtonAddNewShipActionPerformed

    private void jButtonDeleteShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteShipActionPerformed
        
        JFrameRemoveVessel jFrameRemoveVessel = new JFrameRemoveVessel();
        jFrameRemoveVessel.setVisible(true);
        
        System.out.println("Opening Remove frame");
        
    }//GEN-LAST:event_jButtonDeleteShipActionPerformed

    private void jButtonEditShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditShipActionPerformed
        
        JFrameEditVessel jFrameEditVessel = new JFrameEditVessel();
        jFrameEditVessel.setVisible(true);
        
        System.out.println("Opening Edit frame");
        
    }//GEN-LAST:event_jButtonEditShipActionPerformed

    private void jButtonConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigureActionPerformed
        
        JFrameConfigure jFrameConfigure = new JFrameConfigure();
        jFrameConfigure.setVisible(true);
        
        System.out.println("Opening Configure frame");
        
    }//GEN-LAST:event_jButtonConfigureActionPerformed
    
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