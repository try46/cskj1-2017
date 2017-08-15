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
public class TestRobot extends Robot {

    @Override
    //スキャンした時に動くメソッド
    public void onScannedRobot(ScannedRobotEvent event) {

    }

    @Override
    //ロボットが動いた時一回だけ動くメソッド
    public void run() {
        //この(this)ロボットのX座標を取得する
        double x = this.getX();
        //コンソールに出力
        System.out.println("X: " + x);
        //この(this)ロボットのY座標を取得する
        double y = this.getY();
        //コンソールに出力
        System.out.println("Y: " + y);
        //このロボットのBodyの向きを取得する
        double angle = this.getHeading();
        System.out.println("Headiing: " + angle);
        //ロボットの現在の速度を取得する
        double speed = this.getVelocity();
        System.out.println("speed: " + speed);
        //ロボットの高さを取得する
        double height = this.getHeight();
        System.out.println("height: " + height);
        //ロボットの幅を取得する
        double width = this.getWidth();
        System.out.println("width: " + width);
        //ロボットのGunの向きを取得する
        double gunHead = this.getGunHeading();
        System.out.println("gunHead: " + gunHead);
        //ロボットのレーダーの向きを取得する
        double rea = this.getRadarHeading();
        System.out.println("Rader angle: " + rea);
        //ロボットのエネルギーを取得
        double myEnergy = this.getEnergy();
        System.out.println("Energy: " + myEnergy);
        
        
        
    }

}
