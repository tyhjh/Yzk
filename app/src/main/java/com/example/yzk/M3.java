package com.example.yzk;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class M3 extends Activity{
	int i=0;
	private SoundPool sd;
	public LinearLayout ll1;
	public TextView tv1;
	String[] str=new String[20];
	private MediaPlayer mc = null;
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
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.l2);
		Pm(R.raw.bgce);
		str[0]="喂，你不吃点东西吗？";
		str[1]="穹： ......";
		str[2]="话虽如此，可穹从开始就一直望着窗外的风景，一动也不动、而且也不理我。";
		str[3]="她完全不在乎我的心情，继续望着窗外。";
		str[4]="可能是因为今天早晨我催促她赶紧出门，她还在生我的气吧。";
		str[5]="但是，我也没有办法。";
		str[6]=".....不能把她一个人丢下不管。";
		str[7]="这就是所谓的....“妹妹永远不理解哥哥的良苦用心”吧。";
		str[8]="我从装着零食的盒子里拿出一块点心放进嘴里，然后也就不说话了。";
		str[9]="换乘这趟列车不到三十分钟。从时间上来讲的话距离目的地还有一半的路程。";
		str[10]="到了那边以后还有很多事情要忙，我还是先睡一会儿吧.....";
		str[11]="我深深地坐在座位上，闭上了眼睛。";
		str[12]="车厢里比我想象的要安静。知道刚才为止，还觉得枯燥乏味的“哐当哐当”的声音，此刻听起来正宛如一首绝佳的摇篮曲，渐渐将我带入梦乡。";
		str[13]="好疼....";
		str[14]="被一阵疼痛惊醒，我忙睁开眼睛看穹。";
		tv1=(TextView) findViewById(R.id.tv1);
		ll1=(LinearLayout) findViewById(R.id.ll1);
		ll1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				if(i==1){
					Pl(R.raw.m1);

				}
				if(i==11){
					ll1.setBackgroundResource(R.drawable.black);
				}
				if(i==14){
					ll1.setBackgroundResource(R.drawable.p3);
				}
				if(i==15){
					if(mc.isPlaying()){
						mc.release();
					}
					ll1.setBackgroundResource(R.drawable.black);
					Intent in1=new Intent(M3.this,M4.class);
					startActivity(in1);
				}
				tv1.setText(str[i]);
				i=i+1;
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
	private void Pl(int id){
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
