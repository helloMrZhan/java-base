package com.zjq.javabase.base11.demo07;

/**
 * @author zjq
 */
public class SkillImpl implements Skill {
    @Override
    public void use(String name,String skillType) {
        System.out.println(name+"使用技能：---》"+skillType);
    }
}
