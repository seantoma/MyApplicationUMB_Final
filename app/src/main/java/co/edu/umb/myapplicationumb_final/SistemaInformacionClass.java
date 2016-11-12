package co.edu.umb.myapplicationumb_final;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by amilk on 11/11/2016.
 */

public class SistemaInformacionClass extends AppCompatActivity {
    TextView usuSis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sistemaiformacion);
        usuSis = (TextView) findViewById(R.id.textVUsuaSist);

        String nombreCargado = getIntent().getStringExtra("Nombre");
        usuSis.setText(" "+nombreCargado);
    }

    public void salir(View view){
        finish();
    }
}
