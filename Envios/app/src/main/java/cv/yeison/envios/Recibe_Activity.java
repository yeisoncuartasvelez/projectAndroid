package cv.yeison.envios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Recibe_Activity extends AppCompatActivity {

    @BindView(R.id.txvNombre)
    TextView txvNombre;

    @BindView(R.id.txvCorreo)
    TextView txvCorreo;

    @BindView(R.id.txtMensaje)
    TextView txvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null){
            String datoNombre = (String)extras.get("nombre");
            String datoApellido = (String)extras.get("apellido");
            String datoCorreo = (String)extras.get("correo");
            String datoMensaje = (String)extras.get("mensaje");

            txvNombre.setText("Bienvenido  "+ datoNombre +" "+datoApellido);
            txvCorreo.setText(datoCorreo);
            txvMensaje.setText(datoMensaje);
        }


    }
}
