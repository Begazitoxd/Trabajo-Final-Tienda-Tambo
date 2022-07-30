
package trabajofinal;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;



public class VentasTambo extends javax.swing.JFrame {

    String productos[]={"Arroz","Cafe","Aceite","Cereal","Leche","Atun","Mermelada","Sal","Fideos","Sopas"};
    double precios[]={4.40,9.90,12.50,10,5,5.90,4.50,3,3.40,1.80};
    double precio=0;
    int cantidad=0;
    DefaultTableModel modelo=new DefaultTableModel();
    ArrayList<TrabajoFinal> listaVentas=new ArrayList<TrabajoFinal>();
    
    public VentasTambo() {
        initComponents();
        this.setTitle("TAMBO");
        Image icono=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/tambo.png"));        
        this.setIconImage(icono);
        
        Image logo=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/tambo.png"));        
        lxx.setIcon(new ImageIcon(logo.getScaledInstance(lxx.getWidth(),lxx.getHeight(),Image.SCALE_SMOOTH)));
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        Image iconoAgregar=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/4.png"));
        btnAgregar.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(50,50,Image.SCALE_SMOOTH )));
        DefaultComboBoxModel comboModel=new DefaultComboBoxModel(productos);
        CBO.setModel(comboModel);
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO U.");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lxx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBO = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        IMPO = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PRO = new javax.swing.JLabel();
        IGV = new javax.swing.JLabel();
        PRECIO = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lxx, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 153, 78));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CANTIDAD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        TOTAL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TOTAL.setText("S/0.00 PEN");
        getContentPane().add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("IMPORTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        CBO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOActionPerformed(evt);
            }
        });
        getContentPane().add(CBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 100, -1));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 146, 100, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PRECIO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        IMPO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IMPO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IMPO.setText("S/0.00 PEN");
        getContentPane().add(IMPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 120, -1));

        TABLA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TABLA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 550, 190));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("SUBTOTAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("IGV");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("TOTAL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        PRO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PRO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PRO.setText("S/0.00 PEN");
        getContentPane().add(PRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 120, -1));

        IGV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IGV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IGV.setText("S/0.00 PEN");
        getContentPane().add(IGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 120, -1));

        PRECIO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PRECIO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PRECIO.setText("S/0.00 PEN");
        getContentPane().add(PRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, -1));

        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 80, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      TrabajoFinal venta=new TrabajoFinal();
      venta.setId(CBO.getSelectedIndex());
      venta.setDescripcion(CBO.getSelectedItem().toString());
      venta.setPrecio(precio);
      venta.setCantidad(cantidad);
      venta.setImporte(precio*cantidad);
      if(!buscarVenta(venta)){
          listaVentas.add(venta);
      }
      
      listaVentas.add(venta);
      actualizarTabla();
      borrarVenta();
    }//GEN-LAST:event_btnAgregarActionPerformed

    public boolean buscarVenta(TrabajoFinal nueva){
     for(TrabajoFinal v:listaVentas){
         if(v.getId() == nueva.getId()){
             int nuevaCantidad=v.getCantidad()+ nueva.getCantidad();
             v.setCantidad(nuevaCantidad);
             v.setImporte(v.getPrecio()*nuevaCantidad);
             return true;
         }
     }
     return false;
    }
    
    
    public void borrarVenta(){
        precio=0;
        cantidad=1;
        CBO.setSelectedIndex(0);
        jSpinner1.setValue(1);
        calcularPrecio();
                
    }
    private void CBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOActionPerformed
        calcularPrecio(); 
    }//GEN-LAST:event_CBOActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        calcularPrecio(); 
    }//GEN-LAST:event_jSpinner1StateChanged

public void calcularPrecio(){
    precio=precios[CBO.getSelectedIndex()];
    cantidad =Integer.parseInt(jSpinner1.getValue().toString());
    PRECIO.setText(aMoneda(precio));
    IMPO.setText(aMoneda(precio*cantidad));
}
public String aMoneda(double precio){
    return "S/"+Math.round(precio*100.0)/100.0+"PEN";
}

public void actualizarTabla(){
    while(modelo.getRowCount()>0){
        modelo.removeRow(0);
    }
    double subtotal=0;
    for(TrabajoFinal v:listaVentas){
        Object x[]=new Object[4];
        x[0]=v.getDescripcion();
        x[1]=v.getPrecio();
        x[2]=v.getCantidad();
        x[3]=v.getImporte();
        subtotal+=v.getImporte();
        modelo.addRow(x);
    }
    double iva=subtotal*0.16;
    double total=subtotal+iva;
    PRO.setText(aMoneda(subtotal));
    IGV.setText(aMoneda(iva));
    TOTAL.setText(aMoneda(total));
    TABLA.setModel(modelo);
}



    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new VentasTambo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBO;
    private javax.swing.JLabel IGV;
    private javax.swing.JLabel IMPO;
    private javax.swing.JLabel PRECIO;
    private javax.swing.JLabel PRO;
    private javax.swing.JTable TABLA;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lxx;
    // End of variables declaration//GEN-END:variables
}
