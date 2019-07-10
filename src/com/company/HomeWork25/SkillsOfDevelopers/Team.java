package com.company.HomeWork25.SkillsOfDevelopers;

import java.util.ArrayList;

public class Team {

 Team teamOfD[];
 private String name;
 private String skill;
 private String addskill;

 public void setName(String name) { this.name = name; }
 public void setSkill(String skill) { this.skill = skill; }
 public void setAddskill(String addskill) { this.addskill = addskill; }


 @Override
 public String toString() {
  String text = "";
  text += "Имя: " + name;
  text += ", skill: " + skill;
  if (addskill != null)
   text += ", " + addskill;
  else
   text += "";
  return text;
 }
}
