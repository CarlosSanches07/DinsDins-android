package com.example.dindins;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Pagamento {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "valor")
    private double valor;

    @ColumnInfo(name = "dia")
    private String dia;

    public Pagamento(){
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
}
