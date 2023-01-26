import edu.uwm.cs351.util.SortUtils;

import junit.framework.TestCase;

public class TestExhaustive extends TestCase {
  private SortUtils<String> su;
  private String s1, s2, s3, s4, s5, s6;

  @Override
  protected void setUp() {
    s1 = "Aron";
    s2 = "Bobi";
    s3 = "Cris";
    s4 = "Dane";
    s5 = "Elie";
    s6 = "Fran";
    su = new SortUtils<>(String::compareTo);
   }

  public void test1001() {
    String[] array = new String[]{s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
  }

  public void test2001() {
    String[] array = new String[]{s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
  }

  public void test2002() {
    String[] array = new String[]{s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
  }

  public void test3001() {
    String[] array = new String[]{s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
  }

  public void test3002() {
    String[] array = new String[]{s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
  }

  public void test3003() {
    String[] array = new String[]{s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
  }

  public void test3004() {
    String[] array = new String[]{s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
  }

  public void test3005() {
    String[] array = new String[]{s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
  }

  public void test3006() {
    String[] array = new String[]{s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
  }

  public void test4001() {
    String[] array = new String[]{s1, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4002() {
    String[] array = new String[]{s2, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4003() {
    String[] array = new String[]{s3, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4004() {
    String[] array = new String[]{s1, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4005() {
    String[] array = new String[]{s2, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4006() {
    String[] array = new String[]{s3, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4007() {
    String[] array = new String[]{s4, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4008() {
    String[] array = new String[]{s2, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4009() {
    String[] array = new String[]{s1, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4010() {
    String[] array = new String[]{s4, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4011() {
    String[] array = new String[]{s2, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4012() {
    String[] array = new String[]{s1, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4013() {
    String[] array = new String[]{s1, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4014() {
    String[] array = new String[]{s3, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4015() {
    String[] array = new String[]{s4, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4016() {
    String[] array = new String[]{s1, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4017() {
    String[] array = new String[]{s3, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4018() {
    String[] array = new String[]{s4, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4019() {
    String[] array = new String[]{s4, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4020() {
    String[] array = new String[]{s3, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4021() {
    String[] array = new String[]{s2, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4022() {
    String[] array = new String[]{s4, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4023() {
    String[] array = new String[]{s3, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test4024() {
    String[] array = new String[]{s2, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
  }

  public void test5001() {
    String[] array = new String[]{s1, s2, s3, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5002() {
    String[] array = new String[]{s2, s1, s3, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5003() {
    String[] array = new String[]{s3, s1, s2, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5004() {
    String[] array = new String[]{s1, s3, s2, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5005() {
    String[] array = new String[]{s2, s3, s1, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5006() {
    String[] array = new String[]{s3, s2, s1, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5007() {
    String[] array = new String[]{s4, s2, s1, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5008() {
    String[] array = new String[]{s2, s4, s1, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5009() {
    String[] array = new String[]{s1, s4, s2, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5010() {
    String[] array = new String[]{s4, s1, s2, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5011() {
    String[] array = new String[]{s2, s1, s4, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5012() {
    String[] array = new String[]{s1, s2, s4, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5013() {
    String[] array = new String[]{s1, s3, s4, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5014() {
    String[] array = new String[]{s3, s1, s4, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5015() {
    String[] array = new String[]{s4, s1, s3, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5016() {
    String[] array = new String[]{s1, s4, s3, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5017() {
    String[] array = new String[]{s3, s4, s1, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5018() {
    String[] array = new String[]{s4, s3, s1, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5019() {
    String[] array = new String[]{s4, s3, s2, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5020() {
    String[] array = new String[]{s3, s4, s2, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5021() {
    String[] array = new String[]{s2, s4, s3, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5022() {
    String[] array = new String[]{s4, s2, s3, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5023() {
    String[] array = new String[]{s3, s2, s4, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5024() {
    String[] array = new String[]{s2, s3, s4, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5025() {
    String[] array = new String[]{s5, s3, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5026() {
    String[] array = new String[]{s3, s5, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5027() {
    String[] array = new String[]{s4, s5, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5028() {
    String[] array = new String[]{s5, s4, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5029() {
    String[] array = new String[]{s3, s4, s5, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5030() {
    String[] array = new String[]{s4, s3, s5, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5031() {
    String[] array = new String[]{s1, s3, s5, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5032() {
    String[] array = new String[]{s3, s1, s5, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5033() {
    String[] array = new String[]{s5, s1, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5034() {
    String[] array = new String[]{s1, s5, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5035() {
    String[] array = new String[]{s3, s5, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5036() {
    String[] array = new String[]{s5, s3, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5037() {
    String[] array = new String[]{s5, s4, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5038() {
    String[] array = new String[]{s4, s5, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5039() {
    String[] array = new String[]{s1, s5, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5040() {
    String[] array = new String[]{s5, s1, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5041() {
    String[] array = new String[]{s4, s1, s5, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5042() {
    String[] array = new String[]{s1, s4, s5, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5043() {
    String[] array = new String[]{s1, s4, s3, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5044() {
    String[] array = new String[]{s4, s1, s3, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5045() {
    String[] array = new String[]{s3, s1, s4, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5046() {
    String[] array = new String[]{s1, s3, s4, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5047() {
    String[] array = new String[]{s4, s3, s1, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5048() {
    String[] array = new String[]{s3, s4, s1, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5049() {
    String[] array = new String[]{s2, s4, s1, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5050() {
    String[] array = new String[]{s4, s2, s1, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5051() {
    String[] array = new String[]{s1, s2, s4, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5052() {
    String[] array = new String[]{s2, s1, s4, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5053() {
    String[] array = new String[]{s4, s1, s2, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5054() {
    String[] array = new String[]{s1, s4, s2, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5055() {
    String[] array = new String[]{s5, s4, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5056() {
    String[] array = new String[]{s4, s5, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5057() {
    String[] array = new String[]{s2, s5, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5058() {
    String[] array = new String[]{s5, s2, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5059() {
    String[] array = new String[]{s4, s2, s5, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5060() {
    String[] array = new String[]{s2, s4, s5, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5061() {
    String[] array = new String[]{s2, s1, s5, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5062() {
    String[] array = new String[]{s1, s2, s5, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5063() {
    String[] array = new String[]{s5, s2, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5064() {
    String[] array = new String[]{s2, s5, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5065() {
    String[] array = new String[]{s1, s5, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5066() {
    String[] array = new String[]{s5, s1, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5067() {
    String[] array = new String[]{s5, s1, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5068() {
    String[] array = new String[]{s1, s5, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5069() {
    String[] array = new String[]{s4, s5, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5070() {
    String[] array = new String[]{s5, s4, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5071() {
    String[] array = new String[]{s1, s4, s5, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5072() {
    String[] array = new String[]{s4, s1, s5, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5073() {
    String[] array = new String[]{s3, s1, s5, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5074() {
    String[] array = new String[]{s1, s3, s5, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5075() {
    String[] array = new String[]{s5, s3, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5076() {
    String[] array = new String[]{s3, s5, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5077() {
    String[] array = new String[]{s1, s5, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5078() {
    String[] array = new String[]{s5, s1, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5079() {
    String[] array = new String[]{s2, s1, s3, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5080() {
    String[] array = new String[]{s1, s2, s3, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5081() {
    String[] array = new String[]{s3, s2, s1, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5082() {
    String[] array = new String[]{s2, s3, s1, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5083() {
    String[] array = new String[]{s1, s3, s2, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5084() {
    String[] array = new String[]{s3, s1, s2, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5085() {
    String[] array = new String[]{s3, s5, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5086() {
    String[] array = new String[]{s5, s3, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5087() {
    String[] array = new String[]{s2, s3, s5, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5088() {
    String[] array = new String[]{s3, s2, s5, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5089() {
    String[] array = new String[]{s5, s2, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5090() {
    String[] array = new String[]{s2, s5, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5091() {
    String[] array = new String[]{s2, s5, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5092() {
    String[] array = new String[]{s5, s2, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5093() {
    String[] array = new String[]{s1, s2, s5, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5094() {
    String[] array = new String[]{s2, s1, s5, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5095() {
    String[] array = new String[]{s5, s1, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5096() {
    String[] array = new String[]{s1, s5, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5097() {
    String[] array = new String[]{s4, s5, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5098() {
    String[] array = new String[]{s5, s4, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5099() {
    String[] array = new String[]{s2, s4, s5, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5100() {
    String[] array = new String[]{s4, s2, s5, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5101() {
    String[] array = new String[]{s5, s2, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5102() {
    String[] array = new String[]{s2, s5, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5103() {
    String[] array = new String[]{s3, s5, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5104() {
    String[] array = new String[]{s5, s3, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5105() {
    String[] array = new String[]{s4, s3, s5, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5106() {
    String[] array = new String[]{s3, s4, s5, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5107() {
    String[] array = new String[]{s5, s4, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5108() {
    String[] array = new String[]{s4, s5, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5109() {
    String[] array = new String[]{s4, s2, s3, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5110() {
    String[] array = new String[]{s2, s4, s3, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5111() {
    String[] array = new String[]{s3, s4, s2, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5112() {
    String[] array = new String[]{s4, s3, s2, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5113() {
    String[] array = new String[]{s2, s3, s4, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5114() {
    String[] array = new String[]{s3, s2, s4, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5115() {
    String[] array = new String[]{s3, s2, s5, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5116() {
    String[] array = new String[]{s2, s3, s5, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5117() {
    String[] array = new String[]{s5, s3, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5118() {
    String[] array = new String[]{s3, s5, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5119() {
    String[] array = new String[]{s2, s5, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test5120() {
    String[] array = new String[]{s5, s2, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
  }

  public void test6001() {
    String[] array = new String[]{s1, s2, s3, s4, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6002() {
    String[] array = new String[]{s2, s1, s3, s4, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6003() {
    String[] array = new String[]{s3, s1, s2, s4, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6004() {
    String[] array = new String[]{s1, s3, s2, s4, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6005() {
    String[] array = new String[]{s2, s3, s1, s4, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6006() {
    String[] array = new String[]{s3, s2, s1, s4, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6007() {
    String[] array = new String[]{s4, s2, s1, s3, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6008() {
    String[] array = new String[]{s2, s4, s1, s3, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6009() {
    String[] array = new String[]{s1, s4, s2, s3, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6010() {
    String[] array = new String[]{s4, s1, s2, s3, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6011() {
    String[] array = new String[]{s2, s1, s4, s3, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6012() {
    String[] array = new String[]{s1, s2, s4, s3, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6013() {
    String[] array = new String[]{s1, s3, s4, s2, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6014() {
    String[] array = new String[]{s3, s1, s4, s2, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6015() {
    String[] array = new String[]{s4, s1, s3, s2, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6016() {
    String[] array = new String[]{s1, s4, s3, s2, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6017() {
    String[] array = new String[]{s3, s4, s1, s2, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6018() {
    String[] array = new String[]{s4, s3, s1, s2, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6019() {
    String[] array = new String[]{s4, s3, s2, s1, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6020() {
    String[] array = new String[]{s3, s4, s2, s1, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6021() {
    String[] array = new String[]{s2, s4, s3, s1, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6022() {
    String[] array = new String[]{s4, s2, s3, s1, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6023() {
    String[] array = new String[]{s3, s2, s4, s1, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6024() {
    String[] array = new String[]{s2, s3, s4, s1, s5, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6025() {
    String[] array = new String[]{s5, s3, s4, s1, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6026() {
    String[] array = new String[]{s3, s5, s4, s1, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6027() {
    String[] array = new String[]{s4, s5, s3, s1, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6028() {
    String[] array = new String[]{s5, s4, s3, s1, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6029() {
    String[] array = new String[]{s3, s4, s5, s1, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6030() {
    String[] array = new String[]{s4, s3, s5, s1, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6031() {
    String[] array = new String[]{s1, s3, s5, s4, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6032() {
    String[] array = new String[]{s3, s1, s5, s4, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6033() {
    String[] array = new String[]{s5, s1, s3, s4, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6034() {
    String[] array = new String[]{s1, s5, s3, s4, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6035() {
    String[] array = new String[]{s3, s5, s1, s4, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6036() {
    String[] array = new String[]{s5, s3, s1, s4, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6037() {
    String[] array = new String[]{s5, s4, s1, s3, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6038() {
    String[] array = new String[]{s4, s5, s1, s3, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6039() {
    String[] array = new String[]{s1, s5, s4, s3, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6040() {
    String[] array = new String[]{s5, s1, s4, s3, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6041() {
    String[] array = new String[]{s4, s1, s5, s3, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6042() {
    String[] array = new String[]{s1, s4, s5, s3, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6043() {
    String[] array = new String[]{s1, s4, s3, s5, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6044() {
    String[] array = new String[]{s4, s1, s3, s5, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6045() {
    String[] array = new String[]{s3, s1, s4, s5, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6046() {
    String[] array = new String[]{s1, s3, s4, s5, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6047() {
    String[] array = new String[]{s4, s3, s1, s5, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6048() {
    String[] array = new String[]{s3, s4, s1, s5, s2, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6049() {
    String[] array = new String[]{s2, s4, s1, s5, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6050() {
    String[] array = new String[]{s4, s2, s1, s5, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6051() {
    String[] array = new String[]{s1, s2, s4, s5, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6052() {
    String[] array = new String[]{s2, s1, s4, s5, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6053() {
    String[] array = new String[]{s4, s1, s2, s5, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6054() {
    String[] array = new String[]{s1, s4, s2, s5, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6055() {
    String[] array = new String[]{s5, s4, s2, s1, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6056() {
    String[] array = new String[]{s4, s5, s2, s1, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6057() {
    String[] array = new String[]{s2, s5, s4, s1, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6058() {
    String[] array = new String[]{s5, s2, s4, s1, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6059() {
    String[] array = new String[]{s4, s2, s5, s1, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6060() {
    String[] array = new String[]{s2, s4, s5, s1, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6061() {
    String[] array = new String[]{s2, s1, s5, s4, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6062() {
    String[] array = new String[]{s1, s2, s5, s4, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6063() {
    String[] array = new String[]{s5, s2, s1, s4, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6064() {
    String[] array = new String[]{s2, s5, s1, s4, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6065() {
    String[] array = new String[]{s1, s5, s2, s4, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6066() {
    String[] array = new String[]{s5, s1, s2, s4, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6067() {
    String[] array = new String[]{s5, s1, s4, s2, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6068() {
    String[] array = new String[]{s1, s5, s4, s2, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6069() {
    String[] array = new String[]{s4, s5, s1, s2, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6070() {
    String[] array = new String[]{s5, s4, s1, s2, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6071() {
    String[] array = new String[]{s1, s4, s5, s2, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6072() {
    String[] array = new String[]{s4, s1, s5, s2, s3, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6073() {
    String[] array = new String[]{s3, s1, s5, s2, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6074() {
    String[] array = new String[]{s1, s3, s5, s2, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6075() {
    String[] array = new String[]{s5, s3, s1, s2, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6076() {
    String[] array = new String[]{s3, s5, s1, s2, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6077() {
    String[] array = new String[]{s1, s5, s3, s2, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6078() {
    String[] array = new String[]{s5, s1, s3, s2, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6079() {
    String[] array = new String[]{s2, s1, s3, s5, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6080() {
    String[] array = new String[]{s1, s2, s3, s5, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6081() {
    String[] array = new String[]{s3, s2, s1, s5, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6082() {
    String[] array = new String[]{s2, s3, s1, s5, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6083() {
    String[] array = new String[]{s1, s3, s2, s5, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6084() {
    String[] array = new String[]{s3, s1, s2, s5, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6085() {
    String[] array = new String[]{s3, s5, s2, s1, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6086() {
    String[] array = new String[]{s5, s3, s2, s1, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6087() {
    String[] array = new String[]{s2, s3, s5, s1, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6088() {
    String[] array = new String[]{s3, s2, s5, s1, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6089() {
    String[] array = new String[]{s5, s2, s3, s1, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6090() {
    String[] array = new String[]{s2, s5, s3, s1, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6091() {
    String[] array = new String[]{s2, s5, s1, s3, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6092() {
    String[] array = new String[]{s5, s2, s1, s3, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6093() {
    String[] array = new String[]{s1, s2, s5, s3, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6094() {
    String[] array = new String[]{s2, s1, s5, s3, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6095() {
    String[] array = new String[]{s5, s1, s2, s3, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6096() {
    String[] array = new String[]{s1, s5, s2, s3, s4, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6097() {
    String[] array = new String[]{s4, s5, s2, s3, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6098() {
    String[] array = new String[]{s5, s4, s2, s3, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6099() {
    String[] array = new String[]{s2, s4, s5, s3, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6100() {
    String[] array = new String[]{s4, s2, s5, s3, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6101() {
    String[] array = new String[]{s5, s2, s4, s3, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6102() {
    String[] array = new String[]{s2, s5, s4, s3, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6103() {
    String[] array = new String[]{s3, s5, s4, s2, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6104() {
    String[] array = new String[]{s5, s3, s4, s2, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6105() {
    String[] array = new String[]{s4, s3, s5, s2, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6106() {
    String[] array = new String[]{s3, s4, s5, s2, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6107() {
    String[] array = new String[]{s5, s4, s3, s2, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6108() {
    String[] array = new String[]{s4, s5, s3, s2, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6109() {
    String[] array = new String[]{s4, s2, s3, s5, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6110() {
    String[] array = new String[]{s2, s4, s3, s5, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6111() {
    String[] array = new String[]{s3, s4, s2, s5, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6112() {
    String[] array = new String[]{s4, s3, s2, s5, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6113() {
    String[] array = new String[]{s2, s3, s4, s5, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6114() {
    String[] array = new String[]{s3, s2, s4, s5, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6115() {
    String[] array = new String[]{s3, s2, s5, s4, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6116() {
    String[] array = new String[]{s2, s3, s5, s4, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6117() {
    String[] array = new String[]{s5, s3, s2, s4, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6118() {
    String[] array = new String[]{s3, s5, s2, s4, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6119() {
    String[] array = new String[]{s2, s5, s3, s4, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6120() {
    String[] array = new String[]{s5, s2, s3, s4, s1, s6};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6121() {
    String[] array = new String[]{s6, s2, s3, s4, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6122() {
    String[] array = new String[]{s2, s6, s3, s4, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6123() {
    String[] array = new String[]{s3, s6, s2, s4, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6124() {
    String[] array = new String[]{s6, s3, s2, s4, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6125() {
    String[] array = new String[]{s2, s3, s6, s4, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6126() {
    String[] array = new String[]{s3, s2, s6, s4, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6127() {
    String[] array = new String[]{s4, s2, s6, s3, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6128() {
    String[] array = new String[]{s2, s4, s6, s3, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6129() {
    String[] array = new String[]{s6, s4, s2, s3, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6130() {
    String[] array = new String[]{s4, s6, s2, s3, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6131() {
    String[] array = new String[]{s2, s6, s4, s3, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6132() {
    String[] array = new String[]{s6, s2, s4, s3, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6133() {
    String[] array = new String[]{s6, s3, s4, s2, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6134() {
    String[] array = new String[]{s3, s6, s4, s2, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6135() {
    String[] array = new String[]{s4, s6, s3, s2, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6136() {
    String[] array = new String[]{s6, s4, s3, s2, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6137() {
    String[] array = new String[]{s3, s4, s6, s2, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6138() {
    String[] array = new String[]{s4, s3, s6, s2, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6139() {
    String[] array = new String[]{s4, s3, s2, s6, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6140() {
    String[] array = new String[]{s3, s4, s2, s6, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6141() {
    String[] array = new String[]{s2, s4, s3, s6, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6142() {
    String[] array = new String[]{s4, s2, s3, s6, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6143() {
    String[] array = new String[]{s3, s2, s4, s6, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6144() {
    String[] array = new String[]{s2, s3, s4, s6, s1, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6145() {
    String[] array = new String[]{s1, s3, s4, s6, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6146() {
    String[] array = new String[]{s3, s1, s4, s6, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6147() {
    String[] array = new String[]{s4, s1, s3, s6, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6148() {
    String[] array = new String[]{s1, s4, s3, s6, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6149() {
    String[] array = new String[]{s3, s4, s1, s6, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6150() {
    String[] array = new String[]{s4, s3, s1, s6, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6151() {
    String[] array = new String[]{s6, s3, s1, s4, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6152() {
    String[] array = new String[]{s3, s6, s1, s4, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6153() {
    String[] array = new String[]{s1, s6, s3, s4, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6154() {
    String[] array = new String[]{s6, s1, s3, s4, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6155() {
    String[] array = new String[]{s3, s1, s6, s4, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6156() {
    String[] array = new String[]{s1, s3, s6, s4, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6157() {
    String[] array = new String[]{s1, s4, s6, s3, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6158() {
    String[] array = new String[]{s4, s1, s6, s3, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6159() {
    String[] array = new String[]{s6, s1, s4, s3, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6160() {
    String[] array = new String[]{s1, s6, s4, s3, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6161() {
    String[] array = new String[]{s4, s6, s1, s3, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6162() {
    String[] array = new String[]{s6, s4, s1, s3, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6163() {
    String[] array = new String[]{s6, s4, s3, s1, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6164() {
    String[] array = new String[]{s4, s6, s3, s1, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6165() {
    String[] array = new String[]{s3, s6, s4, s1, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6166() {
    String[] array = new String[]{s6, s3, s4, s1, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6167() {
    String[] array = new String[]{s4, s3, s6, s1, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6168() {
    String[] array = new String[]{s3, s4, s6, s1, s2, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6169() {
    String[] array = new String[]{s2, s4, s6, s1, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6170() {
    String[] array = new String[]{s4, s2, s6, s1, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6171() {
    String[] array = new String[]{s6, s2, s4, s1, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6172() {
    String[] array = new String[]{s2, s6, s4, s1, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6173() {
    String[] array = new String[]{s4, s6, s2, s1, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6174() {
    String[] array = new String[]{s6, s4, s2, s1, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6175() {
    String[] array = new String[]{s1, s4, s2, s6, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6176() {
    String[] array = new String[]{s4, s1, s2, s6, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6177() {
    String[] array = new String[]{s2, s1, s4, s6, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6178() {
    String[] array = new String[]{s1, s2, s4, s6, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6179() {
    String[] array = new String[]{s4, s2, s1, s6, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6180() {
    String[] array = new String[]{s2, s4, s1, s6, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6181() {
    String[] array = new String[]{s2, s6, s1, s4, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6182() {
    String[] array = new String[]{s6, s2, s1, s4, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6183() {
    String[] array = new String[]{s1, s2, s6, s4, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6184() {
    String[] array = new String[]{s2, s1, s6, s4, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6185() {
    String[] array = new String[]{s6, s1, s2, s4, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6186() {
    String[] array = new String[]{s1, s6, s2, s4, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6187() {
    String[] array = new String[]{s1, s6, s4, s2, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6188() {
    String[] array = new String[]{s6, s1, s4, s2, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6189() {
    String[] array = new String[]{s4, s1, s6, s2, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6190() {
    String[] array = new String[]{s1, s4, s6, s2, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6191() {
    String[] array = new String[]{s6, s4, s1, s2, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6192() {
    String[] array = new String[]{s4, s6, s1, s2, s3, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6193() {
    String[] array = new String[]{s3, s6, s1, s2, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6194() {
    String[] array = new String[]{s6, s3, s1, s2, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6195() {
    String[] array = new String[]{s1, s3, s6, s2, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6196() {
    String[] array = new String[]{s3, s1, s6, s2, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6197() {
    String[] array = new String[]{s6, s1, s3, s2, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6198() {
    String[] array = new String[]{s1, s6, s3, s2, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6199() {
    String[] array = new String[]{s2, s6, s3, s1, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6200() {
    String[] array = new String[]{s6, s2, s3, s1, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6201() {
    String[] array = new String[]{s3, s2, s6, s1, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6202() {
    String[] array = new String[]{s2, s3, s6, s1, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6203() {
    String[] array = new String[]{s6, s3, s2, s1, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6204() {
    String[] array = new String[]{s3, s6, s2, s1, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6205() {
    String[] array = new String[]{s3, s1, s2, s6, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6206() {
    String[] array = new String[]{s1, s3, s2, s6, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6207() {
    String[] array = new String[]{s2, s3, s1, s6, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6208() {
    String[] array = new String[]{s3, s2, s1, s6, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6209() {
    String[] array = new String[]{s1, s2, s3, s6, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6210() {
    String[] array = new String[]{s2, s1, s3, s6, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6211() {
    String[] array = new String[]{s2, s1, s6, s3, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6212() {
    String[] array = new String[]{s1, s2, s6, s3, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6213() {
    String[] array = new String[]{s6, s2, s1, s3, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6214() {
    String[] array = new String[]{s2, s6, s1, s3, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6215() {
    String[] array = new String[]{s1, s6, s2, s3, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6216() {
    String[] array = new String[]{s6, s1, s2, s3, s4, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6217() {
    String[] array = new String[]{s4, s1, s2, s3, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6218() {
    String[] array = new String[]{s1, s4, s2, s3, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6219() {
    String[] array = new String[]{s2, s4, s1, s3, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6220() {
    String[] array = new String[]{s4, s2, s1, s3, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6221() {
    String[] array = new String[]{s1, s2, s4, s3, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6222() {
    String[] array = new String[]{s2, s1, s4, s3, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6223() {
    String[] array = new String[]{s3, s1, s4, s2, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6224() {
    String[] array = new String[]{s1, s3, s4, s2, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6225() {
    String[] array = new String[]{s4, s3, s1, s2, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6226() {
    String[] array = new String[]{s3, s4, s1, s2, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6227() {
    String[] array = new String[]{s1, s4, s3, s2, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6228() {
    String[] array = new String[]{s4, s1, s3, s2, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6229() {
    String[] array = new String[]{s4, s2, s3, s1, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6230() {
    String[] array = new String[]{s2, s4, s3, s1, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6231() {
    String[] array = new String[]{s3, s4, s2, s1, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6232() {
    String[] array = new String[]{s4, s3, s2, s1, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6233() {
    String[] array = new String[]{s2, s3, s4, s1, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6234() {
    String[] array = new String[]{s3, s2, s4, s1, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6235() {
    String[] array = new String[]{s3, s2, s1, s4, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6236() {
    String[] array = new String[]{s2, s3, s1, s4, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6237() {
    String[] array = new String[]{s1, s3, s2, s4, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6238() {
    String[] array = new String[]{s3, s1, s2, s4, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6239() {
    String[] array = new String[]{s2, s1, s3, s4, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6240() {
    String[] array = new String[]{s1, s2, s3, s4, s6, s5};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6241() {
    String[] array = new String[]{s1, s5, s3, s4, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6242() {
    String[] array = new String[]{s5, s1, s3, s4, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6243() {
    String[] array = new String[]{s3, s1, s5, s4, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6244() {
    String[] array = new String[]{s1, s3, s5, s4, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6245() {
    String[] array = new String[]{s5, s3, s1, s4, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6246() {
    String[] array = new String[]{s3, s5, s1, s4, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6247() {
    String[] array = new String[]{s4, s5, s1, s3, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6248() {
    String[] array = new String[]{s5, s4, s1, s3, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6249() {
    String[] array = new String[]{s1, s4, s5, s3, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6250() {
    String[] array = new String[]{s4, s1, s5, s3, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6251() {
    String[] array = new String[]{s5, s1, s4, s3, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6252() {
    String[] array = new String[]{s1, s5, s4, s3, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6253() {
    String[] array = new String[]{s1, s3, s4, s5, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6254() {
    String[] array = new String[]{s3, s1, s4, s5, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6255() {
    String[] array = new String[]{s4, s1, s3, s5, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6256() {
    String[] array = new String[]{s1, s4, s3, s5, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6257() {
    String[] array = new String[]{s3, s4, s1, s5, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6258() {
    String[] array = new String[]{s4, s3, s1, s5, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6259() {
    String[] array = new String[]{s4, s3, s5, s1, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6260() {
    String[] array = new String[]{s3, s4, s5, s1, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6261() {
    String[] array = new String[]{s5, s4, s3, s1, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6262() {
    String[] array = new String[]{s4, s5, s3, s1, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6263() {
    String[] array = new String[]{s3, s5, s4, s1, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6264() {
    String[] array = new String[]{s5, s3, s4, s1, s6, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6265() {
    String[] array = new String[]{s6, s3, s4, s1, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6266() {
    String[] array = new String[]{s3, s6, s4, s1, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6267() {
    String[] array = new String[]{s4, s6, s3, s1, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6268() {
    String[] array = new String[]{s6, s4, s3, s1, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6269() {
    String[] array = new String[]{s3, s4, s6, s1, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6270() {
    String[] array = new String[]{s4, s3, s6, s1, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6271() {
    String[] array = new String[]{s1, s3, s6, s4, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6272() {
    String[] array = new String[]{s3, s1, s6, s4, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6273() {
    String[] array = new String[]{s6, s1, s3, s4, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6274() {
    String[] array = new String[]{s1, s6, s3, s4, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6275() {
    String[] array = new String[]{s3, s6, s1, s4, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6276() {
    String[] array = new String[]{s6, s3, s1, s4, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6277() {
    String[] array = new String[]{s6, s4, s1, s3, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6278() {
    String[] array = new String[]{s4, s6, s1, s3, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6279() {
    String[] array = new String[]{s1, s6, s4, s3, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6280() {
    String[] array = new String[]{s6, s1, s4, s3, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6281() {
    String[] array = new String[]{s4, s1, s6, s3, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6282() {
    String[] array = new String[]{s1, s4, s6, s3, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6283() {
    String[] array = new String[]{s1, s4, s3, s6, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6284() {
    String[] array = new String[]{s4, s1, s3, s6, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6285() {
    String[] array = new String[]{s3, s1, s4, s6, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6286() {
    String[] array = new String[]{s1, s3, s4, s6, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6287() {
    String[] array = new String[]{s4, s3, s1, s6, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6288() {
    String[] array = new String[]{s3, s4, s1, s6, s5, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6289() {
    String[] array = new String[]{s5, s4, s1, s6, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6290() {
    String[] array = new String[]{s4, s5, s1, s6, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6291() {
    String[] array = new String[]{s1, s5, s4, s6, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6292() {
    String[] array = new String[]{s5, s1, s4, s6, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6293() {
    String[] array = new String[]{s4, s1, s5, s6, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6294() {
    String[] array = new String[]{s1, s4, s5, s6, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6295() {
    String[] array = new String[]{s6, s4, s5, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6296() {
    String[] array = new String[]{s4, s6, s5, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6297() {
    String[] array = new String[]{s5, s6, s4, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6298() {
    String[] array = new String[]{s6, s5, s4, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6299() {
    String[] array = new String[]{s4, s5, s6, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6300() {
    String[] array = new String[]{s5, s4, s6, s1, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6301() {
    String[] array = new String[]{s5, s1, s6, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6302() {
    String[] array = new String[]{s1, s5, s6, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6303() {
    String[] array = new String[]{s6, s5, s1, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6304() {
    String[] array = new String[]{s5, s6, s1, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6305() {
    String[] array = new String[]{s1, s6, s5, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6306() {
    String[] array = new String[]{s6, s1, s5, s4, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6307() {
    String[] array = new String[]{s6, s1, s4, s5, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6308() {
    String[] array = new String[]{s1, s6, s4, s5, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6309() {
    String[] array = new String[]{s4, s6, s1, s5, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6310() {
    String[] array = new String[]{s6, s4, s1, s5, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6311() {
    String[] array = new String[]{s1, s4, s6, s5, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6312() {
    String[] array = new String[]{s4, s1, s6, s5, s3, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6313() {
    String[] array = new String[]{s3, s1, s6, s5, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6314() {
    String[] array = new String[]{s1, s3, s6, s5, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6315() {
    String[] array = new String[]{s6, s3, s1, s5, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6316() {
    String[] array = new String[]{s3, s6, s1, s5, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6317() {
    String[] array = new String[]{s1, s6, s3, s5, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6318() {
    String[] array = new String[]{s6, s1, s3, s5, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6319() {
    String[] array = new String[]{s5, s1, s3, s6, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6320() {
    String[] array = new String[]{s1, s5, s3, s6, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6321() {
    String[] array = new String[]{s3, s5, s1, s6, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6322() {
    String[] array = new String[]{s5, s3, s1, s6, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6323() {
    String[] array = new String[]{s1, s3, s5, s6, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6324() {
    String[] array = new String[]{s3, s1, s5, s6, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6325() {
    String[] array = new String[]{s3, s6, s5, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6326() {
    String[] array = new String[]{s6, s3, s5, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6327() {
    String[] array = new String[]{s5, s3, s6, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6328() {
    String[] array = new String[]{s3, s5, s6, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6329() {
    String[] array = new String[]{s6, s5, s3, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6330() {
    String[] array = new String[]{s5, s6, s3, s1, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6331() {
    String[] array = new String[]{s5, s6, s1, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6332() {
    String[] array = new String[]{s6, s5, s1, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6333() {
    String[] array = new String[]{s1, s5, s6, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6334() {
    String[] array = new String[]{s5, s1, s6, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6335() {
    String[] array = new String[]{s6, s1, s5, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6336() {
    String[] array = new String[]{s1, s6, s5, s3, s4, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6337() {
    String[] array = new String[]{s4, s6, s5, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6338() {
    String[] array = new String[]{s6, s4, s5, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6339() {
    String[] array = new String[]{s5, s4, s6, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6340() {
    String[] array = new String[]{s4, s5, s6, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6341() {
    String[] array = new String[]{s6, s5, s4, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6342() {
    String[] array = new String[]{s5, s6, s4, s3, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6343() {
    String[] array = new String[]{s3, s6, s4, s5, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6344() {
    String[] array = new String[]{s6, s3, s4, s5, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6345() {
    String[] array = new String[]{s4, s3, s6, s5, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6346() {
    String[] array = new String[]{s3, s4, s6, s5, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6347() {
    String[] array = new String[]{s6, s4, s3, s5, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6348() {
    String[] array = new String[]{s4, s6, s3, s5, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6349() {
    String[] array = new String[]{s4, s5, s3, s6, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6350() {
    String[] array = new String[]{s5, s4, s3, s6, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6351() {
    String[] array = new String[]{s3, s4, s5, s6, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6352() {
    String[] array = new String[]{s4, s3, s5, s6, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6353() {
    String[] array = new String[]{s5, s3, s4, s6, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6354() {
    String[] array = new String[]{s3, s5, s4, s6, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6355() {
    String[] array = new String[]{s3, s5, s6, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6356() {
    String[] array = new String[]{s5, s3, s6, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6357() {
    String[] array = new String[]{s6, s3, s5, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6358() {
    String[] array = new String[]{s3, s6, s5, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6359() {
    String[] array = new String[]{s5, s6, s3, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6360() {
    String[] array = new String[]{s6, s5, s3, s4, s1, s2};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6361() {
    String[] array = new String[]{s6, s5, s2, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6362() {
    String[] array = new String[]{s5, s6, s2, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6363() {
    String[] array = new String[]{s2, s6, s5, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6364() {
    String[] array = new String[]{s6, s2, s5, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6365() {
    String[] array = new String[]{s5, s2, s6, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6366() {
    String[] array = new String[]{s2, s5, s6, s4, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6367() {
    String[] array = new String[]{s4, s5, s6, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6368() {
    String[] array = new String[]{s5, s4, s6, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6369() {
    String[] array = new String[]{s6, s4, s5, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6370() {
    String[] array = new String[]{s4, s6, s5, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6371() {
    String[] array = new String[]{s5, s6, s4, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6372() {
    String[] array = new String[]{s6, s5, s4, s2, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6373() {
    String[] array = new String[]{s6, s2, s4, s5, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6374() {
    String[] array = new String[]{s2, s6, s4, s5, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6375() {
    String[] array = new String[]{s4, s6, s2, s5, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6376() {
    String[] array = new String[]{s6, s4, s2, s5, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6377() {
    String[] array = new String[]{s2, s4, s6, s5, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6378() {
    String[] array = new String[]{s4, s2, s6, s5, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6379() {
    String[] array = new String[]{s4, s2, s5, s6, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6380() {
    String[] array = new String[]{s2, s4, s5, s6, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6381() {
    String[] array = new String[]{s5, s4, s2, s6, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6382() {
    String[] array = new String[]{s4, s5, s2, s6, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6383() {
    String[] array = new String[]{s2, s5, s4, s6, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6384() {
    String[] array = new String[]{s5, s2, s4, s6, s1, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6385() {
    String[] array = new String[]{s1, s2, s4, s6, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6386() {
    String[] array = new String[]{s2, s1, s4, s6, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6387() {
    String[] array = new String[]{s4, s1, s2, s6, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6388() {
    String[] array = new String[]{s1, s4, s2, s6, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6389() {
    String[] array = new String[]{s2, s4, s1, s6, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6390() {
    String[] array = new String[]{s4, s2, s1, s6, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6391() {
    String[] array = new String[]{s6, s2, s1, s4, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6392() {
    String[] array = new String[]{s2, s6, s1, s4, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6393() {
    String[] array = new String[]{s1, s6, s2, s4, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6394() {
    String[] array = new String[]{s6, s1, s2, s4, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6395() {
    String[] array = new String[]{s2, s1, s6, s4, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6396() {
    String[] array = new String[]{s1, s2, s6, s4, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6397() {
    String[] array = new String[]{s1, s4, s6, s2, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6398() {
    String[] array = new String[]{s4, s1, s6, s2, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6399() {
    String[] array = new String[]{s6, s1, s4, s2, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6400() {
    String[] array = new String[]{s1, s6, s4, s2, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6401() {
    String[] array = new String[]{s4, s6, s1, s2, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6402() {
    String[] array = new String[]{s6, s4, s1, s2, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6403() {
    String[] array = new String[]{s6, s4, s2, s1, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6404() {
    String[] array = new String[]{s4, s6, s2, s1, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6405() {
    String[] array = new String[]{s2, s6, s4, s1, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6406() {
    String[] array = new String[]{s6, s2, s4, s1, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6407() {
    String[] array = new String[]{s4, s2, s6, s1, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6408() {
    String[] array = new String[]{s2, s4, s6, s1, s5, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6409() {
    String[] array = new String[]{s5, s4, s6, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6410() {
    String[] array = new String[]{s4, s5, s6, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6411() {
    String[] array = new String[]{s6, s5, s4, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6412() {
    String[] array = new String[]{s5, s6, s4, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6413() {
    String[] array = new String[]{s4, s6, s5, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6414() {
    String[] array = new String[]{s6, s4, s5, s1, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6415() {
    String[] array = new String[]{s1, s4, s5, s6, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6416() {
    String[] array = new String[]{s4, s1, s5, s6, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6417() {
    String[] array = new String[]{s5, s1, s4, s6, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6418() {
    String[] array = new String[]{s1, s5, s4, s6, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6419() {
    String[] array = new String[]{s4, s5, s1, s6, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6420() {
    String[] array = new String[]{s5, s4, s1, s6, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6421() {
    String[] array = new String[]{s5, s6, s1, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6422() {
    String[] array = new String[]{s6, s5, s1, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6423() {
    String[] array = new String[]{s1, s5, s6, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6424() {
    String[] array = new String[]{s5, s1, s6, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6425() {
    String[] array = new String[]{s6, s1, s5, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6426() {
    String[] array = new String[]{s1, s6, s5, s4, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6427() {
    String[] array = new String[]{s1, s6, s4, s5, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6428() {
    String[] array = new String[]{s6, s1, s4, s5, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6429() {
    String[] array = new String[]{s4, s1, s6, s5, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6430() {
    String[] array = new String[]{s1, s4, s6, s5, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6431() {
    String[] array = new String[]{s6, s4, s1, s5, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6432() {
    String[] array = new String[]{s4, s6, s1, s5, s2, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6433() {
    String[] array = new String[]{s2, s6, s1, s5, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6434() {
    String[] array = new String[]{s6, s2, s1, s5, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6435() {
    String[] array = new String[]{s1, s2, s6, s5, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6436() {
    String[] array = new String[]{s2, s1, s6, s5, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6437() {
    String[] array = new String[]{s6, s1, s2, s5, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6438() {
    String[] array = new String[]{s1, s6, s2, s5, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6439() {
    String[] array = new String[]{s5, s6, s2, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6440() {
    String[] array = new String[]{s6, s5, s2, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6441() {
    String[] array = new String[]{s2, s5, s6, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6442() {
    String[] array = new String[]{s5, s2, s6, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6443() {
    String[] array = new String[]{s6, s2, s5, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6444() {
    String[] array = new String[]{s2, s6, s5, s1, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6445() {
    String[] array = new String[]{s2, s1, s5, s6, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6446() {
    String[] array = new String[]{s1, s2, s5, s6, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6447() {
    String[] array = new String[]{s5, s2, s1, s6, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6448() {
    String[] array = new String[]{s2, s5, s1, s6, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6449() {
    String[] array = new String[]{s1, s5, s2, s6, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6450() {
    String[] array = new String[]{s5, s1, s2, s6, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6451() {
    String[] array = new String[]{s5, s1, s6, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6452() {
    String[] array = new String[]{s1, s5, s6, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6453() {
    String[] array = new String[]{s6, s5, s1, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6454() {
    String[] array = new String[]{s5, s6, s1, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6455() {
    String[] array = new String[]{s1, s6, s5, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6456() {
    String[] array = new String[]{s6, s1, s5, s2, s4, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6457() {
    String[] array = new String[]{s4, s1, s5, s2, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6458() {
    String[] array = new String[]{s1, s4, s5, s2, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6459() {
    String[] array = new String[]{s5, s4, s1, s2, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6460() {
    String[] array = new String[]{s4, s5, s1, s2, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6461() {
    String[] array = new String[]{s1, s5, s4, s2, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6462() {
    String[] array = new String[]{s5, s1, s4, s2, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6463() {
    String[] array = new String[]{s2, s1, s4, s5, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6464() {
    String[] array = new String[]{s1, s2, s4, s5, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6465() {
    String[] array = new String[]{s4, s2, s1, s5, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6466() {
    String[] array = new String[]{s2, s4, s1, s5, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6467() {
    String[] array = new String[]{s1, s4, s2, s5, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6468() {
    String[] array = new String[]{s4, s1, s2, s5, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6469() {
    String[] array = new String[]{s4, s5, s2, s1, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6470() {
    String[] array = new String[]{s5, s4, s2, s1, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6471() {
    String[] array = new String[]{s2, s4, s5, s1, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6472() {
    String[] array = new String[]{s4, s2, s5, s1, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6473() {
    String[] array = new String[]{s5, s2, s4, s1, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6474() {
    String[] array = new String[]{s2, s5, s4, s1, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6475() {
    String[] array = new String[]{s2, s5, s1, s4, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6476() {
    String[] array = new String[]{s5, s2, s1, s4, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6477() {
    String[] array = new String[]{s1, s2, s5, s4, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6478() {
    String[] array = new String[]{s2, s1, s5, s4, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6479() {
    String[] array = new String[]{s5, s1, s2, s4, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6480() {
    String[] array = new String[]{s1, s5, s2, s4, s6, s3};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6481() {
    String[] array = new String[]{s1, s5, s2, s3, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6482() {
    String[] array = new String[]{s5, s1, s2, s3, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6483() {
    String[] array = new String[]{s2, s1, s5, s3, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6484() {
    String[] array = new String[]{s1, s2, s5, s3, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6485() {
    String[] array = new String[]{s5, s2, s1, s3, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6486() {
    String[] array = new String[]{s2, s5, s1, s3, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6487() {
    String[] array = new String[]{s3, s5, s1, s2, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6488() {
    String[] array = new String[]{s5, s3, s1, s2, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6489() {
    String[] array = new String[]{s1, s3, s5, s2, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6490() {
    String[] array = new String[]{s3, s1, s5, s2, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6491() {
    String[] array = new String[]{s5, s1, s3, s2, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6492() {
    String[] array = new String[]{s1, s5, s3, s2, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6493() {
    String[] array = new String[]{s1, s2, s3, s5, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6494() {
    String[] array = new String[]{s2, s1, s3, s5, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6495() {
    String[] array = new String[]{s3, s1, s2, s5, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6496() {
    String[] array = new String[]{s1, s3, s2, s5, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6497() {
    String[] array = new String[]{s2, s3, s1, s5, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6498() {
    String[] array = new String[]{s3, s2, s1, s5, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6499() {
    String[] array = new String[]{s3, s2, s5, s1, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6500() {
    String[] array = new String[]{s2, s3, s5, s1, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6501() {
    String[] array = new String[]{s5, s3, s2, s1, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6502() {
    String[] array = new String[]{s3, s5, s2, s1, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6503() {
    String[] array = new String[]{s2, s5, s3, s1, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6504() {
    String[] array = new String[]{s5, s2, s3, s1, s6, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6505() {
    String[] array = new String[]{s6, s2, s3, s1, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6506() {
    String[] array = new String[]{s2, s6, s3, s1, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6507() {
    String[] array = new String[]{s3, s6, s2, s1, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6508() {
    String[] array = new String[]{s6, s3, s2, s1, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6509() {
    String[] array = new String[]{s2, s3, s6, s1, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6510() {
    String[] array = new String[]{s3, s2, s6, s1, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6511() {
    String[] array = new String[]{s1, s2, s6, s3, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6512() {
    String[] array = new String[]{s2, s1, s6, s3, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6513() {
    String[] array = new String[]{s6, s1, s2, s3, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6514() {
    String[] array = new String[]{s1, s6, s2, s3, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6515() {
    String[] array = new String[]{s2, s6, s1, s3, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6516() {
    String[] array = new String[]{s6, s2, s1, s3, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6517() {
    String[] array = new String[]{s6, s3, s1, s2, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6518() {
    String[] array = new String[]{s3, s6, s1, s2, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6519() {
    String[] array = new String[]{s1, s6, s3, s2, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6520() {
    String[] array = new String[]{s6, s1, s3, s2, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6521() {
    String[] array = new String[]{s3, s1, s6, s2, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6522() {
    String[] array = new String[]{s1, s3, s6, s2, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6523() {
    String[] array = new String[]{s1, s3, s2, s6, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6524() {
    String[] array = new String[]{s3, s1, s2, s6, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6525() {
    String[] array = new String[]{s2, s1, s3, s6, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6526() {
    String[] array = new String[]{s1, s2, s3, s6, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6527() {
    String[] array = new String[]{s3, s2, s1, s6, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6528() {
    String[] array = new String[]{s2, s3, s1, s6, s5, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6529() {
    String[] array = new String[]{s5, s3, s1, s6, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6530() {
    String[] array = new String[]{s3, s5, s1, s6, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6531() {
    String[] array = new String[]{s1, s5, s3, s6, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6532() {
    String[] array = new String[]{s5, s1, s3, s6, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6533() {
    String[] array = new String[]{s3, s1, s5, s6, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6534() {
    String[] array = new String[]{s1, s3, s5, s6, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6535() {
    String[] array = new String[]{s6, s3, s5, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6536() {
    String[] array = new String[]{s3, s6, s5, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6537() {
    String[] array = new String[]{s5, s6, s3, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6538() {
    String[] array = new String[]{s6, s5, s3, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6539() {
    String[] array = new String[]{s3, s5, s6, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6540() {
    String[] array = new String[]{s5, s3, s6, s1, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6541() {
    String[] array = new String[]{s5, s1, s6, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6542() {
    String[] array = new String[]{s1, s5, s6, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6543() {
    String[] array = new String[]{s6, s5, s1, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6544() {
    String[] array = new String[]{s5, s6, s1, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6545() {
    String[] array = new String[]{s1, s6, s5, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6546() {
    String[] array = new String[]{s6, s1, s5, s3, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6547() {
    String[] array = new String[]{s6, s1, s3, s5, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6548() {
    String[] array = new String[]{s1, s6, s3, s5, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6549() {
    String[] array = new String[]{s3, s6, s1, s5, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6550() {
    String[] array = new String[]{s6, s3, s1, s5, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6551() {
    String[] array = new String[]{s1, s3, s6, s5, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6552() {
    String[] array = new String[]{s3, s1, s6, s5, s2, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6553() {
    String[] array = new String[]{s2, s1, s6, s5, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6554() {
    String[] array = new String[]{s1, s2, s6, s5, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6555() {
    String[] array = new String[]{s6, s2, s1, s5, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6556() {
    String[] array = new String[]{s2, s6, s1, s5, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6557() {
    String[] array = new String[]{s1, s6, s2, s5, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6558() {
    String[] array = new String[]{s6, s1, s2, s5, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6559() {
    String[] array = new String[]{s5, s1, s2, s6, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6560() {
    String[] array = new String[]{s1, s5, s2, s6, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6561() {
    String[] array = new String[]{s2, s5, s1, s6, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6562() {
    String[] array = new String[]{s5, s2, s1, s6, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6563() {
    String[] array = new String[]{s1, s2, s5, s6, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6564() {
    String[] array = new String[]{s2, s1, s5, s6, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6565() {
    String[] array = new String[]{s2, s6, s5, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6566() {
    String[] array = new String[]{s6, s2, s5, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6567() {
    String[] array = new String[]{s5, s2, s6, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6568() {
    String[] array = new String[]{s2, s5, s6, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6569() {
    String[] array = new String[]{s6, s5, s2, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6570() {
    String[] array = new String[]{s5, s6, s2, s1, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6571() {
    String[] array = new String[]{s5, s6, s1, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6572() {
    String[] array = new String[]{s6, s5, s1, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6573() {
    String[] array = new String[]{s1, s5, s6, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6574() {
    String[] array = new String[]{s5, s1, s6, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6575() {
    String[] array = new String[]{s6, s1, s5, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6576() {
    String[] array = new String[]{s1, s6, s5, s2, s3, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6577() {
    String[] array = new String[]{s3, s6, s5, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6578() {
    String[] array = new String[]{s6, s3, s5, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6579() {
    String[] array = new String[]{s5, s3, s6, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6580() {
    String[] array = new String[]{s3, s5, s6, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6581() {
    String[] array = new String[]{s6, s5, s3, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6582() {
    String[] array = new String[]{s5, s6, s3, s2, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6583() {
    String[] array = new String[]{s2, s6, s3, s5, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6584() {
    String[] array = new String[]{s6, s2, s3, s5, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6585() {
    String[] array = new String[]{s3, s2, s6, s5, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6586() {
    String[] array = new String[]{s2, s3, s6, s5, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6587() {
    String[] array = new String[]{s6, s3, s2, s5, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6588() {
    String[] array = new String[]{s3, s6, s2, s5, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6589() {
    String[] array = new String[]{s3, s5, s2, s6, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6590() {
    String[] array = new String[]{s5, s3, s2, s6, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6591() {
    String[] array = new String[]{s2, s3, s5, s6, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6592() {
    String[] array = new String[]{s3, s2, s5, s6, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6593() {
    String[] array = new String[]{s5, s2, s3, s6, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6594() {
    String[] array = new String[]{s2, s5, s3, s6, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6595() {
    String[] array = new String[]{s2, s5, s6, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6596() {
    String[] array = new String[]{s5, s2, s6, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6597() {
    String[] array = new String[]{s6, s2, s5, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6598() {
    String[] array = new String[]{s2, s6, s5, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6599() {
    String[] array = new String[]{s5, s6, s2, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6600() {
    String[] array = new String[]{s6, s5, s2, s3, s1, s4};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6601() {
    String[] array = new String[]{s6, s5, s2, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6602() {
    String[] array = new String[]{s5, s6, s2, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6603() {
    String[] array = new String[]{s2, s6, s5, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6604() {
    String[] array = new String[]{s6, s2, s5, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6605() {
    String[] array = new String[]{s5, s2, s6, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6606() {
    String[] array = new String[]{s2, s5, s6, s3, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6607() {
    String[] array = new String[]{s3, s5, s6, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6608() {
    String[] array = new String[]{s5, s3, s6, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6609() {
    String[] array = new String[]{s6, s3, s5, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6610() {
    String[] array = new String[]{s3, s6, s5, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6611() {
    String[] array = new String[]{s5, s6, s3, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6612() {
    String[] array = new String[]{s6, s5, s3, s2, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6613() {
    String[] array = new String[]{s6, s2, s3, s5, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6614() {
    String[] array = new String[]{s2, s6, s3, s5, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6615() {
    String[] array = new String[]{s3, s6, s2, s5, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6616() {
    String[] array = new String[]{s6, s3, s2, s5, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6617() {
    String[] array = new String[]{s2, s3, s6, s5, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6618() {
    String[] array = new String[]{s3, s2, s6, s5, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6619() {
    String[] array = new String[]{s3, s2, s5, s6, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6620() {
    String[] array = new String[]{s2, s3, s5, s6, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6621() {
    String[] array = new String[]{s5, s3, s2, s6, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6622() {
    String[] array = new String[]{s3, s5, s2, s6, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6623() {
    String[] array = new String[]{s2, s5, s3, s6, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6624() {
    String[] array = new String[]{s5, s2, s3, s6, s4, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6625() {
    String[] array = new String[]{s4, s2, s3, s6, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6626() {
    String[] array = new String[]{s2, s4, s3, s6, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6627() {
    String[] array = new String[]{s3, s4, s2, s6, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6628() {
    String[] array = new String[]{s4, s3, s2, s6, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6629() {
    String[] array = new String[]{s2, s3, s4, s6, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6630() {
    String[] array = new String[]{s3, s2, s4, s6, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6631() {
    String[] array = new String[]{s6, s2, s4, s3, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6632() {
    String[] array = new String[]{s2, s6, s4, s3, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6633() {
    String[] array = new String[]{s4, s6, s2, s3, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6634() {
    String[] array = new String[]{s6, s4, s2, s3, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6635() {
    String[] array = new String[]{s2, s4, s6, s3, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6636() {
    String[] array = new String[]{s4, s2, s6, s3, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6637() {
    String[] array = new String[]{s4, s3, s6, s2, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6638() {
    String[] array = new String[]{s3, s4, s6, s2, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6639() {
    String[] array = new String[]{s6, s4, s3, s2, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6640() {
    String[] array = new String[]{s4, s6, s3, s2, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6641() {
    String[] array = new String[]{s3, s6, s4, s2, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6642() {
    String[] array = new String[]{s6, s3, s4, s2, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6643() {
    String[] array = new String[]{s6, s3, s2, s4, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6644() {
    String[] array = new String[]{s3, s6, s2, s4, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6645() {
    String[] array = new String[]{s2, s6, s3, s4, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6646() {
    String[] array = new String[]{s6, s2, s3, s4, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6647() {
    String[] array = new String[]{s3, s2, s6, s4, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6648() {
    String[] array = new String[]{s2, s3, s6, s4, s5, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6649() {
    String[] array = new String[]{s5, s3, s6, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6650() {
    String[] array = new String[]{s3, s5, s6, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6651() {
    String[] array = new String[]{s6, s5, s3, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6652() {
    String[] array = new String[]{s5, s6, s3, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6653() {
    String[] array = new String[]{s3, s6, s5, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6654() {
    String[] array = new String[]{s6, s3, s5, s4, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6655() {
    String[] array = new String[]{s4, s3, s5, s6, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6656() {
    String[] array = new String[]{s3, s4, s5, s6, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6657() {
    String[] array = new String[]{s5, s4, s3, s6, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6658() {
    String[] array = new String[]{s4, s5, s3, s6, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6659() {
    String[] array = new String[]{s3, s5, s4, s6, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6660() {
    String[] array = new String[]{s5, s3, s4, s6, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6661() {
    String[] array = new String[]{s5, s6, s4, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6662() {
    String[] array = new String[]{s6, s5, s4, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6663() {
    String[] array = new String[]{s4, s5, s6, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6664() {
    String[] array = new String[]{s5, s4, s6, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6665() {
    String[] array = new String[]{s6, s4, s5, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6666() {
    String[] array = new String[]{s4, s6, s5, s3, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6667() {
    String[] array = new String[]{s4, s6, s3, s5, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6668() {
    String[] array = new String[]{s6, s4, s3, s5, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6669() {
    String[] array = new String[]{s3, s4, s6, s5, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6670() {
    String[] array = new String[]{s4, s3, s6, s5, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6671() {
    String[] array = new String[]{s6, s3, s4, s5, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6672() {
    String[] array = new String[]{s3, s6, s4, s5, s2, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6673() {
    String[] array = new String[]{s2, s6, s4, s5, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6674() {
    String[] array = new String[]{s6, s2, s4, s5, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6675() {
    String[] array = new String[]{s4, s2, s6, s5, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6676() {
    String[] array = new String[]{s2, s4, s6, s5, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6677() {
    String[] array = new String[]{s6, s4, s2, s5, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6678() {
    String[] array = new String[]{s4, s6, s2, s5, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6679() {
    String[] array = new String[]{s5, s6, s2, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6680() {
    String[] array = new String[]{s6, s5, s2, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6681() {
    String[] array = new String[]{s2, s5, s6, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6682() {
    String[] array = new String[]{s5, s2, s6, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6683() {
    String[] array = new String[]{s6, s2, s5, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6684() {
    String[] array = new String[]{s2, s6, s5, s4, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6685() {
    String[] array = new String[]{s2, s4, s5, s6, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6686() {
    String[] array = new String[]{s4, s2, s5, s6, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6687() {
    String[] array = new String[]{s5, s2, s4, s6, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6688() {
    String[] array = new String[]{s2, s5, s4, s6, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6689() {
    String[] array = new String[]{s4, s5, s2, s6, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6690() {
    String[] array = new String[]{s5, s4, s2, s6, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6691() {
    String[] array = new String[]{s5, s4, s6, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6692() {
    String[] array = new String[]{s4, s5, s6, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6693() {
    String[] array = new String[]{s6, s5, s4, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6694() {
    String[] array = new String[]{s5, s6, s4, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6695() {
    String[] array = new String[]{s4, s6, s5, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6696() {
    String[] array = new String[]{s6, s4, s5, s2, s3, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6697() {
    String[] array = new String[]{s3, s4, s5, s2, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6698() {
    String[] array = new String[]{s4, s3, s5, s2, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6699() {
    String[] array = new String[]{s5, s3, s4, s2, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6700() {
    String[] array = new String[]{s3, s5, s4, s2, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6701() {
    String[] array = new String[]{s4, s5, s3, s2, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6702() {
    String[] array = new String[]{s5, s4, s3, s2, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6703() {
    String[] array = new String[]{s2, s4, s3, s5, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6704() {
    String[] array = new String[]{s4, s2, s3, s5, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6705() {
    String[] array = new String[]{s3, s2, s4, s5, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6706() {
    String[] array = new String[]{s2, s3, s4, s5, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6707() {
    String[] array = new String[]{s4, s3, s2, s5, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6708() {
    String[] array = new String[]{s3, s4, s2, s5, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6709() {
    String[] array = new String[]{s3, s5, s2, s4, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6710() {
    String[] array = new String[]{s5, s3, s2, s4, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6711() {
    String[] array = new String[]{s2, s3, s5, s4, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6712() {
    String[] array = new String[]{s3, s2, s5, s4, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6713() {
    String[] array = new String[]{s5, s2, s3, s4, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6714() {
    String[] array = new String[]{s2, s5, s3, s4, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6715() {
    String[] array = new String[]{s2, s5, s4, s3, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6716() {
    String[] array = new String[]{s5, s2, s4, s3, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6717() {
    String[] array = new String[]{s4, s2, s5, s3, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6718() {
    String[] array = new String[]{s2, s4, s5, s3, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6719() {
    String[] array = new String[]{s5, s4, s2, s3, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

  public void test6720() {
    String[] array = new String[]{s4, s5, s2, s3, s6, s1};
    su.mergeSort(array);
    assertSame(s1,array[0]);
    assertSame(s2,array[1]);
    assertSame(s3,array[2]);
    assertSame(s4,array[3]);
    assertSame(s5,array[4]);
    assertSame(s6,array[5]);
  }

}
