package com.company.entities;

public class User {
    public String nome;
    private String password;
    private Integer UsuarioId;

    public String getUserData(Integer usuarioId) {
        return "userdata";
    }

    protected int getUserId() {
        return 999;
    }

    private void createDataUser() {}
    private void updateDataUser(int usuarioId) {}
    private void deleteDataUser(int usuarioId) {}

}
