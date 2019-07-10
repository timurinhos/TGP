package com.company.HomeWork25.SkillsOfDevelopers;
//Создать класс Team, который содержит коллекции экземпляров класс Developer.
//Класс Developer содержит коллекцию классов Skill
//Создать класс Project, который содержит экземпляр класса Team.
//Необходимо реализовать методы для вывода на экран всех разработчиков в команде и вывести их навыки.
public class Project {

    public static void main(String[] args) {

        Team team = new Team();
        Skill skill = new Skill();
        skill.GetSkills();
        team.teamOfD = new Team[]{
                new Developer("Андрей", skill.skillsOfDevelopers.get(0)),
                new Developer("Стас", skill.skillsOfDevelopers.get(1)),
                new Developer("Маша",skill.skillsOfDevelopers.get(2), skill.skillsOfDevelopers.get(3)),
                new Developer("Костя", skill.skillsOfDevelopers.get(3), skill.skillsOfDevelopers.get(1)),
                new Developer("Макс", skill.skillsOfDevelopers.get(4))
        };

        System.out.println("Команда 1:");
        for (int k = 0; k < team.teamOfD.length; k++){
            System.out.println(team.teamOfD[k]);
        }

    }
}
