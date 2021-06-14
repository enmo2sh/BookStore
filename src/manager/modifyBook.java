/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import user.bookInfo;

/**
 *
 * @author sara
 */
public class modifyBook extends javax.swing.JFrame {

    /**
     * Creates new form insertBook
     */
    public modifyBook() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l_isbn = new javax.swing.JLabel();
        l_price = new javax.swing.JLabel();
        l_category = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        l_publisher = new javax.swing.JLabel();
        l_nocopies = new javax.swing.JLabel();
        l_threshold = new javax.swing.JLabel();
        l_year = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        copies = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        threshold = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rsz_3book(1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));

        jLabel4.setFont(new java.awt.Font("Chilanka", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(232, 236, 241));
        jLabel4.setText("modify existing Book");

        jLabel7.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Just enter new values in fields you want to update:");

        l_isbn.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        l_isbn.setForeground(new java.awt.Color(232, 236, 241));
        l_isbn.setText("Book's ISBN:");

        l_price.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        l_price.setForeground(new java.awt.Color(232, 236, 241));
        l_price.setText("Price:");

        l_category.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        l_category.setForeground(new java.awt.Color(232, 236, 241));
        l_category.setText("Category:");

        jLabel12.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(232, 236, 241));
        jLabel12.setText("Title:");

        l_publisher.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        l_publisher.setForeground(new java.awt.Color(232, 236, 241));
        l_publisher.setText("Publisher name:");

        l_nocopies.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        l_nocopies.setForeground(new java.awt.Color(232, 236, 241));
        l_nocopies.setText("no of copies:");

        l_threshold.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        l_threshold.setForeground(new java.awt.Color(232, 236, 241));
        l_threshold.setText("Threshold:");

        l_year.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        l_year.setForeground(new java.awt.Color(232, 236, 241));
        l_year.setText("Publication year:");

        title.setBackground(new java.awt.Color(232, 236, 241));
        title.setFont(new java.awt.Font("Ubuntu Mono", 0, 12)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        isbn.setBackground(new java.awt.Color(232, 236, 241));
        isbn.setFont(new java.awt.Font("Ubuntu Mono", 0, 12)); // NOI18N
        isbn.setForeground(new java.awt.Color(51, 51, 51));
        isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnActionPerformed(evt);
            }
        });

        copies.setBackground(new java.awt.Color(232, 236, 241));
        copies.setFont(new java.awt.Font("Ubuntu Mono", 0, 12)); // NOI18N
        copies.setForeground(new java.awt.Color(51, 51, 51));
        copies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiesActionPerformed(evt);
            }
        });

        price.setBackground(new java.awt.Color(232, 236, 241));
        price.setFont(new java.awt.Font("Ubuntu Mono", 0, 12)); // NOI18N
        price.setForeground(new java.awt.Color(51, 51, 51));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        category.setBackground(new java.awt.Color(232, 236, 241));
        category.setFont(new java.awt.Font("Ubuntu Mono", 0, 12)); // NOI18N
        category.setForeground(new java.awt.Color(51, 51, 51));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        threshold.setBackground(new java.awt.Color(232, 236, 241));
        threshold.setFont(new java.awt.Font("Ubuntu Mono", 0, 12)); // NOI18N
        threshold.setForeground(new java.awt.Color(51, 51, 51));
        threshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thresholdActionPerformed(evt);
            }
        });

        publisher.setBackground(new java.awt.Color(232, 236, 241));
        publisher.setFont(new java.awt.Font("Ubuntu Mono", 0, 12)); // NOI18N
        publisher.setForeground(new java.awt.Color(51, 51, 51));
        publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherActionPerformed(evt);
            }
        });

        year.setBackground(new java.awt.Color(232, 236, 241));
        year.setFont(new java.awt.Font("Ubuntu Mono", 0, 12)); // NOI18N
        year.setForeground(new java.awt.Color(51, 51, 51));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        Insert.setBackground(new java.awt.Color(50, 50, 50));
        Insert.setFont(new java.awt.Font("Chilanka", 1, 24)); // NOI18N
        Insert.setForeground(new java.awt.Color(232, 236, 241));
        Insert.setText("Modify");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(50, 50, 50));
        back.setFont(new java.awt.Font("Century", 1, 16)); // NOI18N
        back.setForeground(new java.awt.Color(232, 236, 241));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(121, 121, 121))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(l_publisher)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(l_isbn)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(l_price)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(l_category)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(l_threshold)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(threshold, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(l_nocopies)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                    .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(l_year)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_isbn)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_price)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_category))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_threshold)
                    .addComponent(threshold, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_nocopies)
                    .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_publisher)
                    .addComponent(publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_year)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnActionPerformed

    private void copiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copiesActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void thresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thresholdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thresholdActionPerformed

    private void publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
    int ISBN = -1, publication_year = -1, Price = -1, Threshold = -1, Copies = -1;
    String Title = " ", Category = " ", Publisher = " ";
    boolean modify_copies = false;
          
    if(!isbn.getText().trim().isEmpty())
        ISBN = Integer.parseInt(isbn.getText());
    if(!title.getText().trim().isEmpty())
        Title = title.getText();
    if(!year.getText().trim().isEmpty())
        publication_year = Integer.parseInt(year.getText());
    if(!price.getText().trim().isEmpty())
        Price = Integer.parseInt(price.getText());
    if(!category.getText().trim().isEmpty())
        Category = category.getText();
    if(!threshold.getText().trim().isEmpty())
        Threshold = Integer.parseInt(threshold.getText());
    if(!publisher.getText().trim().isEmpty())
        Publisher = publisher.getText();
    if(!copies.getText().trim().isEmpty()){
        Copies = Integer.parseInt(copies.getText()); 
        modify_copies = true;
    }
    
        bookInfo book = new bookInfo(ISBN, Title, publication_year, Price, Category, Threshold, Publisher, Copies);
        bookQuery q = new bookQuery();
        boolean created = q.ModifyBook(book, modify_copies);
        System.out.println(created);
    }//GEN-LAST:event_InsertActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        ManagerMode form = new ManagerMode();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insert;
    private javax.swing.JButton back;
    private javax.swing.JTextField category;
    private javax.swing.JTextField copies;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l_category;
    private javax.swing.JLabel l_isbn;
    private javax.swing.JLabel l_nocopies;
    private javax.swing.JLabel l_price;
    private javax.swing.JLabel l_publisher;
    private javax.swing.JLabel l_threshold;
    private javax.swing.JLabel l_year;
    private javax.swing.JTextField price;
    private javax.swing.JTextField publisher;
    private javax.swing.JTextField threshold;
    private javax.swing.JTextField title;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}