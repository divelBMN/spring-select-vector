package divelbmn.samplespringselectvector.vector;

public class Vector1 implements Vector {

    private final static int DIMENSIONS_COUNT = 1;


    private double x;


    public Vector1(VectorDao vectorDao) {
        x = vectorDao.getValues().get(0);
    }


    @Override
    public int dimensionsCount() {
        return DIMENSIONS_COUNT;
    }

    @Override
    public double length() {
        return x;
    }
}
