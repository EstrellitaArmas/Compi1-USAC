/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author estergema
 */
class panel extends JPanel{
    private  Image fondo;
    private Jugador jugador;
     ArrayList<Jugador> lista = new ArrayList();
     
    panel(Dimension d) {
       this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));      
        String path;
        path = parser1.TsimbolosF.get("1").getImagen();
       fondo = new ImageIcon(getClass().getResource(path)).getImage();
        //personaje.animar(true);
    //jugador = new Jugador();
   // jugador.animar(true);
    

    }
   
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
        g.drawImage(fondo, 0, 0, null);
        System.out.println("Se ha creado paneles");
        Iterator it = lista.iterator();
        while (it.hasNext()){	  
          ((Jugador) it.next()).dibujar(g);
            System.out.println("se ha creado jugador");
            
	}
    }
public void mouseClicked(MouseEvent e) {
        jugador = new Jugador(e.getX(), e.getY());
        jugador.animar(true);
        lista.add(jugador);                
    }
   

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}
