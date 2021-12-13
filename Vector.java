public class Vector {
    private float[] values;

    Vector(int size) {
        values = new float[size];
    }

    Vector(float[] values) {
        this(values.length);
        for (int i = 0; i < values.length; i++) {
            set(i, values[i]);
        }
    }

    int size() {
        return values.length;
    }

    float get(int i) {
        return values[i];
    }

    void set(int i, float v) {
        values[i] = v;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            sb.append(values[i]);
            if (i < values.length - 1)
                sb.append(" ");
        }

        return sb.toString();
    }
}
