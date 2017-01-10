package jp.ac.uryukyu.ie.e165714;

/**
 * Created by yonaminehigashi on 2017/01/10.
 */
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yonaminehigashi on 2016/11/18.
 */
public class EnemyTest {
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        int hitPoint= hero.getHitPoint();
        assertEquals(heroHP, hitPoint);
    }

}