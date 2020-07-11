package Comparators;

//Interface para definir classe com regra de ordenacao

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }

    @Override
    public Comparator<Estudante> reversed() {
        return null;
    }

    @Override
    public Comparator<Estudante> thenComparing(Comparator<? super Estudante> other) {
        return null;
    }

    @Override
    public <U> Comparator<Estudante> thenComparing(Function<? super Estudante, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Estudante> thenComparing(Function<? super Estudante, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Estudante> thenComparingInt(ToIntFunction<? super Estudante> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Estudante> thenComparingLong(ToLongFunction<? super Estudante> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Estudante> thenComparingDouble(ToDoubleFunction<? super Estudante> keyExtractor) {
        return null;
    }
}
