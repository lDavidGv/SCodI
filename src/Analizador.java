
import java.util.Stack;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Analizador extends javax.swing.JFrame {
public Stack <Integer> pE=new Stack <Integer>();
public Stack  poperadores =new Stack ();
public Stack  poperandos =new Stack ();
public Stack  poperandoscompara =new Stack ();
public Stack  tiposcompara =new Stack ();
public Stack  tipos =new Stack ();
String tip="",operando="",operadores="";
String err="";

int [] insertar;
    /**
     * Creates new form Analizador
     */
    public Analizador() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoperandos = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txttipos = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtsaltos = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtoperadores = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txterr = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(txta);

        jScrollPane1.setViewportView(txtoperandos);

        jScrollPane3.setViewportView(txttipos);

        jScrollPane4.setViewportView(txtsaltos);

        jScrollPane5.setViewportView(txtoperadores);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null}
            },
            new String [] {
                "#", "OPER", "OP1", "OP2","RES"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");

        jScrollPane7.setViewportView(txterr);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane8.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(263, 263, 263)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    int reservadas(String reservada)
{
     switch (reservada)
            {
                case "import":
                    return 1;
                case "class":
                    return 2;
                case "begin":
                    return 3;
                case "end":
                    return 4;
                case "def":
                    return 5;
                case "as":
                    return 6;
                case "integer":
                    return 7;
                case "float":
                    return 8;
                case "char":
                    return 9;
                case "string":
                    return 10;
                case "boolean":
                    return 11;
                case "if":
                    return 12;
                case "endif":
                    return 13;
                case "else":
                    return 14;
                case "endwhile":
                    return 15;
                case "while":
                    return 16;
                case "endfor":
                    return 17;
                case "for":
                    return 18;
                case "enter":
                    return 19;
                case "write":
                    return 20;
                case "read":
                    return 21;
                case "principal":
                    return 22;
                case "elseif":
                    return 23;
                case "function":return 24;
                case "endfunction":return 25;
                case "null":return 26;
                case "include":return 27;
                case "+":return 28;
                case "-":return 29;
                case "*":return 30;
                case "/":return 31;
                case "=":return 32;
                case ",":return 33;
                case ";":return 34;
                
            }
        return 0;
}
void analiza()
{
    boolean def=false,iden=false,pcom=false;
    int cont=0;
    int contc=1;
    int edo=0;
    String texto="";
    String string = txta.getText();
    StringTokenizer st =new StringTokenizer(string);
    String cadena2=txta.getText();
   
while(st.hasMoreElements()) 
{
    String token = st.nextElement().toString();
    int reser=reservadas(token);

    if(reser==5 || def==true)
            {
               System.out.println("def"+cont);
               def=true;
                 if(reser==0 || iden==true)
                 {
                     
                     iden=true;

                    if(reser==0){
                         boolean a=poperandos.contains(token);
                        if(a==true)
                        {
                            err+="Error Variable"+token+" ya inicializada \n";
                            txterr.setText(err);
                        }
                        else
                        {
                            poperandos.push(token);
                            
                            cont+=1;
                            
                        }

                    }

                    if(reser==7)
                    {
                       
                        System.out.println("cont"+cont);
                        for(int i=0;i<cont;i++)
                        {
                            tipos.push("integer");
                        }

cont=0;
                    }
                    if(reser==8)
                    {
                        for(int i=0;i<cont;i++)
                        {
                            tipos.push("float");
                        }
cont=0;

                    }
                    if(reser==9)
                    {
                        for(int i=0;i<cont;i++)//char
                        {
                            tipos.push("char");
                        }

cont=0;
                    }
                    if(reser==10)
                    {
                        for(int i=0;i<cont;i++)
                        {
                            tipos.push("string");
                        }
cont=0;

                    }
                    if(reser==11)
                    {
                        for(int i=0;i<cont;i++)
                        {
                            tipos.push("boolean");
                        }

                        cont=0;
                    }
                    

                 }

            }
    
    if(reser==34 || pcom==true)
    {
        pcom=true;
        def=false;
        if(reser==0)
        {
            poperandos.push(token);
            imprimepilaoperandos();
        }
        if(reser==28)//+
        {
            System.out.println("+++++");
            poperadores.push(token);
            System.out.println(""+poperadores.peek());
        }
        if(reser==29)//-
        {
            poperadores.push(token);
        }
        if(reser==30)//*
        {
            poperadores.push(token);
        }
         if(reser==31)// /
        {
            poperadores.push(token);
        }
          if(reser==32)// =
        {
            poperadores.push(token);
        }
    }
    
   
}
imprimepilaoperadores();
imprimepilaoperandos();
imprimepilatipos();
// 6
}
void imprimepilatipos()
{
    while(!tipos.empty())
    {
        tip+=(String) tipos.pop()+ " ";
        
    }
  
    txttipos.setText(tip);
   
}
void imprimepilaoperadores()
{
    while(!poperadores.empty())
    {
        operadores+=(String) poperadores.pop()+ " ";
        
    }
  
    jTextArea1.setText(operadores);
  
}
void imprimepilaoperandos()
{
   while(!poperandos.empty())
    {
        operando+=(String) poperandos.pop()+ " ";
    } 
    StringBuilder builder1=new StringBuilder(operando);
    String oper2=builder1.reverse().toString();
    txtoperandos.setText(operando);
    
   
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txttipos.setText("");
        txtoperandos.setText("");
        txterr.setText("");
        tip="";
        operando="";
        analiza(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane txta;
    private javax.swing.JTextPane txterr;
    private javax.swing.JTextPane txtoperadores;
    private javax.swing.JTextPane txtoperandos;
    private javax.swing.JTextPane txtsaltos;
    private javax.swing.JTextPane txttipos;
    // End of variables declaration//GEN-END:variables
}
