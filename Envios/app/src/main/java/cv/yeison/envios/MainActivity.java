package cv.yeison.envios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtNombre)
    EditText txtNombre;

    @BindView(R.id.txtApellido)
    EditText txtApellido;

    @BindView(R.id.txtEmail)
    EditText txtEmail;

    @BindView(R.id.txtMensaje)
    EditText txtMensaje;

    @BindView(R.id.btnEnviar)
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnEnviar)
    public void enviar(){

        Intent intent;
        intent = new Intent(MainActivity.this,Recibe_Activity.class);

        String nombre = txtNombre.getText().toString();
        String apellido = txtApellido.getText().toString();
        String correo = txtEmail.getText().toString();
        String mensaje = txtMensaje.getText().toString();

        intent.putExtra("nombre",nombre);
        intent.putExtra("apellido",apellido);
        intent.putExtra("correo",correo);
        intent.putExtra("mensaje",mensaje);

        startActivity(intent);

    }
}
