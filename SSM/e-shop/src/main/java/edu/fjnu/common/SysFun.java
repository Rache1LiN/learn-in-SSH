/**
 * 
 */
package edu.fjnu.common;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ASUS
 *
 */
public class SysFun {

	public static String toString(Object pObj) {
			String str= "";
			if(pObj!= null) {
				str= pObj.toString();
			}
			return str;
		}

		public static boolean isNullOrEmpty(String pStr) {
			boolean vIsOK= true;
			if(pStr!= null&& !pStr.isEmpty()) {
				vIsOK= false;
			}
			return vIsOK;
		}

		public static String dealString(String pStr) {
		
			if(isNullOrEmpty(pStr)) {
				return "";
			} else{
				return pStr.trim();
			}
		}

		public static String dealStringAllowNull(String pStr) {

			if(isNullOrEmpty(pStr)) {
				return null;
			} else{
				return pStr.trim();
			}
		}

		public static Integer parseInt(String pStr, Integer pDefaultNum) {
			int vNum= pDefaultNum;
			if(!isNullOrEmpty(pStr)) {
				try{
					vNum= Integer.parseInt(pStr.trim());
				} catch(Exception ex) {
					vNum= pDefaultNum;
				}
			}
			return vNum;
		}

		public static Integer parseInt(String pStr) {
			return parseInt(pStr, 0);
		}

		public static Long parseLong(String pStr, Long pDefaultNum) {
			Long vNum= pDefaultNum;
			if(!isNullOrEmpty(pStr)) {
				try{
					vNum= Long.parseLong(pStr.trim());
				} catch(Exception ex) {
					vNum= pDefaultNum;
				}
			}
			return vNum;
		}

		public static Long parseLong(String pStr) {
			return parseLong(pStr, 0L);
		}
		
		// http://blog.csdn.net/zengdeqing2012/article/details/50922468
		/**
		 * java解析代码
		 * 
		 * @paramurl
		 * @paramname
		 * @paramaccessToken
		 * @return
		*/

		public static String replaceAccessToken(String url, String name, String accessToken) {
			if(!isNullOrEmpty(url) && !isNullOrEmpty(accessToken)) {
				int index= url.indexOf(name+ "=");
				if(index!= -1) {
					StringBuilder sb= new StringBuilder();
					sb.append(url.substring(0, index)).append(name+ "=").append(accessToken);
					int idx= url.indexOf("&", index);
					if(idx!= -1) {
						sb.append(url.substring(idx));
					}
					url= sb.toString();
				}
			}
			return url;
		}
		/**
		 * 正则替换
		 * 
		 * @paramurl
		 * @paramname
		 * @paramaccessToken
		 * @return
		 */
		public static String replaceAccessTokenReg(String url, String name, String accessToken) {
			if(!isNullOrEmpty(url) && !isNullOrEmpty(name) && !isNullOrEmpty(accessToken)) {
				url= url.replaceAll("("+ name+ "=[^&]*)", name+ "="+ accessToken);
			}
			return url;
		}
		
		public static boolean testAccessTokenReg(String url, String name) {
			boolean vIsOK= false;
			if(!isNullOrEmpty(url) && !isNullOrEmpty(name)) {
				// vIsOK = url.matches("" + name + "=[^&]*");
				// Pattern pattern = Pattern.compile("" + name + "=[^&]*");
				Pattern pattern= Pattern.compile("(&|\\?)"+ name+ "=[^&]*&?");
				Matcher matcher= pattern.matcher(url);
				if(matcher.find()) {
					vIsOK= true;
				}
			}

			return vIsOK;
		}
		
		public static String generalUrl(String pURI, String pQueryString) {
			String url= "";
			if(!isNullOrEmpty(pURI)) {
				url= pURI;
			}
			if(!isNullOrEmpty(pQueryString)) {
				url+= "?"+ pQueryString;
			} else{
				url+= "?s=";
			}

			return url;
		}

		public static String resetUrlQSValue(String pUrl, String pKey, String pValue) {

			if(!isNullOrEmpty(pUrl)) {
				// 存在则替换，否则追加参数
				if(testAccessTokenReg(pUrl, pKey)) {
					pUrl= replaceAccessTokenReg(pUrl, pKey, pValue);
				} else{
					if(pUrl.indexOf("?") < 0) {
						pUrl+= "?s=";
					}
					pUrl+= "&"+ pKey+ "="+ pValue;
				}

			}
			return pUrl;
		}

		public static void main(String[] args) {
			String test_str= "/MyBlog/news_search.jsp?title=a&x=14&y=16&pagesize=2&pageindex=1";
			System.out.println("str的长度"+ test_str.length());
			// 调用方法
			String replace_str= "pageindex"; // 需要替换的参数
			String replace_val= "3"; // 需要替换的值
		
			String result1= replaceAccessToken(test_str, replace_str, replace_val);
			System.out.println("result1="+ result1);
			
			String result2= replaceAccessTokenReg(test_str, replace_str, replace_val);
			System.out.println("result2="+ result2);

			System.out.println("result3="+ testAccessTokenReg(test_str, replace_str));
		}
		/**
		 * 使用md5的算法进行加密
		*/
		public static String md5(String plainText) {
			byte[] secretBytes= null;
			try{
				secretBytes= MessageDigest.getInstance("md5").digest(plainText.getBytes());
			} catch(java.security.NoSuchAlgorithmException e) {
				throw new RuntimeException("没有md5这个算法！");
			}
			String md5code= new BigInteger(1, secretBytes).toString(16);// 16进制数字
			// 如果生成数字未满32位，需要前面补0
			for(int i= 0; i< 32 - md5code.length(); i++) {
				md5code= "0"+ md5code;
			}
				return md5code;
		}
}
