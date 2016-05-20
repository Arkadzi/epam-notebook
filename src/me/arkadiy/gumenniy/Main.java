package me.arkadiy.gumenniy;

import me.arkadiy.gumenniy.view.Console;
import me.arkadiy.gumenniy.view.View;

public class Main {

    public static void main(String[] args) {
	// write your code here

        View view = new Console();
        Controller controller = new Controller(view);
        controller.start();
    }
}
