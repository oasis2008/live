package com.angelatech.yeyelive.socket.im.dispatch;


import com.angelatech.yeyelive.socket.WillProtocol;

/**
 * Created by jjfly on 16-3-8.
 */
public abstract class Dispatchable {

    protected WillProtocol mProtocol = new WillProtocol();

    protected String getDataStr(byte[] datas) {
        return new String(datas).trim();
    }

    public abstract void dispatch(int type, byte[] datas);

    public abstract boolean validateParcel(byte[] parcel);
}
