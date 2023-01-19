package com.example.yaelog.ui.login;

public class LoginFormStatePeroJava {
    Integer usernameError;
    Integer passwordError;
    Boolean isDataValid;

    public Integer getUsernameError() {
        return usernameError;
    }

    public void setUsernameError(Integer usernameError) {
        this.usernameError = usernameError;
    }

    public Integer getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(Integer passwordError) {
        this.passwordError = passwordError;
    }

    public Boolean getDataValid() {
        return isDataValid;
    }

    public void setDataValid(Boolean dataValid) {
        isDataValid = dataValid;
    }
}
