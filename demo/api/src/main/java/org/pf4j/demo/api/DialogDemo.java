package org.pf4j.demo.api;

import org.pf4j.Extension;
import org.pf4j.ExtensionPoint;

import java.awt.*;
/*
弹窗的扩展点定义
* */
public interface DialogDemo extends ExtensionPoint {
   void showDialog();
   String getName();
}
