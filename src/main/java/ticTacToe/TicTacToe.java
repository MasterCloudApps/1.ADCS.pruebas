package ticTacToe;

import ticTacToe.controllers.OperationController;
import ticTacToe.controllers.local.LocalLogic;
import ticTacToe.views.console.ConsoleView;

public class TicTacToe {

	private Logic logic;
	
	private View view;
	
	public TicTacToe(View view, Logic logic) {
		this.view = view;
		this.logic = logic;
	}
	
	public void play() {
		OperationController controller;
		do {
			controller = logic.getOperationController();
			if (controller != null){
				view.interact(controller);
			}
		} while (controller != null);	
	}
	
	public static void main(String[] args) {
		new TicTacToe(new ConsoleView(), new LocalLogic()).play();
	}
}
