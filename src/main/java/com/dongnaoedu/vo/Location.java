/**
 * 
 */
package com.dongnaoedu.vo;

/**
 * 位置信息对象，和mysql中的point信息对应
 * 
 * @author 动脑学院.Tony老师
 * @see 专注在职IT人员能力提升，咨询顾问QQ: 2048209527
 */
public class Location {
    private String lat; // 经度
    private String lng; // 纬度

    public Location() {
    }

    /**
     * 
     * @param lat
     *            经度
     * @param lng
     *            纬度
     */
    public Location(String lat, String lng) {
        setLat(lat);
        setLng(lng);
    }

    /**
     * 转化为location对象，简单点，字符串处理
     * 
     * @param pointString
     *            mysql查出来的point字段字符串形式point(10.3 23.2)
     */
    public Location parse(String pointString) {
        String[] latLng = pointString.toLowerCase().replaceAll("point\\(", "").replaceAll("\\)", "")
                .split(" ");
        setLat(latLng[0]);
        setLng(latLng[1]);
        return this;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "point(" + lat + " " + lng + ")";
    }

}
