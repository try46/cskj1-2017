/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final17a;

import java.awt.Color;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;
import robocode.util.Utils;

/**
 * CS基礎実験 最終大会
 *
 * @author C0116103
 */
public class C0116103 extends Robot {

    /**
     * 弾丸の威力
     */
    public final double GUN_POWER_MAX = 3.0;
    public final double GUN_POWER_MID = 2.0;
    public final double GUN_POWER_LOW = 1.0;

    /**
     * 回転・移動系
     */
    public double turn = 90;
    public double ahead = 300;
    public final double OnWin = 360.0;

    @Override
    public void onWin(WinEvent event) {
        setColors(Color.CYAN, Color.CYAN, Color.CYAN);
        while (true) {
            turnLeft(OnWin);
        }

    }

    @Override
    public void onHitByBullet(HitByBulletEvent event) {
        double angle = event.getHeading() + 90 - this.getHeading();
        turnRight(angle);
        ahead(ahead);
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        double nowX = this.getX();
        double nowY = this.getY();
        double maxX = this.getBattleFieldWidth();
        double maxY = this.getBattleFieldHeight();
        double centerX = maxX / 2;
        double centerY = maxY / 2;
        double gh = this.getHeading();

        String name = event.getName();
        if (getOthers() >= 10) {
            fire(GUN_POWER_LOW);

        } else if (getOthers() <= 5) {
            fire(GUN_POWER_MID);

        } else if (getOthers() == 1) {
            fire(GUN_POWER_MAX);
        }
        if (name.equals("samplesentry.BorderGuard")) {

            double turnRightAmout = 90 - getHeading();

            turnRight(Utils.normalRelativeAngleDegrees(turnRightAmout));

            ahead(maxX / 2.0 - nowX);

            turnLeft(90);

            ahead(maxY / 2.0 - nowY);
            while (true) {
                turnGunRight(90);
                fire(GUN_POWER_LOW);
            }
        }
    }

    @Override
    public void onBulletHit(BulletHitEvent event) {
        System.out.println("Bullet Power" + event.getEnergy());
    }

    @Override
    public void run() {
        /**
         * 座標系
         */
        double nowX = this.getX();
        double nowY = this.getY();
        double maxX = this.getBattleFieldWidth();
        double maxY = this.getBattleFieldHeight();
        double centerX = maxX / 2;
        double centerY = maxY / 2;
        double gh = this.getHeading();

        double upperleftY = maxY - nowY;
        double upperleftX = maxX - nowX;

        setBodyColor(new Color(0, 255, 0));
        setGunColor(new Color(0, 255, 0));
        setRadarColor(new Color(0, 255, 0));
        setScanColor(new Color(0, 255, 0));
        setBulletColor(new Color(0, 255, 0));
        //左上辺りの時
        if (nowX <= centerX && nowY >= centerY) {
            turnLeft(gh);
            ahead(upperleftY);
            turnLeft(turn);
            ahead(upperleftX);
            turnLeft(180);
        }/*
        *右上辺りの時
         */ else if (nowX >= centerX && nowY >= centerY) {
            turnLeft(gh);
            ahead(upperleftY);
            turnRight(turn);
            ahead(upperleftX);
            turnRight(90);

        }/**
         * 左下辺りの時
         */
        else if (nowY <= centerY && nowX <= centerX) {
            turnRight(-gh);
            ahead(-upperleftY);
            turnLeft(turn);
            ahead(upperleftX);
            turnRight(90);
        }/**
         * 右下辺りの時
         */
        else if (nowX >= centerX && nowY <= centerY) {
            turnRight(-gh);
            ahead(-upperleftY);
            turnRight(turn);
            ahead(upperleftX);
            turnRight(180);

        }

        while (true) {
            turnGunLeft(90);
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
