package org.example.Entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Data
public class HinhTamGiac {
    private double canhA;
    private double canhB;
    private double canhC;

    public double chuVi() {
        return (canhA + canhB + canhC);
    }

    //
    public double dienTich() {
        double p = chuVi();
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }
}

