package org.example.vectors;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;


public class VectorOperations {
    public static void main(String[] args) {
        INDArray v1 = Nd4j.create(new double[]{1, 2, 3});
        INDArray v2 = Nd4j.create(new double[]{4, 5, 6});

        // Addition
        System.out.println("v1 + v2 = " + v1.add(v2));

        // Scalar multiplication
        System.out.println("2 * v1 = " + v1.mul(2));

        // Dot product
        double dot = Nd4j.getBlasWrapper().dot(v1, v2);
        System.out.println("Dot product = " + dot);

        // Cross product (3D only)
        INDArray cross = Nd4j.create(new double[]{
                v1.getDouble(1) * v2.getDouble(2) - v1.getDouble(2) * v2.getDouble(1),
                v1.getDouble(2) * v2.getDouble(0) - v1.getDouble(0) * v2.getDouble(2),
                v1.getDouble(0) * v2.getDouble(1) - v1.getDouble(1) * v2.getDouble(0)
        });
        System.out.println("Cross product = " + cross);
    }
}
