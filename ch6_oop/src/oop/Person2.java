package oop;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor // @NonNull
@Getter

@Builder
public class Person2 {
    @Setter // 바로 아래에 있는 멤버변수의 Setter만 만듦
    private String pno;
    @NonNull
    private String name;

    private String tel;

}
