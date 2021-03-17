package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.component.HelloSender;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

  
	@Autowired
	private HelloSender helloSender;
 
	@Test
	public void hello() throws Exception {
		helloSender.send();
	}
	
	@Test
	public void he() {
		String htmlString="\n" + 
				"				<tbody><tr>\n" + 
				"				   <td colspan=\"2\">\n" + 
				"				     <div style=\" display: block; float:right;margin-bottom:20px;\">\n" + 
				"				        <img src=\"/b2b/supplier/b2bStyle/img/images/con_pri_ws_002.gif\" onclick=\"printView()\">\n" + 
				"                     </div>\n" + 
				"                   </td>\n" + 
				"				</tr>\n" + 
				"				<tr style=\"text-align:center\">\n" + 
				"                    <td colspan=\"2\">\n" + 
				"						 \n" + 
				"					    <hr style=\"FILTER: alpha(opacity=100,finishopacity=0,style=3)\" width=\"100%\" color=\"#987cb9\" size=\"3\">\n" + 
				"					</td>\n" + 
				"				</tr>\n" + 
				"				<tr>\n" + 
				"					<td colspan=\"2\" id=\"contentInfo\" style=\"\">\n" + 
				"						<div id=\"mobanDiv\"><input type=\"hidden\" name=\"templateId\" id=\"templateId\" value=\"10051\"> <table width=\"968px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">    <tbody><tr>     <td colspan=\"3\">     <div id=\"titDiv\">     <span style=\"font-size: 16px;margin-left:16px;\">       </span>     </div>     </td>   </tr>   <tr>     <td colspan=\"3\">       <span style=\"font-weight: bold;font-size: 16px;font-weight: bold;\">一、项目名称&nbsp;&nbsp;城区新城分局、西城分局办公房屋租赁项目</span>      <div id=\"ggdiv1\">      <span style=\"font-size: 16px;margin-left:16px;\"><p>&nbsp;&nbsp;</p>            </span>      </div>      </td>    </tr>    <tr>     <td colspan=\"3\">       <span style=\"font-weight: bold;font-size: 16px;font-weight: bold;\">二、采购内容&nbsp;&nbsp;</span>      <div id=\"ggdiv2\">      <span style=\"font-size: 16px;margin-left:16px;\">      <span style=\"color:black;font-family:宋体;font-size:10.5pt;\">拟租赁房屋位于汉滨区巴山中路<span>98</span>号糖酒副食公司院内二楼，面积<span>300</span>平米左右。</span> <table style=\"width:100%;\" border=\"1\" cellspacing=\"0\" bordercolor=\"#DDDDDD\" cellpadding=\"2\"><tbody><tr><th style=\"width:20%;\">包段</th><th style=\"width:40%;\">产品名称</th><th style=\"width:20%;\">产品单位</th><th style=\"width:20%;\">需求数量</th></tr><tr><td>包1</td><td>房屋租赁</td><td>项</td><td>1.000</td></tr></tbody></table><table>                            <tbody><tr>     <td colspan=\"3\">       <span style=\"font-weight: bold;font-size: 16px;font-weight: bold;\">三、供应商名称&nbsp;&nbsp;陕西省安康市糖酒副食有限公司</span>     <div>       <span style=\"font-size: 16px;margin-left:16px;height:30px;width:30px;display:block;\"></span>     </div>   </td>   </tr>   <tr>     <td colspan=\"3\">       <span style=\"font-size: 16px;font-weight: bold;\">&nbsp;&nbsp;&nbsp;&nbsp;此公告自发布之日起3日内有效，如有意见，请于公告期内以书面形式（加盖公章）实名反馈。</span>      <div>       <span style=\"font-size: 16px;margin-left:16px;height:30px;width:30px;display:block;\"></span>     </div>      </td>    </tr>    <tr>      <td colspan=\"3\">         <div id=\"ggdiv3\">         <span style=\"font-size: 16px;margin-left:16px;\">联 系 人：郑女士</span><p>&nbsp;&nbsp;</p>         </div>      </td>    </tr>    <tr>     <td colspan=\"3\">      <div id=\"ggdiv3\">      <span style=\"font-size: 16px;margin-left:16px;\">联系电话：13992544540</span><p>&nbsp;&nbsp;</p>      </div>      </td>    </tr>    <tr>     <td colspan=\"3\">      <div id=\"ggdiv3\">      <span style=\"font-size: 16px;margin-left:16px;\">邮&nbsp;&nbsp;&nbsp;&nbsp;箱：13992544540@139.com</span><p>&nbsp;&nbsp;</p>      </div>      </td>    </tr>   <tr>     <td colspan=\"3\">   <div>       <span style=\"font-size:16px;float:right; clear:both;\">采购人/招标代理机构：中国移动通信集团陕西有限公司安康分公司</span></div><div>       <span id=\"span1\" style=\"font-size: 16px;float:right; clear:both;\">公告发布时间：2020年11月2日</span>   </div>     </td>   </tr></tbody></table></span></div>                                                                                            \n" + 
				"					</td>\n" + 
				"				</tr>\n" + 
				"				<tr><td><br></td></tr>\n" + 
				"				<tr><td><br></td></tr>\n" + 
				"				\n" + 
				"				\n" + 
				"			</tbody></table>\n" + 
				"			</div>\n" + 
				"		\n" + 
				"		<!--版权-->\n" + 
				"<div class=\" footer\" style=\"\">\n" + 
				"<div style=\"float:left;width:50%;text-align: right;margin-bottom: 3px;\">\n" + 
				"<img src=\"/b2b/supplier/b2bStyle/img/CEPREI.png\" border=\"0\" style=\"height:47px;\">\n" + 
				"<img src=\"/b2b/supplier/b2bStyle/img/secrtweb.png\" border=\"0\" style=\"height:47px;margin-right:5px;\">\n" + 
				"</div>\n" + 
				"<div style=\"float:left;width:50%;margin-top: 8px;\">\n" + 
				"<p style=\"margin:0;margin-left:5px;text-align: left;line-height:25px;\">京ICP备05002571号 | 中国移动通信版权所有</p>\n" + 
				"<p style=\"margin:0;margin-left:5px;text-align: left;line-height:25px;\">技术支持工作时间（工作日）：9：00~18：00</p>\n" + 
				"<p style=\"margin:0;margin-left:5px;text-align: left;line-height:25px;\">本网站支持IPv6访问</p>\n" + 
				"</div>\n" + 
				"<div style=\"clear:both;\"></div>\n" + 
				"</div>	\n" + 
				"	<script type=\"text/javascript\">\n" + 
				"		var type = \"单一来源采购信息公告\"\n" + 
				"		var title = '城区新城分局、西城分局办公房屋租赁项目_单一来源采购信息公告'\n" + 
				"		$(function () {\n" + 
				"\n" + 
				"			if(type === '2'){\n" + 
				"				setNegativeBehaviorInfo()\n" + 
				"			}else{\n" + 
				"				setBaseInfo()\n" + 
				"			}\n" + 
				"\n" + 
				"		})\n" + 
				"		function setBaseInfo(){\n" + 
				"			$(\"#title\").html(title)\n" + 
				"			$(\"#contentInfo\").show()\n" + 
				"		}\n" + 
				"		function setNegativeBehaviorInfo(){\n" + 
				"			var content = $(\"#contentInfo\").html()\n" + 
				"			var infoList = content.split('##:##');\n" + 
				"			if (infoList && infoList.length === 2) {\n" + 
				"				var item = JSON.parse(decodeURIComponent(infoList[1]))\n" + 
				"				$(\"#contentInfo\").html(item.realContent)\n" + 
				"				$(\"#title\").html(item.realTitle)\n" + 
				"			}else {\n" + 
				"				setBaseInfo()\n" + 
				"			}\n" + 
				"			$(\"#contentInfo\").show()\n" + 
				"\n" + 
				"		}\n" + 
				"	\n" + 
				"		$(\"#resetButton\").click(function() {\n" + 
				"			$(\"#source\").val(\"\");\n" + 
				"			$(\"#title\").val(\"\");\n" + 
				"			$(\"#startDate\").val(\"\");\n" + 
				"			$(\"#endDate\").val(\"\");\n" + 
				"		})\n" + 
				"		\n" + 
				"		\n" + 
				"		function procurementNotice(obj,noticeType){\n" + 
				"			doSearchByPage(1,13,noticeType);\n" + 
				"			$(obj).click(function(){\n" + 
				"				$(this).parent().addClass(\"zb_table_tit\");\n" + 
				"				$(this).parent().siblings().removeClass(\"zb_table_tit\");\n" + 
				"				//$(\"#laws\").html($(this).html());\n" + 
				"			})\n" + 
				"		}\n" + 
				"		function doSearchByPage(pageNo, pageSize,noticeType) {\n" + 
				"			$(\"#operateInfo\").html(\n" + 
				"					\"操作进行中<img src='/portal/images/operating.gif'/>\");\n" + 
				"			var url = \"/b2b/main/listVendorNoticeResult.html?noticeBean.noticeType=\"+noticeType;\n" + 
				"			document.getElementsByName('page.currentPage')[0].value = pageNo;\n" + 
				"			document.getElementsByName('page.perPageSize')[0].value = pageSize;\n" + 
				"			var formData = $(\"#fmName\").serialize();\n" + 
				"			$('#noticeType').val(noticeType);\n" + 
				"			$.ajax({\n" + 
				"						type : \"POST\",\n" + 
				"						url : url,\n" + 
				"						cache : false,\n" + 
				"						processData : true,\n" + 
				"						data : formData,\n" + 
				"						success : function(responseData) {\n" + 
				"							$(\"#searchResult\").html(responseData);\n" + 
				"							if ($(\"#totalRecordNum\").val() == 0) {\n" + 
				"								var msg=\"<font color='red' size='5em'>查询无结果！</font>\";\n" + 
				"								$(\"#searchResult\").html(msg);\n" + 
				"							} else {\n" + 
				"								$(\"#searchResult\").html(responseData);\n" + 
				"							}\n" + 
				"						}\n" + 
				"					});\n" + 
				"		}\n" + 
				"\n" + 
				"		function selectResult(id) {\n" + 
				"			var uri = \"/b2b/main/viewWorkorder.html?workorderBean.id=\"+ id;\n" + 
				"			window.location.href = uri;\n" + 
				"		}\n" + 
				"		function choose(com){\n" + 
				"			$(\"#company\").val(com);\n" + 
				"			$('button.close').trigger(\"click\");\n" + 
				"		}\n" + 
				"		function printView(){\n" + 
				"		  	var id= $(\"#id\").val();\n" + 
				"		    var url=\"/b2b/main/printView.html?noticeBean.id=\"+id + \"&noticeBean.appType=NOTICE\";\n" + 
				"            window.open(url);		\n" + 
				"		}\n" + 
				"	</script>\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"</td></tr></tbody>";
		Date date=ReleaseDate(htmlString);
		SimpleDateFormat sdfDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("得出的日期是："+sdfDateFormat.format(date));
	}
	
    public static Date ReleaseDate(String htmlString) {
    	Date date = null;
    	String pattern = "[0-9]{4}年[0-9]{1,2}月[0-9]{1,2}日";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(htmlString);
        List<String> list=new ArrayList<String>();
        while (m.find()) {
            list.add(m.group());
        }
        if (list.size()>0) {
			SimpleDateFormat sdfDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
			System.out.println(list.get(list.size()-1));
			try {
				 date=sdfDateFormat.parse(list.get(list.size()-1));
				System.out.println(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			//没有找到则默认1990年1月1日
			Calendar cal=Calendar.getInstance();
			cal.set(Calendar.YEAR,1990);
			cal.set(Calendar.MONTH,0);
			cal.set(Calendar.DATE,1);
			date=cal.getTime();
		}
        return date;

    }
}
