package org.pf4j.demo;

import org.pf4j.Extension;
import org.pf4j.demo.api.DialogDemo;

import javax.swing.*;
import java.awt.*;

@Extension
public class ErrorDialog implements DialogDemo {
    @Override
    public void showDialog() {
        //TODO 该弹出框有问题，需要释放资源
        JOptionPane.showMessageDialog(new JFrame().getContentPane(),"error dialog","error",JOptionPane.WARNING_MESSAGE);git

    }

    @Override
    public String getName() {
        return "ErrorDialog";
    }
}
