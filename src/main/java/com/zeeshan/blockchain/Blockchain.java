package com.zeeshan.blockchain;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Blockchain {
    
    private static int currentIndex = 0;
    private List<Block> blocks;

    public Blockchain() {

        this.blocks = new LinkedList<>();
        // create the first block
        Block firstBlock = new Block(currentIndex, 0, new String[]{"First Class"});
        this.blocks.add(firstBlock);
    }

    public void addBlock(String[] transactions) {
        Block block = new Block(++currentIndex, blocks.get(blocks.size() - 1).getHash(), transactions);
        this.blocks.add(block);
    }

    public List<Block> getBlocks() {
        return blocks;
    }
}
