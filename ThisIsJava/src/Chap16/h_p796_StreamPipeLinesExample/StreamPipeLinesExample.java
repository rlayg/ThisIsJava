package Chap16.h_p796_StreamPipeLinesExample;

import java.util.Arrays;
import java.util.List;import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class StreamPipeLinesExample {

	public static void main(String[] args) {
		//이것이 자바다 p796
		List<Member> list = Arrays.asList(
			new Member("홍길동", Member.MALE, 30),
			new Member("김나리", Member.FEMALE, 20),
			new Member("신용권", Member.MALE, 45),
			new Member("박수미", Member.FEMALE, 27)
		);
			double ageAvg = list.stream()
					.filter(m -> m.getSex() == Member.MALE)
//					.mapToInt(Member :: getAge)
					.mapToInt(s -> s.getAge())
					.average()
					.getAsDouble();
			
			System.out.println("남자 평균 나이: " + ageAvg);
	}

}
