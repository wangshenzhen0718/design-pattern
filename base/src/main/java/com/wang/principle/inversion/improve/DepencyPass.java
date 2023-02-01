package com.wang.principle.inversion.improve;

public class DepencyPass {
    public static void main(String[] args) {
        //接口注入-----------------------------------------------------------
        /*Changhong changhong = new Changhong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changhong);*/
        //----------------------------------
        Changhong changhong = new Changhong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setItv(changhong);
        openAndClose.open();
    }
}
//接口注入-----------------------------------------------------------
/*interface IOpenAndClose {
    void open(ITV itv);
}

interface ITV {
    void play();
}

class Changhong implements ITV {
    public void play() {
        System.out.println("长虹电视打开了！！！");
    }
}

class OpenAndClose implements IOpenAndClose {
    public void open(ITV itv) {
        itv.play();
    }
}*/

//构造方法注入------------------------------------------------------------
/*
interface IOpenAndClose {
    void open();
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV itv;

    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    public void open() {
        itv.play();

    }
}

class Changhong implements ITV {
    public void play() {
        System.out.println("长虹电视打开了！！！");
    }
}*/
//------------------------------------------

interface IOpenAndClose {
    void open();
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV itv;

    public void setItv(ITV itv){
        this.itv=itv;

    }

    public void open() {
        itv.play();

    }
}

class Changhong implements ITV {
    public void play() {
        System.out.println("长虹电视打开了！！！");
    }
}