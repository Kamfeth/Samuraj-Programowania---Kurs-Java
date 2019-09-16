package Zad3;

import zad3.blocks.Block;
import zad3.blocks.red.RedBlock;
import zad3.blocks.green.GreenBlock;

public class Zadanie3 {
    public static void main(String[] args) {
        Block block = new Block();
        block.showMessage();
        RedBlock redBlock = new RedBlock();
        redBlock.showMessage();
        GreenBlock greenBlock = new GreenBlock();
        greenBlock.showMessage();
    }
}
