package com.example.dindins;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class GastoDinheiro {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "valor")
    private double valor;

    @ColumnInfo(name = "dia")
    private String dia;

    @ColumnInfo(name = "observacao")
    private String observacao;

    public GastoDinheiro(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
