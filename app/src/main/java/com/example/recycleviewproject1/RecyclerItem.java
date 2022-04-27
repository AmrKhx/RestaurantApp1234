package com.example.recycleviewproject1;



public class RecyclerItem {
    private int mImageRes;
    private String mText1;
    private  String aVAL;
    private int reRev;
    public RecyclerItem(int mImageRes,String mtext1,String aVAL,int reRev){
        this.mImageRes=mImageRes;
        this.aVAL=aVAL;
        this.reRev=reRev;
        this.mText1=mtext1;



    }//end of const.
    public int getmImageRes() {
        return mImageRes;
    }//end of getmImageRes
    public String getmText1() {
        return mText1;
    }
    public String getAval() {
        return aVAL;
    }

    public int getmImageRes3() {
        return reRev;
    }


}//end of class
