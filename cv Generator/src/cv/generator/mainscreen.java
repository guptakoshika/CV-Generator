package cv.generator;

import ae.java.awt.image.BufferedImage;
import ae.javax.imageio.ImageIO;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class mainscreen extends javax.swing.JFrame {

    public mainscreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Search_label = new javax.swing.JLabel();
        searchcv_label = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fnmae_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        add1 = new javax.swing.JTextField();
        add2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        postcode = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        skill3 = new javax.swing.JTextField();
        skill4 = new javax.swing.JTextField();
        skill1 = new javax.swing.JTextField();
        skill2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        wd1 = new javax.swing.JTextField();
        cn1 = new javax.swing.JTextField();
        cn2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        wd2 = new javax.swing.JTextField();
        wd3 = new javax.swing.JTextField();
        cn3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        univname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        imagelabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Search_label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Search_label.setText("Search");

        searchcv_label.setText("Search CV");

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("PERSONAL INFORMATION ");

        fnmae_label.setText("Fisrt Name");

        jLabel5.setText("Surname");

        jLabel6.setText("Adress line 1");

        jLabel7.setText("Adress Line2");

        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Post Code");

        jLabel9.setText("Nationality");

        jLabel10.setText("date of Birth");

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        jLabel11.setText("Contact");

        jLabel12.setText("Email");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("SKILLS");

        skill3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skill3ActionPerformed(evt);
            }
        });

        skill2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skill2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("WORK EXPERIENCE");

        jLabel15.setText("Company Name");

        jLabel16.setText("Work Done");

        jLabel17.setText("Company Name");

        jLabel20.setText("Company Name");

        jLabel21.setText("Work Done");

        jLabel22.setText("Work Done");

        wd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wd2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("QUALIFICATIONS");

        jLabel23.setText("University Name");

        jLabel24.setText("Collage Qulafication1:");

        jLabel25.setText("College Qualification2 ");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Genarate CV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Choose Image");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Generate excel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(univname, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                    .addComponent(q1)
                                    .addComponent(q2)))
                            .addComponent(Search_label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 824, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(fnmae_label))
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(nationality, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(postcode, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(add2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(add1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(sname)
                                    .addComponent(fname)))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(skill3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(skill1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(skill4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(skill2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel20))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cn2)
                                            .addComponent(wd1)
                                            .addComponent(cn1)
                                            .addComponent(cn3)
                                            .addComponent(wd3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                            .addComponent(wd2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(242, 242, 242)
                                                .addComponent(jButton4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jButton5)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchcv_label)
                        .addGap(39, 39, 39)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchcv_label)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fnmae_label)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(skill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(skill2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(skill3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(skill4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(cn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(wd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(postcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(wd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel21)
                        .addComponent(wd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(univname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jButton2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
    }                                    

    private void wd2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
    }                                   

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         cv o = getdata();
        CvGenerator c = new CvGenerator();
        c.createpdf(o,path);         
    }                                        
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int i = validatedata();
        if(i==0)
        {
            cv o = getdata();
            File file = new File(path);
            byte[] bFile = new byte[(int) file.length()];
        
        try {
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bFile);
                fileInputStream.close();
        }   catch (Exception e) {
	     e.printStackTrace();
            }   
                o.setImage(bFile);
                dbconnect d = new dbconnect();
                d.savedata(o);
        }
    }                                        

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {                                    
       
    }                                   

    private void skill3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private void skill2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        add1.setText("");
        add2.setText("");
        cn1.setText("");
        cn2.setText("");
        cn3.setText("");
        contact.setText("");
        dob.setText("");
        email.setText("");
        fname.setText("");
        sname.setText("");
        nationality.setText("");    
        postcode.setText("");
        skill1.setText("");
        skill2.setText("");
        skill3.setText("");
        skill4.setText("");
        sname.setText("");
        wd1.setText("");
        wd2.setText("");
        wd3.setText("");
        univname.setText("");
        q1.setText("");
        q2.setText("");
        univname.setText("");
        q1.setText("");
        q2.setText("");
        Icon icon1 = null;
        imagelabel.setIcon(icon1);
    }                                        

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {                                   
       
        try {
            int n =Integer.parseInt(search.getText());
            dbconnect d = new dbconnect();
            cv c = new cv();
            c = d.fetch(n);
            skills s = new skills();
            
            //personal info
            contact.setText(c.getContact());
            dob.setText(c.getDob());
            email.setText(c.getEmail());
            fname.setText(c.getFname());
            sname.setText(c.getSname());
            add1.setText(c.getAdress1());
            add2.setText(c.getAddress2());
            nationality.setText(c.getNationality());
            postcode.setText(c.getPostcode());
            
            workexperience w = new workexperience();
            //work experience
            c.setWork(w);
            cn1.setText(w.getCn1());
            cn2.setText(w.getCn2());
            cn3.setText(w.getCn3());
            wd1.setText(w.getWd1());
            wd2.setText(w.getWd2());
            wd3.setText(w.getWd3());
                        
            //skills
            c.setSkill(s);
            skill1.setText(s.getSkill1());
            skill2.setText(s.getSkill2());
            skill3.setText(s.getSkill3());
            skill4.setText(s.getSkill4());
            
            //qualification
            qualifications q = new qualifications();
            c.setQual(q);
            univname.setText(q.getUnivname());
            q1.setText(q.getQ1());
            q2.setText(q.getQ2());
            
            InputStream in = new ByteArrayInputStream(c.getImage());
            BufferedImage image = ImageIO.read(in);
            System.out.println(in);
            imagelabel.setIcon((Icon) image);
        } catch (Exception ex) {
                ex.printStackTrace();
        }
    }                                  
        String path;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(null);
        File f = j.getSelectedFile();
        path = f.getAbsolutePath();
       Toolkit t = Toolkit.getDefaultToolkit();
       Image i = t.getImage(path);
       ImageIcon icon = new ImageIcon(i); 
       //JLabel image = new JLabel();
       imagelabel.setIcon(icon);
       imagelabel.setBounds(1060,120,309,246);
       add(imagelabel);
    }                                        

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new login().setVisible(true);
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainscreen().setVisible(true);
            }
        });
    }
    int validatedata()
    {
        if(fname.getText() == null || 
              sname.getText() == null || add1.getText() == null || 
                add2.getText() == null || 
                nationality.getText() == null || 
                contact.getText() == null ||   
                email.getText() == null || postcode.getText() == null )
        {
            JFrame frame = new JFrame();
            //frame.setSize(new Dimension(480, 10));
            //frame.setPreferredSize(new Dimension(480, frame.getPreferredSize().height));
              JOptionPane.showMessageDialog(
                   frame, "Invalid Credentials!! Please Check and try "); 
              return 1;
        }
        return 0;
    }
cv getdata()
{
     cv o = new cv();
        //personal details
         o.setFname(fname.getText());
         o.setSname(sname.getText());
         o.setAdress1(add1.getText());
         o.setAddress2(add2.getText());
         o.setNationality(nationality.getText());
         o.setContact(contact.getText());
         o.setDob(dob.getText());
         o.setPostcode(postcode.getText());
         o.setEmail(email.getText());
         
         //skills
         skills s = new skills();
         s.setSkill1(skill1.getText());
         s.setSkill2(skill2.getText());
         s.setSkill3(skill3.getText());
         s.setSkill4(skill4.getText());
         
        //workexperience
        workexperience w = new workexperience();
        w.setCn1(cn1.getText());
        w.setCn2(cn2.getText());
        w.setCn3(cn3.getText());
        w.setWd1(wd1.getText());
        w.setWd2(wd2.getText());
        w.setWd3(wd3.getText());
        
        //qualifications
        qualifications q = new qualifications();
        q.setUnivname(univname.getText());
        q.setQ1(q1.getText());
        q.setQ2(q2.getText());
        
         
        o.setSkill(s);
        o.setWork(w);
        o.setQual(q);
        return o;
}
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Search_label;
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JTextField cn1;
    private javax.swing.JTextField cn2;
    private javax.swing.JTextField cn3;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fnmae_label;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField postcode;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchcv_label;
    private javax.swing.JTextField skill1;
    private javax.swing.JTextField skill2;
    private javax.swing.JTextField skill3;
    private javax.swing.JTextField skill4;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField univname;
    private javax.swing.JTextField wd1;
    private javax.swing.JTextField wd2;
    private javax.swing.JTextField wd3;
    // End of variables declaration                   
}
