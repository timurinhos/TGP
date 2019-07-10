package com.company.HomeWork22.Computers;
//Создать объект класса Компьютер, используя классы Винчестер, Дисковод, Оперативная память, Процессор. Методы: включить, выключить, проверить на вирусы, вывести на консоль размер винчестера.
public class ComputerRun {

    public static void main(String[] args) {

        Computer<String, Integer> computer1 = new Computer<>("Dell", "Intel i7 8770k", "DVD/RW",16, 1,false);
        Computer<String, Integer> computer2 = new Computer<>("Impression Computer", "Intel i5 6400", "DVD/CD-RW",8, 500, false, true);
        Computer<String, Integer> computer3 = new Computer<>("MSI", "AMD FX 8350", "BD/RW",32, 3, true, true);

        System.out.println("Первый компьютер:\n" + computer1.OnorOFF() + computer1 + computer1.Hddsize());
        System.out.println("Второй компьютер:\n" + computer2.OnorOFF() +  computer2 + computer2.Hddsize() + computer2.viruscheck());
        System.out.println("Третий компьютер:\n" + computer3.OnorOFF() + computer3 + computer3.Hddsize() + computer3.viruscheck());

    }
}

class Computer<T, G> extends Processor{

 private T name;
 private boolean vc;
 private boolean onoroff;

    public Computer(T name, T nameP, T type, G volume, G size, boolean onoroff) {
        this.name = name;
        setNameP(nameP);
        setType(type);
        setVolume(volume);
        setSize(size);
        this.onoroff = onoroff;
    }

    public Computer(T name, T nameP, T type, G volume, G size, boolean vc, boolean onoroff) {
        this.name = name;
        setNameP(nameP);
        setType(type);
        setVolume(volume);
        setSize(size);
        this.vc = vc;
        this.onoroff = onoroff;
    }

    public String OnorOFF(){

        if (onoroff)
            return "Компьютер включен.\n";
        else
            return "Компьютер выключен.\n";

    }

    public String viruscheck(){

        if (vc)
        return "Идет проверка на вирусы...\nВирусы не найдены)\n";
        else
            return "Идет проверка на вирусы...\nВирусы найдены!\n";

    }

    @Override
    public String toString() {
        return "Производитель: " + name +
                ", Процессор: " + getNameP() + ", Оптический привод: " + getType() + ", ОЗУ: " + getVolume() + " Gb";
    }
}

class Processor<T> extends OpticalDrive{

 private T nameP;

    public T getNameP() { return nameP; }
    public void setNameP(T nameP) { this.nameP = nameP; }

}

class OpticalDrive<T> extends Ram{

 private T type;

    public T getType() { return type; }
    public void setType(T type) { this.type = type; }

}

class Ram<G> extends HDD{

 private G volume;

    public G getVolume() { return volume; }
    public void setVolume(G volume) { this.volume = volume; }

}

class HDD<G> {

 private G size;

    public G getSize() { return size; }
    public void setSize(G size) { this.size = size; }

    public String Hddsize(){
        return ", Размер винчестера: " + size + "(GB/TB)\n";
    }

}