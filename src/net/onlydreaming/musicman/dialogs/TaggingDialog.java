/*
 * TaggingDialog.java
 * Part of the MusicMan application by Ian Renton.  For information, please visit:
 * http://www.onlydreaming.net/software/musicman
 * This code is licenced under the GNU GPL v3 (http://www.gnu.org/licenses/).
 */
package net.onlydreaming.musicman.dialogs;

import net.onlydreaming.musicman.objects.TagUpdateBundle;

/**
 *
 * @author tsuki
 */
public class TaggingDialog extends javax.swing.JDialog {
    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;

    /** Creates new form TaggingDialog */
    public TaggingDialog(java.awt.Frame parent, boolean modal, String artist, String album, String track, String title, String genre, boolean checkedByDefault) {
        super(parent, modal);
        initComponents();
        
        this.artist.setText(artist);
        this.album.setText(album);
        this.track.setText(track);
        this.title.setText(title);
        this.genre.setText(genre);
        this.artistCheck.setSelected(checkedByDefault);
        this.albumCheck.setSelected(checkedByDefault);
        this.trackCheck.setSelected(checkedByDefault);
        this.titleCheck.setSelected(checkedByDefault);
        this.genreCheck.setSelected(checkedByDefault);

        setSize(500, 100);

        getRootPane().setDefaultButton(okButton);
    }

    /** @return the return status of this dialog - one of RET_OK or RET_CANCEL */
    public int getReturnStatus() {
        return returnStatus;
    }

    public TagUpdateBundle getUpdateBundle() {
        return new TagUpdateBundle(artist.getText(), album.getText(), title.getText(), track.getText(), genre.getText(), artistCheck.isSelected(), albumCheck.isSelected(), titleCheck.isSelected(), trackCheck.isSelected(), genreCheck.isSelected());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        artistLabel = new javax.swing.JLabel();
        albumLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        artist = new javax.swing.JTextField();
        album = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        genre = new javax.swing.JTextField();
        artistCheck = new javax.swing.JCheckBox();
        albumCheck = new javax.swing.JCheckBox();
        titleCheck = new javax.swing.JCheckBox();
        genreCheck = new javax.swing.JCheckBox();
        trackLabel = new javax.swing.JLabel();
        track = new javax.swing.JTextField();
        trackCheck = new javax.swing.JCheckBox();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(net.onlydreaming.musicman.MusicManApp.class).getContext().getResourceMap(TaggingDialog.class);
        setTitle(resourceMap.getString("TaggingDialog1.title")); // NOI18N
        setName("TaggingDialog1"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        buttonPanel.setMaximumSize(new java.awt.Dimension(500, 100));
        buttonPanel.setName("buttonPanel"); // NOI18N
        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        okButton.setText(resourceMap.getString("okButton.text")); // NOI18N
        okButton.setName("okButton"); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(okButton);

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(cancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(buttonPanel, gridBagConstraints);

        text.setText(resourceMap.getString("text.text")); // NOI18N
        text.setMaximumSize(new java.awt.Dimension(450, 56));
        text.setName("text"); // NOI18N
        text.setPreferredSize(new java.awt.Dimension(450, 56));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(text, gridBagConstraints);

        artistLabel.setText(resourceMap.getString("artistLabel.text")); // NOI18N
        artistLabel.setName("artistLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(artistLabel, gridBagConstraints);

        albumLabel.setText(resourceMap.getString("albumLabel.text")); // NOI18N
        albumLabel.setName("albumLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(albumLabel, gridBagConstraints);

        titleLabel.setText(resourceMap.getString("titleLabel.text")); // NOI18N
        titleLabel.setName("titleLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(titleLabel, gridBagConstraints);

        genreLabel.setText(resourceMap.getString("genreLabel.text")); // NOI18N
        genreLabel.setName("genreLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(genreLabel, gridBagConstraints);

        artist.setText(resourceMap.getString("artist.text")); // NOI18N
        artist.setMaximumSize(new java.awt.Dimension(200, 20));
        artist.setMinimumSize(new java.awt.Dimension(200, 20));
        artist.setName("artist"); // NOI18N
        artist.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(artist, gridBagConstraints);

        album.setMaximumSize(new java.awt.Dimension(200, 20));
        album.setMinimumSize(new java.awt.Dimension(200, 20));
        album.setName("album"); // NOI18N
        album.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(album, gridBagConstraints);

        title.setMaximumSize(new java.awt.Dimension(200, 20));
        title.setMinimumSize(new java.awt.Dimension(200, 20));
        title.setName("title"); // NOI18N
        title.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(title, gridBagConstraints);

        genre.setMaximumSize(new java.awt.Dimension(200, 20));
        genre.setMinimumSize(new java.awt.Dimension(200, 20));
        genre.setName("genre"); // NOI18N
        genre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(genre, gridBagConstraints);

        artistCheck.setText(resourceMap.getString("artistCheck.text")); // NOI18N
        artistCheck.setName("artistCheck"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        getContentPane().add(artistCheck, gridBagConstraints);

        albumCheck.setName("albumCheck"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(albumCheck, gridBagConstraints);

        titleCheck.setName("titleCheck"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(titleCheck, gridBagConstraints);

        genreCheck.setName("genreCheck"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(genreCheck, gridBagConstraints);

        trackLabel.setText(resourceMap.getString("trackLabel.text")); // NOI18N
        trackLabel.setName("trackLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(trackLabel, gridBagConstraints);

        track.setMaximumSize(new java.awt.Dimension(200, 20));
        track.setMinimumSize(new java.awt.Dimension(200, 20));
        track.setName("track"); // NOI18N
        track.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(track, gridBagConstraints);

        trackCheck.setName("trackCheck"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        getContentPane().add(trackCheck, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField album;
    private javax.swing.JCheckBox albumCheck;
    private javax.swing.JLabel albumLabel;
    private javax.swing.JTextField artist;
    private javax.swing.JCheckBox artistCheck;
    private javax.swing.JLabel artistLabel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField genre;
    private javax.swing.JCheckBox genreCheck;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel text;
    private javax.swing.JTextField title;
    private javax.swing.JCheckBox titleCheck;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField track;
    private javax.swing.JCheckBox trackCheck;
    private javax.swing.JLabel trackLabel;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
