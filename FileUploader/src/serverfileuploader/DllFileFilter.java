/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverfileuploader;

import java.io.File;

/**
 *
 * @author parvez
 */
public class DllFileFilter extends javax.swing.filechooser.FileFilter {

    private String extension;
    public DllFileFilter(String ext){
        extension=ext;
    }
    public boolean accept(File file) {
        String filename = file.getName();
        return filename.endsWith(extension);
    }

    public String getDescription() {
        return "*"+extension;
    }
}
