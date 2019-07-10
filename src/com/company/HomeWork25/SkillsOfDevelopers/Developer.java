package com.company.HomeWork25.SkillsOfDevelopers;

import java.util.ArrayList;

public class Developer extends Team{

    ArrayList<Skill> skills;

    public Developer(String name, String skill) {
       setName(name);
       setSkill(skill);
    }

    public Developer(String name, String skill, String addskill) {
        setName(name);
        setSkill(skill);
        setAddskill(addskill);
    }

}
