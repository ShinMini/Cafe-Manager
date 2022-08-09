/**
 * PROJ : 카페 데이터 관리 
 * FILE : Cafe.java
 * DESC : 카페 정보 
 * 
 * @version 1.0
**/
package model;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Cafe {
    /*** 카페 정보 종류 ***/
    /** 카페 이름 **/
    private String cafeName;
    
    /** 카페 위치 **/
    private String cafeLocation;
    
    /** 카페 오픈 시간 **/
    private String cafeOpen;
    
    /** 카페 클로즈 시간 **/
    private String cafeClose;
    
    /** 카페 전화번호 **/
    private String cafeNo;
    
    /** 카페 스토어 매니저 **/
    private String cafeSM;
    
    /** 카페 딜리버리 가능여부 **/
    private char cafeDelivery;
    // constructor
    public Cafe(String cafeName, String cafeLocation, String cafeOpen, String cafeClose, 
            String cafeNo, String cafeSM) {
        super();
        this.cafeName = cafeName;
        this.cafeLocation = cafeLocation;
        this.cafeOpen = cafeOpen;
        this.cafeClose = cafeClose;
        this.cafeNo = cafeNo;
        this.cafeSM = cafeSM;
    }
    
    // Getter & Setter
    public String getCafeName() {
        return cafeName;
    }
    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }
    public String getCafeOpen() {
        return cafeOpen;
    }
    public void setCafeOpen(String cafeOpen) {
        this.cafeOpen = cafeOpen;
    }
    public String getCafeNo() {
        return cafeNo;
    }
    public void setCafeNo(String cafeNo) {
        this.cafeNo = cafeNo;
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("카페명 : ");
        builder.append(cafeName);
        builder.append("\n");
            
        builder.append("카페 위치 : ");
        builder.append(cafeLocation);
        builder.append("\n");
            
        builder.append("카페 오픈 시간 : ");
        builder.append(cafeOpen);
        builder.append("\n");
            
        builder.append("카페 클로즈 시간");
        builder.append(cafeClose);
        builder.append("\n");
            
        builder.append("카페 전화번호");
        builder.append(cafeNo);
        builder.append("\n");
            
        builder.append("카페 스토어 매니저");
        builder.append(cafeSM);
        builder.append("\n");
        return builder.toString();
    }
}