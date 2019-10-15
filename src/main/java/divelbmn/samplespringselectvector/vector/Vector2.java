package divelbmn.samplespringselectvector.vector;

public class Vector2 implements Vector {

    private final static int DIMENSIONS_COUNT = 2;


    private double x;
    private double y;


    public Vector2(VectorDao vectorDao) {
        x = vectorDao.getValues().get(0);
        y = vectorDao.getValues().get(1);
    }


    @Override
    public int dimensionsCount() {
        return DIMENSIONS_COUNT;
    }

    @Override
    public double length() {
        return Math.sqrt(x * x + y * y);
    }
}
