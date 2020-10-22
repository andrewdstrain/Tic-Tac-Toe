package com.isageek.blaztek.tictactoe;

public class AlreadyPlayedHereException extends Exception {
    public AlreadyPlayedHereException() {
        super("Cheater: There's already a mark there.");
    }

    public AlreadyPlayedHereException(String message) {
        super(message);
    }
}
