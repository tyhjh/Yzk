package com.example.yzk;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class M2 extends Activity{
	private MediaPlayer mc = null;
	public LinearLayout ll1;
	public Button bt1;
	public TextView tv1;
	int i=0;
	static M2 instance =null;
	String[] str=new String[15];
	//监听返回键
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
		setContentView(R.layout.l1);
		bt1=(Button) findViewById(R.id.bt1);
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent in2=new Intent(M2.this,M7.class);
				mc.release();
				startActivity(in2);
			}
		});
		instance=this;
		str[0]="蔚蓝的天空让人觉得异常的清澈。不同于城市的天空，纯粹的蓝。";
		str[1]="和天空一样，连白云也显示出了和城市说不一样的的异彩。不禁让人会有“果然是空气清新啊....”的想法。";
		str[2]="我心中那份微弱的旅行热情也冷却下来，现在车厢里，听着火车发出“哐当，哐当”的引人入睡的声音，我只有一种无聊的感觉。";
		str[3]="等间隔的电杆线从眼前一个个的飞过。";
		str[4]="让我想起小时候数电杆玩的事情。";
		str[5]="电线杆就好比浮在水面上的木桩一般，一边想象着自己在木桩上跳跃的样子，一边数着木桩的数目。";
		str[6]="我本以为，只有我才会有这种稀奇古怪的想法，可没想到的是前几天看的推理小说中，里面的犯人竟然也有过和我一样的幻想。";
		str[7]="原来想法古怪的人不止我一个啊，想到这里，心情变的很微妙，也算是一种宽慰感吧。";
		str[8]="窗外的风景很单调，看着看着就乏味了。";
		str[9]="我倒不是讨厌这种悠然自得的感觉，只是，一成不变的事物总会让人厌烦的。";
		str[10]="不过，幸好我身边还有一个旅伴......";
		ll1=(LinearLayout) findViewById(R.id.ll1);
		tv1=(TextView) findViewById(R.id.tv1);
		Pm(R.raw.bgce);
		ll1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				if(i==11){
					if(mc.isPlaying()){
						mc.release();
					}
					Intent in=new Intent(M2.this,M3.class);
					startActivity(in);
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
}
