package exchangeValues.seven;

import exchangeValues.ExchangeValues;
import org.junit.Test;

/**
 * @description: 通过位运算交换两个变量的值
 * @author: Seven-Steven
 * @create: 2018-11-25 15:49
 **/
public class Method1 extends ExchangeValues {
  /**
   * @Description: 通过位运算交换两个变量的值
   * @Param: [value] 换值前的数组
   * @Return: int[] 换值后的数组
   * @Author: Seven-Steven
   * @Date: 18-11-25
   **/
  @Override
  public int[] method(int[] value) {
    value[0] = value[0] ^ value[1];
    value[1] = value[0] ^ value[1];
    value[0] = value[0] ^ value[1];
    return value;
  }

  @Test
  @Override
  public void test() {
    super.test();
  }
}
