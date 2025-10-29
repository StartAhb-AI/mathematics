package com.poc;


import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.api.ndarray.INDArray;

public class ND4JDistributions {
    public static void main(String[] args) {
        // Binomial Distribution (n=10, p=0.5)
        INDArray binomialSamples = Nd4j.getExecutioner()
            .exec(new org.nd4j.linalg.api.ops.random.impl.BinomialDistribution(
                Nd4j.createUninitialized(new int[]{5}), 10, 0.5));
        System.out.println("Binomial Samples: " + binomialSamples);

        // Normal Distribution: mean=0, std=1
        INDArray normalSamples = Nd4j.randn(5);  // standard normal
        System.out.println("Normal Samples: " + normalSamples);

        // Uniform Distribution: range [0,1)
        INDArray uniformSamples = Nd4j.rand(5);  // uniform [0,1)
        System.out.println("Uniform Samples: " + uniformSamples);
    }
}
