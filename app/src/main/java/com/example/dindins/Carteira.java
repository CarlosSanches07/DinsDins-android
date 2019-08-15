package com.example.dindins;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Carteira {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name="saldo")
    private double saldo;

    public Carteira() {
        this.saldo  = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
