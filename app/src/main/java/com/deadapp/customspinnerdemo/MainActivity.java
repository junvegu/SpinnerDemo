package com.deadapp.customspinnerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppCompatSpinner mSheSpinner;
    private AppCompatSpinner mHobiiesSpinner;
    private SpinnerCommon<SheModel> mSheModelSpinnerCommon;
    private SpinnerCommon<SheHobbiesModel> mHerHobbiesSpinnerCommon;


    private SheModel mExGirlfriendTemp;

    private SheHobbiesModel mExGFHobbiesTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSheSpinner = (AppCompatSpinner) findViewById(R.id.she_spinner);
        mHobiiesSpinner = (AppCompatSpinner) findViewById(R.id.hobbies_spinner);

        mSheModelSpinnerCommon = new SpinnerCommon<>(mSheSpinner, SheModel.getMockData(), new SheModelAdapter());

        mSheSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mExGirlfriendTemp = mSheModelSpinnerCommon.getItem(i);
                mHerHobbiesSpinnerCommon = new SpinnerCommon<>(mHobiiesSpinner, mSheModelSpinnerCommon.getItem(i).getSheHobbiesModels(), new HerHobbiesAdapter());

                if (mExGirlfriendTemp != null) {

                    //CALL TO API or SAVE TEMP
                    Toast.makeText(MainActivity.this, "Has estado con ...." + mExGirlfriendTemp.getName(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                mExGirlfriendTemp = null;
                Toast.makeText(MainActivity.this, "Estás solo", Toast.LENGTH_SHORT).show();

            }
        });

        mHobiiesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mExGFHobbiesTemp = mHerHobbiesSpinnerCommon.getItem(i);

                if (mExGFHobbiesTemp != null) {
                    Toast.makeText(MainActivity.this, "a ella le gusta ..." + mExGFHobbiesTemp.getName(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "no tiene hobbies", Toast.LENGTH_SHORT).show();

            }
        });
    }


}


class SheModelAdapter extends SpinnerCommon.SpinnerAdapter<SheModel> {
    @Override
    public String getItemRepresentation(int position) {
        return super.getItem(position).getName();
    }
}

class HerHobbiesAdapter extends SpinnerCommon.SpinnerAdapter<SheHobbiesModel> {
    @Override
    public String getItemRepresentation(int position) {
        return super.getItem(position).getName();
    }
}
