package com.isageek.blaztek.tictactoe;

public class NotYourTurnException extends Exception {
    public NotYourTurnException() {
        super("Cheater: It is not your turn.");
    }

    public NotYourTurnException(String message) {
        super(message);
    }
}
