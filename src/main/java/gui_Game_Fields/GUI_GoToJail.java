package gui_Game_Fields;

import game_Txt.FieldText;
import gui_fields.GUI_Field;
import spil.Konto;
import spil.Player;

import java.awt.*;

public class GUI_GoToJail extends GUI_Parentfield {
    public static FieldText mt = FieldText.getInstance();
    public GUI_GoToJail() {
        super(Color.gray, Color.black,mt.mp.get("goToJailT"), mt.mp.get("goToJailS"), mt.mp.get("goToJailD"));
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
