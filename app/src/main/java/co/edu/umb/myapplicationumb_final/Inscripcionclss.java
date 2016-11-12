package co.edu.umb.myapplicationumb_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by amilk on 11/11/2016.
 */

public class Inscripcionclss extends AppCompatActivity {

    String nombre, usuario, pass;
    Button bntGuardarDat;
    EditText txtNombrecls;
    EditText txtUsuariocls;
    EditText txtPasscls;
    TextView lblGaurda, txtAtrasCls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscripcion);

        bntGuardarDat = (Button) findViewById(R.id.bntGuardarInsc);

        txtNombrecls = (EditText) findViewById(R.id.txtNombreInsc);
        txtUsuariocls  = (EditText) findViewById(R.id.txtUsuarioIngr);
        txtPasscls = (EditText) findViewById(R.id.txtContrasenaInsc);

        txtAtrasCls = (TextView) findViewById(R.id.txtVieatrasInscr);
        lblGaurda = (TextView) findViewById(R.id.txtGuardadoInsc);
    }

    public void cargarDatos (View view){
        nombre = txtNombrecls.getText().toString();
        usuario = txtUsuariocls.getText().toString();
        pass = txtPasscls.getText().toString();
        lblGaurda.setText("SUS DATOS HAN SIDO GUARDADOS CORRECTAMENTE");
    }

    public void onClickVoyaHome(View view){
        Intent i = new Intent (this, MainActivity.class);
        i.putExtra("Nombre",nombre+"");
        i.putExtra("Usuario",usuario+"");
        i.putExtra("PassWord",pass+"");
        startActivity(i);
    }
}

