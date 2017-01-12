package jp.ac.uryukyu.ie.e165714;

/**
 * Created by yonaminehigashi on 2017/01/10.
 */
public class Enemy extends LivingThing{
    //オーバライド開始
    @Override
    public void attack(LivingThing opponent){
        boolean critical;
        if (isDead()==false) {
            int damage = (int) (Math.random() * getAttack());

            //クリティカルダメージのため
            if( Math.random()<0.2){
                damage=damage*2;
                critical=true;
            }else{
                critical=false;
            }

            if(damage==0){
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n",getName(), opponent.getName(), damage);
            }else if(critical==true) {
                System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            }else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n",getName(),opponent.getName(),damage);
            }
            opponent.wounded(damage);
        }
    }
    //@Override

    //オーバライド終了

    public Enemy(String name, int hitPoint,int attack){
        super(name,hitPoint,attack);
    }
}