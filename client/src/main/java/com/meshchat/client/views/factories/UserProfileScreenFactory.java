package com.meshchat.client.views.factories;

import com.meshchat.client.Launcher;
import com.meshchat.client.views.base.ScreenFactory;
import com.meshchat.client.views.form.UserProfileScreenHandler;

public class UserProfileScreenFactory implements ScreenFactory<UserProfileScreenHandler> {
    @Override
    public UserProfileScreenHandler getScreenHandler() {
        return Launcher.injector.getInstance(UserProfileScreenHandler.class);
    }
}
