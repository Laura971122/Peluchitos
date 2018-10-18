package com.laugracianool.peluchitos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */

public class EliminarFragment extends Fragment {

    private EditText eNombre ;
    private Button bEliminar;
    Comunicador interfaz;

    public EliminarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_eliminar, container, false);

        eNombre= view.findViewById(R.id.eNombre);
        bEliminar= view.findViewById(R.id.bEliminar);

        bEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaz.eliminarDatosBuscar (eNombre.getText().toString());
            }
        });
        return view;
    }
}