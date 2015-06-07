package com.example.ochiai.drum;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private SoundPool mSoundPool;

    private int[] msoundID;
//mSoundRisouceに音を割り当て

    private int[] mSoundResource = {
            R.raw.cymbal1,
            R.raw.cymbal2,
            R.raw.cymbal3,
            R.raw.tom1,
            R.raw.tom2,
            R.raw.tom3,
            R.raw.hihat,
            R.raw.snare,
            R.raw.bass
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume(){
        super.onResume();

        mSoundPool = new SoundPool(mSoundResource.length, AudioManager.STREAM_MUSIC,0);
//mSoundResource.lenght=mSoundResouceの数
        msoundID = new int[mSoundResource.length];
//音をロードする
        for(int i =0; i < mSoundResource.length; i++){
            msoundID[i] = mSoundPool.load(getApplicationContext(),mSoundResource[i], 0);
        }

    }
    @Override
    protected void  onDestroy() {
        super.onDestroy();

        mSoundPool.release();
    }

    public void cymbal1 (View v) {
    mSoundPool.play(msoundID[0], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void cymbal2 (View v) {
        mSoundPool.play(msoundID[1],1.0F,1.0F,0,0,1.0F);
    }
    public void cymbal3 (View v) {
        mSoundPool.play(msoundID[2],1.0F,1.0F,0,0,1.0F);
    }
    public void tom1 (View v) {
        mSoundPool.play(msoundID[3],1.0F,1.0F,0,0,1.0F);
    }
    public void tom2 (View v) {
        mSoundPool.play(msoundID[4],1.0F,1.0F,0,0,1.0F);
    }
    public void tom3 (View v) {
        mSoundPool.play(msoundID[5],1.0F,1.0F,0,0,1.0F);
    }
    public void hihat (View v) {
        mSoundPool.play(msoundID[6],1.0F,1.0F,0,0,1.0F);
    }
    public void snare (View v) {
        mSoundPool.play(msoundID[7],1.0F,1.0F,0,0,1.0F);
    }
    public void bass (View v) {
        mSoundPool.play(msoundID[8],1.0F,1.0F,0,0,1.0F);
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
