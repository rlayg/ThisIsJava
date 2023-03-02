package Chap06.m_class_p247;

public class chap06_m_class_p247 {

	public static void main(String[] args) {
		// 이것이 자바다 p.247
		System.out.println("지구의 반지름: " + ma_Earth.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적: " + ma_Earth.EARTH_SURFACE_AREA + " km^2");
		System.out.println("지구의 부피: " + 4.0/3.0*ma_Earth.EARTH_RADIUS*Math.PI + "km^3");
	}

}
// 4/3은 인트형이라 소수곱연안에 애러남 4.0 3.0으로(double형으로) 바꿔