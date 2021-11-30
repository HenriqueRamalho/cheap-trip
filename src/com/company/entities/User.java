package com.company.entities;

public class User {
    private int usuarioId;
    private String nome;
    private String password;

    public int getUserId() {

        return this.usuarioId;
    }

    public String getNome() {

        return this.nome;
    }

    public String getPassword() {

        return this.password;
    }

    public void createDataUser(int usuarioId, String nome, String password) {
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.password = password;
    }
    public void updateDataUser(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }
    public void deleteDataUser(int usuarioId) throws Exception {
        if(usuarioId > 0) {
            this.nome = "";
            this.password = "";
            return;
        }
        throw new Exception("informe um id");

    }

}
