package com.company.ysuku.web.user;

import com.haulmont.cuba.core.global.PasswordEncryption;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.ysuku.entity.User;

import javax.inject.Inject;

public class UserEdit extends AbstractEditor<User> {
    @Inject
    private PasswordEncryption passwordEncryption;

    @Override
    protected boolean preCommit() {
        String encryptionPlainHash = passwordEncryption.getPlainHash(getItem().getPassword());
        getItem().setPassword(encryptionPlainHash);
        return super.preCommit();
    }
}