package br.com.fiap.rm72468.olimpiadasapp;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class IngressosActivity extends AppCompatActivity  {

    private EditText edtNome;
    private EditText edtIdade;
    private Spinner spnModalidade;
    private Button btnReserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingressos);
        edtNome = (EditText)findViewById(R.id.edtNome);
        edtIdade = (EditText)findViewById(R.id.edtIdade);
        spnModalidade = (Spinner)findViewById(R.id.spnModalidade);

        btnReserva = (Button)findViewById(R.id.btnReservar);

    }

    public void btnReservaClick(View v){
        final Dialog d = new Dialog(this);
        d.setTitle("Confirmação");
        d.setContentView(R.layout.activity_ingressos_confirmacao);

        TextView txtNome = (TextView)d.findViewById(R.id.edtNomeD);
        txtNome.setText(edtNome.getText());
        TextView txtIdade = (TextView)d.findViewById(R.id.edtIdadeD);
        txtIdade.setText(edtIdade.getText());
        TextView txtModalidade = (TextView)d.findViewById(R.id.edtModalidadeD);
        txtModalidade.setText(spnModalidade.getSelectedItem().toString());

        ((Button)d.findViewById(R.id.btnConfirmar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.dismiss();
            }
        });

        d.show();
    }



}
