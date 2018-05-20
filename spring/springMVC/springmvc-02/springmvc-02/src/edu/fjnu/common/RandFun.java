/**
 * 
 */
package edu.fjnu.common;
/**
 * 【随机生成方面的辅助类】：
 * 
 * 
 * @author Liuvei
 * @Copyright: 2018 Liuvei.com
 *
 */
public class RandFun {

	
	  /**
	   * 生成随机数字(Integer类型)：[min,max]
	   * 
	   * @param min
	   * @param max
	   * @return
	   */
	  public static Integer randNum(Integer min, Integer max) {
	    if (max == min) {
	      max = min + 100;
	    }
	    if (max < min) {
	      int tmp = min;
	      min = max;
	      max = tmp;
	    }
	    max = max + 1; // 才会 [min, max]
	    // min 1 , max 9
	    // (max - min ) = 9-1 = 8
	    // new Random().nextInt(max-min) = new Random().nextInt(8)
	    // == > 生成[0,7]
	    // == > [0,7] + min = [1-8]
	    // [1, 8] 对比 min=1和 max=9，代表结果是[1,9) 即： [min, max)
	    // 故 [min,max]，则max要加1
	    return new java.util.Random().nextInt(max - min) + min;
	  }
	  /**
	   * 生成随机数字(Long类型)：[min,max]
	   * 
	   * @param min
	   * @param max
	   * @return
	   */
	  public static Long randLong(Integer min, Integer max) {
	    return randNum(min, max).longValue();
	  }
	  /**
	   * 生成4位随机数字(Integer类型)
	   * 
	   * @return
	   */
	  public static Integer rand4Num() {
	    return randNum(1000, 9999);
	  }
	  /**
	   * 生成4位随机数字(Long类型)
	   * 
	   * @return
	   */
	  public static Long rand4Long() {
	    return rand4Num().longValue();
	  }
	  /**
	   * 生成6位随机数字(Integer类型)
	   * 
	   * @return
	   */
	  public static Integer rand6Num() {
	    return randNum(100000, 999999);
	  }
	  /**
	   * 生成6位随机数字(Long类型)
	   * 
	   * @return
	   */
	  public static Long rand6Long() {
	    return rand6Num().longValue();
	  }
	  /**
	   * 生成8位随机数字(Integer类型)
	   * 
	   * @return
	   */
	  public static Integer rand8Num() {
	    return randNum(10000000, 99999999);
	  }
	  /**
	   * 生成8位随机数字(Long类型)
	   * 
	   * @return
	   */
	  public static Long rand8Long() {
	    return rand8Num().longValue();
	  }
	  /**
	   * 生成10位随机数字(Integer类型): 最大是Integer.MAX_VALUE
	   * 
	   * @return
	   */
	  public static Integer rand10Num() {
	    return randNum(1000000000, Integer.MAX_VALUE);
	  }
	  /**
	   * 生成10位随机数字(Long类型): 最大是Integer.MAX_VALUE
	   * 
	   * @return
	   */
	  public static Long rand10Long() {
	    return rand10Num().longValue();
	  }
	 
	  /**
	   * 生成随机字符，包含数字、大小写字母
	   * 
	   * @param len
	   *            生成的随机字符的长度
	   * @return
	   */
	  public static String randCode(Integer len) {
	    String codeNum = "";
	    int[] code = new int[3];
	    java.util.Random random = new java.util.Random();
	    for (int i = 0; i < len; i++) {
	      int num = random.nextInt(10) + 48;
	      int uppercase = random.nextInt(26) + 65;
	      int lowercase = random.nextInt(26) + 97;
	      code[0] = num;
	      code[1] = uppercase;
	      code[2] = lowercase;
	      codeNum += (char) code[random.nextInt(3)];
	    }
	    return codeNum;
	  }
	 
	 
}

