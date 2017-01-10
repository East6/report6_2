package jp.ac.uryukyu.ie.e165714;

/**
 * Created by yonaminehigashi on 2017/01/10.
 */
public class LivingThing {
    //フィールド変数
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    //コンストラクタ
    /**
     *  String name; //敵の名前
     *  int hitPoint; //敵のHP
     *  int attack; //敵の攻撃力
     *  boolean dead; //敵の生死状態。true=死亡。
     */
    public LivingThing (String name, int hitPoint,int attack){
        this.name=name;
        this.hitPoint=hitPoint;
        this.attack=attack;
        dead=false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n",name,hitPoint,attack);
    }
    //ゲッターとセッター
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getHitPoint(){return hitPoint;}
    public void setHitPoint(int hitPoint){this.hitPoint=hitPoint;}
    public int getAttack(){return attack;}
    public void setAttack(int attack){this.attack = attack;}
    //getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
    public boolean isDead(){return dead;}
    public void setDead(boolean dead){this.dead=dead;}

    /**
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     */
    public void attack(LivingThing opponent){
        if (dead==false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n",name, opponent.getName(), damage);

            opponent.wounded(damage);
        }

    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     */

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}