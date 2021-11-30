package com.company.entities;

import java.util.Date;

public class Group {
    public String title;
    public Date dataInicio;
    public Date dataFinal;
    public Double valorGrupo;
    private Integer grupoId;
    private Integer userId;
    private int destinoId;

    public void getGrupData(Integer userId, Integer destinyId) {}

    public int getDestinoId() {
        return this.destinoId;
    }

    public void createGroup(User user, int destinoId) {
        this.userId = user.getUserId();
        this.destinoId = destinoId;
    }

    private void updateGroup(Integer destinoId) {
        this.destinoId = destinoId;
    }
    private void deleteGroup(Integer userId) {}

}
