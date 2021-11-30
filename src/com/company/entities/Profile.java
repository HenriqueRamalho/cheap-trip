package com.company.entities;

import java.util.Date;

public class Profile {
    public String endereco;
    public Date dataNasc;
    public String estadoCivil;

    private String rg;
    private String cpf;
    public String telefone;
    private User user;

    public Profile(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public String getProfile(Integer userId) { return ""; }
    private void createDataProfile() { }
    private void updateDataProfile(Integer userId) {}
    private void deleteDataProfile(Integer userId) {}
}
