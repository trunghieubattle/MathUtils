/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static hieu.util.MathUtil.computeFactorial;

/**
 *
 * @author trant
 */
public class MathUtilTest {
    //báo cho jvm biết rằng đây là hàm main
    //trong hàm này chứa các kệnh để test code chính mnh2 ở bên mathutil
    //ta test tình huống thành công ở đây
    
  @Test
  public void testSuccessfullCases(){
      //assertEquals(30, 50);
      //tao kì vọng có 30, xem mày đưa vào thực tế là bao nhiêu
      //2 thứ khớp nhau, mày xử lý như dự kiến, đèn xanh. Ko khớp như dự kiến đèn đỏ
//      assertEquals(120, computeFactorial(5));
//      assertEquals(720, computeFactorial(6));
//      assertEquals(1, computeFactorial(0));
//      assertEquals(1, computeFactorial(1));
//      assertEquals(2, computeFactorial(2));
      //muốn xanh, thì tất cả phải xanh, đóng hết cho mọi case
      //nếu tất cà xanh, có thằng đỏ, coi như cả đám đỏ
      //vì hàm ý: code phải chạy đúng chpo mọi tình huống
      //
  
    
}
      @Test(expected = IllegalArgumentException.class) //annotation, dấu hiệu báo cho JVM và thư viện jar liên quan biết cần phải làm gì
      //quen biết cần phải làm gì
      public void testFailedCases(){
          //tao kì vọng mày ném ra ngoại lệ thì coi như code của mày ngon
//          computeFactorial(-5);
          computeFactorial(16);
          //ngoại lệ ko phải là 1 value để có thể so sánh dc
          //nên mình ko có xài hàm assertEqual() dc
          //vì hàm này càn 2 value expected và actual
          // trong khi dò ném ra ngoại lệ ko phải là actual value để so sánh
          //là ngoãi lệm ình cần ko
          //code có thể lỗi logic nhưng clean and build luôn ra file .jar
          //vậy thì nguy hiểm quá
          //mình cần disable cái nút clean and build nến code còn đỏ
          //tức là error logic
          //nhớ 2 con số: 1005 Netbeans 8, 1204 : NetBeans 10 trở lên
          //khi chới với Ant project
  }
}