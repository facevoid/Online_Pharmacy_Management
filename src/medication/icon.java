/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medication;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Shaurav
 */
class icon {

    static Image getImage() {
        Image image = null;
        
        try {
            image = ImageIO.read(new File("res/background.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(icon.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("got image");
        return image;
        
        
         
    }
    
}
