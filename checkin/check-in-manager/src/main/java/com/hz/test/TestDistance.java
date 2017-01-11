package com.hz.test;

public class TestDistance {
	 private static final double EARTH_RADIUS = 6378.137;

	    private static double rad(double d){
	        return d * Math.PI / 180.0;
	    }

	    public static double GetDistance(double long1, double lat1, double long2, double lat2) {
	        double a, b, d, sa2, sb2;
	        lat1 = rad(lat1);
	        lat2 = rad(lat2);
	        a = lat1 - lat2;
	        b = rad(long1 - long2);

	        sa2 = Math.sin(a / 2.0);
	        sb2 = Math.sin(b / 2.0);
	        d = 2   * EARTH_RADIUS
	                * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1)
	                * Math.cos(lat2) * sb2 * sb2));
	        return 1000*d;
	    }

	    public static void main(String[] args) {
//	    	var pointA = new BMap.Point(106.486654,29.490295);  // 创建点坐标A--大渡口区
//	    	var pointB = new BMap.Point(106.581515,29.615467);  // 创建点坐标B--江北区
	    	
	        //根据两点间的经纬度计算距离，单位：km
	        System.out.println(GetDistance(106.486654, 29.490295, 106.581515, 29.615467));
	       Double distance =  GetDistance(106.486654, 29.490295, 106.581515, 29.615467);
	        
	        Integer prec = 1000;
	        
	        Double differ = prec - distance;
	        		System.out.println(differ);
	        
	        System.out.println(GetDistance(117.1181, 36.68484, 117.01, 36.66123));
	        System.out.println(GetDistance(112.9084, 28.14203, 112.9083, 28.14194));
	        System.out.println(GetDistance(121.5373, 38.86827, 121.5372, 38.86832));
	        System.out.println(GetDistance(20.5, 118.2, 21.1, 117.6));
	        System.out.println(GetDistance(121.445140,31.177779, 121.444832,31.179313));
	    }
}
