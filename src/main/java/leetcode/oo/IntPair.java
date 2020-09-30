package leetcode.oo;

import java.util.Objects;

public final class IntPair {

    final int first;
    final int second;

    public IntPair(final int first, final int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "IntPair{" +
            "first=" + this.first +
            ", second=" + this.second +
            '}';
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !this.getClass().equals(object.getClass())) {
            return false;
        }
        final IntPair intPair = (IntPair) object;
        return this.first == intPair.first &&
            this.second == intPair.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.first, this.second);
    }
}
