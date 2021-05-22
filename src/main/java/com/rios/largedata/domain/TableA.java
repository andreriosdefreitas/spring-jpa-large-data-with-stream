package com.rios.largedata.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "table_a")
public class TableA {

    @Id
    private Integer id;

    @Column(name = "column_a")
    private String columnA;

    @Column(name = "column_b")
    private String columnB;

    @Column(name = "column_c")
    private String columnC;

    @Column(name = "column_d")
    private String columnD;

    @Column(name = "column_e")
    private String columnE;

    @Column(name = "column_f")
    private String columnF;

    @Column(name = "column_g")
    private String columnG;

    @Column(name = "column_h")
    private String columnH;

    @Column(name = "column_i")
    private String columnI;

    @Column(name = "column_j")
    private String columnJ;

    @Column(name = "column_k")
    private String columnK;

    @Column(name = "column_l")
    private String columnL;

    @Column(name = "column_m")
    private String columnM;

    @Column(name = "column_n")
    private String columnN;

    @Column(name = "column_o")
    private String columnO;

    @Column(name = "column_p")
    private String columnP;

    @Column(name = "column_q")
    private String columnQ;

    @Column(name = "column_r")
    private String columnR;

    @Column(name = "column_s")
    private String columnS;

    @Column(name = "column_t")
    private String columnT;

    @Column(name = "column_u")
    private String columnU;

    @Column(name = "column_v")
    private String columnV;

    @Column(name = "column_w")
    private String columnW;

    @Column(name = "column_x")
    private String columnX;

    @Column(name = "column_y")
    private String columnY;

    @Column(name = "column_z")
    private String columnZ;

}
