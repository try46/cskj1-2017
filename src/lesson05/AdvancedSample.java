/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05;

import robocode.AdvancedRobot;
import robocode.MoveCompleteCondition;
import robocode.TurnCompleteCondition;
import robocode.util.Utils;

/**
 *
 * @author C0116103
 */
public class AdvancedSample extends AdvancedRobot {

    @Override
    public void run() {
        //90度の方向を向くために、あと何度足らないか計算
        double turnRightAmout = 90 - getHeading();
        //90度の方向を向く
        turnRight(Utils.normalRelativeAngleDegrees(turnRightAmout));
        //中心の横方向に移動する
        ahead(getBattleFieldWidth() / 2.0 - getX());
        //90度左回転
        turnLeft(90);
        //
        ahead(getBattleFieldHeight() / 2.0 - getY());
        /**
         * setAhead(250);
         *
         * setTurnRight(90);
         *
         * waitFor(new TurnCompleteCondition(this));
         *
         * setTurnGunRight(720);
         *
         */

        setAhead(200);
        setTurnGunLeft(90);
        waitFor(new MoveCompleteCondition(this));
        setBack(200);
        setTurnGunLeft(90);
        execute();

        /*
        setAdjustGunForRobotTurn(true);
        while (true) {
            setAhead(2000);
            setTurnRight(360);
            setMaxVelocity(5);
            waitFor(new TurnCompleteCondition(this));
        }*/
        setAhead(120);
        execute();
    }

}
