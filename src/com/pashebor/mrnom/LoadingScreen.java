package com.pashebor.mrnom;

import com.pashebor.framework.Game;
import com.pashebor.framework.Graphics;
import com.pashebor.framework.Screen;
import com.pashebor.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
        Assets.logo = g.newPixmap("logo.png", PixmapFormat.ARGB4444);
        Assets.mainMenu = g.newPixmap("mainmenuNew.png", PixmapFormat.ARGB4444);
        Assets.buttons = g.newPixmap("buttonsNew.png", PixmapFormat.ARGB4444);
        Assets.help1 = g.newPixmap("help1New.png", PixmapFormat.ARGB4444);
        Assets.help2 = g.newPixmap("help2New.png", PixmapFormat.ARGB4444);
        Assets.help3 = g.newPixmap("help3New.png", PixmapFormat.ARGB4444);
        Assets.numbers = g.newPixmap("numbersNew.png", PixmapFormat.ARGB4444);
        Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
        Assets.pause = g.newPixmap("pausemenuNew.png", PixmapFormat.ARGB4444);
        Assets.gameOver = g.newPixmap("gameoverNew.png", PixmapFormat.ARGB4444);
        Assets.headUp = g.newPixmap("aleheadxUp.png", PixmapFormat.ARGB4444);
        Assets.headLeft = g.newPixmap("aleheadLeft.png", PixmapFormat.ARGB4444);
        Assets.headDown = g.newPixmap("aleheadDown.png", PixmapFormat.ARGB4444);
        Assets.headRight = g.newPixmap("aleheadRight.png", PixmapFormat.ARGB4444);
        Assets.tail = g.newPixmap("poo.png", PixmapFormat.ARGB4444);
        Assets.stain1 = g.newPixmap("burger.png", PixmapFormat.ARGB4444);
        Assets.stain2 = g.newPixmap("cake.png", PixmapFormat.ARGB4444);
        Assets.stain3 = g.newPixmap("kura.png", PixmapFormat.ARGB4444);
        Assets.stain4 = g.newPixmap("mushrooms.png", PixmapFormat.ARGB4444);
        Assets.stain5 = g.newPixmap("candleCake.png", PixmapFormat.ARGB4444);
        Assets.click = game.getAudio().newSound("click.ogg");
        Assets.eat = game.getAudio().newSound("eat.ogg");
        Assets.bitten = game.getAudio().newSound("bitten.ogg");
        Settings.load(game.getFileIO());
        game.setScreen(new MainMenuScreen(game));
    }

    @Override
    public void present(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}