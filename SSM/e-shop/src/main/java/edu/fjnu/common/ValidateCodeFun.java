package edu.fjnu.common;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
public class ValidateCodeFun {
	  /**
	   * ��ԭʼ��������ָ���ַ�������ָ����ߵ�BufferedImage
	   * 
	   * @param strCode
	   * @param width
	   * @param height
	   * @return
	   */
	  public static BufferedImage generalImage(String strCode, Integer width, 
	Integer height) {
	    // ���ڴ��д���ͼ��
	    // int width = 85, height = 20;
	    BufferedImage vBufferedImage = new BufferedImage(width, height, 
	BufferedImage.TYPE_INT_RGB);
	    // ��ȡͼ��������
	    Graphics g = vBufferedImage.getGraphics();
	    // ���������
	    Random random = new Random();
	    // �趨����ɫ
	    g.setColor(generalRandColor(200, 250));
	    g.fillRect(0, 0, width, height);
	    // �趨����
	    g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	    // �������155�������ߣ�ʹͼ���е���֤�벻�ױ���������̽�⵽
	    g.setColor(generalRandColor(160, 200));
	    for (int i = 0; i < 155; i++) {
	      int x = random.nextInt(width);
	      int y = random.nextInt(height);
	      int xl = random.nextInt(12);
	      int yl = random.nextInt(12);
	      g.drawLine(x, y, x + xl, y + yl);
	    }
	    char[] arr = strCode.toCharArray();
	    for (int i = 0; i < arr.length; i++) {
	      String randChar = "" + arr[i];
	      // ����֤����ʾ��ͼ����
	      g.setColor(new Color(20 + random.nextInt(110), 20 + 
	random.nextInt(110), 20 + random.nextInt(110)));
	      // ���ú�����������ɫ��ͬ����������Ϊ����̫�ӽ�������ֻ��ֱ������
	      g.drawString(randChar, 13 * i + 6, 16);
	    }
	    // ͼ����Ч
	    g.dispose();
	    return vBufferedImage;
	  }
	  /**
	   * ��ָ���ַ�������ָ����ߵ�BufferedImage : 80 * 20
	   * 
	   * @param strCode
	   * @return
	   */
	  public static BufferedImage generalImage(String strCode) {
	    return generalImage(strCode, 80, 20);
	  }
	  // ---------------------------------------------------------  
	  /**
	   * ��ԭʼ���������ɸ�����Χ�������ɫ
	   * 
	   * @param fc
	   * @param bc
	   * @return
	   */
	  public static Color generalRandColor(int fc, int bc) {
	    Random random = new Random();
	    if (fc > 255)
	      fc = 255;
	    if (bc > 255)
	      bc = 255;
	    int r = fc + random.nextInt(bc - fc);
	    int g = fc + random.nextInt(bc - fc);
	    int b = fc + random.nextInt(bc - fc);
	    return new Color(r, g, b);
	  }
	  // ---------------------------------------------------------  
	  /**
	   * BufferedImageתΪImageOutputStream
	   * 
	   * @param pBufferedImage
	   * @return
	   */
	  public static ImageOutputStream toImageOutputStream(BufferedImage 
	pBufferedImage) {
	    BufferedImage vBufferedImage = pBufferedImage;
	    ImageOutputStream imageOut = null;
	    ByteArrayOutputStream outStream = null;
	    try {
	      outStream = new ByteArrayOutputStream();
	      imageOut = ImageIO.createImageOutputStream(outStream);
	      ImageIO.write(vBufferedImage, "JPEG", imageOut);
	      imageOut.close();
	    } catch (Exception e) {
	      System.out.println("toImageOutputStream()ʱ��������" + 
	e.toString());
	    }
	    return imageOut;
	  }
	  /**
	   * BufferedImageתΪByteArrayInputStream
	   * 
	   * @param pBufferedImage
	   * @return
	   */
	  public static ByteArrayInputStream toByteArrayInputStream(BufferedImage 
	pBufferedImage) {
	    BufferedImage vBufferedImage = pBufferedImage;
	    ByteArrayInputStream inStream = null;
	    ByteArrayOutputStream outStream = null;
	    try {
	      outStream = new ByteArrayOutputStream();
	      ImageOutputStream imageOut = 
	ImageIO.createImageOutputStream(outStream);
	      ImageIO.write(vBufferedImage, "JPEG", imageOut);
	      imageOut.close();
	      inStream = new ByteArrayInputStream(outStream.toByteArray());
	    } catch (Exception e) {
	      System.out.println("ͼƬת��Ϊ������ʱ��������" + e.toString());
	    }
	    return inStream;
	  }
	  // ---------------------------------------------------------  
	  /**
	   * ��ȡָ���ַ�����ͼƬ��������80 * 20
	   * 
	   * @param strCode
	   * @return
	   */
	  public static ByteArrayInputStream getByteArrayInputStream(String strCode) {
	    return getByteArrayInputStream(strCode, 80, 20);
	  }
	  /**
	   * ��ȡָ���ַ�����ͼƬ��������ָ�����
	   * 
	   * @param strCode
	   * @param width
	   * @param height
	   * @return
	   */
	  public static ByteArrayInputStream getByteArrayInputStream(String strCode, 
	Integer width, Integer height) {
	    if (width < 1) {
	      width = 80;
	    }
	    if (height < 1) {
	      height = 20;
	    }
	    BufferedImage vBufferedImage = generalImage(strCode, width, height);
	    ByteArrayInputStream imageStream = 
	toByteArrayInputStream(vBufferedImage);
	    return imageStream;
	  }
}
