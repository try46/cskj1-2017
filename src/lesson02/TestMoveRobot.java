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
public class TestMoveRobot extends Robot{

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        System.out.println("FOUND ENTRY");
        fire(1);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
           double gunHead = this.getGunHeading();
            System.out.println("gunHead: " + gunHead);
        while (true) {        
            turnGunRight(360);
        }
 //To change body of generated methods, choose Tools | Templates.
    }
    
}
