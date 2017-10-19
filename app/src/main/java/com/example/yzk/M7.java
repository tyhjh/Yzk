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

public class M7 extends Activity{

	int i=37;
	private SoundPool sd;
	private MediaPlayer mc = null;
	private LinearLayout ll1;
	private TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.l7);
		ll1=(LinearLayout) findViewById(R.id.ll1);
		tv1=(TextView) findViewById(R.id.tv1);
		final String1 str=new String1();
		final Sound1 sound1=new Sound1();
		tv1.setText(str.getStr(i));
		ll1.setBackgroundResource(R.drawable.p9);
		p1(R.raw.bg2);
		ll1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				tv1.setText(str.getStr(i));
				int id1=sound1.getSound(i);
				if(id1!=0){
					p2(id1);
				}
				if(i==38){
					ll1.setBackgroundResource(R.drawable.p23);
				}
				if(i==40){
					ll1.setBackgroundResource(R.drawable.p9);
				}
				if(i==56){
					ll1.setBackgroundResource(R.drawable.p24);
				}
				if(i==60){
					if(mc.isPlaying())
					{
						mc.release();
					}

					ll1.setBackgroundResource(R.drawable.black);
				}
				if(i==62){
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==65){
					p1(R.raw.bg01);
					ll1.setBackgroundResource(R.drawable.p26);
				}
				if(i==69){
					ll1.setBackgroundResource(R.drawable.p27);
				}
				if(i==75){
					ll1.setBackgroundResource(R.drawable.p28);
				}
				if(i==77){
					ll1.setBackgroundResource(R.drawable.p29);
				}
				if(i==80){
					ll1.setBackgroundResource(R.drawable.p30);
				}
				if(i==82){
					ll1.setBackgroundResource(R.drawable.p27);
				}
				if(i==88){
					ll1.setBackgroundResource(R.drawable.black);
				}
				if(i==90){
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==95){
					ll1.setBackgroundResource(R.drawable.p31);
				}
				if(i==112){
					ll1.setBackgroundResource(R.drawable.p32);
				}
				if(i==114){
					ll1.setBackgroundResource(R.drawable.p33);
					if(mc.isPlaying()){
						mc.release();
					}
				}
				if(i==118){
					p1(R.raw.bg3);
				}
				if(i==123){
					if(mc.isPlaying()){
						mc.release();
					}
				}
				if(i==126){
					ll1.setBackgroundResource(R.drawable.p34);
				}
				if(i==130){
					ll1.setBackgroundResource(R.drawable.p33);
				}
				if(i==134){
					ll1.setBackgroundResource(R.drawable.p34);
				}
				if(i==137){
					ll1.setBackgroundResource(R.drawable.black);
				}
				if(i==139){
					ll1.setBackgroundResource(R.drawable.p35);
				}
				if(i==142){
					ll1.setBackgroundResource(R.drawable.p36);
				}
				if(i==143){
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==144){
					ll1.setBackgroundResource(R.drawable.p37);
					p1(R.raw.bg5);
				}
				if(i==157){
					ll1.setBackgroundResource(R.drawable.p38);
				}
				if(i==166){
					if(mc.isPlaying()){
						mc.release();
					}
					p1(R.raw.bg4);
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==169){
					ll1.setBackgroundResource(R.drawable.p37);
				}
				if(i==170){
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==172){
					if(mc.isPlaying()){
						mc.release();
					}
				}
				if(i==182){
					ll1.setBackgroundResource(R.drawable.p9);
				}
				if(i==184){
					ll1.setBackgroundResource(R.drawable.p39);
					p1(R.raw.bg01);
				}
				if(i==191){
					ll1.setBackgroundResource(R.drawable.p40);
				}
				if(i==192){
					ll1.setBackgroundResource(R.drawable.p39);
				}
				if(i==194){
					ll1.setBackgroundResource(R.drawable.p31);
				}
				if(i==199){
					ll1.setBackgroundResource(R.drawable.p37);
				}
				if(i==201){
					ll1.setBackgroundResource(R.drawable.p037);
				}
				if(i==203){
					ll1.setBackgroundResource(R.drawable.p37);
				}
				if(i==206){
					ll1.setBackgroundResource(R.drawable.p31);
				}
				if(i==209){
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==221){
					ll1.setBackgroundResource(R.drawable.p31);
				}
				if(i==223){
					ll1.setBackgroundResource(R.drawable.p41);
				}
				if(i==226){
					ll1.setBackgroundResource(R.drawable.p31);
				}
				if(i==230){
					ll1.setBackgroundResource(R.drawable.p42);
				}
				if(i==231){
					ll1.setBackgroundResource(R.drawable.p43);
				}
				if(i==233){
					ll1.setBackgroundResource(R.drawable.p31 );
				}
				if(i==235){
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==247){
					ll1.setBackgroundResource(R.drawable.p31);
				}
				if(i==250){
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==253){
					ll1.setBackgroundResource(R.drawable.p44);
				}
				if(i==255){
					ll1.setBackgroundResource(R.drawable.p037);
				}
				if(i==256){
					ll1.setBackgroundResource(R.drawable.p25);
				}
				if(i==258){
					ll1.setBackgroundResource(R.drawable.p45);
					if(mc.isPlaying()){
						mc.release();
					}
				}
				if(i==296){
					ll1.setBackgroundResource(R.drawable.p46);
				}
				if(i==301){
					ll1.setBackgroundResource(R.drawable.p47);
				}
				if(i==305){
					ll1.setBackgroundResource(R.drawable.p48);
				}
				if(i==308){
					ll1.setBackgroundResource(R.drawable.p047);
					p1(R.raw.bg02);
				}
				if(i==311){
					ll1.setBackgroundResource(R.drawable.p49);
				}
				if(i==346){
					ll1.setBackgroundResource(R.drawable.p50);
				}
				if(i==350){
					ll1.setBackgroundResource(R.drawable.p045);
				}
				if(i==351){
					ll1.setBackgroundResource(R.drawable.p51);
				}
				if(i==358){
					ll1.setBackgroundResource(R.drawable.p47);
				}
				if(i==362){
					ll1.setBackgroundResource(R.drawable.p52);
				}
				if(i==368){
					ll1.setBackgroundResource(R.drawable.p47);
				}
				if(i==371){
					ll1.setBackgroundResource(R.drawable.p51);
				}
				if(i==377){
					ll1.setBackgroundResource(R.drawable.p53);
				}
				if(i==379){
					ll1.setBackgroundResource(R.drawable.p54);
				}
				if(i==381){
					ll1.setBackgroundResource(R.drawable.p53);
				}
				if(i==383){
					ll1.setBackgroundResource(R.drawable.p55);
				}
				if(i==384){
					ll1.setBackgroundResource(R.drawable.p53);
				}
				if(i==386){
					ll1.setBackgroundResource(R.drawable.p56);
				}
				if(i==394){
					ll1.setBackgroundResource(R.drawable.p57);
				}
				if(i==399){
					ll1.setBackgroundResource(R.drawable.p58);
				}

				//之后
				i=i+1;
			}
		});

	}
	private void p1(int id){
		mc = MediaPlayer.create(this,id);
		try {
			if(mc!=null)
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
