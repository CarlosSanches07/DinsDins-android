package com.example.dindins;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {

            MenuInflater inflate = mode.getMenuInflater();
            inflate.inflate(R.menu.main_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

            switch(item.getItemId()){
                case R.id.gastoCartao:
                    Toast.makeText(getContext(), "Cartão", Toast.LENGTH_SHORT);
                    mode.finish();
                    return true;

                case R.id.gastoDinheiro:
                    Toast.makeText(getContext(), "Dinheiro", Toast.LENGTH_SHORT);
                    mode.finish();
                    return true;
                case R.id.listaGastos:
                    Toast.makeText(getContext(), "Lista Gastos", Toast.LENGTH_SHORT);
                    mode.finish();
                    return true;
                case R.id.configCarteira:
                    Toast.makeText(getContext(), "Configura Carteira", Toast.LENGTH_SHORT);
                    mode.finish();
                    return true;
                default:
                    return false;
            }
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    };*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch(item.getItemId()){
            case R.id.gastoCartao:
                intent = new Intent(this, GastoCartaoActivity.class);
                startActivity(intent);
                return true;
            case R.id.gastoDinheiro:
                intent = new Intent(this, GastoDinheiroActivity.class);
                startActivity(intent);
                return true;
            case R.id.listaGastos:
                Toast.makeText(this, "Lista Gastos", Toast.LENGTH_LONG);
                return true;
            case R.id.configCarteira:
                Toast.makeText(this, "Configura Carteira", Toast.LENGTH_LONG);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
