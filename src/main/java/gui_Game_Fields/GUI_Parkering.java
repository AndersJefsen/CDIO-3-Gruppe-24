package gui_Game_Fields;

import spil.Player;

import java.awt.*;

public class GUI_Parkering extends GUI_Parentfield{
    public GUI_Parkering() {
        super(Color.gray, Color.black,mt.mp.get("parkeringT"), mt.mp.get("parkeringS"), mt.mp.get("parkeringD"));
    }

    @Override
    public int cost() {
        return 0;
    }
    @Override
    public void hit(Player player)
    {

    }
}
