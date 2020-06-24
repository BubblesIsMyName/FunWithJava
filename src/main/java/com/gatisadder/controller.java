package com.gatisadder;

import com.gatisadder.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;
/*
Controller class is responsible for linking the model
and view class. Neither of them though about one another.

The view can then be changed and not affect the model logic which
in our case is for counting up to AMX and MIN.
*/

public class controller implements ActionListener
{
    public model _model;
    public view _view;

    public controller(view v) {
        // Constructor
        this._model = new model();
        this._view = v;
    }


    public void actionPerformed(java.awt.event.ActionEvent e) {
        String input = e.getActionCommand();
        checkAction(input);
    }


    public void checkAction(String input) {
        switch(input) {
            case constants.kUp:
                _view.setLabel(_model.addNumber());
                break;
            case constants.kDown:
                _view.setLabel(_model.minusNumber());
                break;
            default:
                System.out.println("WTF happened here");
                break;
        }

    }

    public void initmodel(int x)
    {
        _view.setLabel(_model.initModel(x));
    }
}