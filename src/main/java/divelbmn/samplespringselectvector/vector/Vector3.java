package divelbmn.samplespringselectvector.vector;

public class Vector3 implements Vector {

    private final static int DIMENSIONS_COUNT = 3;


    private double x;
    private double y;
    private double z;


    public Vector3(VectorDao vectorDao) {
        x = vectorDao.getValues().get(0);
        y = vectorDao.getValues().get(1);
        z = vectorDao.getValues().get(2);
    }


    @Override
    public int dimensionsCount() {
        return DIMENSIONS_COUNT;
    }

    @Override
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}
