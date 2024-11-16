package com.example.quanlisanbay.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PhanCong")
public class PhanCong {
    @Id
    @Column(name = "MaNV")
    private String maNV;
    
    @Column(name = "MaChuyenBay")
    private String maChuyenBay;
    
    @Column(name = "NgayDi")
    private LocalDate ngayDi;

    // Constructors
    public PhanCong() {}
    
    public PhanCong(String maNV, String maChuyenBay, LocalDate ngayDi) {
        this.maNV = maNV;
        this.maChuyenBay = maChuyenBay;
        this.ngayDi = ngayDi;
    }

    // Getters
    public String getMaNV() {
        return maNV;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public LocalDate getNgayDi() {
        return ngayDi;
    }

    // Setters
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setNgayDi(LocalDate ngayDi) {
        this.ngayDi = ngayDi;
    }
}