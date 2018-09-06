package com;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.river.model.MessageRecord;
import com.river.service.MessageRecordService;
import net.karp.captchaCode.CaptchaCode;
import net.karp.excel.XlsUtils;
import net.karp.qRCode.QRCodeUtil;
import net.karp.random.RandomUtils;
import net.karp.snowflake.SnowflakeIdWorker;
import net.karp.string.StringUtil;
import net.karp.validate.IDCardUtils;
import net.karp.validate.ValidateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.events.Event;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLearningApplicationTests {
    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
    }

    /**
     * 测试excel类
     *
     * @throws IOException
     * @throws FileNotFoundException
     */
//	@Test
//	public void JerryUtilExcelTest() throws IOException, FileNotFoundException {
//		try {
//			File file = new File("D:\\用户目录\\下载\\设备信息管理模板 (5).xlsx");
//			InputStream inputStream = new FileInputStream(file.getAbsolutePath());
//			List<String[]> list = XlsUtils.rosolveFile(inputStream, "xlsx", 8);
//
//			for (int i = 0; i <= list.size(); i++) {
//				StringBuilder sb = new StringBuilder();
//				String[] strArr = list.get(i);
//				for (String str : strArr
//						) {
//					sb.append(str);
//					sb.append(" ");
//				}
//				sb.append("/r/n");
//				logger.info(sb.toString());
//			}
//
//		} catch (Exception ex) {
//			logger.error(ex.getMessage());
//		}
//
//	}
//
//	/**
//	 * 测试生成二维码
//	 */
//	@Test
//	public void MyQRCodeUtilTest() {
//		//MyQRCodeUtil.createQrCode("test","普加学","D:\\用户目录\\下载\\" );
//		try {
//			String fileName = QRCodeUtil.encode("test", "D:\\用户目录\\下载\\1.png", "D:\\用户目录\\下载\\", false);
//			logger.info(fileName);
//		} catch (Exception ex) {
//			System.out.print(ex.getMessage());
//		}
//	}
//
//	/**
//	 * 测试随机数
//	 */
//	@Test
//	public void randomTest() {
//		String random1 =  RandomUtils.randomAll(10);
//		String s = RandomUtils.randomInt(10);
//		String randomStr = RandomUtils.randomStr(10);
//		System.out.println(random1);
//		System.out.println(s);
//		System.out.println(randomStr);
//
//	}
//
//	/**
//	 * 测试雪花算法
//	 */
//	@Test
//	public  void  snowflakeIdTest()
//	{
//		SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
//		for (int i=0;i<=100;i++){
//			long nextId = idWorker.nextId();
//			System.out.println(nextId);
//		}
//	}
//
//	/**
//	 * 测试string工具类
//	 * @param
//	 */
//	@Test
//	public  void  stringPinYinTest()
//	{
////        try {
////            String pinYin = PinyinTool.toPinYin("普加学", "-", PinyinTool.Type.FIRSTUPPER);
////
////            String str1="";
////            String str2 =" ";
////            String str3 =null;
////            String str4 ="adfasf";
////
////            boolean b = StringUtil.isNotNull(str1);
////            boolean b2 = StringUtil.isNotNull(str2);
////            boolean b3 = StringUtil.isNotNull(str3);
////            boolean b4 = StringUtil.isNotNull(str4);
////            System.out.println(b);
////            System.out.println(b2);
////            System.out.println(b3);
////            System.out.println(b4);
////
////            System.out.println(pinYin);
////        }
////        catch (Exception ex)
////        {
////
////        }
//
//	}
//
//	/**
//	 * 测试身份证号
//	 */
//	@Test
//	public  void  idCardTest()
//	{
//		String IDCard ="532331199004152413";
//		boolean verifi = IDCardUtils.verifi(IDCard);
//
//		boolean phone = ValidateUtils.isMobile("15025161056");
//		System.out.println(verifi);
//		System.out.println(phone);
//
//	}
//
//	/**
//	 * 测试生成验证码
//	 */
//	@Test
//	public  void  captchaTest()
//	{
//		CaptchaCode captchaCode = new CaptchaCode();
//		String code = captchaCode.getCode();
//		BufferedImage buffImg = captchaCode.getBuffImg();
//		File file = new File("d:/test01.jpg");
//		System.out.println(code);
//		try {
//			captchaCode.write(new FileOutputStream(file));
////           ImageIO.write(buffImg,"jpg",file);
//			System.out.println("成功保存到："+file.getAbsolutePath());
//		} catch (IOException e) {
//			System.out.println("保存失败");
//			e.printStackTrace();
//		}
//
//		System.out.println(buffImg);
//
//	}
//
//	/**
//	 * 测试http工具lei
//	 */
//
//	@Test
//	public  void  HttpUtilsTest() {
////
////        String url="http://localhost:8080/equipment/getEquipmentList?pageNum=1&pageSize=10";
////        try {
////
////
////            EquipmentQueryDTO dto = new EquipmentQueryDTO();
////            dto.setEquipmentName("测试1");
////            dto.setEnableState(-1);
////            dto.setEquipmentCode("");
////            String jsonString = JSON.toJSONString(dto);
////
//////            String s = HttpClient4.doPost2Json(url, jsonString);
////
////
////
////            String httpPost = HttpClient.httpPost(url, jsonString);
////
//////            JSONObject obj = new JSONObject();
//////             obj.getJSONObject(httpPost);//JSON.toJavaObject(httpPost, new Result().getClass())
////            JSONObject json = JSONObject.parseObject(httpPost);
////            Result result = JSON.toJavaObject(json, Result.class);
////            String s = result.getData().get("list").get("list").toString();
////           // JSONObject jsonArr =  JSONObject.parseObject(s);
////            JSONArray jsonArray = JSON.parseArray(s);
////            int size = jsonArray.size();
////            for (int i = 0; i < size; i++){
////                JSONObject jsonObject = jsonArray.getJSONObject(i);
////                Equipment equipment = JSON.toJavaObject(jsonObject, Equipment.class);
////                System.out.println(equipment.toString());
////            }
//////            List<Equipment> list2=(List<Equipment>)JSONArray.toList(JSONArray.fromObject(jsonArr), Equipment.class);
////            System.out.println(httpPost);
//////            System.out.println(s);
////        }
////        catch (Exception ex)
////        {
////
////        }
////
////    }
//	}

    @Autowired
    MessageRecordService messageRecordService;


    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void testSaveMessageRecord() {
        MessageRecord messageRecord = messageRecordService.selectByPrimaryKey("d9a77a42-8a11-4243-af9b-715735c01099");
        messageRecord.setMessage("123 ces测试");
        int i = messageRecordService.updateByPrimaryKey(messageRecord);
        String s = JSON.toJSONString(messageRecord);
        String s1 = RandomUtils.randomStr(5);
        redisTemplate.opsForValue().set(s1,messageRecord);
        logger.info("操作Redis的key=："+s1 );
        logger.info("修改数据库状态：" + i);
        logger.info("数据信息为：" + s);

    logger.info("测试");
    }


}
