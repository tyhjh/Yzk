package com.example.yzk;

import Layout1.Class1;
import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends Activity {
	private MediaPlayer mc = null;// 播放器引用
	private TextView v1;

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
			if (event.getAction() == KeyEvent.ACTION_DOWN && event.getRepeatCount() == 0) {
				mc.release();
				finish();
			}
			return true;
		}
		return super.dispatchKeyEvent(event);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		Pm(R.raw.bg1);
		v1=(TextView) findViewById(R.id.v1);
		final Class1 c1=new Class1();
		v1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				if(mc.isPlaying()){
					mc.release();
				}

				Intent in=new Intent(MainActivity.this,c1.getClass(0));
				startActivity(in);
			}
		});
		mc.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {//播出完毕事件
			@Override public void onCompletion(MediaPlayer arg0) {
				mc.release();
			}
		});
	}
	private void Pm(int id){
		mc = MediaPlayer.create(this,id);
		try {
			if(mc != null)
			{
				mc.stop();
			}
			mc.prepare();
			mc.start();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
