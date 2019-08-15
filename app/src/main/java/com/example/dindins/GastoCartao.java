package com.example.dindins;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class GastoCartao {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "numParcelas")
    private int numParcelas;

    @ColumnInfo(name = "dia")
    private String dia;

    @ColumnInfo(name = "valor")
    private double valor;

    @ColumnInfo(name = "observacao")
    private String observacao;

    public GastoCartao(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
