package com.company.entities;

public class Destino {
    private String nome;
    private String curiosidade;
    private int destinoId;
    private double valorDestino;

    public Destino(String nome, String curiosidade, int destinoId, double valorDestino) {
        this.nome = nome;
        this.curiosidade = curiosidade;
        this.destinoId = destinoId;
        this.valorDestino = valorDestino;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCuriosidade() {
        return this.curiosidade;
    }

    public int getDestinoId() {
        return this.destinoId;
    }

    public double getValorDestino() {
        return this.valorDestino;
    }

    public String getDestinyData(Integer groupId) {
        return "";
    }
    private void createDestino() {}
    private void updateDestino(Integer destinoId) {}
    private void deleteDestino(Integer destinoId) {}
}
