package com.jtecx.getinternetstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jtecx.getinternetstuff.data.Lottery;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    TextView drawDate;
    TextView winingNumbers;
    TextView megaBall;
    Button button;
    static final String TAG = "LootyPool";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void clickButton(View view){
        button = (Button) findViewById(R.id.button);
        drawDate = (TextView)findViewById(R.id.drawDate);

        LotteryAPI.Factory.getIstance().getLottery().enqueue(new Callback<List<Lottery>>() {
            @Override
            public void onResponse(Call<List<Lottery>> call, Response<List<Lottery>> response) {
                Log.d(TAG, "getting Draw Date");

                for(Lottery lottery : response.body()) {
                    Log.d(TAG, "Draw Date is: " + lottery.getDrawDate());
                }

                drawDate.setText("DRAW_DATE");
                Log.d(TAG, "done setting Draw Date");
            }

            @Override
            public void onFailure(Call<List<Lottery>> call, Throwable t) {
                Log.e("Failed",  t.getMessage());
                Log.d(TAG, "At onFailure - Something Failed!!");
                Log.d(TAG, "error is: " + t.getCause());

            }
        });
    }
}
