/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;
import static hieu.util.MathUtil.computeFactorial;
/**
 *
 * @author trant
 */
public class MathUtil {
    public static void main(String[] args) {
        System.out.println("5! = " + computeFactorial(5));
        
        //hy vong ham tra ve mot neu tinh 1 giai thua
        //expected 1 if cf(1)
        //expected 1 if cf(0)
        System.out.println("1!  = " + computeFactorial(1));
        System.out.println("0! = " + computeFactorial(0));
        //ecpected exception if cf(-5)
        System.out.println("-5! = " + computeFactorial(-5));
    }
}
