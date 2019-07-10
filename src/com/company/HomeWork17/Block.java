package com.company.HomeWork17;

public class Block {
    private int a, b, c;
    private int volume;

    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    boolean someBlock(Block block) {
        if ((block.a == a) && (block.b == b) && (block.c == c)) {
            return true;

        } else {
            return false;
        }
    }

    boolean sameVolume(Block block) {
        if (block.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
}

class RunBlock {
    public static void main(String[] args) {
        Block block1 = new Block(10, 2, 5);
        Block block2 = new Block(10, 2, 5);
        Block block3 = new Block(4, 5, 5);

        System.out.println("Те же размеры?" + block1.someBlock(block2));
        System.out.println("Те же размеры?" + block2.someBlock(block3));
        System.out.println("Тот же обьем?" + block2.sameVolume(block3));
    }
}