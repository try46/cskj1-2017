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
public class KadaiRobot1 extends Robot {

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        double fieldx = this.getBattleFieldWidth();
        double fieldy = this.getBattleFieldHeight();
        double x=this.getX();
        double y=this.getY();
        double gh=this.getHeading();
       
        turnRight(-gh);
        ahead(fieldy/2-y);
        turnRight(90);
        ahead(fieldx/2-x);
       
      
        
    }
}
//To change body of generated methods, choose Tools | Templates.

