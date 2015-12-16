package com.yash.sms.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseList {

private ArrayList<Object> list;


public ArrayList<Object> getList() {
    return list;
}

public void setList(ArrayList<Object> list) {
    this.list = list;
}   
}
