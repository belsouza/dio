package digital.inovattion.one.utils;

import digital.inovattion.one.utils.operations.internals.DivHelper;
import digital.inovattion.one.utils.operations.internals.MultiHelper;
import digital.inovattion.one.utils.operations.internals.SubHelper;
import digital.inovattion.one.utils.operations.internals.SumHelper;

public class Calculator {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultiHelper multiHelper;
    private DivHelper divHelper;

    public Calculator(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multiHelper = new MultiHelper();
        divHelper = new DivHelper();
    }

    public int soma(int a, int b) {     return sumHelper.execute(a, b);    }
    public int subtracao(int a, int b) {    return subHelper.execute(a, b);   }
    public int multiplicacao(int a, int b) {    return multiHelper.execute(a, b);    }
    public int divisao(int a, int b) { return divHelper.execute(a, b);   }

}
