package jp.ac.uryukyu.ie.e165714;

/**
 * Created by yonaminehigashi on 2017/01/10.
 */

public class Hero extends LivingThing{
    //Overrideはじめ
    @Override
    public void attack(LivingThing opponent){
        boolean critical;
        if (isDead()==false) {
            int damage = (int) (Math.random() * getAttack());

            //クリティカルダメージのため
            if( Math.random()<0.3){
                damage=damage*2;
                critical=true;
            }else{
                critical=false;
            }

            if(damage==0){
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n",getName(), opponent.getName(), damage);
            }else if(critical==true){
                System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n",getName(),opponent.getName(),damage);
            }else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n",getName(),opponent.getName(),damage);
            }
            opponent.wounded(damage);
        }
    }
    public Hero(String name, int hitPoint,int attack){
        super(name,hitPoint,attack);
    }

}