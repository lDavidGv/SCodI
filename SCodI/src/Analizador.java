
import java.util.Stack;
import java.util.StringTokenizer;

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
public Stack  tipos =new Stack ();
String tip="",operando="";

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(txta);

        jScrollPane1.setViewportView(txtoperandos);

        jScrollPane3.setViewportView(txttipos);

        jScrollPane4.setViewportView(txtsaltos);

        jScrollPane5.setViewportView(txtoperadores);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable1);

        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap(358, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int Relaciona(char c){
   int valor, valoracii= (int) c;
   

   if(valoracii>=48 && valoracii<=57)//numeros
   {
       return 9;
   }
   if(valoracii>=65 && valoracii<=90)//Mayusculas
   {
       return 10;
   }
   if(valoracii>=97 && valoracii<=122)//minusculas
   {
       return 11;
   }
   if(valoracii==39)//'
   {
       return 14;
   }
   if(valoracii==32)//espacio
   {
       return 7;
   }
   if(valoracii==00)
   {
       return 6;
   }

   switch(c){

   case '.': valor=1;
       break;
   case 'E': valor=2;
       break;
   case 'e': valor=3;
       break;
   case '+': valor=4;
       break;
   case '-': valor=5;
       break;
   
   case '\n': valor=8;
               break;
   case '\t': valor=9;
       break;
   case '*': valor=12;
       break;
   case '/': valor=13;
       break;
       
   case '"': valor=15;
       break;
   case '&': valor=16;
       break;
   case '|': valor=17;
       break;
   case '!': valor=18;
       break;
   case '=': valor=19;
       break;
   case '<':valor=20;
       break;
   case '>': valor=21;
       break;
   case '[': valor=22;
       break;
   case ']': valor=23;
       break;
   case '(': valor=24;
       break;
   case ')': valor=25;
       break;
   case ':': valor=26;
       break;
   case ';': valor=27;
       break;
   case '_': valor=28;
       break;
   case '%': valor=29;
       break;
   case ',': valor=30;
       break;

   default: valor=6;
   }
   return valor;
}
    
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
    boolean def=false,iden=false;
    int cont=0;
    int contc=1;
    int edo=0;
    String texto="";
    String string = txta.getText();
    StringTokenizer st =new StringTokenizer(string);
    String cadena2=txta.getText();
   
  /*  char car = cadena2.charAt (0);
    while(contc<cadena2.length())
    {
        edo=Relaciona(car);
        if(edo==10 || edo==11)
        {
            texto+=texto;
            
        }
        if(edo==7)
        {
            System.out.println(texto);
         int reser=reservadas(texto);

    if(reser==5 || def==true)
            {
               System.out.println("def"+cont);
               def=true;
                 if(reser==0 || iden==true)
                 {
                     System.out.println("iden"+cont);
                     iden=true;

                    if(reser==0){
                        cont+=1;
                      
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
                        for(int i=1;i<cont;i++)
                        {
                            tipos.push("float");
                        }
cont=0;

                    }
                    if(reser==9)
                    {
                        for(int i=1;i<cont;i++)
                        {
                            tipos.push("char");
                        }

cont=0;
                    }
                    if(reser==10)
                    {
                        for(int i=1;i<cont;i++)
                        {
                            tipos.push("string");
                        }
cont=0;

                    }
                    if(reser==11)
                    {
                        for(int i=1;i<cont;i++)
                        {
                            tipos.push("boolean");
                        }
                        cont=0;
                    }

                 }
        }
        while(car==' ' || car=='\t' || car==32 )
        {
              contc++;
        }
        car = cadena2.charAt (contc);
        contc++;
        
    }
    contc++;
// itera mediante el “objeto st” para obtener más tokens de él
*/
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
                        poperandos.push(token);
                        cont+=1;
                      
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
                        for(int i=1;i<cont;i++)
                        {
                            tipos.push("float");
                        }
cont=0;

                    }
                    if(reser==9)
                    {
                        for(int i=1;i<cont;i++)
                        {
                            tipos.push("char");
                        }

cont=0;
                    }
                    if(reser==10)
                    {
                        for(int i=1;i<cont;i++)
                        {
                            tipos.push("string");
                        }
cont=0;

                    }
                    if(reser==11)
                    {
                        for(int i=1;i<cont;i++)
                        {
                            tipos.push("boolean");
                        }

                        cont=0;
                    }

                 }


            }
    
    /*int edo=pE.peek();
    if((reser==0 && edo==5)||(reser==0 && edo==33))
    {
        poperandos.push(token);
        System.out.println("operando: "+" "+poperandos.pop());
        cont++;
    }
    if(reser==7 && edo==7)
    {
        for(int i=0;i<=cont;i++){
        poperadores.push(token);
        System.out.println("operando: "+" "+poperadores.pop());
        }
    }*/
}

 while(!tipos.empty())
    {
        tip+=(String) tipos.pop()+ " ";
    }
  
    txttipos.setText(tip);
while(!poperandos.empty())
    {
        operando+=(String) poperandos.pop()+ " ";
    } 
 StringBuilder builder1=new StringBuilder(operando);
 String oper2=builder1.reverse().toString();
 txtoperandos.setText(oper2);// 6
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txttipos.setText("");
        txtoperandos.setText("");
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane txta;
    private javax.swing.JTextPane txtoperadores;
    private javax.swing.JTextPane txtoperandos;
    private javax.swing.JTextPane txtsaltos;
    private javax.swing.JTextPane txttipos;
    // End of variables declaration//GEN-END:variables
}
