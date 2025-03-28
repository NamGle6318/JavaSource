package oop;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter // 모든 멤버변수의 Setter 생성

public class Person {
    private String pno;
    private String name;
    private String tel;

}
