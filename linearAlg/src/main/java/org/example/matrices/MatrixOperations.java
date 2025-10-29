package org.example.matrices;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.inverse.InvertMatrix;

public class MatrixOperations {
    public static void main(String[] args) {
        INDArray A = Nd4j.create(new double[][]{{1, 2}, {3, 4}});
        INDArray B = Nd4j.create(new double[][]{{5, 6}, {7, 8}});

        System.out.println("A + B = \n" + A.add(B));
        System.out.println("A x B = \n" + A.mmul(B));
        System.out.println("A^T = \n" + A.transpose());

        // Inverse
        INDArray invA = InvertMatrix.invert(A, false);
        System.out.println("A^-1 = \n" + invA);
    }
}
