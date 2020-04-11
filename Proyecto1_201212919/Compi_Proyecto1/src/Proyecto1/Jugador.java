/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.swing.Timer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author estergema
 */
public class Jugador {
     private BufferedImage[] _image;
    private URL _url;
    private int sprites = 4;
    private int index=1;

    private Timer timer;
    private Image imagen;
    //Coordenadas del sprite
    private int X ;
    private int Y;

     public Jugador(int x , int y) {
         load_sprites();
        //coordenadas iniciales
        this.X = x ; 
        this.Y = y;
        //imagen del bicho
        imagen = new ImageIcon(getClass().getResource("/Imagenes/chopper0.jpg")).getImage();
        //animación 
         timer = new Timer(100, new ActionListener (){
           public void actionPerformed(ActionEvent e) {
           index++;
              imagen = _image[index];
        if(index==30)index=1;
         }
        });

    }

    //Carga laa imagenes del bicho en memoria
    private void load_sprites(){
        _image = new BufferedImage[sprites+1];
        //se llena el buffer con la imagen
        for(int i=1; i<=sprites;i++){
            try {
                _url = new URL(getClass().getResource("/Imagenes/chopper1.jpg").toString());
                _image[i] = ImageIO.read(_url);
            } catch (IOException ex) {System.out.println(ex); }
        }
        _image[1].getGraphics();
    }

     //Controla el inicio y fin de la animación
    public void animar(boolean turnOnOff) {
        if (turnOnOff) {            
            timer.start();
        } else {
            timer.stop();
        }
    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(imagen, X, Y, null);
    }
    
}
