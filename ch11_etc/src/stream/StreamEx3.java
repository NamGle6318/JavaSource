package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        // 중간처리와 최종처리
        // Member list 내 남자의 나이 평균

        List<Member> members = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FEMALE, 20),
                new Member("김정환", Member.MALE, 45),
                new Member("성춘향", Member.FEMALE, 27));

        int age = 0;
        int count = 0;
        for (Member member : members) {
            if (member.getGender() == Member.MALE) {
                age += member.getAge();
                count++;
            }
        }
        System.out.println("남자 멤버 나이 평균 : " + (age / count));

        double ageAvg = members.stream()
                .filter(member -> member.getGender() == Member.MALE) // 남자 판별 조건식
                .mapToInt(Member::getAge) // = 향상된 for문 int type 리턴
                .average() // 평균 계싼
                .getAsDouble(); // double로 형변환
        System.out.println("남자 멤버 나이 평균 : " + ageAvg);

        // 여자 멤버 나이 평균 구하기
        double ageAvg2 = members.stream()
                .filter(f -> f.getGender() == Member.FEMALE)
                .mapToInt(Member::getAge) // Member -> Member.getAge() Member::getAge
                .average()
                .getAsDouble();

        System.out.println("여자 멤버 나이 편균 : " + ageAvg2);

    }
}
