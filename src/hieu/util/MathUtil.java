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
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result += 1;
        }
        return result;
    }
    
}