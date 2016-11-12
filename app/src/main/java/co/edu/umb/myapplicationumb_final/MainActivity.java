package co.edu.umb.myapplicationumb_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String NombreCompl;

    TextView Inscripcioncl, txtUsuMain, txtPassMain;
    EditText txtUsuarioClsMain, txtPassClsMain;
    Button bntIngresarClsMain;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Inscripcioncl = (TextView) findViewById(R.id.txtInscrip);
        txtUsuMain = (TextView) findViewById(R.id.usuRegisMain);
        txtPassMain = (TextView) findViewById(R.id.passRegsMain);

        bntIngresarClsMain = (Button) findViewById(R.id.bntIngresarIngr);

        txtUsuarioClsMain = (EditText) findViewById(R.id.txtUsuarioIngr);
        txtPassClsMain = (EditText) findViewById(R.id.txtPassIngr);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClickVoyaIncripcion(View view){
        Intent i = new Intent (this, Inscripcionclss.class);
        startActivity(i);
    }

    public void onClickIngrSistema(View view){
        NombreCompl = getIntent().getStringExtra("Nombre");
        String UsuarioCargado = getIntent().getStringExtra("Usuario");
        String PasswordCargado = getIntent().getStringExtra("PassWord");

        String usua = txtUsuarioClsMain.getText().toString();
        String pass = txtPassClsMain.getText().toString();

        if ((usua.equals(UsuarioCargado)) && (pass.equals(PasswordCargado)) ){
            Intent i = new Intent (this, SistemaInformacionClass.class);
            i.putExtra("Nombre",NombreCompl+"");
            startActivity(i);
        }
    }

    public void onClickRevela(View view){
        String NombreCargado = getIntent().getStringExtra("Nombre");
        String UsuarioCargado = getIntent().getStringExtra("Usuario");
        String PasswordCargado = getIntent().getStringExtra("PassWord");
        txtUsuMain.setText("Usu: "+UsuarioCargado);
        txtPassMain.setText("Pas: "+PasswordCargado);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
