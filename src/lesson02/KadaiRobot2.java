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
 * @author try
 */
public class KadaiRobot2 extends Robot {

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        double fieldx = this.getBattleFieldWidth();
        double fieldy = this.getBattleFieldHeight();
        double x = this.getX();
        double y = this.getY();
        double gh = this.getHeading();

        turnRight(-gh);

        while (true) {
            ahead(400);
            turnLeft(90);
            ahead(400);
            turnRight(-90);
        }
    }
    //To change body of generated methods, choose Tools | Templates.
}
//}
