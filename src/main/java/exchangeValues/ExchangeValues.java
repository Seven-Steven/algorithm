package exchangeValues;

import org.junit.Assert;

/**
 * @description: 模板方法, 具体实现类需要继承此抽象类并实现其 method 方法
 * @author: Seven-Steven
 * @create: 2018-11-25 15:43
 **/
public abstract class ExchangeValues {
  /**
   * @Description: 交换长度为 2 的整型数组的元素位置
   * @Param: [value] 长度为 2 的整型数组
   * @Return: int[] 交换元素位置后的数组
   * @Author: Seven-Steven
   * @Date: 18-11-25
   **/
  public abstract int[] method(int[] value);

  public void test() {
    int[] before = {1, 2}, after = {2, 1};
    Assert.assertArrayEquals(after, method(before));

    before[0] = Integer.MAX_VALUE;
    before[1] = 1;
    after[0] = 1;
    after[1] = Integer.MAX_VALUE;
    Assert.assertArrayEquals(after, method(before));

    int count = 100000000;
    long start = System.currentTimeMillis();
    for (int i = 0; i < count; i++) {
      method(before);
    }
    long end = System.currentTimeMillis();
    System.out.println("==============================================================");
    System.out.println(getClass() + " 执行 " + count + " 次共耗时: " + (end - start) + " ms");
    System.out.println("==============================================================");
  }
}
