package com.meshchat.client.views.layout;

import com.meshchat.client.utils.Config;
import com.meshchat.client.views.base.BaseLayout;
import com.meshchat.client.views.base.LazyInitialize;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TabsLayout
 * - Chứa tabbar và phần content
 */
public class TabsLayout extends BaseLayout<TabsLayout.Sessions> {

    @FXML
    private Pane tab;
    @FXML
    private Pane screen;
    public List<LazyInitialize> lazyShowList = new ArrayList<>();


    public enum Sessions {
        TAB,
        SCREEN
    }

    public TabsLayout() {
        super(Config.TAB_LAYOUT_PATH);
    }

    @Override
    public void initialize() {
        super.initialize();
        super.addSession(TabsLayout.Sessions.TAB, this.tab);
        super.addSession(TabsLayout.Sessions.SCREEN, this.screen);
    }

    @Override
    public void onShow() {
        System.out.println(lazyShowList);
        this.lazyShowList.forEach(LazyInitialize::onShow);
    }

    @Override
    public void show() {
        super.show();
//        this.onShow();
    }
}
