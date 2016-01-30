package com.pashebor.mrnom;

import com.pashebor.framework.Screen;
import com.pashebor.impl.AndroidGame;

public class MrNomGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
}