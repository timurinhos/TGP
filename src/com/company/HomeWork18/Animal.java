package com.company.HomeWork18;
//1.Создать сущности Кот, Собака, Щука, Золотая Рыбка, Рыба, Животное, Летающий, Плавающий, Бегающий, Прыгающий, Кушающий, Домашнее животное.
//Подумать, что от чего наследовать.
public class Animal{

}
class Cat extends Pet{

}
class Dog extends Pet{

}
class Pike extends Fish{

}
class GoldFish extends Fish{

}
class Fish extends Swimming{

}
class Flying extends Eating{

}
class Swimming extends Eating{

}
class Jumping extends Eating {

}
class Running extends Eating{

}
class Eating extends Animal{

}
class Pet extends Running{

}
