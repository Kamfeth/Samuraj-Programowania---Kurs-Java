package Zad3;

import Zad3.Blocks.Block;
import Zad3.Blocks.Red.RedBlock;
import Zad3.Blocks.Green.GreenBlock;

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
