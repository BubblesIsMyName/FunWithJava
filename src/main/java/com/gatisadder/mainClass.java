package com.gatisadder;

import com.gatisadder.*;

public class mainClass
{

    public static void startUI()
    {
        view myView = new view();
        controller myController = new controller(myView);
        myController.initmodel(0);
        myView.addController(myController);
    }

    public static void main(String[] argv) throws Exception
    {
        startUI();
    }
}