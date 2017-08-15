/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pre01a;

import java.awt.Color;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;

/**
 *
 * @author C0116103
 */
public class C0116103 extends Robot {
    
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        if (getOthers() >= 5) {
            fire(1.5);
        } else if (getOthers() <= 4 && getOthers() >= 1) {
            fire(2.5);
        } else if (getOthers() == 1) {
            fire(3);
        }
        
    }
    
    @Override
    public void onWin(WinEvent event) {
        setColors(Color.CYAN, Color.CYAN, Color.CYAN);
        while (true) {
            turnGunRight(360);
        }
        
    }
    
    @Override
    public void onHitByBullet(HitByBulletEvent event) {
        double angle = event.getBearing();
        System.out.println("Enemy Bullet Angle :" + angle);
        turnRight(angle);
        
    }
    
    @Override
    public void onBulletHit(BulletHitEvent event) {
        double enemy = event.getEnergy();
        String name = event.getName();
        System.out.println("HIT! Enemy Energy :" + enemy);
        System.out.println("HIT! Enemy Name :" + name);
        
    }
    
    @Override
    public void run() {
        double fieldx = this.getBattleFieldWidth();
        double fieldy = this.getBattleFieldHeight();
        double x = this.getX();
        double y = this.getY();
        double gh = this.getHeading();
        
        setBodyColor(new Color(0, 255, 0));
        setGunColor(new Color(0, 255, 0));
        setRadarColor(new Color(0, 255, 0));
        setScanColor(new Color(0, 255, 0));
        setBulletColor(new Color(0, 255, 0));
        
        turnLeft(gh);
        ahead(fieldy - y);
        turnLeft(90);
        ahead(fieldx - x);
        ahead(-10);
        turnLeft(90);
        ahead(10);
        turnLeft(90);
        
        while (true) {
            turnGunRight(90);
            turnGunRight(-90);
            if (getEnergy() <= 67) {
                setBodyColor(new Color(255, 255, 0));
                setGunColor(new Color(255, 255, 0));
                setRadarColor(new Color(255, 255, 0));
                setScanColor(new Color(255, 255, 0));
                setBulletColor(new Color(255, 255, 0));
                
            }
            if (getEnergy() <= 33) {
                setBodyColor(new Color(255, 0, 0));
                setGunColor(new Color(255, 0, 0));
                setRadarColor(new Color(255, 0, 0));
                setScanColor(new Color(255, 0, 0));
                setBulletColor(new Color(255, 0, 0));
            }
        }
        
    }
}
