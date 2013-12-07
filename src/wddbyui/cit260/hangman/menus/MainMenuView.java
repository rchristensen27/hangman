package wddbyui.cit260.hangman.menus;

import wddbyui.cit260.hangman.enums.Status;
import wddbyui.cit260.hangman.exceptions.MenuException; //Lesson 11 Paired, Lorna & Gerald

/**
 *
 * @author gerrygj
 */
public class MainMenuView extends Menu {

    private static final String[][] menuItems = {
        {"1", "Continue game"},
        {"2", "Display instructions"},
        {"3", "Exit program"},
    };

    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }

    public Status getMainMenuItem() throws MenuException {   //Lesson 11 Paired, Lorna & Gerald
        return mainMenuControl.activateControl(this.getCommand().charAt(0));
    }
    
}
