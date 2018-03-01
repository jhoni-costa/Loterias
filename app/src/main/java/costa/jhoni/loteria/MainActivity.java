package costa.jhoni.loteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoGerar;
    private RadioGroup grupoRadio;
    private TextView n1, n2, n3, n4, n5, n6, n7, n8, n9;

    private List<Integer> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        array = new ArrayList<>();
        for (int i = 1; i <= 60; i++) {
            array.add(i);
        }

        botaoGerar = findViewById(R.id.botao_gerar);
        grupoRadio = findViewById(R.id.grupo_radio);

        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        n3 = findViewById(R.id.num3);
        n4 = findViewById(R.id.num4);
        n5 = findViewById(R.id.num5);
        n6 = findViewById(R.id.num6);

        n7 = findViewById(R.id.num7);
        n8 = findViewById(R.id.num8);
        n9 = findViewById(R.id.num9);

        botaoGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Integer> lista;
                switch (grupoRadio.getCheckedRadioButtonId()) {
                    case R.id.radio6:
                        lista = geraNumero(6);
                        n1.setText(String.valueOf(lista.get(0)));
                        n2.setText(String.valueOf(lista.get(1)));
                        n3.setText(String.valueOf(lista.get(2)));
                        n4.setText(String.valueOf(lista.get(3)));
                        n5.setText(String.valueOf(lista.get(4)));
                        n6.setText(String.valueOf(lista.get(5)));

                        n7.setVisibility(View.INVISIBLE);
                        n8.setVisibility(View.INVISIBLE);
                        n9.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radio7:
                        lista = geraNumero(7);
                        n1.setText(String.valueOf(lista.get(0)));
                        n2.setText(String.valueOf(lista.get(1)));
                        n3.setText(String.valueOf(lista.get(2)));
                        n4.setText(String.valueOf(lista.get(3)));
                        n5.setText(String.valueOf(lista.get(4)));
                        n6.setText(String.valueOf(lista.get(5)));

                        n7.setVisibility(View.VISIBLE);
                        n7.setText(String.valueOf(lista.get(6)));

                        n8.setVisibility(View.INVISIBLE);
                        n9.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radio8:
                        lista = geraNumero(8);
                        n1.setText(String.valueOf(lista.get(0)));
                        n2.setText(String.valueOf(lista.get(1)));
                        n3.setText(String.valueOf(lista.get(2)));
                        n4.setText(String.valueOf(lista.get(3)));
                        n5.setText(String.valueOf(lista.get(4)));
                        n6.setText(String.valueOf(lista.get(5)));

                        n7.setVisibility(View.VISIBLE);
                        n7.setText(String.valueOf(lista.get(6)));
                        n8.setVisibility(View.VISIBLE);
                        n8.setText(String.valueOf(lista.get(7)));
                        n9.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radio9:
                        lista = geraNumero(9);
                        n1.setText(String.valueOf(lista.get(0)));
                        n2.setText(String.valueOf(lista.get(1)));
                        n3.setText(String.valueOf(lista.get(2)));
                        n4.setText(String.valueOf(lista.get(3)));
                        n5.setText(String.valueOf(lista.get(4)));
                        n6.setText(String.valueOf(lista.get(5)));

                        n7.setVisibility(View.VISIBLE);
                        n7.setText(String.valueOf(lista.get(6)));
                        n8.setVisibility(View.VISIBLE);
                        n8.setText(String.valueOf(lista.get(7)));
                        n9.setVisibility(View.VISIBLE);
                        n9.setText(String.valueOf(lista.get(8)));
                        break;
                }
            }
        });
    }

    private List<Integer> geraNumero(int quantidade) {

        Collections.shuffle(array);
        List<Integer> resultado = new ArrayList<>();
        for (int i = 1; i <= quantidade; i++) {
            resultado.add(array.get(i));
        }
        Collections.sort(resultado);
        return resultado;
    }
}
