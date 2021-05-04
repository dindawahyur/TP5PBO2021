/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author dwrah
 */
public class Enemy extends GameObject {
    
    //flag 0 jalan arah kanan
    //flag 1 jalan arah kiri
    int flag = 0;
    
    public Enemy(int x, int y, ID id){
        super(x, y, id);
       
//        speed = 1;
    }
   

    @Override
    public void tick() {
        if(flag==0){
            x += 5;
            if(getX() == 740) flag=1;
        }
        
        if(flag==1){
            x -= 5;
            if(getX() == 0) flag=0;
        }
        
//        x += vel_x;
        y += vel_y;
        
        x = Game.clamp(x, 0, Game.WIDTH - 60);
        y = Game.clamp(y, 0, Game.HEIGHT - 80);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.decode("#FF0000"));
        g.fillRect(x, y, 40, 40);
    }
}
