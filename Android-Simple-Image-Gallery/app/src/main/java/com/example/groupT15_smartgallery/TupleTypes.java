package com.example.groupT15_smartgallery;

import java.util.Comparator;

final public class TupleTypes {

    public class Tuple<X, Y> {
        private X first;
        private Y second;

        public Tuple(X first, Y second) {
            this.first = first;
            this.second = second;
        }

        public X getFirst() {
            return first;
        }

        public void setFirst(X first) {
            this.first = first;
        }

        public Y getSecond() {
            return second;
        }

        public void setSecond(Y second) {
            this.second = second;
        }
    }

    public class TupStrStr extends Tuple<String, String> {
        public TupStrStr(String first, String second) {
            super(first, second);
        }
    }

    public class TupStrInt extends Tuple<String, Integer> {
        public TupStrInt(String first, Integer second) {
            super(first, second);
        }
    }

    public class TupStrLong extends Tuple<String, Long> {
        public TupStrLong(String first, long second) {
            super(first, second);
        }
    }

    public class StrIntComp implements Comparator<TupStrInt> {
        @Override
        public int compare(TupStrInt o1, TupStrInt o2) {
            return o1.getSecond() - o2.getSecond();
        }
    }

    public class StrLongComp implements Comparator<TupStrLong> {
        @Override
        public int compare(TupStrLong o1, TupStrLong o2) {
            return (int)(o1.getSecond() - o2.getSecond());
        }
    }
}
