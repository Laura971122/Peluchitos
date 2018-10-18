package com.laugracianool.peluchitos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BuscarFragment extends Fragment {

    private EditText eBuscar;
    private Button bBuscar;
    private TextView tNombre, tId_Codigo, tCantidad, tPrecio;
    Comunicador interfaz;


    public BuscarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buscar, container, false);

        eBuscar= view.findViewById(R.id.eBuscar);
        tNombre= view.findViewById(R.id.tNombre);
        tId_Codigo= view.findViewById(R.id.tId_Codigo);
        tCantidad= view.findViewById(R.id.tCantidad);
        tPrecio= view.findViewById(R.id.tPrecio);
        bBuscar= view.findViewById(R.id.bBuscar);

        Bundle data = getArguments();
        tNombre.setText(data.getString("nombre"));
        tId_Codigo.setText(data.getString("id_codigo"));
        tCantidad.setText(data.getString("cantidad"));
        tPrecio.setText(data.getString("precio"));

        bBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaz.enviarDatosBuscar(eBuscar.getText().toString());
            }
        });

        return view;
    }
}