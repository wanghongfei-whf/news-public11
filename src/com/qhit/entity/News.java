package com.qhit.entity;

import java.util.Date;

public class News {
    private int nid;
    private int ntid;
    private String ntitle;
    private String nauthor;
    private Date ncreateDate;
    private String npicPath;//图片地址
    private String ncontent;
    private Date nmodifydate;
    private String nsummary;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getNtid() {
        return ntid;
    }

    public void setNtid(int ntid) {
        this.ntid = ntid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor;
    }

    public Date getNcreateDate() {
        return ncreateDate;
    }

    public void setNcreateDate(Date ncreateDdte) {
        this.ncreateDate = ncreateDdte;
    }

    public String getNpicPath() {
        return npicPath;
    }

    public void setNpicPath(String npicPath) {
        this.npicPath = npicPath;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public Date getNmodifydate() {
        return nmodifydate;
    }

    public void setNmodifydate(Date nmodifydate) {
        this.nmodifydate = nmodifydate;
    }

    public String getNsummary() {
        return nsummary;
    }

    public void setNsummary(String nsummary) {
        this.nsummary = nsummary;
    }

    @Override
    public String toString() {
        return "News{" +
                "nid=" + nid +
                ", ntid=" + ntid +
                ", ntitle='" + ntitle + '\'' +
                ", nauther='" + nauthor + '\'' +
                ", ncreateDdte=" + ncreateDate +
                ", npicPath='" + npicPath + '\'' +
                ", ncontent='" + ncontent + '\'' +
                ", nmodifydate=" + nmodifydate +
                ", nsummary='" + nsummary + '\'' +
                '}';
    }
}
