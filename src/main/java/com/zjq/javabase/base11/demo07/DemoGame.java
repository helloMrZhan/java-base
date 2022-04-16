package com.zjq.javabase.base11.demo07;

/**
 * @author zjq
 */
public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("五虎上将关羽"); // 设置英雄的名称

        // 设置英雄技能
//        hero.setSkill(new SkillImpl()); // 使用单独定义的实现类

        // 还可以改成使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia~");
//            }
//        };
//        hero.setSkill(skill);

        // 进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use(String name, String skillType) {
                System.out.println(name+"使用技能：---》"+skillType);
            }
        });
        hero.attack(hero.getName(),"烽火狼烟💥💥💥");
        hero.attack(hero.getName(),"万箭齐发🏹🏹🏹");
        hero.attack(hero.getName(),"无懈可击🛡️🛡️🛡️");
        hero.attack(hero.getName(),"南蛮入侵🐎🐎🐎");
    }

}
