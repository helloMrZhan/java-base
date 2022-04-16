package com.zjq.javabase.base11.demo07;

/**
 * @author zjq
 */
public class Hero {

    private String name; // 英雄的名称
    private Skill skill; // 英雄的技能

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(String name,String skillType) {
        // 调用接口中的抽象方法
        skill.use(name,skillType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
