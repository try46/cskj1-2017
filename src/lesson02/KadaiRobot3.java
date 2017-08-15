/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 *
 * @author c0116103
 */
public class KadaiRobot3 extends Robot {

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        double x = this.getX();
        double y = this.getY();
        double fieldx = this.getBattleFieldWidth();
        double fieldy = this.getBattleFieldHeight();
        double x0 = fieldx - x;
        double y0 = fieldy - y;
        double gh = this.getHeading();
//To change body of generated methods, choose Tools | Templates.

        turnLeft(gh);
        ahead(fieldy + y);
        turnLeft(90);
        ahead(fieldx + x);
        turnGunRight(180);

        while (true) {
            turnGunRight(90);
            turnGunRight(-90);
        }

    }
}
