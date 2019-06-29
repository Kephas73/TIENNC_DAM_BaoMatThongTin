
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import sun.misc.BASE64Decoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class Giai_Ma extends javax.swing.JFrame {

    /**
     * Creates new form Giai_Ma
     */
    private static final String UNICODE_FORMAT="UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME="DESede";
    private KeySpec myKeySpec;
    private SecretKeyFactory mySecretKeyFactory;
    private Cipher cipher;
    byte[] keyAsBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    SecretKey key;
    public Giai_Ma() {
        initComponents();
        
        /* vig=new int[26][26];
       for(int i=0;i<26;i++)
               for(int j=0;j<26;j++)
                    vig[i][j]=(i+j)%26;*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtD3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtE3 = new javax.swing.JTextArea();
        txtE1 = new javax.swing.JTextField();
        txtM2 = new javax.swing.JTextField();
        txtH2 = new javax.swing.JTextField();
        txtM3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtM1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtH2_Phay = new javax.swing.JTextArea();
        btSo_Sanh = new javax.swing.JButton();
        txtDuong_Dan = new javax.swing.JTextField();
        btMo_File = new javax.swing.JButton();
        txtK3 = new javax.swing.JTextField();
        btD3 = new javax.swing.JButton();
        txtK1 = new javax.swing.JTextField();
        btM1 = new javax.swing.JButton();
        btH2_Phay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btTach_Chuoi = new javax.swing.JButton();
        txtN1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btN1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("FORM NHẬN");

        txtD3.setColumns(20);
        txtD3.setRows(5);
        jScrollPane1.setViewportView(txtD3);

        txtE3.setColumns(20);
        txtE3.setRows(5);
        jScrollPane2.setViewportView(txtE3);

        txtM1.setColumns(20);
        txtM1.setRows(5);
        jScrollPane3.setViewportView(txtM1);

        txtH2_Phay.setColumns(20);
        txtH2_Phay.setRows(5);
        jScrollPane4.setViewportView(txtH2_Phay);

        btSo_Sanh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSo_Sanh.setText("So sánh [H2,H2']");
        btSo_Sanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSo_SanhActionPerformed(evt);
            }
        });

        btMo_File.setForeground(new java.awt.Color(255, 0, 0));
        btMo_File.setText("Mở File E3");
        btMo_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMo_FileActionPerformed(evt);
            }
        });

        btD3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btD3.setText("Giải mã E3");
        btD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btD3ActionPerformed(evt);
            }
        });

        btM1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btM1.setText("Giải mã E1");
        btM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btM1ActionPerformed(evt);
            }
        });

        btH2_Phay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btH2_Phay.setText("Băm chuỗi N1");
        btH2_Phay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btH2_PhayActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("E3:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("D3:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("E1:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("M2:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("H2:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("M3:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("M1:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("H2':");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("K3:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("K1:");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Đường dẫn");

        btTach_Chuoi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btTach_Chuoi.setText("Tách chuỗi [D3] gồm: N3+H2+N1");
        btTach_Chuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTach_ChuoiActionPerformed(evt);
            }
        });

        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("N1:");

        btN1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btN1.setText("Tách chuỗi N1 =M2+E1");
        btN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSo_Sanh)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDuong_Dan, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btMo_File))
                            .addComponent(jLabel12))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtH2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtM3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtM2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addGap(32, 32, 32)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtK3)
                                        .addComponent(btD3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                    .addComponent(btTach_Chuoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btH2_Phay, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btM1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtK1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btN1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuong_Dan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMo_File)))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtK3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btD3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtM3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btTach_Chuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtM2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btN1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtH2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtK1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btM1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel9)))
                    .addComponent(btH2_Phay, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addComponent(btSo_Sanh)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Hàm giải mã-----------------------------------------------------------------------
     //****************************RAIL-FENCE*******************************//
    
     //****************************AES*******************************//
  
     //****************************DES*******************************//
   
     //****************************CAESAR*******************************//
    
   
      //****************************Vigenere*******************************//
     
     //****************************3DES*******************************//
    String decrypt(String encryptedString){
        String decryptedText=null;
        try{
            cipher.init(Cipher.DECRYPT_MODE,key);
            BASE64Decoder base64decoder = new BASE64Decoder();
            byte[] encryptedText= base64decoder.decodeBuffer(encryptedString);
            byte[] plainText=cipher.doFinal(encryptedText);
            String a =new String(plainText);
    
            decryptedText=a;
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return decryptedText;
    }
 // Kêt thúc hàm giải mã------------------------------------------------------  
 // Hàm mở File---------------------------------------------------------------
    String MoFile(String L)
    {
        try
        {
            BufferedReader br= null;
            String fileName=L;
            br = new  BufferedReader(new FileReader(fileName));
            StringBuffer sb= new StringBuffer();
            JOptionPane.showMessageDialog(null,"Mở File thành công");
            char[] ca= new char[5];
            while(br.ready())
            {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            
            String chuoi= sb.toString();
             return chuoi;
        }
        catch(IOException ex)
        {
            
        }
        return null;
    }
 // Kết thúc hàm mở File-----------------------------------------------
 // Hàm tách chuỗi--------------------------------------------------------   
    String Tach_Chuoi_Cuoi(String A)
    {
        int vt=A.lastIndexOf("-");
        String B=A.substring(vt+1).trim();
       return B;
    }
    String Tach_Chuoi_Dau(String A)//Dau-Cuoi
    {
        int vt=A.lastIndexOf("-");
        String B=A.substring(0,vt).trim();
       return B;
    }
   String Tach_Chuoi1(String A)
   {
       int vt=A.indexOf("-");
       String B=A.substring(vt+1).trim();
       return B;
   }
   String ChuyenByte_hexa(byte[] data) 
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < data.length; i++)
        {
            sb.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
   
  
  // Kết thúc hàm tách chuỗi-------------------------------------------------------------------
 // Hàm băm chuỗi-------------------------------------------------

    
     String Bam_MD5(String A)
    {
         try
         {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(A.getBytes());
            return ChuyenByte_hexa(messageDigest);
          }
         catch (NoSuchAlgorithmException e) 
          {
            throw new RuntimeException(e);
          }
    }
    
 // Kết thúc hàm băm chuỗi----------------------------------------------
    private void btMo_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMo_FileActionPerformed
        // TODO add your handling code here:
        String L=this.txtDuong_Dan.getText();
        this.txtE3.setText(MoFile(L));
    }//GEN-LAST:event_btMo_FileActionPerformed

    private void btD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btD3ActionPerformed
        // TODO add your handling code here:
        
         try{
            myEncryptionKey= txtK3.getText();
            myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
            keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
            myKeySpec = new DESedeKeySpec(keyAsBytes);
            mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
            cipher = Cipher.getInstance(myEncryptionScheme);
            key = mySecretKeyFactory.generateSecret(myKeySpec);
            
            String plainText=txtE3.getText();
            String decrypted = decrypt(plainText);
          
            this.txtD3.setText(decrypted);
        }catch(Exception e){
            System.out.println("da giai ma van ban" +e);
        }
    }//GEN-LAST:event_btD3ActionPerformed

    private void btTach_ChuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTach_ChuoiActionPerformed
        // TODO add your handling code here:
       String A=this.txtD3.getText();
        String B=Tach_Chuoi_Dau(A);
        String D=Tach_Chuoi_Cuoi(B);
        String C=Tach_Chuoi_Dau(B);
       // String C=Tach_Chuoi_Dau(B);
      //  String D=Tach_Chuoi_Dau(C);
        //String B=Tach_Chuoi_Dau(A);
       // String C=B.replaceAll("-","");
        
        
        this.txtM3.setText(Tach_Chuoi_Cuoi(A));
        this.txtH2.setText(D);
        this.txtN1.setText(C);
       // this.txtH2.setText(Bam_SHA(C));
       
       
        
       
    }//GEN-LAST:event_btTach_ChuoiActionPerformed

    private void btH2_PhayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btH2_PhayActionPerformed
        // TODO add your handling code here:
         /* String A=this.txtD3.getText();
          String B=Tach_Chuoi_Dau(A);
        String C=Tach_Chuoi1(B);
        String D=C.replaceAll("-","");*/
         
         String A=this.txtN1.getText();
         String D=A.replaceAll("-", "");
        this.txtH2_Phay.setText(Bam_MD5(D));
        
        
    }//GEN-LAST:event_btH2_PhayActionPerformed

    private void btM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btM1ActionPerformed
        // TODO add your handling code here:
       /* String A=this.txtD3.getText();
          String B=Tach_Chuoi_Dau(A);
        String C=Tach_Chuoi1(B);
      String D=Tach_Chuoi_Cuoi(C);
      String E=Tach_Chuoi_Dau(C);
        
        this.txtM2.setText(D);
        this.txtE1.setText(E);
        
        String K=this.txtK1.getText();
        String O=this.txtE1.getText();*/
       
       try{
            myEncryptionKey= txtK1.getText();
            myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
            keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
            myKeySpec = new DESedeKeySpec(keyAsBytes);
            mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
            cipher = Cipher.getInstance(myEncryptionScheme);
            key = mySecretKeyFactory.generateSecret(myKeySpec);
            
            String plainText=txtE1.getText();
            String decrypted = decrypt(plainText);
          
            this.txtM1.setText(decrypted);
        }catch(Exception e){
            System.out.println("da giai ma van ban" +e);
        }
         /*String banma=this.txtbm.getText();
        String k=this.txtkhoa.getText();
        String kt1="";
        int kn=k.length();
        for(int i=0;i<kn;i++)
        kt1+=(char)(((26-(Character.toUpperCase(k.charAt(i))-'A'))%26)+'A');
        this.txtkhoa.setText(k);
        String banro=mahoa(banma,kt1);
        this.txtbr.setText(banro);*/ // Vigenere
        
       // int K=Integer.valueOf(this.txtK1.getText());
       
       // this.txtM1.setText(Caesar(O,-K));
        
    }//GEN-LAST:event_btM1ActionPerformed

    private void btSo_SanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSo_SanhActionPerformed
        // TODO add your handling code here:
        String A=this.txtH2.getText();
        String B=this.txtH2_Phay.getText();
        if(A.compareTo(B)==0)
        {
            JOptionPane.showMessageDialog(null,"Văn bản toàn vẹn");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Văn bản không toàn vẹn");
        }
    }//GEN-LAST:event_btSo_SanhActionPerformed

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_txtN1ActionPerformed

    private void btN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN1ActionPerformed
        // TODO add your handling code here:
         String A=this.txtN1.getText();
        
        String B=Tach_Chuoi_Cuoi(A);
        String C=Tach_Chuoi_Dau(A);
        this.txtM2.setText(B);
        this.txtE1.setText(C);
    }//GEN-LAST:event_btN1ActionPerformed

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
            java.util.logging.Logger.getLogger(Giai_Ma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giai_Ma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giai_Ma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giai_Ma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giai_Ma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btD3;
    private javax.swing.JButton btH2_Phay;
    private javax.swing.JButton btM1;
    private javax.swing.JButton btMo_File;
    private javax.swing.JButton btN1;
    private javax.swing.JButton btSo_Sanh;
    private javax.swing.JButton btTach_Chuoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtD3;
    private javax.swing.JTextField txtDuong_Dan;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextArea txtE3;
    private javax.swing.JTextField txtH2;
    private javax.swing.JTextArea txtH2_Phay;
    private javax.swing.JTextField txtK1;
    private javax.swing.JTextField txtK3;
    private javax.swing.JTextArea txtM1;
    private javax.swing.JTextField txtM2;
    private javax.swing.JTextField txtM3;
    private javax.swing.JTextField txtN1;
    // End of variables declaration//GEN-END:variables
}
