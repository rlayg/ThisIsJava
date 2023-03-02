package Chap16.h_p796_StreamPipeLinesExample;

import java.util.Arrays;
import java.util.List;import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class StreamPipeLinesExample {

	public static void main(String[] args) {
		//�̰��� �ڹٴ� p796
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿", Member.MALE, 30),
			new Member("�質��", Member.FEMALE, 20),
			new Member("�ſ��", Member.MALE, 45),
			new Member("�ڼ���", Member.FEMALE, 27)
		);
			double ageAvg = list.stream()
					.filter(m -> m.getSex() == Member.MALE)
//					.mapToInt(Member :: getAge)
					.mapToInt(s -> s.getAge())
					.average()
					.getAsDouble();
			
			System.out.println("���� ��� ����: " + ageAvg);
	}

}
