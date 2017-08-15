/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

import java.awt.Color;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;
import robocode.util.Utils;

/**
 *
 * @author C0116103
 */
public class C0116103 extends Robot {

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1);
        //敵のベアリング角を取得する
        double angle = event.getBearing();
        System.out.println("bearing:" + angle);

        //敵の名前を取得する
        String name = event.getName();
        System.out.println("NAME: " + name);
        //敵との距離
        double dis = event.getDistance();
        System.out.println("Distance: " + dis);
        //敵のエネルギー
        double ene = event.getEnergy();
        System.out.println("Enemy Energy: " + ene);
        //敵の向き
        double ang = event.getHeading();
        System.out.println("Enemy Heading: " + ang);
        //敵の速度
        double vec = event.getVelocity();
        System.out.println("Enemy Velocity: " + vec);
//To change body of generated methods, choose Tools | Templates.

        if (name.equals("sample.SittingDuck")) {
            setBulletColor(new Color(255, 0, 255));
            setScanColor(Color.MAGENTA);
            fire(2);
        }
    }

    @Override
    public void onWin(WinEvent event) {
        int i = (int) (Math.random() * 255);
        setAllColors(new Color(i, i, i));

        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onHitWall(HitWallEvent event) {
        turnRight(360);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onHitRobot(HitRobotEvent event) {
        double angle = Utils.normalRelativeAngleDegrees(
                getGunHeading() - getHeading());

        double power = event.getEnergy();

        System.out.println("angle:" + angle + " " + "power:" + power);
        turnGunRight(angle);

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onHitByBullet(HitByBulletEvent event) {

        turnLeft(90 - event.getBearing());

    }

    @Override
    public void onBulletMissed(BulletMissedEvent event) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onBulletHit(BulletHitEvent event) {
        double ene = event.getEnergy();
        String name = event.getName();
        System.out.println("Energy: " + ene + "name: " + name);

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        //this.setBodyColor(Color.BLUE);
        this.setBodyColor(new Color(255, 255, 255));
        this.setRadarColor(Color.yellow);
        this.setGunColor(new Color(55, 34, 89));
        this.setBulletColor(new Color(255, 0, 255));
        this.setScanColor(Color.BLUE);
        System.out.println(this.getEnergy());
        double gh = this.getHeading();
        ahead(getBattleFieldHeight() - getY());
        turnRight(90);
        while (true) {
            turnGunRight(90);
            turnGunLeft(-90);
            if (getEnergy() <= 50) {
                setBodyColor(new Color(255, 0, 0));
                setScanColor(new Color(255, 0, 0));
            }
        }

    }
}
//To change body of generated methods, choose Tools | Templates.

