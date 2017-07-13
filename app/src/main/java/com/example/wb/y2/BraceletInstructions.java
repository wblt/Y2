package com.example.wb.y2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import android.util.Log;

public class BraceletInstructions {

	private static final String TAG = "BraceletInstructions";
	/**
	 * 包头-设备识别
	 */
	public static final String  INSTRUCTIONS_HEAD = "A9";
	/**	时间设置	0x01 **/
	public static final String  INSTRUCTIONS_TIME= "01";
	/**闹钟设置	0x02 */
	public static final String INSTRUCTIONS_ALARM_CLOCK ="02";
	/***设备绑定命令	0x32*/
	public static final String INSTRUCTIONS_BINDING ="32";
	/***设备绑定应答	0x33*/
	public static final String INSTRUCTIONS_BINDING_RETURN ="33";
	/***登入请求	0x34*/
	public static final String INSTRUCTIONS_LOGIN ="34";
	/***登入响应	0x35*/
	public static final String INSTRUCTIONS_LOGIN_RETURN ="35";
	/***解除绑定命令	0x0C*/
	public static final String INSTRUCTIONS_UNBUNDING ="0C";
	/***解除绑定回应	0x0D*/
	public static final String INSTRUCTIONS_UNBUNDING_RETURN ="0D";
	/***运动目标设置	0x03*/
	public static final String INSTRUCTIONS_MOVING_TARGET ="03";
	/***用户信息设置	0x04*/
	public static final String INSTRUCTIONS_USER_INFO ="04";
	/***	防丢设置	0x05*/
	public static final String INSTRUCTIONS_ANTI_LOST="05";
	/***	久坐设置	0x06*/
	public static final String INSTRUCTIONS_SEDENTARY="06";
	/***自动睡眠设置	0x07*/
	public static final String INSTRUCTIONS_AUTO_SLEEP ="07";
	/***设备电量请求	0x08*/
	public static final String INSTRUCTIONS_ELECTRICITY ="08";
	/***设备电量返回	0x09*/
	public static final String INSTRUCTIONS_ELECTRICITY_RETURN ="09";
	/***系统用户设置	0x0A*/
	public static final String INSTRUCTIONS_SYSTEM_USER ="0A";
	/***天气推送	0x0B*/
	public static final String INSTRUCTIONS_WEATHER_PUSH ="0B";
	/***查找手环	0x0E*/
	public static final String INSTRUCTIONS_FIND_BRACELET ="0E";
	/***	远程控制	0x0F*/
	public static final String INSTRUCTIONS_REMOTE_CONTROL ="0F";
	/***来电提醒	0x10*/
	public static final String INSTRUCTIONS_CALL ="10";
	/***短信提醒	0x11*/
	public static final String INSTRUCTIONS_SHORT_MESSAGE ="11";
	/***QQ提醒	0x12*/
	public static final String INSTRUCTIONS_QQ ="12";
	/***微信提醒	0x13*/
	public static final String INSTRUCTIONS_WECHAT ="13";
	/**推送设置	0x14*/
	public static final String INSTRUCTIONS_PUSH_SET ="14";
	/***勿扰模式	0x15*/
	public static final String INSTRUCTIONS_DO_NOT_DISTURD ="15";
	/***提醒模式	0x16*/
	public static final String INSTRUCTIONS_REMIND ="16";
	/***手势智控	0x17*/
	public static final String INSTRUCTIONS_GESTURE_CONTROL ="17";
	/***配置信息同步	0x18*/
	public static final String INSTRUCTIONS_CONFIG_MSG_SYNC ="18";
	/***推送消息	0x19*/
	public static final String INSTRUCTIONS_PUSH_MSG ="19";
	/***手机语言更新	0x1A*/
	public static final String INSTRUCTIONS_LANGUAGE_UPDATE ="1A";
	/***APP同步气压紫外线温度	0x1B*/
	public static final String INSTRUCTIONS_ENVIRONMENTEL_SYNC ="1B";
	/***拍照开关	0x1C*/
	public static final String INSTRUCTIONS_CAMERA_SWITCH  ="1C";
	/***固件升级启动	0x1D*/
	public static final String INSTRUCTIONS_FIRMWARE_UP_STARTS ="1D";
	/***固件升级回应	0x1E*/
	public static final String INSTRUCTIONS_FIRMWARE_UP_RETURN ="1E";
	/***固件升级状态	0x1F*/
	public static final String INSTRUCTIONS_FIRMWARE_UP_STATE ="1F";
	/***运动数据请求	0x20*/
	public static final String INSTRUCTIONS_MOTION ="20";
	/***	运动数据返回	0x21*/
	public static final String INSTRUCTIONS_MOTION_RETURN ="21";
	/***睡眠数据请求	0x22*/
	public static final String INSTRUCTIONS_SLEEP ="22";
	/***睡眠数据返回	0x23*/
	public static final String INSTRUCTIONS_SLEEP_RETURN ="23";
	/***运动数据同步设置	0x24*/
	public static final String INSTRUCTIONS_MOTION_SYNC_SET ="24";
	/***历史数据同步指示	0x25*/
	public static final String INSTRUCTIONS_HOISTORY_MOTION_SYNC ="25";
	/***心率数据请求	0x26*/
	public static final String INSTRUCTIONS_HEART_RATE ="26";
	/***心率数据返回	0x27*/
	public static final String INSTRUCTIONS_HEART_RATE_RETURN ="27";
	/***气压数据请求	0x28*/
	public static final String INSTRUCTIONS_PRESSURE ="28";
	/***气压数据返回	0x29*/
	public static final String INSTRUCTIONS_PRESSURE_RETURN ="29";
	/***紫外线数据请求	0x2A*/
	public static final String INSTRUCTIONS_ULTRAVIOLET_RAYS ="2A";
	/***紫外线数据返回	0x2B*/
	public static final String INSTRUCTIONS_ULTRAVIOLET_RAYS_RETURN ="2B";
	/***自动测试心率	0x2C*/
	public static final String INSTRUCTIONS_AUTO_HEART_RATE ="2C";
	/***固件升级命令	0x30*/
	public static final String INSTRUCTIONS_FIRMWARE_UP ="30";
	/***固件版本信息	0x31*/
	public static final String INSTRUCTIONS_FIRMWARE_MSG ="31";
	/***实时同步数据	0x36*/
	public static final String INSTRUCTIONS_SYNC_DATA ="36";
	/***当天运动校准	0x37*/
	public static final String INSTRUCTIONS_DAY_MOTION ="37";
	/***断开蓝牙指示	0x38*/
	public static final String INSTRUCTIONS_DISCONNECT_BLE ="38";
	/***横竖显示 	0x39*/
	public static final String INSTRUCTIONS_ANYWAY_DISPLAY ="39";
	/***喝水提醒设置	0x3a*/
	public static final String INSTRUCTIONS_DRINK_WATER ="3A";
	/***屏幕测试	0xf0*/
	public static final String INSTRUCTIONS_SCREEN_TEST ="F0";
	/***马达测试	0xf1*/
	public static final String INSTRUCTIONS_MOTOR_TEST ="F1";
	/***计步器测试	0xf2*/
	public static final String INSTRUCTIONS_PEDOMETER_TEST ="F2";
	/***心率测试	0xf3*/
	public static final String INSTRUCTIONS_HEART_RATE_TEST ="F3";
	/***Flahs测试	0xf4*/
	public static final String INSTRUCTIONS_FLAHS_TEST ="F4";
	/***关机命令	0xf5*/
	public static final String INSTRUCTIONS_POWER_CLOSE="F5";
	/***解绑命令	0xf6*/
	public static final String INSTRUCTIONS_UNBUNDING_SYSTEM ="F6";
	/***重启命令	0xf7*/
	public static final String INSTRUCTIONS_RESTART ="F7";
	/***请求睡眠汇总数据发送到厂商服务器	0x44*/
	public static final String INSTRUCTIONS_SEND_SLEEP_DATA ="44";
	
	/***请求手环主动间隔15s发运动汇总数据到厂商服务器	0x48*/
	public static final String  INSTRUCTIONS_SEND_SLEEP_DATA_TIME ="48";
	/***连接微信成功回应	0xC0*/
	public static final String INSTRUCTIONS_CONNECT_WECHAT ="C0";
	/***发送运动历史数据到微信	0xA8*/
	public static final String INSTRUCTIONS_SEND_HISTORY_MOTION_WECHAT ="A8";
	
	/***实时同步数据-关闭*/
	public static final String REAL_TIME_SYNC_CLOSE ="00";
	/***实时同步数据-运动*/
	public static final String REAL_TIME_SYNC_MOTION ="01";
	/***实时同步数据-睡眠*/
	public static final String REAL_TIME_SYNC_SLEEP ="02";
	/***实时同步数据-心率*/
	public static final String REAL_TIME_SYNC_HEART_RATE ="03";
	/***实时同步数据-气压*/
	public static final String REAL_TIME_SYNC_PRESSURE ="04";
	
	/**获取绑定运动手环的命令
	 * @param id 自定义ID
	 * @param mac 设备mac
	 * @return
	 */
	public static String getBindingInstructions(String id,String mac)
	{
		return getBindingAndLoginBracelet(id,mac,INSTRUCTIONS_BINDING);
	}
	
	/**获取登入运动手环的命令
	 * @param id 自定义ID
	 * @param mac 设备mac
	 * @return
	 */
	public static String getLoginInstructions(String id,String mac)
	{
		return getBindingAndLoginBracelet(id,mac,INSTRUCTIONS_LOGIN);
	}
	
	/**获取绑定/登入运动手环的命令
	 * @param id 自定义ID
	 * @param mac 设备mac
	 * @return
	 */
	private static String  getBindingAndLoginBracelet(String id,String mac,String instructions)
	{
		StringBuffer str = new StringBuffer();
		str.append(INSTRUCTIONS_HEAD);
		str.append(instructions);
		str.append("00");
		str.append("0C");
		if(id!=null)
		{
			if(id.length() >= 12)
			{
				if(id.length() == 12){
					str.append(id);
				}else
				{
					 str.append(id.substring(0,12));
				}
			}else
			{
				int len = id.length();
				for(int i = len;i<12;i++)
				{
					str.append("0");
				}
				str.append(id);
			}
			
		}else
		{
			str.append("000000000000");
		}
		if(mac!=null)
		{
			if(mac.indexOf(":")>-1)
			{
				String[] m = mac.split(":");
				if(m.length>5)
				{
					str.append(m[0]+m[1]+m[2]+m[3]+m[4]);
				}else
				{
					str.append("0000000000");
				}
			}else
			{
				str.append("0000000000");
			}
			
		}else
		{
			str.append("0000000000");
		}
		str.append("AD");
		str.append(calculationCRC(str.toString()));
		
		Logs.e(TAG,"校对一下:"+proofreadingCRC(str.toString()));
		return str.toString();
	}
	
	/**获取同步手环时间命令
	 * @return 同步时间命令
	 */
	public static String getTimeSynsInstructions()
	{
		StringBuffer str = new StringBuffer(INSTRUCTIONS_HEAD);
		str.append(INSTRUCTIONS_TIME);
		str.append("00");
		str.append("06");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String[] times = sdf.format(new Date()).split(" ");
		String [] date = times[0].split("-");
		String [] time = times[1].split(":");
		
		
		str.append(hex10_16(date[0].substring(2))+hex10_16(date[1])+hex10_16(date[2]));
		str.append(hex10_16(time[0])+hex10_16(time[1])+hex10_16(time[2]));
		
//		str.append(time[0]+time[1]+time[2]);
//		str.append("171215");
//		str.append("010203");
//		str.append("00");
		str.append(calculationCRC(str.toString()));
		proofreadingCRC(str.toString());
		return str.toString();
	}
	
	/**获取用户信息设置命令
	 * @return
	 */
	public static String getUserInfoInstructions()
	{
		StringBuffer str = new StringBuffer(INSTRUCTIONS_HEAD);
		str.append(INSTRUCTIONS_USER_INFO);
		str.append("00");
		str.append("08");
		str.append("00A2AA3C27100000");
		
		str.append(calculationCRC(str.toString()));
		proofreadingCRC(str.toString());
		return str.toString();
	}

	/**获取解除绑定命令
	 * @return
	 */
	public static String getUnbundingInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_UNBUNDING);
	}
	
	/**获取电量命令
	 * @return
	 */
	public static String getElectricityInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_ELECTRICITY);
	}
	
	/**查找手环命令
	 * @return
	 */
	public static String getFindBraceletInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_FIND_BRACELET);
	}
	
	/**获取运动数据命令
	 * @return
	 */
	public static String getMotionInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_MOTION);
	}
	
	/**接收成功或者失败运动数据命令
	 * @param state 成功/失败
	 * @return
	 */
	public static String getMotionStateInstructions(boolean state)
	{
		String s = "00";
		if(!state)
		{
			s = "01";
		}
		return getOneLenthInstructions(INSTRUCTIONS_MOTION,s);
	}
	
	/**运动数据同步设置命令
	 * @param state 开/关
	 * @return
	 */
	public static String getSetMotionSyncInstructions(boolean state)
		{
			String s = "01";
			if(!state)
			{
				s = "00";
			}
			return getOneLenthInstructions(INSTRUCTIONS_MOTION_SYNC_SET,s);
		}
	
	
	/**睡眠数据接收命令
	 * @return
	 */
	public static String getSleepInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_SLEEP);
	}
	/**睡眠数据接收成功或者失败命令
	 * @param state 成功/失败
	 * @return
	 */
	public static String getSleepInstructions(boolean state)
	{
			String s = "00";
			if(!state)
			{
				s = "01";
			}
		return getOneLenthInstructions(INSTRUCTIONS_SLEEP,s);
	}
	
	/**心率数据接收命令
	 * @return
	 */
	public static String getHeartRateInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_HEART_RATE);
	}
	
	/**心率数据接收成功或者失败命令
	 * @param state 成功/失败
	 * @return
	 */
	public static String getHeartRateInstructions(boolean state)
	{
		String s = "00";
		if(!state)
		{
			s = "01";
		}
		return getOneLenthInstructions(INSTRUCTIONS_HEART_RATE,s);
	}

	/**气压数据接收命令
	 * @return
	 */
	public static String getPressureInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_PRESSURE);
	}
	/**气压数据接收成功或者失败命令
	 * @param state
	 * @return
	 */
	public static String getPressureInstructions(boolean state)
	{
		String s = "00";
		if(!state)
		{
			s = "01";
		}
		return getOneLenthInstructions(INSTRUCTIONS_PRESSURE,s);
	}
	/**紫外线数据接收命令
	 * @return
	 */
	public static String getUltravioletRaysInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_ULTRAVIOLET_RAYS);
	}
	/**紫外线数据接收成功或失败命令
		 * @param state 成功/失败
		 * @return
		 */
	public static String getUltravioletRaysInstructions(boolean state)
		{
			String s = "00";
			if(!state)
			{
				s = "01";
			}
			return getOneLenthInstructions(INSTRUCTIONS_ULTRAVIOLET_RAYS,s);
		}

	/**开启/关闭实时同步数据
	 * @param type 同步的数据类型
	 * @return
	 */
	public static String getRealTimeSyncInstructions(String type)
	{
		String s = REAL_TIME_SYNC_CLOSE;
		if(type.equals(REAL_TIME_SYNC_HEART_RATE)||type.equals(REAL_TIME_SYNC_MOTION)
				||type.equals(REAL_TIME_SYNC_PRESSURE)||type.equals(REAL_TIME_SYNC_SLEEP))
		{
			s = type;
		}
		return getOneLenthInstructions(INSTRUCTIONS_SYNC_DATA,s);
	}
	
	/**断开蓝牙指令
	 * @return
	 */
	public static String getDisconnectBleInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_DISCONNECT_BLE);
	}

	/**横竖屏显示指令
	 * @param state true 横  false 竖
	 * @return
	 */
	public static String getAnywayDisolayInstructions(boolean state)
	{
		String s = "00";
		if(!state)
		{
			s = "01";
		}
		return getOneLenthInstructions(INSTRUCTIONS_ANYWAY_DISPLAY,s);
	}
	
	/**屏幕测试
	 * @param state 开/关
	 * @return
	 */
	public static String getScreenTestInstructions(boolean state)
	{
		String s = "01";
		if(!state)
		{
			s = "00";
		}
		return getOneLenthInstructions(INSTRUCTIONS_SCREEN_TEST,s);
	}
	
	/**马达测试
	 * @param state 开/关
	 * @return
	 */
	public static String getMotorTestInstructions(boolean state)
	{
		String s = "01";
		if(!state)
		{
			s = "00";
		}
		return getOneLenthInstructions(INSTRUCTIONS_MOTOR_TEST,s);
	}
	/**计步器测试
	 * @param state 开/关
	 * @return
	 */
	public static String getPedometerTestInstructions(boolean state)
	{
		String s = "01";
		if(!state)
		{
			s = "00";
		}
		return getOneLenthInstructions(INSTRUCTIONS_PEDOMETER_TEST,s);
	}
	/**心率测试
	 * @param state 开/关
	 * @return
	 */
	public static String getHeartRateTestInstructions(boolean state)
	{
		String s = "01";
		if(!state)
		{
			s = "00";
		}
		return getOneLenthInstructions(INSTRUCTIONS_HEART_RATE_TEST,s);
	}
	
	/**关机测试
	 * @return
	 */
	public static String getPowerCloseInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_POWER_CLOSE);
	}
	/**强制解绑测试
	 * @return
	 */
	public static String getUnbundingTestInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_UNBUNDING_SYSTEM);
	}	
	/**重启测试
	 * @return
	 */
	public static String getRestartInstructions()
	{
		return getZeroLenthInstructions(INSTRUCTIONS_RESTART);
	}
	/**设置语言
	 * @param state 中文/非中文
	 * **/
	public static String getLanguageInstructions(boolean state)
	{
		String s = "00";
		if(!state)
		{
			s = "01";
		}
		return getOneLenthInstructions(INSTRUCTIONS_LANGUAGE_UPDATE,s);
	}
	/**运动数据同步设置
	 * @param state 同步/不能同步
	 * **/
	public static String getMotionSynsSetInstructions(boolean state)
	{
		String s = "01";
		if(!state)
		{
			s = "00";
		}
		return getOneLenthInstructions(INSTRUCTIONS_MOTION_SYNC_SET,s);
	}
	
	/**获取升级固件命令
	 * @param
	 * @return
	 */
	public static String getFirmwareUpStatrtsInstructions(byte[] datas)
	{
		if(datas == null)
		{
			return "";
		}
		Logs.e(TAG, "文件大小:"+datas.length);
		StringBuffer str = new StringBuffer(INSTRUCTIONS_HEAD);
		str.append(INSTRUCTIONS_FIRMWARE_UP_STARTS);
		str.append("00");
		str.append( hex10_16(datas.length+""));
		String s = calculationCRC(str.toString(),datas);
		Logs.i(TAG, s+" ");
		str.append(new String(Hex.encodeHex(datas)));
		str.append(s);
		
		proofreadingCRC(str.toString());
		return str.toString();
	}
	
	//public static String getLoginInstructions()
//{
//	return getZeroLenthInstructions(INSTRUCTIONS_UNBUNDING);
//}
//	public static String getMotionStateInstructions(boolean state)
//	{
//		String s = "00";
//		if(!state)
//		{
//			s = "01";
//		}
//		return getOneLenthInstructions(INSTRUCTIONS_UNBUNDING,s);
//	}

//	public static String getLoginInstructions()
//	{
//		StringBuffer str = new StringBuffer(INSTRUCTIONS_HEAD);
//		str.append(INSTRUCTIONS_USER_INFO);
//		str.append("00");
//		str.append("08");
//		
//		str.append(calculationCRC(str.toString()));
//		proofreadingCRC(str.toString());
//		return str.toString();
//	}
	
	/**获取0长度的命令
	 * @param instructions 命令
	 * @return
	 */
	private static String getZeroLenthInstructions(String instructions)
	{
		StringBuffer str = new StringBuffer(INSTRUCTIONS_HEAD);
		str.append(instructions);
		str.append("00");
		str.append("00");
		str.append(calculationCRC(str.toString()));
		proofreadingCRC(str.toString());
		return str.toString();
	}
	/**获取1长度的命令
	 * @param instructions 命令
	 * @return
	 */
	private static String getOneLenthInstructions(String instructions,String data)
	{
		StringBuffer str = new StringBuffer(INSTRUCTIONS_HEAD);
		str.append(instructions);
		str.append("00");
		str.append("01");
		str.append(data);
		str.append(calculationCRC(str.toString()));
		proofreadingCRC(str.toString());
		return str.toString();
	}
	
	/**计算校验码
	 * @param val
	 * @return
	 */
	public static String calculationCRC(String val)
	{
		byte[] data;
		String crc = "";
		try {
			data = Hex.decodeHex(val.toCharArray());
			if(data!=null)
			{
				byte bb =data[0];
				for(int i = 1;i<data.length;i++)
				{
					bb+=data[i];
				}
				 int s =  (bb&0xFF);
				
				 crc = Integer.toHexString(s)+"";
			}
			if(crc.length()<2)
			{
				crc = "0"+crc;
			}
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return crc;
	}
	/**计算校验码
	 * @param val
	 * @return
	 */
	public static String calculationCRC(String val,byte[] datas)
	{
		byte[] data1;
		byte[] data;
		String crc = "";
		try {
			data1 = Hex.decodeHex(val.toCharArray());
			data = new byte[data1.length+datas.length];
			
			System.arraycopy(data1,0,data, 0,data1.length);
			
			System.arraycopy(datas,0,data, data1.length,datas.length);
//			int j = 0;
//			for(byte b:data)
//			{
//				j++;
//				Logs.i(TAG, "byte"+j+":"+b);
//			}
			Logs.i(TAG, "data1:'"+data1[data1.length-1]+"data_data1:"+data[data1.length-1]+"\ndatas:"
					+datas[datas.length-1]+"data_datas:"+data[data.length-1]);
			if(data!=null)
			{
				byte bb =data[0];
				for(int i = 1;i<data.length;i++)
				{
					bb+=data[i];
				}
				 int s =  (bb&0xFF);
				
				 crc = Integer.toHexString(s)+"";
			}
			if(crc.length()<2)
			{
				crc = "0"+crc;
			}
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return crc;
	}
	/**校对校验码
	 * @param val
	 * @return
	 */
	public static boolean proofreadingCRC(String val)
	{
		String s =  val.substring(0,val.length()-2);
		char[] c = s.toCharArray();
		String crc = val.substring(val.length()-2);
		byte[] data ;
		String temp = "";
		try {
			data = Hex.decodeHex(c);
			if(data!=null)
			{
				byte bb =data[0];
				for(int i = 1;i<data.length;i++)
				{
					bb+=data[i];
				}
				 int num =  (bb&0xFF);
				
				 temp = Integer.toHexString(num)+"";
					if(temp.length()<2)
					{
						temp = "0"+temp;
					}
			}
			Logs.e(TAG,"校对一下:"+val+"\ncrc:"+temp+"\n"+crc);
			if(crc.equals(temp))
			{
				return true;
			}
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**10转16
	 * @param val
	 * @return
	 */
	public static String hex10_16(String val)
	{
		String s = "00";
		try{
			s = Integer.toHexString(Integer.parseInt(val));
		if(s.length()<2)
		{
			s = "0"+s;
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		Logs.i(TAG, "进制转换:"+s);
		
		return s;
	}
	/**解析命令为字符数组
	 * @param str
	 * @return
	 */
	public static String[] analysisData(String str)
	{
		if(str==null||str.length()%2!=0)
		{
			return null;
		}
		String[] strs = new String[str.length()/2];
	for(int i = 0;i<strs.length;i++)
		{
			
			strs[i] =str.substring(i*2, i*2+2) ;
//			Logs.i(TAG, "解析的字符串:序号:"+i+"\t数据:"+strs[i]);

		}
		
		
		return strs;
	}
}
