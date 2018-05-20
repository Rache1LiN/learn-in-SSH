/**
 * 
 */
package edu.fjnu.common;
/**
 * ��������ɷ���ĸ����ࡿ��
 * 
 * 
 * @author Liuvei
 * @Copyright: 2018 Liuvei.com
 *
 */
public class RandFun {

	
	  /**
	   * �����������(Integer����)��[min,max]
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
	    max = max + 1; // �Ż� [min, max]
	    // min 1 , max 9
	    // (max - min ) = 9-1 = 8
	    // new Random().nextInt(max-min) = new Random().nextInt(8)
	    // == > ����[0,7]
	    // == > [0,7] + min = [1-8]
	    // [1, 8] �Ա� min=1�� max=9����������[1,9) ���� [min, max)
	    // �� [min,max]����maxҪ��1
	    return new java.util.Random().nextInt(max - min) + min;
	  }
	  /**
	   * �����������(Long����)��[min,max]
	   * 
	   * @param min
	   * @param max
	   * @return
	   */
	  public static Long randLong(Integer min, Integer max) {
	    return randNum(min, max).longValue();
	  }
	  /**
	   * ����4λ�������(Integer����)
	   * 
	   * @return
	   */
	  public static Integer rand4Num() {
	    return randNum(1000, 9999);
	  }
	  /**
	   * ����4λ�������(Long����)
	   * 
	   * @return
	   */
	  public static Long rand4Long() {
	    return rand4Num().longValue();
	  }
	  /**
	   * ����6λ�������(Integer����)
	   * 
	   * @return
	   */
	  public static Integer rand6Num() {
	    return randNum(100000, 999999);
	  }
	  /**
	   * ����6λ�������(Long����)
	   * 
	   * @return
	   */
	  public static Long rand6Long() {
	    return rand6Num().longValue();
	  }
	  /**
	   * ����8λ�������(Integer����)
	   * 
	   * @return
	   */
	  public static Integer rand8Num() {
	    return randNum(10000000, 99999999);
	  }
	  /**
	   * ����8λ�������(Long����)
	   * 
	   * @return
	   */
	  public static Long rand8Long() {
	    return rand8Num().longValue();
	  }
	  /**
	   * ����10λ�������(Integer����): �����Integer.MAX_VALUE
	   * 
	   * @return
	   */
	  public static Integer rand10Num() {
	    return randNum(1000000000, Integer.MAX_VALUE);
	  }
	  /**
	   * ����10λ�������(Long����): �����Integer.MAX_VALUE
	   * 
	   * @return
	   */
	  public static Long rand10Long() {
	    return rand10Num().longValue();
	  }
	 
	  /**
	   * ��������ַ����������֡���Сд��ĸ
	   * 
	   * @param len
	   *            ���ɵ�����ַ��ĳ���
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

