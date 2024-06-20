package com.zeeshan.blockchain;

import java.util.Scanner;

public class BlockchainDemo {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String l = sc.nextLine();
        
        for( int i = 0; i< n; i++){
            String k = sc.nextLine();
        blockchain.addBlock(new String[] {k});
        
        }
        
        for(Block block : blockchain.getBlocks()) {
            System.out.println("block #" + block.getIndex()  + ": " + block.getHash());
        }
    
    }

}
