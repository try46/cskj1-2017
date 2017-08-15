/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson04;

import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 *
 * @author try
 */
public class MySampleRobot extends Robot {

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onHitWall(HitWallEvent event) {
        back(50);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onHitByBullet(HitByBulletEvent event) {
        double angle=event.getHeading()+90-this.getHeading();
        //double angle=event.getHeading()-this.getHeading();
        turnRight(angle);
    }

    @Override
    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
        //To change body of generated methods, choose Tools | Templates.
    }

}
