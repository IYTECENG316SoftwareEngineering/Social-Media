package com.example.macbookpro.p3_databasedeneme;

public class Oyuncular {

    private String isim;
    private String soyisim;
    private long id;

    public Oyuncular()
    {
        super();
    }

    public Oyuncular(String isim, String soyisim)
    {
        super();
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getSoyisim()
    {
        return soyisim;
    }

    public void setSoyisim(String soyisim)
    {
        this.soyisim = soyisim;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
}

