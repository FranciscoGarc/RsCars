/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Fran
 */
public class vDashboardCont extends javax.swing.JFrame {
int xMouse, yMouse;
    /**
     * Creates new form vDashboardCont
     */
    public vDashboardCont() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBg = new com.k33ptoo.components.KGradientPanel();
        pArriba = new com.k33ptoo.components.KGradientPanel();
        btnExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PMenu = new com.k33ptoo.components.KGradientPanel();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        kButton8 = new com.k33ptoo.components.KButton();
        kButton9 = new com.k33ptoo.components.KButton();
        PPrincipal = new com.k33ptoo.components.KGradientPanel();
        imgBg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setUndecorated(true);
        setResizable(false);

        PBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pArriba.setkBorderRadius(0);
        pArriba.setkEndColor(new java.awt.Color(51, 102, 0));
        pArriba.setkStartColor(new java.awt.Color(0, 102, 0));
        pArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pArribaMouseDragged(evt);
            }
        });
        pArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pArribaMousePressed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RSCars");

        javax.swing.GroupLayout pArribaLayout = new javax.swing.GroupLayout(pArriba);
        pArriba.setLayout(pArribaLayout);
        pArribaLayout.setHorizontalGroup(
            pArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pArribaLayout.setVerticalGroup(
            pArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PBg.add(pArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        PMenu.setkEndColor(new java.awt.Color(0, 153, 0));
        PMenu.setkStartColor(new java.awt.Color(51, 102, 0));
        PMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton2.setText("Cerrar sesion");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton2.setkBackGroundColor(new java.awt.Color(0, 102, 51));
        kButton2.setkEndColor(new java.awt.Color(51, 204, 0));
        kButton2.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        kButton2.setkPressedColor(new java.awt.Color(255, 102, 102));
        kButton2.setkSelectedColor(new java.awt.Color(255, 153, 153));
        kButton2.setkStartColor(new java.awt.Color(0, 102, 102));
        PMenu.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, 110, 50));

        kButton6.setText("Detalles de citas");
        kButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton6.setkBackGroundColor(new java.awt.Color(0, 102, 51));
        kButton6.setkEndColor(new java.awt.Color(51, 204, 0));
        kButton6.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(0, 204, 51));
        kButton6.setkPressedColor(new java.awt.Color(0, 102, 0));
        kButton6.setkSelectedColor(new java.awt.Color(0, 102, 102));
        kButton6.setkStartColor(new java.awt.Color(0, 102, 102));
        PMenu.add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 100));

        kButton7.setText("Gastos");
        kButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton7.setkBackGroundColor(new java.awt.Color(0, 102, 51));
        kButton7.setkEndColor(new java.awt.Color(51, 204, 0));
        kButton7.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(0, 204, 51));
        kButton7.setkPressedColor(new java.awt.Color(0, 102, 0));
        kButton7.setkSelectedColor(new java.awt.Color(0, 102, 102));
        kButton7.setkStartColor(new java.awt.Color(0, 102, 102));
        PMenu.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 100));

        kButton8.setText("Ingresos");
        kButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton8.setkBackGroundColor(new java.awt.Color(0, 102, 51));
        kButton8.setkEndColor(new java.awt.Color(51, 204, 0));
        kButton8.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(0, 204, 51));
        kButton8.setkPressedColor(new java.awt.Color(0, 102, 0));
        kButton8.setkSelectedColor(new java.awt.Color(0, 102, 102));
        kButton8.setkStartColor(new java.awt.Color(0, 102, 102));
        PMenu.add(kButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 220, 100));

        kButton9.setText("Ventas");
        kButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton9.setkBackGroundColor(new java.awt.Color(0, 102, 51));
        kButton9.setkEndColor(new java.awt.Color(51, 204, 0));
        kButton9.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(0, 204, 51));
        kButton9.setkPressedColor(new java.awt.Color(0, 102, 0));
        kButton9.setkSelectedColor(new java.awt.Color(0, 102, 102));
        kButton9.setkStartColor(new java.awt.Color(0, 102, 102));
        PMenu.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 100));

        PBg.add(PMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 880));

        PPrincipal.setLayout(new java.awt.BorderLayout());

        imgBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg1.png"))); // NOI18N
        PPrincipal.add(imgBg, java.awt.BorderLayout.CENTER);

        PBg.add(PPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 960, 880));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg1.png"))); // NOI18N
        PBg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void pArribaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pArribaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pArribaMouseDragged

    private void pArribaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pArribaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pArribaMousePressed

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
            java.util.logging.Logger.getLogger(vDashboardCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vDashboardCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vDashboardCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vDashboardCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vDashboardCont().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel PBg;
    private com.k33ptoo.components.KGradientPanel PMenu;
    private com.k33ptoo.components.KGradientPanel PPrincipal;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel imgBg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KButton kButton9;
    private com.k33ptoo.components.KGradientPanel pArriba;
    // End of variables declaration//GEN-END:variables
}