package presentation;


import dialog.DialogReservation;
import java.time.LocalDate;
import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
        Valider.setEnabled(false);
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitreReserverTable = new javax.swing.JLabel();
        ChoisirDate = new javax.swing.JPanel();
        ChangerDate = new javax.swing.JLabel();
        selectionDate = new com.github.lgooddatepicker.components.DatePicker();
        selectionDate.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        ChangerHeure = new javax.swing.JLabel();
        selectionHeure = new javax.swing.JComboBox<>();
        ChoisirNombrePersonnes = new javax.swing.JPanel();
        ChangerNombrePersonnes = new javax.swing.JLabel();
        selectionNombrePersonnes = new javax.swing.JComboBox<>();
        ChoisirTable = new javax.swing.JPanel();
        ChangerTable = new javax.swing.JLabel();
        tablesImage = new javax.swing.JLabel();
        ChoisirNumeroTable = new javax.swing.JToolBar();
        ChoixTable = new javax.swing.JScrollPane();
        ListeTable = new javax.swing.JList<>();
        Valider = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitreReserverTable.setText("  Réservez une table");
        TitreReserverTable.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        ChoisirDate.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        ChoisirDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ChoisirDateAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ChangerDate.setText("1: Choisissez la date");

        selectionDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                selectionDateAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ChangerHeure.setText("2: Choisissez l'heure");

        selectionHeure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30", " " }));
        selectionHeure.setSelectedIndex(5);
        selectionHeure.setActionCommand("");
        selectionHeure.setComponentPopupMenu(null);
        selectionHeure.setToolTipText("");
        selectionHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionHeureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChoisirDateLayout = new javax.swing.GroupLayout(ChoisirDate);
        ChoisirDate.setLayout(ChoisirDateLayout);
        ChoisirDateLayout.setHorizontalGroup(
            ChoisirDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoisirDateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ChoisirDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangerDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ChoisirDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectionHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangerHeure))
                .addGap(18, 18, 18))
        );
        ChoisirDateLayout.setVerticalGroup(
            ChoisirDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoisirDateLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ChoisirDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangerDate)
                    .addComponent(ChangerHeure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChoisirDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        selectionDate.getAccessibleContext().setAccessibleName("");
        selectionDate.getAccessibleContext().setAccessibleDescription("");

        ChoisirNombrePersonnes.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        ChangerNombrePersonnes.setText("3: Indiquez le nombre de personnes ");

        selectionNombrePersonnes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", " " }));
        selectionNombrePersonnes.setSelectedIndex(7);
        selectionNombrePersonnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionNombrePersonnesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChoisirNombrePersonnesLayout = new javax.swing.GroupLayout(ChoisirNombrePersonnes);
        ChoisirNombrePersonnes.setLayout(ChoisirNombrePersonnesLayout);
        ChoisirNombrePersonnesLayout.setHorizontalGroup(
            ChoisirNombrePersonnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoisirNombrePersonnesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ChoisirNombrePersonnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangerNombrePersonnes)
                    .addComponent(selectionNombrePersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChoisirNombrePersonnesLayout.setVerticalGroup(
            ChoisirNombrePersonnesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoisirNombrePersonnesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChangerNombrePersonnes)
                .addGap(18, 18, 18)
                .addComponent(selectionNombrePersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        ChoisirTable.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        ChangerTable.setText("4. Choisissez votre table ");

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N

        ChoisirNumeroTable.setRollover(true);

        ListeTable.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 1", "Table  2", "Table  3", "Table  4", "Table  5", "Table 6", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListeTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListeTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ListeTable.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListeTableValueChanged(evt);
            }
        });
        ChoixTable.setViewportView(ListeTable);

        ChoisirNumeroTable.add(ChoixTable);

        javax.swing.GroupLayout ChoisirTableLayout = new javax.swing.GroupLayout(ChoisirTable);
        ChoisirTable.setLayout(ChoisirTableLayout);
        ChoisirTableLayout.setHorizontalGroup(
            ChoisirTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoisirTableLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ChoisirTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangerTable)
                    .addGroup(ChoisirTableLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ChoisirNumeroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        ChoisirTableLayout.setVerticalGroup(
            ChoisirTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoisirTableLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ChangerTable)
                .addGroup(ChoisirTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChoisirTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(ChoisirTableLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(ChoisirNumeroTable, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Valider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Annuler)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChoisirDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChoisirNombrePersonnes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChoisirTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TitreReserverTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitreReserverTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChoisirDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChoisirNombrePersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChoisirTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Annuler)
                    .addComponent(Valider))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        dialog.handleValidationEvent();
    }//GEN-LAST:event_ValiderActionPerformed

    private void selectionHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionHeureActionPerformed
        Object selection = selectionHeure.getSelectedItem();
        
        if(selection != null)
        {
            String horaire = selection.toString().trim();
            if (!horaire.isBlank()){
                dialog.handleTimeSelectedEvent(horaire);
            }
            
        }
    }//GEN-LAST:event_selectionHeureActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        selectionDate.setDate(null);
        selectionHeure.setSelectedItem(5);
        selectionNombrePersonnes.setSelectedIndex(7);
        dialog.handleCancelEvent();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void selectionNombrePersonnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionNombrePersonnesActionPerformed
        String nbpersonnes = selectionNombrePersonnes.getSelectedItem().toString().trim();
        
        if (!nbpersonnes.isBlank())
        {
            dialog.handleNumOfPersonsSelectedEvent(Integer.parseInt(nbpersonnes));
        }
    }//GEN-LAST:event_selectionNombrePersonnesActionPerformed

    private void ChoisirDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ChoisirDateAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoisirDateAncestorAdded

    private void selectionDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_selectionDateAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_selectionDateAncestorAdded

    private void ListeTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListeTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ListeTableAncestorAdded

    private void ListeTableValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListeTableValueChanged
        if (!evt.getValueIsAdjusting()){
            int ligneChoisie = ListeTable.getSelectedIndex();
            if (ligneChoisie>=0){
                dialog.handleTableSelectedEvent(ligneChoisie + 1);
            }
        }
    }//GEN-LAST:event_ListeTableValueChanged

    public void activerButonValider(boolean etat){
        this.Valider.setEnabled(etat);
    }
    
    public void modifierListeTables(String [] tables){
        this.ListeTable.setListData(tables);
    }
    
    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        LocalDate dateSelection = dateEvent.getNewDate();
        
        if(dateSelection!=null)
        {
            dialog.handleDateSelectedEvent(dateSelection);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JLabel ChangerDate;
    private javax.swing.JLabel ChangerHeure;
    private javax.swing.JLabel ChangerNombrePersonnes;
    private javax.swing.JLabel ChangerTable;
    private javax.swing.JPanel ChoisirDate;
    private javax.swing.JPanel ChoisirNombrePersonnes;
    private javax.swing.JToolBar ChoisirNumeroTable;
    private javax.swing.JPanel ChoisirTable;
    private javax.swing.JScrollPane ChoixTable;
    private javax.swing.JList<String> ListeTable;
    private javax.swing.JLabel TitreReserverTable;
    private javax.swing.JButton Valider;
    private com.github.lgooddatepicker.components.DatePicker selectionDate;
    private javax.swing.JComboBox<String> selectionHeure;
    private javax.swing.JComboBox<String> selectionNombrePersonnes;
    private javax.swing.JLabel tablesImage;
    // End of variables declaration//GEN-END:variables

}