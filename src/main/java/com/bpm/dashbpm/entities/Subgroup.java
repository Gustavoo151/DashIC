package com.bpm.dashbpm.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dadoscidades")
public class Subgroup {

    @Id
    @Column(name = "idbase")
    private Integer idbase;

    @Column(name = "base", length = 50)
    private String base;

    @Column(name = "alvo", length = 100)
    private String alvo;

    @Column(name = "a")
    private Integer a;

    @Column(name = "d")
    private Integer d;

    @Column(name = "dp")
    private Integer dp;

    @Column(name = "dn")
    private Integer dn;

    @Column(name = "i")
    private Integer i;

    @Column(name = "supp")
    private Float supp;

    @Column(name = "itemDom")
    private Float itemDom;

    @Column(name = "descr", length = 350)
    private String descr;

    @Column(name = "tp")
    private Integer tp;

    @Column(name = "fp")
    private Integer fp;

    @Column(name = "quali")
    private Float quali;

    @Column(name = "lift")
    private Float lift;

    @Column(name = "conf")
    private Float conf;

    @Column(name = "cov")
    private Float cov;

    @Column(name = "chi")
    private Float chi;

    @Column(name = "pvalue", length = 100)
    private String pvalue;

    @Column(name = "sup_p")
    private Float sup_p;

    @Column(name = "sup_n")
    private Float sup_n;

    @Column(name = "cod_cidade")
    private Integer codCidade;

    @Column(name = "nome_cidade", length = 150)
    private String nomeCidade;

    public Subgroup() {}

    public Subgroup(Integer idbase, String base, String alvo, Integer a, Integer d, Integer dp, Integer dn, Integer i,
                    Float supp, Float itemDom, String descr, Integer tp, Integer fp, Float quali, Float lift,
                    Float conf, Float cov, Float chi, String pvalue, Float sup_p, Float sup_n,
                    Integer cod_cidade, String nomeCidade) {
        this.idbase = idbase;
        this.base = base;
        this.alvo = alvo;
        this.a = a;
        this.d = d;
        this.dp = dp;
        this.dn = dn;
        this.i = i;
        this.supp = supp;
        this.itemDom = itemDom;
        this.descr = descr;
        this.tp = tp;
        this.fp = fp;
        this.quali = quali;
        this.lift = lift;
        this.conf = conf;
        this.cov = cov;
        this.chi = chi;
        this.pvalue = pvalue;
        this.sup_p = sup_p;
        this.sup_n = sup_n;
        this.codCidade = cod_cidade;
        this.nomeCidade = nomeCidade;
    }

    // Getters and setters omitted for brevity

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subgroup subgroup = (Subgroup) o;
        return Objects.equals(idbase, subgroup.idbase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idbase);
    }

    @Override
    public String toString() {
        return "Subgroup{" +
                ", base='" + base + '\'' +
                ", alvo='" + alvo + '\'' +
                ", a=" + a +
                ", d=" + d +
                ", dp=" + dp +
                ", dn=" + dn +
                ", i=" + i +
                ", supp=" + supp +
                ", itemDom=" + itemDom +
                ", descr='" + descr + '\'' +
                ", TP=" + tp +
                ", FP=" + fp +
                ", quali=" + quali +
                ", lift=" + lift +
                ", conf=" + conf +
                ", cov=" + cov +
                ", chi=" + chi +
                ", pvalue='" + pvalue + '\'' +
                ", sup_p=" + sup_p +
                ", sup_n=" + sup_n +
                ", cod_cidade=" + codCidade +
                ", nome_cidade='" + nomeCidade + '\'' +
                '}';
    }

    public Integer getIdbase() {
        return idbase;
    }

    public String getBase() {
        return base;
    }

    public String getAlvo() {
        return alvo;
    }

    public Integer getA() {
        return a;
    }

    public Integer getD() {
        return d;
    }

    public Integer getDp() {
        return dp;
    }

    public Integer getDn() {
        return dn;
    }

    public Integer getI() {
        return i;
    }

    public Float getSupp() {
        return supp;
    }

    public Float getItemDom() {
        return itemDom;
    }

    public String getDescr() {
        return descr;
    }

    public Integer getTp() {
        return tp;
    }

    public Integer getFp() {
        return fp;
    }

    public Float getQuali() {
        return quali;
    }

    public Float getLift() {
        return lift;
    }

    public Float getConf() {
        return conf;
    }

    public Float getCov() {
        return cov;
    }

    public Float getChi() {
        return chi;
    }

    public String getPvalue() {
        return pvalue;
    }

    public Float getSup_p() {
        return sup_p;
    }

    public Float getSup_n() {
        return sup_n;
    }

    public Integer getCodCidade() {
        return codCidade;
    }

    public String getNome_cidade() {
        return nomeCidade;
    }
}
