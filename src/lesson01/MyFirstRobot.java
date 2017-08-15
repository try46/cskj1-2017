/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 *
 * @author try
 */
public class MyFirstRobot extends Robot {

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onHitWall(HitWallEvent event) {
        super.onHitWall(event);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onHitByBullet(HitByBulletEvent event) {
        super.onHitByBullet(event);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(60);
            back(100);
            turnGunLeft(60);
        }
        //To change body of generated methods, choose Tools | Templates
    }

}
