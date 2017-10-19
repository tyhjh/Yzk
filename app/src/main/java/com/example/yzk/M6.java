package com.example.yzk;

import Layout1.Sound1;
import Layout1.String1;
import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class M6 extends Activity{
	int i=0;
	private SoundPool sd;
	private LinearLayout ll1;
	private MediaPlayer mc = null;
	private TextView tv1;
	String[] str=new String[20];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.l6);
		tv1=(TextView) findViewById(R.id.tv1);
		//关闭M2；
		p1(R.raw.bg01);
		str[0]="穹走这么长时间的路是多久以前的事情了？";
		tv1.setText(str[0]);
		ll1=(LinearLayout) findViewById(R.id.ll1);
		final String1 st=new String1();
		final Sound1 s1=new Sound1();
		ll1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				if(i==37){
					if(mc.isPlaying()){
						mc.release();
					}
					Intent in=new Intent(M6.this,M7.class);
					startActivity(in);
				}
				if(i==2){
					ll1.setBackgroundResource(R.drawable.p14);
				}
				if(i==8){
					ll1.setBackgroundResource(R.drawable.p15);
				}
				if(i==11){
					ll1.setBackgroundResource(R.drawable.p6);
				}
				if(i==16){
					ll1.setBackgroundResource(R.drawable.p16);
				}
				if(i==17){
					ll1.setBackgroundResource(R.drawable.p17);
				}
				if(i==20){
					ll1.setBackgroundResource(R.drawable.p18);
				}
				if(i==22){
					ll1.setBackgroundResource(R.drawable.p6);
				}
				if(i==24){
					ll1.setBackgroundResource(R.drawable.p19);
				}
				if(i==26){
					ll1.setBackgroundResource(R.drawable.p20);
				}
				if(i==29){
					ll1.setBackgroundResource(R.drawable.p21);
				}
				if(i==30){
					ll1.setBackgroundResource(R.drawable.p6);
				}
				if(i==33){
					ll1.setBackgroundResource(R.drawable.p22);
				}
				if(s1.getSound(i)!=0){
					p2(s1.getSound(i));
				}
				tv1.setText(st.getStr(i));
				i=i+1;
			}
		});
	}
	private void p1(int id){
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
	private void p2(int id){
		try{
			sd.release();
		}catch(Exception e){

		}
		sd=new SoundPool(15, AudioManager.STREAM_MUSIC, 5);
		final int source=sd.load(this, id,0);

		sd.setOnLoadCompleteListener(new OnLoadCompleteListener() {

			@Override
			public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
				// TODO 自动生成的方法存根
				sd.play(source, 1, 1, 0, 0, 1);
			}
		});
	}
}
