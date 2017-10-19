package com.example.yzk;

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

public class M4 extends Activity{
	private SoundPool sd;
	private MediaPlayer mc = null;
	private LinearLayout ll1;
	int i=0;
	private TextView tv1;
	String[] str=new String[75];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.l4);
		ll1=(LinearLayout) findViewById(R.id.ll1);
		p1(R.raw.bgce);
		tv1=(TextView) findViewById(R.id.tv1);
		str[0]="干什么啊";
		str[1]="就像是瞄准了我闭上眼睛的时机一样，我的足尖被轻轻地踢了一脚";
		str[2]="同时手也被拽了出去。...哎，真是不坦率啊。";
		str[3]="给.....啊！";
		str[4]="我刚把装着零食的盒子拿出来，就被她一把抢过去。";
		str[5]="穹：............";
		str[6]="喂喂，稍微剩下一点啊？";
		str[7]="穹： ............";
		str[8]="她没有理会我，嘴里叼着零食望着窗外。";
		str[9]="虽然她以前就是着这个样子，可我不明白的是，为什么和自己的亲妹妹交流一下就这么难。";
		str[10]="穹：........干嘛？";
		str[11]="不知道是不是在意我一直漠默视着她，穹一脸不耐烦得看着我。";
		str[12]="不，没事......我稍微睡会儿。";
		str[13]="穹：......这样啊......";
		str[14]="看着嘟囔了一句后就再次把视线投向窗外的穹，就在我想着这次终于可以悠闲地小睡一下的时候......";
		str[15]="嗯？";
		str[16]="膝盖上传来什么东西放上去的感觉。";
		str[17]="睁眼一看，是刚才被穹抢走的点心盒。";
		str[18]="穹：......剩下的悠吃。";
		str[19]="......嗯，你不吃了吗？";
		str[20]="什么啊......不要不理她的意思吗？";
		str[21]="刚才那一下的理由就是这个啊......真是的，该说她性格乖僻呢，还是说她不坦率呢。";
		str[22]="穹：......不过，你一次吃不完吧。";
		str[23]="说着，穹又从我手中的盒子里拿了几个点心出来。";
		str[24]="喂喂，你到底是吃还是不吃啊......";
		str[25]="穹：......哼。";
		str[26]="她小口的咀嚼着嘴里的食物，像是在遮羞似的。";
		str[27]="嗯，她就是在这种地方显得比较可爱嘛。不过这样的话，我也没办法睡觉了......";
		str[28]="放弃睡眠之后，我也将视线重新移回到风景之上。";
		str[29]="...我们现在正在前往的，是父亲的老家。";
		str[30]="虽然现在已经没有人住了，不过以前爷爷奶奶住在那里，没到到了暑假，我们总会去那里住上两周左右。";
		str[31]="小时候只要是现在这样吃着零食，和妈妈他们说着话，不一会儿就到了。但是现在来看的话，距离真是意外的远呢......";
		str[32]="穹已经有......多少年......没去过那里了。";
		str[33]="穹：......谁知道。";
		str[34]="那时候你还小，不记得了啊";
		str[35]="穹：...别把我当小孩子，明明我和你一般大小的。";
		str[36]="...我的意思是最后一次去那里的时候你还小啦。不是把你当小孩子。";
		str[37]="穹：.....哼。";
		str[38]="没错，我们是同龄的双胞胎。为了方便区分，我成了哥哥。可穹却认为，双生子之间不分大小，身份是平等的。";
		str[39]="所以只要一把她当小孩子看就立刻会生气。不过这也是没办法的事情，自从妈妈说让我照顾好穹之后，我就一直守在她身边了。";
		str[40]="那边有很多令你怀念的地方呢。不知道她有没有听我说话，我仍继续说着。一些关于小时候在乡下发生的趣事。";
		str[41]="穹：......悠？";
		str[42]="一个人自言自语的说着，不知道什么时候一股睡意席卷而来，将我渐渐带入了梦乡。";
		str[43]="穹：......真是的......";
		str[44]="在我意识模糊的时候，感觉头好像被什么柔软的东西包裹着似的。";
		str[45]="穹：......什么事情都自己决定......";
		str[46]="穹：......总是一个人努力着......";
		str[47]="穹：......总是什么痛苦都自己背负......";
		str[48]="穹：......悠真是一个......";
		str[49]="穹：......傻瓜......";
		str[50]="像是被这种惬意的感觉吸进一般，我渐渐失去意识。";
		str[51]="穹：悠......喂......起来啦。";
		str[52]="肩膀被轻轻的摇晃着。";
		str[53]="穹：。。悠。。悠。";
		str[54]="。。嗯......啊。。已经到了吗？";
		str[55]="感觉某种温暖的触觉正在从我身边逐渐消失。";
		str[56]="手臂上还留有一丝余热。就好像一直被什么温暖的东西触碰着似的......";
		str[57]="穹：。。好像快到车站了";
		str[58]="是吗......呼啊~~......";
		str[59]="已经开始减速，身体由于惯性不由得向前倾，像要被抛出去似的。";
		str[60]="对了，没忘带什么东西吧。";
		str[61]="话虽这么说，其实随身带的行李只有一个小包，还有一些吃剩的零食和垃圾。穹的车票也在我的口袋里。";
		str[62]="车内广播：马上要到达的车站是，穗见......穗见......请各位旅客不要忘记行李。";
		str[63]="好，我们准备下车吧......";
		str[64]="列车缓缓驶入站台，终于要开始了";
		str[65]="我是靠自己的意志决定来这里生活的。现在已然无法回头，而且我也不打算回头。";
		str[66]="这里充满了我们儿时的回忆，应该不会有什么不习惯的地方，但我心里还是非常的不安。";
		str[67]="不过......我还是觉得不管有什么问题都会有办法的。";
		str[68]="......穹和......我，只要我们两人在一起的话。";
		ll1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				if(i==2){
					p2(R.raw.m2);
				}
				if(i==5){
					ll1.setBackgroundResource(R.drawable.p4);
					p2(R.raw.m3);
				}
				if(i==7){
					ll1.setBackgroundResource(R.drawable.p041);
					p2(R.raw.m4);
				}
				if(i==10){
					p2(R.raw.m5);
					ll1.setBackgroundResource(R.drawable.p5);
				}
				if(i==13){
					p2(R.raw.m6);
					ll1.setBackgroundResource(R.drawable.p041);
				}
				if(i==14){
					ll1.setBackgroundResource(R.drawable.black);
				}
				if(i==17){
					ll1.setBackgroundResource(R.drawable.p4);
				}
				if(i==18){
					p2(R.raw.m7);
				}
				if(i==22){
					ll1.setBackgroundResource(R.drawable.p5);
					p2(R.raw.m8);
				}
				if(i==25){
					p2(R.raw.m9);
					ll1.setBackgroundResource(R.drawable.p041);
				}

				if(i==29){
					ll1.setBackgroundResource(R.drawable.p4);
				}
				if(i==33){
					p2(R.raw.m10);
					ll1.setBackgroundResource(R.drawable.p042);
				}
				if(i==35){
					p2(R.raw.m11);
				}
				if(i==37){
					p2(R.raw.m12);
					ll1.setBackgroundResource(R.drawable.p4);
				}
				if(i==40){
					p2(R.raw.m13);
				}
				if(i==41){
					ll1.setBackgroundResource(R.drawable.black);
					p2(R.raw.m14);
				}
				if(i==43){

					p1(R.raw.bg02);
					p2(R.raw.m16);
				}
				if(i==45){

					p2(R.raw.m17);
				}
				if(i==46){

					p2(R.raw.m18);
				}
				if(i==47){

					p2(R.raw.m19);
				}
				if(i==48){

					p2(R.raw.m20);
				}
				if(i==49){

					p2(R.raw.m21);
				}
				if(i==51){

					p2(R.raw.m22);
				}
				if(i==53){
					p2(R.raw.m23);
				}
				if(i==54){
					ll1.setBackgroundResource(R.drawable.p3);
				}
				if(i==57){

					p2(R.raw.m24);
				}
				if(i==62){

					p2(R.raw.m25);
				}
				if(i==65){
					ll1.setBackgroundResource(R.drawable.p031);
					p2(R.raw.m26);
				}
				if(i==69){
					if(mc.isPlaying()){
						mc.release();
					}
					Intent in=new Intent(M4.this,M5.class);
					startActivity(in);
				}
				tv1.setText(str[i]);
				i=i+1;
			}
		});
		mc.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {//播出完毕事件
			@Override public void onCompletion(MediaPlayer arg0) {
				p1(R.raw.bgce) ;
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
