/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05;

import robocode.AdvancedRobot;
import robocode.MoveCompleteCondition;
import robocode.ScannedRobotEvent;

/**
 *
 * @author try
 */
public class AdvancedFirstRobot extends AdvancedRobot {

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        
        
        while (true) {
            setAhead(200);
            setTurnGunLeft(2000);
            waitFor(new MoveCompleteCondition(this));
            setBack(200);
            waitFor(new MoveCompleteCondition(this));
        }
        //To change body of generated methods, choose Tools | Templates.
    }

}
