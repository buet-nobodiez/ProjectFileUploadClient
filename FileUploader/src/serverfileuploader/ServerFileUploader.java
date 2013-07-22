/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverfileuploader;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author parvez
 */
public class ServerFileUploader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //UIManager.getCrossPlatformLookAndFeelClassName();
            
        }catch(Exception ex){
            
        }
        
        MainWindow window= new MainWindow();
        window.setVisible(true);
        
        //window.setResizable(false);
        
        /*
        FileChooser file_chooser = new FileChooser();
        file_chooser.setVisible(true);
        file_chooser.setResizable(false);
        file_chooser.getFileChooser().setVisible(true);
        */
       
        
    }
}
