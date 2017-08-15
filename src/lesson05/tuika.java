/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05;

import robocode.AdvancedRobot;
import robocode.MoveCompleteCondition;
import robocode.TurnCompleteCondition;

/**
 *
 * @author try
 */
public class tuika extends AdvancedRobot {

    @Override
    public void run() {
        while (true) {

            setAhead(2000);
            setMaxVelocity(3);
            setTurnRight(360);
            waitFor(new TurnCompleteCondition(this));
            setTurnLeft(360);
            waitFor(new TurnCompleteCondition(this));
            setTurnRight(360);
            setMaxVelocity(8);
            waitFor(new TurnCompleteCondition(this));
            setTurnLeft(360);
            waitFor(new TurnCompleteCondition(this));
        }
    }
}
