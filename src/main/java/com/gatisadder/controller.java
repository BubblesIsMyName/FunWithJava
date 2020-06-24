package com.gatisadder;

import com.gatisadder.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

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