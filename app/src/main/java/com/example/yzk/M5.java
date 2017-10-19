package com.example.yzk;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class M5 extends Activity{
	public VideoView vv;
	private LinearLayout ll1;
	int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.l5);
		ll1=(LinearLayout) findViewById(R.id.ll1);
		vv=(VideoView) findViewById(R.id.vv);
		String uri = "android.resource://" + getPackageName() + "/" + R.raw.mv1;

		vv.setVideoPath(uri);
		vv.start();
		vv.setOnCompletionListener(new OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO 自动生成的方法存根
				ll1.setBackgroundResource(R.drawable.p7);
				vv.setBackgroundResource(R.drawable.p7);
			}
		});
		ll1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent in=new Intent(M5.this,M6.class);
				startActivity(in);
			}
		});
	}
}
