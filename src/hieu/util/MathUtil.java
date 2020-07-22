/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieu.util;

/**
 *
 * @author trant
 */
//đây là class chứa các hàng toán hoc tính toán với mục tiêu xài chung
// cho các nơi khác, phàm cái gì mang tính xài chung, ta sẽ dùng static

public class MathUtil {
    //tính n! = 1,2,3,4,..n
    //nt chỉ tối đa 2 ký tự, nên ta xia long mới an toàn
    //thực ra 15! là to lắm nẹn tính giai thừa từ 16 trở lại
    public static long computeFactorial(int n){
        if (n< 0||n>15) {
            throw new IllegalArgumentException("Invalid number >=0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }
    
}
