package view;

import controller.TicController;
import model.TicModel;

import java.util.Scanner;

public class TicView {
    public static TicController cont;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        cont = new TicController(new TicModel());

        while (!cont.isGameOver()){
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    System.out.print(cont.getPieceAt(i,j));


                }
                System.out.println();
            }
            System.out.println();
            System.out.print("Player " + cont.getPlayerNum() + ", choose where you want to lay your stone. Input your row then column.");
            int row = input.nextInt();
            int col = input.nextInt();
            cont.placePieceAt(row, col);
        }
        System.out.println("Congrats, Player " + cont.getGameWinner() + ", you won!");
    }
}
