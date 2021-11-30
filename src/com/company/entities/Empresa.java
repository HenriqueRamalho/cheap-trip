package com.company.entities;

public class Empresa {
    public String nomeFantasia;
    public String razaoSocial;
    private String cnpj;
    private int empresaId;

    public String getDataEmpresa() {
        return "";
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public int getEmpresaId() {
        return this.empresaId;
    }

    public void createEmpresa(String nomeFantasia, String razaoSocial, String cnpj, int empresaId) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.empresaId = empresaId;
    }
    private void updateEmpresa(Integer destinoId) {}
    private void deleteDestino(Integer destinoId) {}

}
