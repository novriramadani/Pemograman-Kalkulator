package ac.id.poltekkampar.program1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView monitor;
    Button satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, nol,kurang1,tambah1,kali1,samadengan,bagi1,hapus,koma;
    DecimalFormat df=new DecimalFormat("###.#");

    float one,two;
    boolean tambah,kurang,kali,bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitor = (TextView) findViewById(R.id.monitor);
        satu = (Button) findViewById(R.id.satu);
        dua = (Button) findViewById(R.id.dua);
        tiga = (Button) findViewById(R.id.tiga);
        empat = (Button) findViewById(R.id.empat);
        lima = (Button) findViewById(R.id.lima);
        enam = (Button) findViewById(R.id.enam);
        tujuh = (Button) findViewById(R.id.tujuh);
        delapan = (Button) findViewById(R.id.delapan);
        sembilan = (Button) findViewById(R.id.sembilan);
        nol = (Button) findViewById(R.id.nol);
        hapus = (Button) findViewById(R.id.hapus);
        koma = (Button) findViewById(R.id.koma);
        samadengan = (Button) findViewById(R.id.samadengan);
        tambah1 = (Button) findViewById(R.id.tambah1);
        kurang1 = (Button) findViewById(R.id.kurang1);
        kali1 = (Button) findViewById(R.id.kali1);
        bagi1 = (Button) findViewById(R.id.bagi1);



        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"1");
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"2");
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"3");
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"4");
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"5");
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"6");
            }
        });

        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"7");
            }
        });

        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"8");
            }
        });

        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"9");
            }
        });

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+"0");
            }
        });

        tambah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (monitor==null){
                    monitor.setText("");
                }else{
                    one=Float.parseFloat(monitor.getText()+"");
                    tambah=true;
                    monitor.setText("");
                }
            }
            });

        kurang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (monitor==null){
                    monitor.setText("");
                }else{
                    one=Float.parseFloat(monitor.getText()+"");
                    kurang=true;
                    monitor.setText("");
                }
            }
        });

        kali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (monitor==null){
                    monitor.setText("");
                }else{
                    one=Float.parseFloat(monitor.getText()+"");
                    kali=true;
                    monitor.setText("");
                }
            }
        });

        bagi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (monitor==null){
                    monitor.setText("");
                }else{
                    one=Float.parseFloat(monitor.getText()+"");
                    bagi=true;
                    monitor.setText("");
                }
            }
        });

            samadengan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    two = Float.parseFloat(monitor.getText() + "");
                    monitor.setText(one + two + "");
                    if (tambah == true) {
                        monitor.setText(one + two + "");
                        tambah = false;
                    }
                    if (kurang == true) {
                        monitor.setText(one + two + "");
                        kurang = false;
                    }
                    if (kali == true) {
                        monitor.setText(one + two + "");
                        bagi = false;
                    }
                }
            });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText("");
            }
        });


        koma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText(monitor.getText()+".");
            }
        });


            }
        }


